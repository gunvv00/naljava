package com.naljava.api.services.admin.accounts.api;

import com.naljava.api.services.admin.accounts.dto.AdminAccountDto;
import com.naljava.api.services.admin.accounts.service.AdminAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/accounts")
@RequiredArgsConstructor
public class AdminAccountApi {

    private final AdminAccountService adminAccountService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getAccount(@PathVariable Long id) {
        AdminAccountDto.Response response = adminAccountService.getAccount(id);
        return ResponseEntity.ok(response);
    }
}
