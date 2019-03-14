package com.imooc.o2o.util;

import javax.servlet.http.HttpServletRequest;

/**
 * <Description>验证码工具类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年3月14日 <br>
 * @since V7.3<br>
 * @see com.imooc.o2o.util <br>
 */
public class CodeUtil {
    public static boolean checkVerifyCode(HttpServletRequest request) {
        String verifyCodeExpected = (String) request.getSession().getAttribute("code");
        String verifyCodeActual = HttpServletRequestUtil.getString(request, "verifyCodeActual");
        if (verifyCodeActual == null || !(verifyCodeActual.equals(verifyCodeExpected))) {
            return false;
        }
        return true;
    }
}
