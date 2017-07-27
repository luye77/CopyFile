import java.util.ArrayList;

//用来截取每个字符串
public class NewStringCut {
	Student stu=new Student();
	ArrayList<Student> as=new ArrayList<Student>();
	int a;
	public Student stringCut(String str){
		String[]s=str.split(" ");
		for(int i=0;i<s.length;i++){
			if(i==0){
				stu.setId(Integer.parseInt(s[0]));
			}
			if(i==1){
				stu.setName(s[1]);
			}
			if(i==2){
				stu.setGrade(Integer.parseInt(s[2]));
			}
		}
//		System.out.println(stu.getId()+stu.getName()+stu.getGrade());
		return stu;
	}
}
