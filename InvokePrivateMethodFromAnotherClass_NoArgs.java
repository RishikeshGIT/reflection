package reflection;

import java.lang.Class;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokePrivateMethodFromAnotherClass_NoArgs {
	public static void main(String [] args) throws 
	ClassNotFoundException, SecurityException, IllegalAccessException, InstantiationException, 
	NoSuchMethodException, IllegalArgumentException, InvocationTargetException 
	{
		Class c = Class.forName("reflection.TestClass_Simple");
		Object obj = c.newInstance();
		
		Method method = c.getDeclaredMethod("displayMessage", null);
		method.setAccessible(true);
		
		method.invoke(obj, null);
	}
}
