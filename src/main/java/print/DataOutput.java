package print;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataOutput {

	// Standard Output
	public void stdOut(List<Data> datas) {
		datas.stream().forEach(data -> {
			System.out.println(data.toString());
		});
	}
	
	// File Output
	public void fileOut(List<? extends Data> datas, String path) {
		File file = new File(path);
		try {
			FileWriter fw = new FileWriter(file);
			datas.stream().forEach(data -> {
				try {
					fw.write(data.output());
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