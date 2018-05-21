package com.xl.dy.platform.config;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Description: 读取配置文件的配置信息
 * @Param:
 * Created by JT on 2018/5/21 0021.
 */
@Configuration
@ConfigurationProperties(prefix = "swiftpass.pay",ignoreUnknownFields = false)
public class SwiftpassProperties {
    /**
     * 威富通支付商户号
     */
    private String mchId;

    /**
     * 威富通支付商户密钥
     */
    private String key;

    /**
     * 威富通支付回调url
     */
    private String reqUrl;

    /**
     * 威富通通知回调url
     */
    private String notifyUrl;

    /**
     * 威富通appId
     */
    private String appId;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getReqUrl() {
        return reqUrl;
    }

    public void setReqUrl(String reqUrl) {
        this.reqUrl = reqUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
