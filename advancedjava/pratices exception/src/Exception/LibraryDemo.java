package Exception;



class BookUnavailableException extends Exception{
	public BookUnavailableException(String message) {
		super(message);
	}
}
class Library{
	int availableBooks = 3;
	public void borrowBook(int booksRequestedCount) throws Exception {
		
			if(booksRequestedCount > availableBooks)
				throw new BookUnavailableException("Not enough books available");
			if(booksRequestedCount < 0)
				throw new Exception("You Must bi avaible the exception 1 books");
		
	}
}

public class LibraryDemo {
	public static void main(String[] args) {
		Library library = new Library();
		try {
			library.borrowBook(19);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Exception Occured :" + e.getMessage());
//			System.out.println("Exception Occured");
		}
		
	}

}






















































// throws used 

//package Exception;
//
//class Library{
//	int availableBooks = 3;
//	public void borrowBook(int booksRequestedCount) throws Exception {
//		
//			if(booksRequestedCount > availableBooks)
//				throw new Exception("Not enough books available");
//			if(booksRequestedCount < 0)
//				throw new Exception("You Must bi avaible the exception 1 books");
//		
//	}
//}
//
//public class LibraryDemo {
//	public static void main(String[] args) {
//		Library library = new Library();
//		try {
//			library.borrowBook(-1);
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//			System.out.println("Exception Occured :" + e.getMessage());
////			System.out.println("Exception Occured");
//		}
//		
//	}
//
//}















































// throw

//package Exception;
//
//class Library{
//	int availableBooks = 3;
//	public void borrowBook(int booksRequestedCount) {
//		try {
//			if(booksRequestedCount > availableBooks)
//				throw new Exception("Not enough books available");
//			
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("you requested no accepted");
//			
//		}catch(Exception e) {
//			System.out.println("Null pointer Exception");
//		}finally {
//			System.out.println("Finally block");
//		}
//		
//	}
//}
//
//public class LibraryDemo {
//	public static void main(String[] args) {
//		Library library = new Library();
//		library.borrowBook(10);
//		
//	}
//
//}




























// try and catch or finally 

//package Exception;
//
//class Library{
//	int availableBooks = 3;
//	public void borrowBook(int booksRequested) {
//		try {
//			int [] books = {101,102,103};
//			System.out.println("Books Requested : " + books[booksRequested] );
//			
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("you requested no accepted");
//			
//		}catch(NullPointerException e) {
//			System.out.println("Null pointer Exception");
//		}finally {
//			System.out.println("Finally block");
//		}
//		
//		}
//}
//
//public class LibraryDemo {
//	public static void main(String[] args) {
//		Library library = new Library();
//		library.borrowBook(4);
//		
//	}
//
//}
