import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext bean=new ClassPathXmlApplicationContext("spring-conplication.xml");
		SqlSessionFactory sessionFactory=(SqlSessionFactory) bean.getBean("sf");
		System.out.println(sessionFactory);
	}
}
