<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- %@ page contentType="text/html;charset=UTF-8" % -->
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="<%=request.getContextPath() %>/assets/css/user.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<div id="header">
		<jsp:include page="/WEB-INF/views/includes/header.jsp"/>
		</div>
		<div id="content">
			<div id="user">
				<form id="login-form" name="loginform" method="post" action="<%=request.getContextPath()%>/user">
					<input name="a" type="hidden" value="login">
					<label class="block-label" for="email">이메일</label>
					<input id="email" name="email" type="text" value="">
					<label class="block-label" >패스워드</label>
					<input name="password" type="password" value="">

					<%
						String result = (String)request.getAttribute("result");
						if("fail".equals(result)){ 
					%>
						<p>
							로그인이 실패 했습니다.
						</p>
					<% 
						} 
					%>

					<input type="submit" value="로그인">
				</form>
			</div>
		</div>
		<div id="navigation">
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp"/>
		</div>
		<div id="footer">
		<jsp:include page="/WEB-INF/views/includes/footer.jsp"/>
		</div>
	</div>
</body>
</html>