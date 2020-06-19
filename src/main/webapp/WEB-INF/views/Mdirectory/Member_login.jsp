<%@include file ="../header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script>

    $(function () {

        $("#log_btn").click(function() {

            var id = $("#id").val();
            var pwd = $("#pwd").val();

            $.ajax({
                type : "post",
                url : "/member/login/ok",
                data : {"id" : id, "pwd" : pwd},
                success : function (data) {
                    if(data != ""){
                        alert("로그인")
                        location.href='/'
                    }else{
                        alert("일치하는 아이디와 비밀번호가 없습니다.")
                    }
                }
            }) ; // ajax end
        })

    })

</script>

<div>
<h1>로그인</h1>
    <div align="center">
        <table>
            <tr>
                <td>아이디</td>
                <td><input type="text" id="id"></td>
                <td rowspan="2"><input id="log_btn" type="button" value="로그인"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" id="pwd"></td>
            </tr>
        </table>

        <br />

        <input type="button" value="네이버로긴 자리" style="background-color: #4CAF50">
        <input type="button" value="구글로긴 자리" style="background-color: #9fcdff">

        <hr width="50%" color="yellow"/>

        <input type="button" value="회원가입" onclick="location.href='/member/rule'">
        <input type="button" value="아이디 찾기" onclick="location.href='/member/find/id'">
        <input type="button" value="비밀번호 찾기" onclick="location.href='member/find/pwd'">

    </div>
</div>



<%@include file ="../footer.jsp" %>