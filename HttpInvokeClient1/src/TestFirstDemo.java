import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFirstDemo {
   public static void main(String[] args) {
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"firstdemo.xml");
 
	   FirstDemoService service = (FirstDemoService) applicationContext.getBean("remoteService");
		System.out.println("---------------�����ַ���-----------------");
		System.out.println(service.getString("Httpinvoker��start.....!"));
		System.out.println("\n---------------�����Զ������-----------------");
		Person stu=service.getInfo("zy");
		System.out.println("����:"+stu.getName()+";����:"+stu.getAge());
}
}