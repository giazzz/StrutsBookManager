<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Success</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 50%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<h1>List Book</h1>
<td>
    <a href="book.jsp">Tạo mới</a>
</td>

<table>
    <tr>
        <th>Mã sách</th>
        <th>Tên sách</th>
        <th>Tóm tắt</th>
        <th>Tác giả</th>
        <th>Email tác giả</th>
        <th></th>
    </tr>

    <s:iterator value="products">
        <tr>
            <td><s:property value="maSach" /></td>
            <td><s:property value="tenSach" /></td>
            <td><s:property value="tomTat" /></td>
            <td><s:property value="tacgia.TenTacGia" /></td>
            <td><s:property value="tacgia.Email" /></td>
            <td>
                <a href="">Edit</a>
                <a href="">Delete</a>
            </td>
        </tr>
    </s:iterator>

</table>

</body>
</html>
