package blog.com;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PostService2 {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getPostsbyCreator(Long creatorId) {
        return postRepository.findByCreatorId(creatorId);
    }
 
        
    public List<Post> getAllPosts(Long blogId){
        return postRepository.findByBlogId(blogId);
    }
   

    public void post(Post post) {
    	postRepository.save(post);
    }

    public boolean deletePost(Long id) {
    	postRepository.deleteById(id);
        return true;
    }
    
    public Post getPost(Long id) {
        return postRepository.findById(id).get();
    }
}
