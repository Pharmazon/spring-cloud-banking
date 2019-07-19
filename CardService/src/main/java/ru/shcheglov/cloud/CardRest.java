package ru.shcheglov.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CardRest {

    @Value("${test}")
    private String test;

    @Autowired
    private CardNumberGenerator generator;

    @PreAuthorize("hasAuthority('CARD_WRITE')")
    @RequestMapping("create")
    public String createNewCard() {
        return generator.generate();
    }

    @RequestMapping("/test")
    public String test() {
        return test;
    }
}
