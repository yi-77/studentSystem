package com.example.studentsystem.domain;

import java.io.Serializable;


public class College implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键
	private Integer id;
	//学号
	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
