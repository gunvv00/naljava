package com.naljava.models.accounts.domain.repo;

import com.naljava.models.accounts.domain.Account;

import java.util.Optional;

public interface AccountRepository {
    Optional<Account> findById(Long id);
}
