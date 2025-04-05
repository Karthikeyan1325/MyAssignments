package week2.day1;

public class LibraryClass {
	
	public String addBook(String bookTitle) {
		// TODO Auto-generated method stub
		
		System.out.println("vinland saga " + bookTitle);
		
		
		return bookTitle ;

	}
	
	public void issueBook() {
		// TODO Auto-generated method stub
		
		System.out.println("Book issued successfully");

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LibraryClass book = new LibraryClass();
		
		//method 1
		book.addBook("Book added successfully");
		
		//method 2
		book.issueBook();
		
		
		
		
		
		
		
	}

}
