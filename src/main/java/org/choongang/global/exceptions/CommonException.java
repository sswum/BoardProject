package org.choongang.global.exceptions;

import jakarta.servlet.http.HttpServletResponse;

public class CommonException extends RuntimeException {
    private int status;

    public CommonException(String message) {
        this(message, HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        //응답코드 에러 설정함.
    }

    public CommonException(String message, int status) {
        super(message);
        this.status =status;   //상태 코드를 설정할 수 있게끔 넣어줌
    }
    public int getStatus() {
        return status;
    }

}
