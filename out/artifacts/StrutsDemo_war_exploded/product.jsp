<%--
  Created by IntelliJ IDEA.
  User: tvngi
  Date: 6/22/2020
  Time: 7:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%--<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>--%>

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
<s:form method="POST" action="product">
    <s:textfield name="name" label="Name"/>
    <s:textfield name="quantity" label="Quantity"/>
    <s:textfield name="price" label="Price"/>
    <s:select list="{'male','female','unknown'}" label="Gender" headerKey="-1" headerValue="--Chon gender--"/>
    <s:checkbox name="checkBox" fieldValue="true" label="Test"/>
    <s:checkboxlist list="{'Red','Green'}" label="Color" name="color"/>
    <s:submit value="Save"/>
</s:form>
<s:if test="%{price < 500}">
    <h1>San pham binh dan</h1>
</s:if>


</body>
</html>
