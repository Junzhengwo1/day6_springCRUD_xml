package com.kou.test;

import com.kou.domian.Account;
import com.kou.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author JIAJUN KOU
 */
public class AccountServiceTest {
    @Test
    public void testFindAll(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //得到spring容器的业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }

    }

    @Test
    public void testFindOne(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //得到spring容器的业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account account = as.findAccountById(2);
        System.out.println(account);
    }
    @Test
    public void testSave(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //得到spring容器的业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account account=new Account();
        account.setName("王后");
        account.setMoney((float) 5000.0);
        as.saveAccount(account);
        testFindAll();

    }
    @Test
    public void testUpdate(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //得到spring容器的业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account account = as.findAccountById(4);
        account.setName("王爷");
        account.setMoney(2000f);
        System.out.println(account);
        as.updateAccount(account);
        testFindAll();

    }
    @Test
    public void testDelete(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //得到spring容器的业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        as.deleteAccount(5);
        testFindAll();
    }
}
