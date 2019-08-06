package Lecture;

public class link {
	
	public int iData; //data item
	public link next; //reference to the next link
	
	public link ( int id ) {
		iData = id;
		next = null;
	}
	
	public void diplayLink() {
		System.out.println(iData);
	}

}
