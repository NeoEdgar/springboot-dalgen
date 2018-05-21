package com.xl.dy.platform.controller.test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.xl.dy.platform.serviceImpl.test.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.xl.dy.common.constant.BaseCode;
import com.xl.dy.common.constant.BaseException;
import com.xl.dy.common.util.dy.OssUtil;
import com.xl.dy.common.util.ResInfo;
import com.xl.dy.common.util.ResultBuilder;


/**
 * @author LHJ
 */
@Controller
@RequestMapping(value = "/test")
public class HelloController {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private TestServiceImpl testService;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public ResInfo sayHello() {
        return ResultBuilder.buildNewDataSuccess("hello");
    }

    /**
     * 图片上传
     *
     * @throws Exception
     */
    @RequestMapping(value = "/uploadPhoto")
    public void getPhoto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        Map<String, String> ma = new HashMap<>();
        MultipartFile file = multipartRequest.getFile("file");
        if (file == null || file.getSize() <= 0) {
            throw new BaseException(BaseCode.PARAM_ERROR);
        }
        InputStream inputStream = file.getInputStream();
        String originalFilename = file.getOriginalFilename();
        String substring = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
        String name = System.currentTimeMillis() + substring;
        String ossUp = OssUtil.OSSUp(inputStream, name);
//		Ossutil ossClient = new Ossutil();
//		String name = ossClient.uploadImg2Oss(file);
//		String imgUrl = ossClient.getImgUrl(name);
        ma.put("imgUrl", ossUp);
        System.out.println(ossUp);
        response.setContentType("text/html;chartset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(JSON.toJSONString(ma));
    }
}