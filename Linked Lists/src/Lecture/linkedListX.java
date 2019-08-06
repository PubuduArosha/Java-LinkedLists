package Lecture;

public class linkedListX {

	private link first;
	
	public linkedListX() {
		first = null;
	}
	
	public void displayList() {
		link current = first;
		
		while( current != null ) {
			current.diplayLink();
			current = current.next;
		}
		
		System.out.println(" ");
	}
	
	public void insertFirst( int id ) {
		link newLink = new link(id);
		first = newLink;
		
	}
	
	public link deleteFirst() {
		link temp = first;
		first = first.next;
		return temp;
	}
	
	public boolean isEmpty() {
		return ( first == null );
	}
	
}
