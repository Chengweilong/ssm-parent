package cwl.come.service.impl;

import cwl.come.domain.Account;
import cwl.come.mapper.AccountMapper;
import cwl.come.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    @Override
    public Account findById(int id) {
        Account byId = accountMapper.findById(id);

        return byId;
    }
}
