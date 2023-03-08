package com.becasemodule6.controllers;

import com.becasemodule6.Services.account.AccountServiceImpl;
import com.becasemodule6.models.Account;
import com.becasemodule6.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    AccountServiceImpl accountService;

    List<Role> roles = new ArrayList<>();

    @PostMapping("/save")
    public void save(@RequestBody Account account) {
        Role role = new Role(1);
        roles.add(role);
        account.setRoles(roles);
        accountService.save(account);
    }

    @GetMapping("/show")
    public List<Account> getAll() {
        return accountService.findAll();
    }
}
