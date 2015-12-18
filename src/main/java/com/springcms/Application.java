package com.springcms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;

import com.springcms.models.Post;
import com.springcms.rep.PostRepository;

@SpringBootApplication
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<Post> postList = postService.findAll();
//		
//		for(Post post: postList) {
//			System.out.println(post.getContent().getExtended());
//			System.out.println(post.getAuthor().getEmail());
//		}

		
//		Post post = new Post();
//		post.setTitle("title");
//		User author = new User();
//		author.setEmail("kkk@kk.com");
//		author.setId("id");
//		post.setAuthor(author);
//		postService.save(post);

		long count = postRepository.readCountAllActiveProducts();
		
		List<Post>  postList = postRepository.readAllActiveProducts(new PageRequest(0, 10));
		
		for (Post post: postList) {
			System.out.println(post);
		}
		System.out.println(count);
	}

}
