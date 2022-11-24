package org.howard.edu.lsp.assignment7;

import java.util.*;

public class EmptyListException extends Exception{

	/**
	 * @param errorMessage The error message to be delivered when an IntegerSetException occurs.
	 */
	public EmptyListException(String errorMessage) {
		super(errorMessage);
	}
}
