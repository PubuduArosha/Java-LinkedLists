package Lecture;

public class myLinkList {

	public static void main(String[] args) {
		
		linkedListX theList = new linkedListX();
		
		theList.insertFirst(23);
		theList.insertFirst(89);
		theList.insertFirst(12);
		theList.insertFirst(55);
		
		theList.displayList();
		
		while( !theList.isEmpty()) {
			link aLink = theList.deleteFirst();
			System.out.println("Deleted");
			aLink.diplayLink();
		}

	}

}
