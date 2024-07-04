package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
		byte[] bytes = Files
				.readAllBytes(Paths.get(Main.class.getClassLoader().getResource("fileIO/input.txt").getPath()));
		String wholeText = new String(bytes);
		System.out.println(wholeText);

	}
}
