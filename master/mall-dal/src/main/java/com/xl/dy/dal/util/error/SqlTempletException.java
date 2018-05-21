package com.xl.dy.dal.util.error;


public class SqlTempletException extends Exception {
	public final String ERR_MSG="SQL执行异常";
	public SqlTempletException() {
        super("SQL执行异常");
    }
	public SqlTempletException(String msg) {
        super(msg);
    }

    public SqlTempletException(Exception ex) {
        super(ex);
    }

    public SqlTempletException(String msg, Exception ex) {
        super(msg, ex);
    }

    public SqlTempletException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public SqlTempletException(Throwable cause) {
        super(cause);
    }
}
