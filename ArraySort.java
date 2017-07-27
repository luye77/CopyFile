import java.util.Comparator;  
   
public class ArraySort implements Comparator<Student> {   
    //接口，必须实现的方法  
    public int compare(Student o1, Student o2) {  
        Student p1 = (Student) o1;  
        Student p2 = (Student) o2;  
        if (p1.getGrade() < p2.getGrade())  
            return 1;  
        else if (p1.getGrade() > p2.getGrade())  
            return -1;  
        else  
            return 0;  
}  
