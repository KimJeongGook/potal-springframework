package co.homework.potal.board.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {

	private int no;
	private String writer;
	private Date wdate;
	private String title;
	private String subject;
	private int hit;
	
	private String name;
	
}
