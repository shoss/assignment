package print;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	@JsonProperty("user_name")
	private String name;
	
	@JsonProperty("comment")
	private String comment;
	
	private static String nameSuffix = "さん";
	
	private static int limit = 20;

	public User() {
	}	
	
	public User(String name, String comment) {
		this.name = name;
		this.comment = comment;
	}

	public User cutComment() {
		if(this.comment.length() > limit) {
			return  new User(this.name, this.comment.substring(0, limit));
		}else {
			return this;
		}
	}
	
	@Override
	public String toString() {
		return name + nameSuffix + "\r\n" + comment + "\r\n";
	}
}
