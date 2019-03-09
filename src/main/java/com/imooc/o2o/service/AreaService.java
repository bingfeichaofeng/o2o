package com.imooc.o2o.service;

import java.util.List;

import com.imooc.o2o.entity.Area;

/**
 * <Description>区域实体类服务层接口 <br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年2月17日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.service <br>
 */
public interface AreaService {
    /**
     * Description:列出区域列表<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @return <br>
     */
    List<Area> getAreaList();
}
