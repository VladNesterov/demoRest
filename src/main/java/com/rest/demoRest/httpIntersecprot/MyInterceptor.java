package com.rest.demoRest.httpIntersecprot;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.BufferedReader;
import java.io.StringReader;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println(request.getHeader("Authorization"));
        ObjectMapper objectMapper = new ObjectMapper();
        StringBuilder requestBody = new StringBuilder();
        BufferedReader reader = request.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            requestBody.append(line);
        }
//        String jsonString = requestBody.toString();
//        ListAddressRqDto listAddressRqDto = objectMapper.readValue(jsonString, ListAddressRqDto.class);
//        listAddressRqDto.getAddressRqDto().forEach(it -> it.setAddressIndex("000000Pidor"));
//        String jsonBody = objectMapper.writeValueAsString(listAddressRqDto);
//        reader = new BufferedReader(new StringReader(jsonBody));
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
