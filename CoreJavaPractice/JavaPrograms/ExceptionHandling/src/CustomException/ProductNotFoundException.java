package CustomException;

public class ProductNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2042875881081263732L;

	public ProductNotFoundException(String message) {
		super(message);
	}

}
