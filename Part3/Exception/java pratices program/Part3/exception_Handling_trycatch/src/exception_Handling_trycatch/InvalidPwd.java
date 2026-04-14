package exception_Handling_trycatch;

public class InvalidPwd extends Exception {
	@Override
	public String getMessage() {
		return "pwd is incoreec";
	}
	

}
