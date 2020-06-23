<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file ="../include/header.jsp" %>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <div class="row">
                <div class="col-md-3">
                    <div class="btn-group btn-group-lg btn-group-vertical" role="group">
                        <button class="btn btn-warning" type="button" onclick="location.href='/shoppingInfo'">
                            쇼핑정보
                        </button>
                        <button class="btn btn-warning" type="button" onclick="location.href='/cart'">
                            장바구니
                        </button>
                        <button class="btn btn-warning" type="button" onclick="location.href='/mileage?id=${sessionScope.member.memberId}'">
                            마일리지
                        </button>
                        <button class="btn btn-warning" type="button" onclick="location.href='/updateInfo'">
                            회원정보수정
                        </button>
                        <button class="btn btn-warning" type="button" onclick="location.href='/unsubscribe'">
                            회원탈퇴
                        </button>
                    </div>
                </div>
                <div class="col-md-9">
                    <h3>
                        마일리지
                    </h3>
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th class="text-center">No.</th>
                            <th class="text-center">변동내역</th>
                            <th class="text-center">사용액수</th>
                            <th class="text-center">변동일자</th>
                        </tr>
                        </thead>
                        <c:set var="mileageList" value="${mileageList }" />
                        <c:if test="${!empty mileageList }"> //list
                            <c:forEach var = "i" begin = "0" end ="${mileageList.size()-1 }">
                                <!--<c:set var = "mdto" value="${mileageList.get(i) }" /> -->
                                <tr class="notice" style="background-color: beige;">
                                    <td>${mileageList.getId() }</td>
                                    <td>${mileageList.getMileagePath() }</td>
                                    <td>${mileageList.getMileage() }</td>
                                    <td>${mileageList.getMileageDate().substring(0,10) }</td>
                                </tr>
                            </c:forEach>
                        </c:if>
                        <c:if test ="${empty mileageList }">
                            <tr>
                                <td colspan="5" align="center">
                                    <h3>서버 오류입니다. 새로고침하거나 고객센터에 문의하세요</h3>
                                </td>
                            </tr>
                        </c:if>
                    </table>
                </div>
            </div>
            <nav>
                <ul class="pagination">
                    <li class="page-item">
                        <a class="page-link" href="#">Previous</a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">1</a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">2</a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">3</a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">4</a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">5</a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">Next</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</div>
<%@include file ="../include/footer.jsp" %>