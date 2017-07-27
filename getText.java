import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class getText{
	/**
	 * 读取本地普通文件，将其转化为一个字符串数组
	 * @return
	 * @throws FileNotFoundException 
	 */
	public void getTxt1(String filepath) throws FileNotFoundException{
		ArrayList<Student> als=new ArrayList<Student>();
		ArraySort as=new ArraySort();
		FileOut fo=new FileOut();
		FileIn fi=new FileIn();
		
		ArrayList<String> stringList = new ArrayList<String>();
		//在程序里多写几个输出，可以方便的看到执行过程，方便纠错
	  try{
		als=fi.fileIn(filepath);
		//用Comparator排序，还可以直接用Student实现Comparable接口
		Collections.sort(als,as);
		//将list转化成string
		for (Student stu : als) {
			System.out.println(stu.getId()+stu.getName()+stu.getGrade());
			//将student的属性转化成字符串，直接new就行
			stringList.add(new String(stu.getId()+stu.getName()+stu.getGrade()));
		}
		//写入文件
		for (String ob : stringList) {
			fo.fileOut(ob, "D:\\p\\a2.txt");
		}
	    }catch (Exception e) {
	   //logger.info("读取文件--->失败！- 原因：文件路径错误或者文件不存在");
		e.printStackTrace();
		}	
	}
	
	
}