public class FirstDemoServerImpl implements FirstDemoService {
 
	public String getString(String msg) {
		 String str = "�����������...Զ�̷�����óɹ�! " + msg;
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