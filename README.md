# blogs

I have chosen sql datatbase
why ?
    because the blogs data are relational and have fixed schema 
#Notes
 - no authentication was used as it wasn't requested 
 - although alot of CRUD operations on blogs parts was't required most of them was implemented
   
 #CURL urls :
   
     Post Request  url : "blog/addBlog"
    to add a new blog (blog object  is passed in the body of the request)
    
     Get Request url : "blog/getAllBlogs"
    to get all the blogs 
    
     Get Request "blog/getOneBlog/{id}"
     to get a blog by id 
  
    Delete Request  url : "blog/deleteOneBlog/{id}"
     to delete a blog by id	

    
    Post Request url :"post/addPost"
     to add a new post  (post object  is passed in the body of the request)
   
    Get Request url :"post/getAllPosts/{id}"
     to get all post on a specfic blog (id of the blog is passed as path variable)
    
    Get Request  url :"post/getComments/{id}"
     to get all comments on a specfic post (id of the post is passed as path variable)
   
    Post Request   url :"post/comment"
        comment on a post  (commentPlaceHolder object  is passed in the body of the request)
    
    Post Request   url :"user/register" 
    it was for testing 
    no authentication was implemented as it wasn't required


  
