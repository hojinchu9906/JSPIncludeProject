<%--
  Created by IntelliJ IDEA.
  User: sist
  Date: 2016-03-18
  Time: 오후 4:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>로그인.jsp</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

</head>
<body>
    <form method="post" action="../member/login_ok.jsp" id="logform">
        <table border="0" width="200">
            <tr>
                <td width="30%" align="right">ID</td>
                <td width="70%" align="left">
                    <input type="text" name="id" size="20">
                </td>
            </tr>
            <tr>
                <td width="30%" align="right">PW</td>
                <td width="70%" align="left">
                    <input type="password" name="pwd" size="21">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="right">
                    <input type="button" value="로그인">
                    <input type="button" value="회원가입" id="joinBtn">
                </td>
            </tr>
        </table>
    </form>

</body>
</html>

































