package aplicacao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archive {
		public static String read(String path) {
			String content = "";
			try {
				FileReader archive = new FileReader(path);
				BufferedReader readArchive = new BufferedReader(archive);
				String line = "";
				try {
					line = readArchive.readLine();
					while(line != null) {
						content += line;
						line = readArchive.readLine();
						}
					}catch(IOException e) {
						content = "Err0r: Not possible do read this file!";
					}
			}catch(IOException e) {
				content = "Err0r: File not found!";
			}
			if(content.contains("Err0r"))
				return "";
			else
				return content;
		}
		
	public static boolean write(String path,String content) {
		try{
			FileWriter archive = new FileWriter(path);
			PrintWriter writeArchive = new PrintWriter(archive);
			writeArchive.println(content);
			writeArchive.close();
			return true;
		}catch(IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}	
}
