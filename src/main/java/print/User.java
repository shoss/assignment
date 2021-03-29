package print;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User extends Data{

	@JsonProperty("user_name")
	private String name;
	
	@JsonProperty("comment")
	private String comment;
	
	private static String nameSuffix = "さん";
	
	private static int limit = 20;
	
	public String output() {
		String comment = this.comment.length() > limit ? this.comment.substring(0, limit): this.comment;
		return this.name + nameSuffix + "\r\n" + comment + "\r\n";
	}
}
