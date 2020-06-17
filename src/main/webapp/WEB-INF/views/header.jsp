<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Conpub</title>

    <meta name="description" content="안녕하세요. 당신을 위한 콘펍입니다">
    <meta name="author" content="Pubble">

    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

  </head>
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		
<!-- 여기부터 header -->
		<header>
            <nav class="navbar navbar-expand-md navbar-light bg-light">
			<ul class="nav navbar-nav navbar-right">
				<li class="nav-item" >
					<a class="nav-link active" href="#">로그인</a>
				</li>

				<li class="nav-item">
					<a class="nav-link" href="#">회원가입</a>
				</li>

				<li class="nav-item">
					<a class="nav-link" href="#">장바구니</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">고객센터</a>
				</li>
			</ul>
            </nav>

			<nav class="navbar navbar-expand-lg navbar-light bg-warning static-top">
				 
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="navbar-toggler-icon"></span>

<!-- 지금 로고 이미지 넣었는데 깨짐-->
				</button> <a class="navbar-brand" href="#"> <img src="${pageContext.request.contextPath}/webapp/WEB-INF/images/conpub-logo-e.png" alt="Logo" style="width:170px;"> </a>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="navbar-nav">
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown">도서</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
								<a class="dropdown-item" href="#">포트폴리오</a> <a class="dropdown-item" href="#">독립출판</a> <a class="dropdown-item" href="#">앨범</a>
							</div>
						</li>
						<li class="nav-item active">
							 <a class="nav-link" href="#">학위논문 <span class="sr-only">(current)</span></a>
						</li>
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">홍보물</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
								<a class="dropdown-item" href="#">팜플렛</a> <a class="dropdown-item" href="#">카탈로그</a>
								<div class="dropdown-divider">
								</div> <a class="dropdown-item" href="#">포스터</a>
							</div>
						</li>
						<li class="nav-item">
							 <a class="nav-link" href="#">포토북</a>
						</li>
					</ul>
					<form class="form-inline">
						<input class="form-control mr-sm-2" type="text"> 
						<button class="btn btn-primary my-2 my-sm-0" type="submit">
							검색
						</button>
					</form>

				</div>
			</nav>
			
		</header>
			