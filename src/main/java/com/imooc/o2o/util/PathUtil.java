package com.imooc.o2o.util;

/**
 * <Description>路径工具类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年3月2日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.util <br>
 */
public class PathUtil {
    private static String seperator = System.getProperty("file.separator");

    /**
     * Description:根据不同的系统环境，返回相应的根目录<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @return <br>
     */
    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/projectdev/image/";
        }
        else {
            basePath = "/home/haugnwenyi/image/";
        }
        basePath = basePath.replace("/", seperator);
        return basePath;
    }

    /**
     * Description:返回项目图片的子路径<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param shopId
     * @return <br>
     */
    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/item/shop/" + shopId + "/";
        return imagePath.replace("/", seperator);
    }
}
