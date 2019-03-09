package com.imooc.o2o.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

/**
 * <Description>项目图片处理工具类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年3月2日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.util <br>
 */
public class ImageUtil {
    private final static Logger logger = LoggerFactory.getLogger(ImageUtil.class);

    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

    private static ThreadLocalRandom random = ThreadLocalRandom.current();

    /**
     * Description:生成图片缩略图<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param thumbnail
     * @param targetAddr
     * @return 图片的路径<br>
     */
    public static String generateThumbnail(CommonsMultipartFile thumbnail, String targetAddr) {
        String realFileName = getRandomFileName();
        String extension = getFileExtension(thumbnail);
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr + realFileName + extension;
        File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
        try {
            Thumbnails.of(thumbnail.getInputStream()).size(200, 200)
                .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.jpg")), 0.25f)
                .outputQuality(0.8f).toFile(dest);
        }
        catch (IOException e) {
            logger.error("创建缩略图失败" + e.toString());
        }
        return relativeAddr;
    }

    /**
     * Description:创建目标路径所涉及到的目录,即/home/work/huangwenyi/xxx.jpg 那么,home,work,huangwenyi 这三个文件夹都得创建,除非已经存在<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param targetAddr <br>
     */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }
    }

    /**
     * Description:随机生成文件名，当前年月日时分秒+五位随机数<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @return String<br>
     */
    private static String getRandomFileName() {
        // 获取随机的五位数
        int rannum = random.nextInt(8999) + 10000;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String nowTimeStr = sdf.format(new Date());
        sdf = null;
        return nowTimeStr + rannum;
    }

    /**
     * Description:获取输入文件的扩展名<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @return String<br>
     */
    private static String getFileExtension(CommonsMultipartFile cFile) {
        String originalFileName = cFile.getOriginalFilename();
        return originalFileName.substring(originalFileName.lastIndexOf("."));
    }
}
