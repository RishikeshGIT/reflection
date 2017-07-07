package reflection;

import java.lang.Class;

public class ForNameDemo {
	public static void main(String[] args) {
		ForNameDemo demo = new ForNameDemo();
		try {
			demo.demoClassForNameMethod();
			demo.demoClassGetClassMethod();
			demo.demoClassObjectTypeMethod();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void demoClassForNameMethod() throws ClassNotFoundException {
		System.out.println("=============================demoClassForNameMethod=============================");
		Class c = Class.forName("reflection.TestClass_Simple");	
		System.out.println("The Class that is loaded and Referenced is: "+c.getName());
		System.out.println("==========================================================\n");
	}
	
	public void demoClassGetClassMethod() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("=============================demoClassGetClassMethod=============================");
		//create an instance of the 'simple class' using the newInstance() method
		Class c = Class.forName("reflection.TestClass_Simple");
		TestClass_Simple s = (TestClass_Simple)c.newInstance();
		printMessage(s);
		s.MethodInTestClassSimple();
		System.out.println("==========================================================\n");
	}
	
	public void printMessage(Object obj) throws ClassNotFoundException {
		Class c = obj.getClass();
		System.out.println("The Class Name (in PrintMessage method) is:"+c.getName());
	}
	
	public void demoClassObjectTypeMethod() throws ClassNotFoundException {
		System.out.println("=============================demoClassObjectTypeMethod=============================");
		Class c1 = Class.forName("reflection.TestClass_Simple");
		System.out.println("is "+c1.getName()+" an Interface?:=>"+c1.isInterface());
		
		Class c2 = Class.forName("reflection.TestInterface_Simple");
		System.out.println("is "+c2.getName()+" an Interface?:=>"+c2.isInterface());
		System.out.println("==========================================================\n");
	}
}
