package reflection;

import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class MimikingJavapTool {
	public static void main(String [] args) throws ClassNotFoundException {
		
		MimikingJavapTool tool = new MimikingJavapTool();
		
		Class c = Class.forName(args[0]);
		
		tool.getDetailsOfFieldsDeclared(c);
		tool.getDetailsOfConstructorsDeclared(c);
		tool.getDetailsOfMethodsDeclared(c);
	}
	
	public void getDetailsOfFieldsDeclared(Class c) {
		Field[] fields = c.getDeclaredFields();
		System.out.println("Printing Fields Details of the Class "+c.getName());
		for (Field f : fields) {
			System.out.println(f.toString());
		}
	}
	
	public void getDetailsOfConstructorsDeclared(Class c) {
		Constructor [] constructors = c.getDeclaredConstructors();
		System.out.println("\nPrinting Constructor Details of the Class "+c.getName());
		for (Constructor con : constructors) {
			System.out.println(con.toString());
		}
	}
	
	public void getDetailsOfMethodsDeclared(Class c) {
		Method[] methods = c.getDeclaredMethods();
		System.out.println("\nPrinting Method Details of the Class "+c.getName());
		for (Method m : methods) {
			System.out.println(m.toString());
		}
	}
}
