<%--
  Created by IntelliJ IDEA.
  User: sist
  Date: 2016-03-22
  Time: 오후 2:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         import="java.util.*,com.sist.movie.data.*" pageEncoding="EUC-KR" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <table border="0" width="600">
            <tr>
                <%
                    MovieDataManager movieDataManager=new MovieDataManager();
                    List<MovieDTO> movieDTOList=movieDataManager.movieAllData();
                    //출렬
                    for(MovieDTO movieDTO : movieDTOList){
                        %>
                        <td>
                            <img src="<%=movieDTO.getImage()%>" width="100" height="120">
                        </td>
                <%
                    }
                %>
            </tr>

            <tr>
                <%
                    for(MovieDTO movieDTO:movieDTOList){
                        %>
                        <td>
                            <%=movieDTO.getTitle()%>
                        </td>
                <%
                    }
                %>
            </tr>
        </table>
    </center>
</body>
</html>


























































































