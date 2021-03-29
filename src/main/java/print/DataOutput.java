package print;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataOutput {

	// Standard Output
	public void jsonStdOut(List<User> users) {
		users.stream().forEach(user -> {
			System.out.println(user.cutComment().toString());
		});
	}
	
	// File Output
	public void jsonFileOut(String path, List<User> users) {
		File file = new File(path);
		try {
			FileWriter fw = new FileWriter(file);
			users.stream().forEach(user -> {
				try {
					fw.write(user.cutComment().toString());
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			});
			fw.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
