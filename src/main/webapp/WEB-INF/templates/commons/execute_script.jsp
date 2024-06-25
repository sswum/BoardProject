<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.cor" %>
<c:if test="${! empty script}"> !-- 비어있지 않을 때 --!
<script>
${script}
</script>

</c:if>