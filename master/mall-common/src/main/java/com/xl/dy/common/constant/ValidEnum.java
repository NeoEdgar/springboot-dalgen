package com.xl.dy.common.constant;

/**
 * 是否有效
 *
 * @author YM
 */
public enum ValidEnum {

    YES("1", "是"),
    NO("0", "否");

    private String code;
    private String info;

    ValidEnum(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public static ValidEnum convertToEnum(String code) {
        for (ValidEnum validEnum : values()) {
            if (validEnum.getCode().equalsIgnoreCase(code)) {
                return validEnum;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
