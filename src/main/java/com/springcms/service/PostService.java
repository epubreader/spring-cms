package com.springcms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcms.models.Post;
import com.springcms.rep.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	/**
	 * Find all music in music collection
	 * @return
	 */
	public List<Post> findAll() {
		return repository.findAll();
	}
	
	public Post save(Post post) {
		return repository.save(post);
	}
	
	public long readCountAllActiveProducts() {
		return repository.readCountAllActiveProducts();
	}
}
