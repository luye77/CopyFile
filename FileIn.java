import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileIn {
	//读取文件，转化成字符串，截取并返回student的list集合
	public ArrayList<Student> fileIn(String path) throws IOException{
		ArrayList<Student> al=new ArrayList<Student>();
		String temp = null;
		ArrayList<String> readList = new ArrayList<String>();
		File f = new File(path);
		FileInputStream fs=new FileInputStream(f);
		InputStreamReader read = new InputStreamReader(fs,"GBK");
		BufferedReader reader=new BufferedReader(read);
		//这个判断是什么意思
		//转化成字符串
		while((temp=reader.readLine())!=null &&!"".equals(temp)){
		    readList.add(temp);
		}
		read.close();
		//截取并返回student的list集合
		for (String object : readList) {	
			System.out.println(object);
			//这是重点，每次都要new一个新对象，要不会覆盖前一个数据
			al.add(new NewStringCut().stringCut(object));		
		}
		return al;
	}


}
