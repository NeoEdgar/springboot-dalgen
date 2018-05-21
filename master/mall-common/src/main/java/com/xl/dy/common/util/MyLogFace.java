package com.xl.dy.common.util;

/**
 *
 */
public class MyLogFace implements MyLogInf {

    private org.slf4j.Logger 				log = null;
    public void setName(String clz) { 		log = org.slf4j.LoggerFactory.getLogger(clz);	}

    public boolean isDebugEnabled() { return log.isDebugEnabled();		}
    public boolean isInfoEnabled() 	{ return log.isInfoEnabled();   	}
    public boolean isWarnEnabled() 	{ return log.isWarnEnabled();		}
    public boolean isErrorEnabled() { return log.isErrorEnabled();		}
    public boolean isTraceEnabled() { return log.isTraceEnabled();		}

    public void trace(String message, Object... args) {
        if (this.isTraceEnabled()) {
            log.trace(message, args);
        }
    }

    @Override
    public void debug(String message, Object... args) {
        if (this.isDebugEnabled()) {
            log.debug(message, args);
        }
    }

    @Override
    public void info(String message, Object... args) {
        if (this.isInfoEnabled()) {
            log.info(message, args);
        }
    }

    @Override
    public void warn(String message, Object... args) {
        if (this.isWarnEnabled()) {
            log.warn(message, args);
        }
    }

    public void error(String message, Object... args) {
        if (this.isErrorEnabled()) {
            log.error(message, args);
        }
    }

    @Override
    public void error(Throwable e, String message, Object... args) {
        if (this.isErrorEnabled()) {
            log.error(String.format(message, args), e);
        }
    }
    //------------------
    public void error(Throwable e, String message) {//简化版
        if (this.isErrorEnabled()) {
            log.error(message + e.toString(), e);
        }
    }

}
