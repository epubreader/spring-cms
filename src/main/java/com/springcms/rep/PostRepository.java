package com.springcms.rep;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.springcms.models.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	@Query(value = "{state : 'published'}", count = true)
	public long readCountAllActiveProducts();
	
	@Query(value = "{state : 'published'}")
	public List<Post> readAllActiveProducts(Pageable pageable);
}
