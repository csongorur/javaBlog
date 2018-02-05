package com.blog.blog.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Blog {

	@GeneratedValue
	@Id
	private Long id;
	private String title;
	
	@Column(columnDefinition = "TEXT")
	private String content;
	private Date published;
	
	@ManyToOne
	private User user;
	
	private Blog() {}

	public Blog(String title, String content, Date published, User user) {
		this.title = title;
		this.content = content;
		this.published = published;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
