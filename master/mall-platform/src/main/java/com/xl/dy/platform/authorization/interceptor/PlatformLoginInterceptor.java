package com.xl.dy.platform.authorization.interceptor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆拦截
 * <p>校验用户accessToken是否有效，有效则返回 用户信息，并封装到requestAttribute中</p>
 * @author nickliu on 2017/7/28 17:33.
 */
@Component
public class PlatformLoginInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(PlatformLoginInterceptor.class);
    
  //  @Autowired
    //private RpcConfigCommonService rpcConfigCommonService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		return false;
    /*   
    	if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }
        String accessToken = request.getHeader(UserConstants.ACCESS_TOKEN);
        String userId = request.getHeader(UserConstants.USER_ACCOUNT_ID);
        String platform = request.getHeader(UserConstants.PLATFORM);
        LOG.info("accessToken: {}", accessToken);
        LOG.info("userId: {}", userId);
        LOG.info("platform: {}", platform);
        if(StringUtils.isNotBlank(accessToken) && StringUtils.isNotBlank(userId) && StringUtils.isNotBlank(platform)){
            try{
            	//获取token
            	String result = rpcConfigCommonService.rpcTokenManagerApi.getToken(accessToken);
                if (!FastJsonUtils.callSuccess(result)) {
                    response.setStatus(403);
                    ResponseUtil.responseWithJson(response,BaseCode.FORBIDDEN);
                    return false;
                }
                TokenVO tokenVO = FastJsonUtils.getData(result, TokenVO.class);
                //access_token 校验
                if (tokenVO == null) {
                    return false;
                }
                //更新token
                String newTokenResult = rpcConfigCommonService.rpcTokenManagerApi.refreshToken(accessToken, Long.parseLong(userId), platform);
                TokenVO newTokenVO = FastJsonUtils.getData(newTokenResult, TokenVO.class);
                if (newTokenVO == null) {
                    LOG.error("token获取失败,返回报文{}", newTokenResult);
                    response.setStatus(403);
                    ResponseUtil.responseWithJson(response, BaseCode.FORBIDDEN);
                    return false;
                }
//                response.setHeader(UserConstants.ACCESS_TOKEN, newTokenVO.getAccessToken());
            } catch (Exception e) {
                LOG.error("[登陆拦截]业务异常,msg=" + e.toString(), e);
                response.setStatus(403);
                ResponseUtil.responseWithJson(response, BaseCode.FORBIDDEN);
                return false;
            }
        } else {
            LOG.error("[登陆拦截]accessToken不允许为空");
            response.setStatus(403);
            ResponseUtil.responseWithJson(response,BaseCode.FORBIDDEN);
            return false;
        }
        return super.preHandle(request, response, handler);*/
    }
    
//    @Override
//	public void postHandle(
//			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
//			throws Exception {
//    	String accessToken = request.getHeader(UserConstants.ACCESS_TOKEN);
//    	String userAccountId = request.getParameter("userAccountId");
//    	String result = tokenManagerApi.refreshToken(accessToken, userAccountId);
//    	TokenVO tokenVO = FastJsonUtils.getData(result, TokenVO.class);
//    	if(tokenVO==null){
//    		  response.setStatus(403);
//              ResponseUtil.responseWithJson(response,BaseCode.FORBIDDEN);
//              return ;
//    	}
//    	response.setHeader(UserConstants.ACCESS_TOKEN, tokenVO.getAccessToken());
//	}
    
    
}
