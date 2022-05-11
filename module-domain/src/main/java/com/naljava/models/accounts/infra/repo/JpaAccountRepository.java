package com.naljava.models.accounts.infra.repo;

import com.naljava.models.accounts.domain.Account;
import com.naljava.models.accounts.domain.repo.AccountRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaAccountRepository extends JpaRepository<Account, Long>, AccountRepository {
}
