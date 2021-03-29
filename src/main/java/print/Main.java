package print;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		if(args.length < 2) {
			System.out.println("入力ファイル名と出力ファイル名を入力してください。");
			System.out.println("Main 入力ファイル名 出力ファイル名");
			System.exit(1);
		}
		
		String input = args[0];
		String output = args[1];
		
		DataConvert dacvt = new DataConvert();
		DataOutput daopt = new DataOutput();
		List<User> users = dacvt.jsonToUserList(Paths.get((input))); 
		
		// Write User's Name & Comment
//		daopt.jsonStdOut(users);
		daopt.fileOut(users, output);
	}
}
