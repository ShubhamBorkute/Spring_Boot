package temp;

import java.util.ArrayList;

public class ArrayListReturn {
public static void main(String[] args) {
	ArrayList<Object> al=new ArrayList<>();
	Integer arr[]= {1,1,5,5,8};

	
	al.add(arr);
System.out.println(al.get(0).getClass().getName());
	
	
}
}
