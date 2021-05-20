package blog.com;


public class commentPlaceHolder {

	   private String text;
	   private String creator;

	    private Long postId;

	    public String getText() {
	        return text;
	    }

	    public void setText(String text) {
	        this.text = text;
	    }

	    public Long getPostId() {
	        return postId;
	    }

	    public void setPostId(Long postId) {
	        this.postId = postId;
	    }

		public String getCreator() {
			return creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

}
