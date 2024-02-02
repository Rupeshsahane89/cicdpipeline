package io.getarrays.cicdpipeline.web;

import static java.time.LocalTime.now;
import  static java.util.Map.of;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.apache.tomcat.websocket.AuthenticatorFactory;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.Map;


import static java.util.Optional.of;

@RestController
@RequestMapping(path = "/test")
public class TestController {
    @GetMapping
    public ResponseEntity<Map<String,String>> test() {
         return ResponseEntity.ok().body(Map.of("Testing ","up and running"));
    }




}
