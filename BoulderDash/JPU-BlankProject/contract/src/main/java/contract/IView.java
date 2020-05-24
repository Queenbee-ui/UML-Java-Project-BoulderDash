package contract;

/**
 * The Interface IView.
 *
 * @author Reine
 */
public interface IView {

	/**
	 * Prints the message.
	 *
	 * @param message the message
	 */
	void printMessage(final String message);

	/**
	 * Closes the Window and exits the Program
	 */
	public void close();
}
