

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import com.cg.bean.Address;
import com.cg.bean.Student;
import com.cg.dao.StudentDaoImp1;
import com.cg.util.JPAUtil;


public class TestStuOneToOneClient {
	static EntityManager em=null;
	static StudentDaoImp1 stuDao=null;
	public static void main(String[] args) {
		em=JPAUtil.getEntityManager();
		stuDao = new StudentDaoImp1();
		Address address1=new Address();
		address1.setCity("puram");
		address1.setState("bihar");
		address1.setStreet("shamiyana");
		address1.setZipCode("45453");

		Address address2=new Address();
		address2.setCity("shahibadbad");
		address2.setState("up");
		address2.setStreet("Gtroad");
		address2.setZipCode("20021");

		Student st1=new Student();
		st1.setStuName("ramesh");
		st1.setStuAdd(address1);


		Student st2=new Student();
		st2.setStuName("teja");
		st2.setStuAdd(address2);
		
		stuDao.addStudent(st1);
		stuDao.addStudent(st2);
		System.out.println("both students are added");
		List stList=(List) stuDao.getAllStudents();
		System.out.println(stList);
	}

}
