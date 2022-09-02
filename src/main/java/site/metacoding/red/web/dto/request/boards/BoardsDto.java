package site.metacoding.red.web.dto.request.boards;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardsDto {
	private Integer id;
	private String title;
	private String content;
	private String username;
}
