<%--
  Created by IntelliJ IDEA.
  User: sist
  Date: 2016-03-18
  Time: 오후 3:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    pageEncoding="euc-kr" import="com.jsp.change.*" %>

<%
    //url에 파라미터를 아래처럼 mode로 줄것임.
    //../main/main.jsp?mode=1
    String log_jsp="";
    String req_jsp="";
    String mode=request.getParameter("mode");

    //main.jsp?mode=1
    if(mode==null)
        mode="0";
    req_jsp=JspChange.jspChange(Integer.parseInt(mode));

%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>메인.jsp</title>

    <style>
        td{
            font-family: 맑은 고딕;
            font-size: 9pt;
        }
    </style>

</head>
<body>
    <center>
        <table border="1" bordercolor="blue" width="900" cellspacing="0" cellpadding="0" height="700">
            <tr>
                <td width="100%" height="100" colspan="2">
                </td>
            </tr>

            <tr>
                <td width="200" height="500" valign="top" align="center">
                    <jsp:include page="../member/login.jsp"></jsp:include>
                    <jsp:include page="menu.jsp"></jsp:include>
                </td>
                <td width="700" height="100" align="center" style="margin-top: 15px">
                    <jsp:include page="<%=req_jsp%>"></jsp:include>
                </td>
            </tr>

            <tr>
                <td width="100%" height="100" colspan="2"></td>
            </tr>
        </table>
    </center>
</body>
</html>







































