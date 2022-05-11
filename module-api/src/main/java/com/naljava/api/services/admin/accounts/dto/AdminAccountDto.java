package com.naljava.api.services.admin.accounts.dto;

import com.naljava.models.accounts.domain.Account;
import lombok.Builder;
import lombok.Data;

public class AdminAccountDto {

    @Data
    @Builder
    public static class Response {
        private Long id;
        private String name;
        private String username;

        public static Response of(Account account) {
            return Response.builder()
                    .id(account.getId())
                    .name(account.getName())
                    .username(account.getUsername())
                    .build();
        }
    }
}
