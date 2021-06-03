package com.todo.entity;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Notes {

	@Id
	private int id;
	private String title;
	private String  content;
	private Date addition_date;
	public Notes(String title, String content, Date addition_date) {
		super();
		this.id = new Random().nextInt(10000);
		this.title = title;
		this.content = content;
		this.addition_date = addition_date;
	}
	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the addition_date
	 */
	public Date getAddition_date() {
		return addition_date;
	}
	/**
	 * @param addition_date the addition_date to set
	 */
	public void setAddition_date(Date addition_date) {
		this.addition_date = addition_date;
	}
	@Override
	public String toString() {
		return "Notes [id=" + id + ", title=" + title + ", content=" + content + ", addition_date=" + addition_date
				+ "]";
	}
	
	
	
	
}
