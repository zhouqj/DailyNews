package test;

import com.dailyNews.model.User;
import com.dailyNews.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zhouqj on 2017/1/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private IUserService userService = null;

    @Test
    public void test(){
        User user = userService.getUserById(1);
        if(user!=null) {
            logger.info(user.getUser_name());
        }
        else{
            logger.info("用户不存在");
        }
    }

}
