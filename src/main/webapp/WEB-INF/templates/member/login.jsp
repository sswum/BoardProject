<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<fmt:message var="pageTitle" key='로그인' />
<c:url var="actionUrl"  value="/member/join" />

<layout:main title="로그인">

<section class="layout-width content-box">
<h1>로그인 </h1>

<form name="frmLogin" method="GET" action="${actionUrl}" autocomplete="off">
<dl>
<dt>
    <fmt:message key="이메일" />

</dt>
<dd>
    <input type="text" name="email" placeholder="메일을 입력해주세요!">
</dd>
</dl>

<dl>
<dt>
    <fmt:message key="비밀번호" />
</dt>

<dd>
    <input type="password" name="password" placeholder="비밀번호를 입력해주세요!">

<button type="submit"> 입력
</button>

</form>
</section>
</layout:main>
