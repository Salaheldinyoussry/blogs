package blog.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@RestController
public class controller {
    @Autowired
    private PostService2 postService;

    @Autowired
    private UserService userService;

    @Autowired
    private CommentService commentService;
    
    @Autowired
    private BlogService blogService;
    
    @PostMapping("blog/addBlog")
    public void addBlog(@RequestBody Blog  blog){
	   blogService.insert(blog);
    	
    }
    
    @GetMapping("blog/getAllBlogs")
    public List<Blog> getAllBlogs(){
	   return (List<Blog>) blogService.getAllBlogs()  ;
    	
    }
    
    @GetMapping("blog/getOneBlog/{id}")
    public Blog getOneBlog(@PathVariable long id){
	   return blogService.find(id) ;
    	
    }
    
    @DeleteMapping("blog/deleteOneBlog/{id}")
    public String deleteOneBlog(@PathVariable long id){
	
		
		   try {
			     // System.out.println(user.getPassword());
		    	blogService.deleteBlog(id) ;
			      }
			      catch(Exception e) {
			    	  e.printStackTrace();
			    	  return "error happened";
			      }
			       return "deleted successfully";
		
}
    
    @PostMapping("post/addPost")
    public void addPost(@RequestBody Post  post){
	   postService.post(post);
    	
    }
    @GetMapping("post/getAllPosts")
    public List<Post> getAllPosts(){
	   return (List<Post>) postService.getAllPosts() ;
    	
    }
    
    @GetMapping("post/getComments/{id}")
    public List<Comment> getAllComments(@PathVariable long id){
     
    	return commentService.getComments(id);
    }
    
    
    @PostMapping("post/comment")
    public void comment(@RequestBody commentPlaceHolder cp){
	   Post post=postService.getPost(cp.getPostId());
	   User user =userService.getUser(cp.getCreator());
       commentService.comment(new Comment(cp.getText(),post,user));    	
    	
    }
    
  @PostMapping("user/register")
  public String register(@RequestBody User user){ // Note that no authentication was done as it wasn't requested in the challenge
      try {
      userService.save(user);
      }
      catch(Exception e) {
    	  e.printStackTrace();
    	  return "error happened";
      }
       return "User created";
  }
  
  

}
