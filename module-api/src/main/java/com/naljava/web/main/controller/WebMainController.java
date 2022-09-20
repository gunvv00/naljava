package com.naljava.web.main.controller;

import com.naljava.models.systeminfos.domain.SystemInfo;
import com.naljava.models.systeminfos.service.SystemInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class WebMainController {

    private final SystemInfoService systemInfoService;

    @Value("${http_https}")
    private String httpHttps;

    @Value("${server_domain}")
    private String serverDomain;

    @Value("${service_domain}")
    private String serviceDomain;

    @Value("${server.port}")
    private String port;

    @Value("${bucket_url}")
    private String bucketUrl;

    @GetMapping({"", "/"})
    public String main(Model model) {
        model.addAttribute("port", port);

        SystemInfo systemInfo = systemInfoService.findByName("SERVER_START_TIME");
        model.addAttribute("serverStartDateTime", systemInfo.getValue());
        model.addAttribute("bucketUrl", bucketUrl);

        model.addAttribute("httpHttps", httpHttps);
        model.addAttribute("serverDomain", serverDomain);
        model.addAttribute("serviceDomain", serviceDomain);
        return "main";
    }

}
