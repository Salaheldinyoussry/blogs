package blog.com;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class BlogService {

    @Autowired
    private BlogRepository br;

  
    public Iterable<Blog> getAllBlogs(){
        return  br.findAll();
    }

    public void insert(Blog blog) {
    	br.save(blog);
    }
 


    public boolean deleteBlog(Long blogId){
//        Optional<Blog> theblog = br.findById(blogId);
//        if(theblog.isPresent())
//            return false;
        br.deleteById(blogId);
        return true;
    }



    public Blog find(Long blogId) {
        return br.findById(blogId).get();
    }
}
