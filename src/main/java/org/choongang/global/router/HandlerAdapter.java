package org.choongang.global.router;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

public interface HandlerAdapter {
    void execute(HttpServletRequest request, HttpServletResponse response, List<Object> data)
        throws Exception;
}


//내부처리하지않고 전가시킴