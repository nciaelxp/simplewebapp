package com.simple.web.exception;

import org.springframework.dao.DataAccessException;

/**
 * Created with IntelliJ IDEA.
 * User: nasya
 * Date: 13-12-6
 * Time: 上午12:11
 * To change this template use File | Settings | File Templates.
 */
public class UniqueIdentityException extends DataAccessException {

    /** serialVersionUID */
	private static final long serialVersionUID = 5563016880439088578L;

	public UniqueIdentityException(String message) {
        super(message);
    }

    public UniqueIdentityException(String message,Throwable e) {
        super(message,e);
    }
}
