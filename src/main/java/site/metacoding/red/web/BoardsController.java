package site.metacoding.red.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.boards.Boards;
import site.metacoding.red.domain.boards.BoardsDao;
import site.metacoding.red.web.dto.request.boards.WriteDto;
import site.metacoding.red.web.dto.response.RespDto;

@RequiredArgsConstructor
@RestController
public class BoardsController {

	private final BoardsDao boardsDao;
	
	@GetMapping("/boards/{id}")
	public RespDto<?> getBoards(@PathVariable Integer id) {
		return new RespDto<>(1, "성공", boardsDao.findById(id));
	}
	
	@GetMapping("/boards")
	public RespDto<?> getBoardsList(){
		return new RespDto<>(1, "성공", boardsDao.findAll());
	}
	
	@PostMapping("/boards")
	public RespDto<?> insert(WriteDto writeDto){
		boardsDao.insert(writeDto);
		return new RespDto<>(1, "작성완료", null);
	}
	
	@PutMapping("/boards/{id}")
	public RespDto<?> update(@PathVariable Integer id, WriteDto writeDto){
		Boards boardsPS = boardsDao.findById(id);
		boardsPS.전체수정(writeDto);
		boardsDao.update(boardsPS);
		return new RespDto<>(1, "수정완료", null);
	}
	
	@DeleteMapping("/boards/{id}")
	public RespDto<?> delete(@PathVariable Integer id){
		boardsDao.deletById(id);
		return new RespDto<>(1, "삭제완료", null);
	}
}
