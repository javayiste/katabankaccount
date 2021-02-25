package com.softeam.katabankaccount.exception;

public class InvalidTransactionException extends Exception {
	
	/**
	 * Author Morad MELSAOUI
	 * Classe exception pour les traitements transactional
	 */
	private static final long serialVersionUID = 1L;

	public InvalidTransactionException(String message) {
	      super(message);
	  }

}
