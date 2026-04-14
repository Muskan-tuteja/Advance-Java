package exception_Handling_trycatch;

public class OutOfLimitException extends Exception {
	public String getMessage() {
		return "Withdrawal amount exceeds daily limited";
	}
}
