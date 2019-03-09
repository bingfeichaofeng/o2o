package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <Description>配置Spring和Junit整合，Junit启动时加载SpringIOC容器<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年2月17日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o <br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件的位置
@ContextConfiguration({
    "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"
})
public class BaseTest {

}
