package com.naljava.api.services.webapp.profiles.api;

import com.naljava.api.services.webapp.profiles.dto.WebappProfileDto;
import com.naljava.api.services.webapp.profiles.service.WebappProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webapp/profiles")
@RequiredArgsConstructor
public class WebappProfileApi {

    private final WebappProfileService webappProfileService;

    @GetMapping("/{accountId}")
    public ResponseEntity<?> getProfile(@PathVariable Long accountId) {
        WebappProfileDto.Response response = webappProfileService.getProfile(accountId);
        return ResponseEntity.ok(response);
    }

}
