package test;

import java.lang.reflect.Constructor;
import beans.Test;
public class Client {
	public static void main(String[] args){
		try{
			Class c=Class.forName("beans.Test");
			Constructor con[]=c.getDeclaredConstructors();
			con[0].setAccessible(true);
			Test t=(Test)con[0].newInstance(null);
			t.hello();
		}
		catch(Exception e){
			
		}
	}
}
