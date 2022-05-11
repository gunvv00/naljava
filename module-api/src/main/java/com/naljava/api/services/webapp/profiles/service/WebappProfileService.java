package com.naljava.api.services.webapp.profiles.service;

import com.naljava.api.services.webapp.profiles.dto.WebappProfileDto;
import com.naljava.models.accounts.domain.Account;
import com.naljava.models.accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class WebappProfileService {

    private final AccountService accountService;

    public WebappProfileDto.Response getProfile(Long accountId) {
        Account account = accountService.findById(accountId);
        return WebappProfileDto.Response.of(account);
    }
}
