package com.xl.dy.platform.authorization.exception;

import com.xl.dy.common.constant.BaseCode;
import com.xl.dy.common.constant.BaseException;
import com.xl.dy.common.util.DateUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 全局异常拦截
 * @Param:
 * Created by JT on 2018/5/21 0021.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
   
    @ResponseBody
    /*
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req,BaseException e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(e.getError().getCode());
        r.setData(e.getError());
        r.setUrl(req.getRequestURL().toString());
        return r;
    }*/
    
    public Map<String,Object> exception(HttpServletRequest req,Exception e){
		Map<String,Object> map=new HashMap<String,Object>();
		// 判断如果事自定义异常则做出响应
		if(e instanceof BaseException){
			map.put("error", ((BaseException) e).getError());
			map.put("message", e.getMessage());
		}else {
			// 未知的异常做出响应
			map.put("error",BaseCode.UNKNOWN.getCode());
			map.put("message", BaseCode.UNKNOWN.getMessage());
		}
		map.put("url", req.getRequestURL().toString());
		map.put("timeStamp", DateUtils.dateToString(new Date()));
		return map;
	} 

}