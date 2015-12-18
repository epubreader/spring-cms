package com.springcms.models;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.springcms.util.PostState;

@Document(collection = "posts")
public class Post {
	
    @Id
    private String id;
    
    private String title;
    
    private PostState state;
    
    private Date publishedDate;

    private Content content;
    
    private ObjectId author;
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public PostState getState() {
		return state;
	}

	public void setState(PostState state) {
		this.state = state;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public ObjectId getAuthor() {
		return author;
	}

	public void setAuthor(ObjectId author) {
		this.author = author;
	}
	
}
