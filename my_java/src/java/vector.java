package java;
import java.util.*;

public class vector {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("java");
		v.add("python");
		Iterator<String> i=v.iterator();
		while(i.hasNext())
		{
			System.out.println("i.next()");
		}
		
	}

}
