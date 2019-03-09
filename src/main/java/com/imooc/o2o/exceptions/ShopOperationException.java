package com.imooc.o2o.exceptions;

/**
 * <Description>业务异常类，简单封装，让报错更明显<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年3月9日 <br>
 * @since V7.3<br>
 * @see com.imooc.o2o.exceptions <br>
 */
public class ShopOperationException extends RuntimeException {

    /**
     * serialVersionUID <br>
     */
    private static final long serialVersionUID = 2361446884822298905L;

    public ShopOperationException(String msg) {
        super(msg);
    }
}
