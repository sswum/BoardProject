package org.choongang.global.exceptions;

import jakarta.servlet.http.HttpServletResponse;

//어떤 관리자페이지 접근했을 때 나오게 해주는 예외 옵션
public class UnAuthorizedException extends CommonException {
    public UnAuthorizedException() {
        super("접근 권한이 없습니다.", HttpServletResponse.SC_UNAUTHORIZED);
    } //ERROR 401로 고정!

}
