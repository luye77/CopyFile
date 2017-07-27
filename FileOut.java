import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileOut{
	public void fileOut(String s,String path) throws IOException {
		BufferedWriter br=new BufferedWriter(
				new FileWriter(
						//解决了被覆盖问题,有true代表接着写，没true就会把之前的覆盖
						new File(path),true));
			br.write(s);
			br.newLine();
			br.close();
	}
}
