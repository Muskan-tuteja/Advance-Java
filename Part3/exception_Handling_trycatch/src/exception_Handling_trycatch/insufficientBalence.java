package exception_Handling_trycatch;

public class insufficientBalence extends RuntimeException {
	@Override
	public String getMessage()
	{
		return"Check account balance";
	}

}
