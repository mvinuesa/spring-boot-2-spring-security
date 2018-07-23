package com.mvinuesa.spring.boot.security.poc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Controller to manage security endpoints
 *
 * @author mvinuesa
 * @since 1.0.0
 *
 */
@RequestMapping("/api/")
@RestController
public class UserController {


    /**
     * Endpoint with security
     * <p>
     * @return String with a description
     */
    @GetMapping(produces = APPLICATION_JSON_VALUE, value = "/endpointWithBasicSecurity")
    @ResponseStatus(OK)
    public String endpointWithBasicSecurity() {
        return "endpointWithBasicSecurity";
    }

    /**
     * Endpoint without security
     * <p>
     * @return String with a description
     */
    @GetMapping(produces = APPLICATION_JSON_VALUE, value = "/endpointWithoutSecurity")
    @ResponseStatus(OK)
    public String endpointWithoutSecurity() {
        return "endpointWithoutSecurity";
    }
}
