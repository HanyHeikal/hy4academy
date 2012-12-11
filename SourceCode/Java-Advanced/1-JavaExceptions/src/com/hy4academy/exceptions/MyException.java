package com.hy4academy.exceptions;
// throwable class
public class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	private int causeCode = 0;
	private String reason = "";

	public MyException(int causeCode, String reason) {
		this.causeCode = causeCode;
		this.reason = reason;
	}

	public int getCauseCode() {
		return causeCode;
	}

	public String getReason() {
		return reason;
	}

	// causeCode constants
	public static final int RESPONSE_SUCCESS = 0;
	public static final int ACCOUNT_NOT_FOUND = 101;
	public static final int DB_PROBLEM = 102;

	public String getCauseCodeString() {
		String causeCodeString = null;
		switch (this.causeCode) {
		case RESPONSE_SUCCESS:
			causeCodeString = "Successful";
		case ACCOUNT_NOT_FOUND:
			causeCodeString = "Account is not found in database";
			break;
		default:
			causeCodeString = "Invalid CauseCode";
			break;
		}
		return causeCodeString;
	}
}
