package org.choongang.global.router;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.choongang.global.config.containers.BeanContainer;

import java.io.IOException;

@WebServlet("/")
public class DispatcherServlet extends HttpServlet  {

    //모든 요청은 이 서비스를 통해서 나아간다.
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        BeanContainer bc = BeanContainer.getInstance(); //객체 컨테이너 생성
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        bc.addBean(HttpServletRequest.class.getName(), request);
        bc.addBean(HttpServletResponse.class.getName(), response);
        bc.addBean(HttpSession.class.getName(), request.getSession());
//서블릿 기본 객체 3가지를 지정 ,근데 직접 관리하는 이유는 싱글톤은 이미 객체가 만들어져 있으면
        //더이상 만들지 않기 때문에 생성 => 왜냐면 세개의 객체는 계속 바뀔 수 있기 때문에
        bc.loadBeans(); // 애노테이션이 있는 모든 객체를 불러오고 의존성을 다 주입한다.

        RouterService service = bc.getBean(RouterService.class);
        service.route(request, response);
    }
}
