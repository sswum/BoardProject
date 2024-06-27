package org.choongang.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.choongang.global.config.annotations.Component;
import org.choongang.global.config.containers.BeanContainer;
import org.choongang.member.constants.UserType;
import org.choongang.member.entities.Member;

//애노테이션을 알아서 의존성 주입해주는 리콰이어드알규
@RequiredArgsConstructor
@Component
public class MemberUtil {
    //세션 객체 필요해서 생성
    private final HttpSession session;

//조회 했을 때 나오면 로그인상태,아니면 미로그인 상태
    //로그인 여부
    public boolean isLogin() {
        return getMember() != null;
    }

    //관리자 여부
    public boolean isAdmin() {
        if (isLogin()) {
            Member member  = getMember(); //회원데이터 조회

            return member.getUserType() == UserType.ADMIN;
        }
        return false;
    }

    /**
     *
     *  로그인한 회원 정보
     * @return
     */

    public Member getMember() {
        HttpSession session = BeanContainer.getInstance().getBean(HttpSession.class);
        Member member = (Member) session.getAttribute("member");
        return member;
    }


}
