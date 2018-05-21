package com.xl.dy.common.enumm;

/**
 * RPC通讯层签名计算方法枚举类
 */
public enum RpcSignTypeEnum {

    // 明文
    NOT_SIGN(0),
    // SHA-1签名
    SHA1_SIGN(1);

    private Integer code;

    private RpcSignTypeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode()
    {
        return this.code;
    }

    public static RpcSignTypeEnum getRpcSignTypeEnum(Integer code) {
        if (code == null) {
            return null;
        }

        RpcSignTypeEnum[] values =RpcSignTypeEnum.values();
        for (RpcSignTypeEnum e : values) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }

}
