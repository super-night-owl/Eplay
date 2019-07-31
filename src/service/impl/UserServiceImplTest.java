package service.impl;


import bean.UserBean;
import com.sun.org.apache.bcel.internal.generic.DADD;
import org.junit.Test;
import service.UserService;
import util.DateUtil;
import util.Factory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create by mysteriousTime
 * time on 2019/7/29  19:52
 */

public class UserServiceImplTest {
//
    UserServiceImpl userService=new UserServiceImpl();
    @Test
    public void register() {
        UserBean userBean=new UserBean("ad","qeq","s","af","1","nan","142@qd","1234345","1",0,"13243564","245336");
        userService.register(userBean,"132");

    }

    @Test
    public void isExcit() {
        UserBean userBean=new UserBean("ad","qeq","s","af","1","nan","142@qd","1234345","1",0,"13243564","245336");
        UserBean userBean1=new UserBean("宋远桥");
        userService.isExcit(userBean1);
    }

    @Test
    public void isActive() {

    }

    @Test
    public void login() {
    }

    @Test
    public void takeOrder() {
    }

    @Test
    public void addMyOrder() {
    }

    @Test
    public void delOrder() {
    }

    @Test
    public void comment() {
    }
}
