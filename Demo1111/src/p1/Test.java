package p1;

import java.util.ArrayList;
import java.util.Comparator;

class Byname implements Comparator{

	private int id=0;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compare(Object o1, Object o2) {
		
		return 0;
	}
	
}

public class Test {
	
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(101);
		al.add(102);
		
		al.forEach(e->System.out.println(e));
		
		al.sort(new Byname() );
		
	}

}
