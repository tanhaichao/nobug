package io.leopard.web4j.nobug.xss;

public class XssException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	public XssException(String message) {
		super(message);
	}

}
