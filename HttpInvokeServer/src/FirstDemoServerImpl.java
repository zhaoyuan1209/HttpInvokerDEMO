public class FirstDemoServerImpl implements FirstDemoService {
 
	public String getString(String msg) {
		 String str = "正在请求调用...远程服务调用成功! " + msg;
	     return str;    
	}
 
	public Person getInfo(String name)
	{
		Person stu=new Person();
		stu.setAge("23");
		stu.setName(name+":Tom");
		return stu;
	}
 
}