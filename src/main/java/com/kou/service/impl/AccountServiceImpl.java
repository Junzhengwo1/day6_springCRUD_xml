package com.kou.service.impl;

import com.kou.dao.IAccountDao;
import com.kou.domian.Account;
import com.kou.service.IAccountService;

import java.util.List;

/**
 * @author JIAJUN KOU
 * 账户业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }
    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }
    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }
    @Override
    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
