package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
      
      Student std= (Student)context.getBean("stdId");
      
      std.display();
      }
}
