package site.metacoding.red.domain.boards.mapper;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardsDetail {//오브젝트로 받으려고..
	private Integer id;
	private String title;
	private String content;
	private Timestamp createdAt;
	private Integer usersId;
	private String username;
	private String password;
	private String email;
}
