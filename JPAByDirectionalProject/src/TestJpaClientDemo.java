import java.util.Iterator;
import java.util.List;
import java.util.Scanner;





import com.cg.bean.Student;
import com.cg.dao.StudentDaoImp1;


public class TestJpaClientDemo {

	public static void main(String[] args){
		StudentDaoImp1 stoDao=new StudentDaoImp1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no.");
		int rn=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		
		Student st=new Student();
		st.setRollNo(rn);
		st.setStuName(nm);
		Student stu=stoDao.addStudent(st);
		System.out.println("data is inserted in the table"+ stu);
		
		 System.out.println("-------------------");
	        
	        System.out.println("Retrieve all data and display");
	        List<Student> stList = stoDao.getAllStudents();
	        Iterator<Student> it = stList.iterator();
	        System.out.println("RollNo\t\t STUNAME");
	        while(it.hasNext()){
	            Student tempStu = it.next();
	            System.out.println(tempStu.getRollNo()+"\t\t"+tempStu.getStuName());
	        }
	        
	        System.out.println("-------------------");
	       /* 
	        System.out.println("Deleted 45 roll no");
	        System.out.println("Record Deleted for : " +stoDao.deleteStudent(45));
	        */
	        System.out.println("-------------------");
	        
	        System.out.println("Update Name:");
	        Student st3 = stoDao.updateStudentName(89, "pankaj");
	        System.out.println("Updated :"+st3);

	        System.out.println("-------------------");
	    }
	}