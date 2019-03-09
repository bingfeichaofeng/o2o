package com.imooc.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;

/**
 * <Description>区域dao测试类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年2月17日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.dao <br>
 */
public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    /**
     * Description:测试列出区域列表方法<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     *         <br>
     */
    @Test
    public void testQueryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2, areaList.size());
    }
}
