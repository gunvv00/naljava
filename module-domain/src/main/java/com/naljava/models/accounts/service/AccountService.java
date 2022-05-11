package com.naljava.models.accounts.service;

import com.naljava.models.accounts.domain.Account;
import com.naljava.models.accounts.domain.repo.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository repository;

    public Account findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 account id 입니다."));
    }
}
