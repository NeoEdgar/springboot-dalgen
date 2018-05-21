package com.xl.dy.common.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 异常码枚举类
 * @Param:
 * Created by JT on 2018/5/21 0021.
 */
public enum BaseCode {

    SUCCESS(200, "Opeartion success"),
    INSERT_FAIL(-10,"insert fail"),
    EMPTY_DATA(-11,"Empty data"),
    PARAM_ERROR(-12, "参数错误"),
    FORBIDDEN(-13, "用户无权限"),
    NOT_LOGGED_IN(-14,"用户没有登录"),
    PARSE_ERROR(-15, "解析错误"),

    UNKNOWN(-1, "Unknown error");


    private static final Map<Integer, BaseCode> values = new HashMap<>();

    static {
        for (BaseCode ec : BaseCode.values()) {
            values.put(ec.code, ec);
        }
    }

    private int code;
    private String message;

    BaseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static BaseCode valueOf(int code) {
        BaseCode ec = values.get(code);
        if (ec != null) {
            return ec;
        }
        return UNKNOWN;
    }

    public static BaseCode valueOfCodeStr(String codeStr) {
        int code = Integer.parseInt(codeStr);
        BaseCode ec = values.get(code);
        if (ec != null) {
            return ec;
        }
        return UNKNOWN;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}