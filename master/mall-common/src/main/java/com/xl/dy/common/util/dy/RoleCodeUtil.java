package com.xl.dy.common.util.dy;

/**
 * @program: mall-master
 * @description: 生成角色编码
 * @author: Caeser
 * @create: 2018-03-21 16:09
 **/
public class RoleCodeUtil {
    public static String getRoleCode(String code){
        char[] charArr = code.toCharArray();
        char lastChar = charArr[charArr.length-1];
        char lastSecChar = charArr[charArr.length-2];
        int result = Integer.parseInt(lastChar+"");
        String resultCode = "";
        if(result<9){
            result += 1;
            for(int i = 0;i <charArr.length-1;i++){
                resultCode+=charArr[i];
            }
            resultCode = resultCode+result;
            return resultCode;
        }else{
            int lastSec = Integer.parseInt(lastSecChar+"");
            lastSec +=1;
            for(int i = 0;i <charArr.length-2;i++){
                resultCode+=charArr[i];
            }
            resultCode = resultCode+lastSec+0;
            return resultCode;
        }

    }
}
