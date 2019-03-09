package com.imooc.o2o.util;

import javax.servlet.http.HttpServletRequest;

/**
 * <Description>处理HTTP请求的工具类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年3月9日 <br>
 * @since V7.3<br>
 * @see com.imooc.o2o.util <br>
 */
public class HttpServletRequestUtil {
    /**
     * Description:获取int类型数据<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param request
     * @param key
     * @return int<br>
     */
    public static int getInt(HttpServletRequest request, String key) {
        try {
            return Integer.decode(request.getParameter(key));
        }
        catch (Exception e) {
            return -1;
        }
    }

    /**
     * Description:获取long类型数据<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param request
     * @param key
     * @return Long<br>
     */
    public static Long getLong(HttpServletRequest request, String key) {
        try {
            return Long.valueOf(request.getParameter(key));
        }
        catch (Exception e) {
            return -1L;
        }
    }

    /**
     * Description:获取double类型数据<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param request
     * @param key
     * @return Double<br>
     */
    public static Double getDouble(HttpServletRequest request, String key) {
        try {
            return Double.valueOf(request.getParameter(key));
        }
        catch (Exception e) {
            return -1d;
        }
    }

    /**
     * Description:获取boolean类型数据<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param request
     * @param key
     * @return boolean<br>
     */
    public static boolean getBoolean(HttpServletRequest request, String key) {
        try {
            return Boolean.valueOf(request.getParameter(key));
        }
        catch (Exception e) {
            return false;
        }
    }

    /**
     * Description:获取String类型数据<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param request
     * @param key
     * @return String<br>
     */
    public static String getString(HttpServletRequest request, String key) {
        try {
            String result = request.getParameter(key);
            if (result != null) {
                result = result.trim();
            }
            if ("".equals(result)) {
                result = null;
            }
            return result;
        }
        catch (Exception e) {
            return null;
        }
    }
}
