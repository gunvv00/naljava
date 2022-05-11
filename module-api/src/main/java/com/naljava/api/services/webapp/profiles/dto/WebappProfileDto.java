package com.naljava.api.services.webapp.profiles.dto;

import com.naljava.models.accounts.domain.Account;
import lombok.Builder;
import lombok.Data;

public class WebappProfileDto {

    @Data
    @Builder
    public static class Response {
        private Long accountId;
        private String name;

        public static Response of(Account account) {
            return Response.builder()
                    .accountId(account.getId())
                    .name(account.getName())
                    .build();
        }
    }
}
