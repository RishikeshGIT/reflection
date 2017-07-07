package reflection;

import java.lang.Class;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokePrivateMethodFromAnotherClass_WithArgs {
	
	public static void main(String [] args) throws ClassNotFoundException, SecurityException, InstantiationException, 
			IllegalAccessException, IllegalArgumentException, NoSuchMethodException, InvocationTargetException
	{
		Class c = Class.forName("reflection.TestClass_Simple_Args");
		Object obj = c.newInstance();
		
		Method method = c.getDeclaredMethod("getMeCubeOfNumber", new Class[] {int.class});
		method.setAccessible(true);
		
		int result = (Integer)method.invoke(obj,  4);
		System.out.println("The cube of 4 is: "+result);
	}
}
