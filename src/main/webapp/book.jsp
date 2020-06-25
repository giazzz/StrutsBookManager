<%--
  Created by IntelliJ IDEA.
  User: tvngi
  Date: 6/24/2020
  Time: 8:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .errorMessage{
            color: red;
        }
    </style>

    <%--    <sb:head/>--%>
</head>
<body>
<s:form method="POST" action="book">
    <s:textfield name="tenSach" label="Ten sach"/>
    <s:textfield name="tomTat" label="Tom tat"/>
    <s:select name="maTG" list="#{'1':'gia', '2':'tre'}" label="Tac gia" headerKey="-1" headerValue="--Chon tac gia--"/>
    <s:submit value="Save"/>
</s:form>

</body>
</html>
