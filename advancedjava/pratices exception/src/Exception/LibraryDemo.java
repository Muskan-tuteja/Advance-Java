package Exception;

class Library{
	public void borrowBook(int booksRequested) {
		try {
			int [] books = {101,102,103};
			System.out.println("Books Requested : " + books[booksRequested] );
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("you requested no accepted");
			
		}catch(NullPointerException e) {
			System.out.println("Null pointer Exception");
		}finally {
			System.out.println("Finally block");
		}
		
		}
}

public class LibraryDemo {
	public static void main(String[] args) {
		Library library = new Library();
		library.borrowBook(4);
		
	}

}
