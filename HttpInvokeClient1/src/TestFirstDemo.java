import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFirstDemo {
   public static void main(String[] args) {
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"firstdemo.xml");
 
	   FirstDemoService service = (FirstDemoService) applicationContext.getBean("remoteService");
		System.out.println("---------------返回字符串-----------------");
		System.out.println(service.getString("Httpinvoker，start.....!"));
		System.out.println("\n---------------返回自定义对象-----------------");
		Person stu=service.getInfo("zy");
		System.out.println("姓名:"+stu.getName()+";年龄:"+stu.getAge());
}
}