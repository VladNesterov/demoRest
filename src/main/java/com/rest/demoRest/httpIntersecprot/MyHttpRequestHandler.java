package com.rest.demoRest.httpIntersecprot;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import java.io.IOException;
import java.io.PrintWriter;

@Component
public class MyHttpRequestHandler implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request,
                              HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        System.out.println("response from MyHttpRequestHandler, uri: " + request.getRequestURI());
        System.out.println(request.getRequestURI());
    }
}
