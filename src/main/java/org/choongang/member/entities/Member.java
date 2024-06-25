package org.choongang.member.entities;

import lombok.Builder;
import lombok.Data;
import org.choongang.member.constants.UserType;

import java.time.LocalDateTime;

@Builder
@Data
public class Member {
    private long userNo;
    private String email;
    private String password;
    private String userName;
    private UserType userType = UserType.USER; //고정하는 이유는 일반 사용자로 쓸 수 있게끔!
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}

