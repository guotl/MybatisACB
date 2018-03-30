<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <base href="<%=basePath%>">
    <title>Insert title here</title>
</head>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js" type="text/javascript">
</script>
<body>

<h2>Index.jsp</h2>
<p>
    缺少登陆之后跳转的操作
</p>
<p>
    后续补充登陆和注册功能
</p>

<script type="text/javascript">
    $(function () {
        window.location.href = "<%=basePath%>html/login.html";
    });
</script>
</body>
</html>
