package com.chinasoft.wangpo.service.impl;

import com.chinasoft.wangpo.entity.Account;
import com.chinasoft.wangpo.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * 2017-06-14 23:03
 *
 * @author Makise
 */
@Service("/accountService")
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService{

    @Override
    public Account userLogin(Account account) {
        return accountDao.userLogin(account);
    }

}
