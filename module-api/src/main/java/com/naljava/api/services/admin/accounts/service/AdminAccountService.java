package com.naljava.api.services.admin.accounts.service;

import com.naljava.api.services.admin.accounts.dto.AdminAccountDto;
import com.naljava.models.accounts.domain.Account;
import com.naljava.models.accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AdminAccountService {

    private final AccountService accountService;

    public AdminAccountDto.Response getAccount(Long id) {
        Account account = accountService.findById(id);
        return AdminAccountDto.Response.of(account);
    }
}
