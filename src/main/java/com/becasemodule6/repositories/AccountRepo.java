package com.becasemodule6.repositories;

import com.becasemodule6.models.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountRepo extends PagingAndSortingRepository<Account, Long> {
    Account findAccountByUsername(String username);
}
