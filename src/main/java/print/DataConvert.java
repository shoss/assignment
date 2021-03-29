package print;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConvert {

	// Convert JSON to User List
	public List<User> toUserList(Path path) throws IOException {
		
		// Convert JSON File to String
		List<String> ls = Files.readAllLines(path);
		String str = ls.stream().collect(Collectors.joining(""));

		// Convert String to List
		ObjectMapper mapper = new ObjectMapper();
		return Arrays.asList(mapper.readValue(str, User[].class));
	}
}
