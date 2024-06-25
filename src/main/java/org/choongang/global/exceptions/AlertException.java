package org.choongang.global.exceptions;


//알림창으로 예외를 뜨게 설정
public class AlertException extends CommonException {
    public AlertException(String message, int status) {
        super(message, status);

    }

}
