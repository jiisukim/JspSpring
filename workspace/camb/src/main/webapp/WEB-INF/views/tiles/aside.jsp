<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="aside" style="float:left;clear:both;">
<aside class="main-sidebar">
        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/resources/sbadmin/index.html">
                <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fas fa-laugh-wink"></i>
                </div>
                <div class="sidebar-brand-text mx-3">CAM <sup>B</sup></div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active">
                <a class="nav-link" href="#">
                    <i class="fas fa-fw fa-tachometer-alt"></i>
                    <span>CamB 소개</span>
                </a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                	USER
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="/resources/sbadmin/#" data-toggle="collapse" data-target="#STUDENT" aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-fw fa-users"></i>
                    <span>STUDENT</span>
                </a>
                <div id="STUDENT" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="/resources/sbadmin/buttons.html">학적</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">수강신청</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">수업</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">등록금</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">장학</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">졸업</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">봉사</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">상담</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">생활관</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">정보화시설</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">증명서</a>
                    </div>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link collapsed" href="/resources/sbadmin/#" data-toggle="collapse" data-target="#PROFESSOR" aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-fw fa-user"></i>
                    <span>PROFESSOR</span>
                </a>
                <div id="PROFESSOR" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar" >
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" data-toggle="collapse" data-target="#PROFESSOR_menu" href="#">수업관리</a>
                        <a class="collapse-item" data-toggle="collapse" data-target="#PROFESSOR_consulting" href="#">학생별 상담 관리</a>
                        <a class="collapse-item" href="/professor/salary/salaryList">급여</a>
                        <a class="collapse-item" href="/professor/academic/academicList">승인</a>
                        <a class="collapse-item" href="#">증명서</a>
                    </div>
                </div>
                <div id="PROFESSOR_menu" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
	               	 <div class="bg-white py-2 collapse-inner rounded">
	               	 	<a class="collapse-item" data-toggle="collapse" data-target="#PROFESSOR" href="#" style="box-shadow: 1px 1px 3px 1px #dadce0;">수업관리</a>
	               	 	<div style="box-shadow: 1px 1px 3px 2px gray inset;">
		               	 	<a class="collapse-item" href="/professor/list">수업 조회</a>
		               	 	<a class="collapse-item" href="#">시간표 조회</a>
		               	 	<a class="collapse-item" href="/professor/attendance/list">출결 관리</a>
		               	 	<a class="collapse-item" href="/professor/grade/list">성적 관리</a>
		               	 	<a class="collapse-item" href="/professor/study/lectureEvaluationList">강의평가 조회</a>
	               	 	</div>
	               	 </div>
                </div>
                <div id="PROFESSOR_consulting" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
	               	 <div class="bg-white py-2 collapse-inner rounded">
	               	 	<a class="collapse-item" data-toggle="collapse" data-target="#PROFESSOR" href="#" style="box-shadow: 1px 1px 3px 1px #dadce0;">학생별 상담 관리</a>
	               	 	<div style="box-shadow: 1px 1px 3px 2px gray inset;">
		               	 	<a class="collapse-item" href="/professor/consulting/consultingList">상담 일정 조회</a>
		               	 	<a class="collapse-item" href="#">상담 통계</a>
	               	 	</div>
	               	 </div>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link collapsed" href="/resources/sbadmin/#" data-toggle="collapse" data-target="#ADMIN" aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-fw fa-key"></i>
                    <span>ADMIN</span>
                </a>
                <div id="ADMIN" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="/resources/sbadmin/buttons.html">사용자</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">수업</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">등록</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">학적</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">학사 일정 관리</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">학과 관리</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">증명서 관리</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">급여</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">공지사항</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">Q&A</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">FAQ</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">시설관리</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">봉사관리</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">마일리지</a>
                        <a class="collapse-item" href="/resources/sbadmin/cards.html">장학금</a>
                    </div>
                </div>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Addons
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="/resources/sbadmin/#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>COMMON</span>
                </a>
                <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="/resources/sbadmin/login.html">메인 위젯 설정</a>
                        <a class="collapse-item" href="/resources/sbadmin/register.html">캘린더</a>
                        <a class="collapse-item" href="/resources/sbadmin/forgot-password.html">공지사항</a>
                    </div>
                </div>
            </li>


            <!-- Divider -->
            <hr class="sidebar-divider d-none d-md-block">

            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>

            <!-- Sidebar Message -->
            <div class="sidebar-card d-none d-lg-flex">
                <img class="sidebar-card-illustration mb-2" src="/resources/sbadmin/img/undraw_rocket.svg" alt="...">
                <p class="text-center mb-2">
                	<strong>Cam B</strong> 를 방문해주셔서 감사합니다!
                </p>
                <a class="btn btn-success btn-sm" href="/resources/sbadmin/https://startbootstrap.com/theme/sb-admin-pro">마이페이지 가기</a>
            </div>

        </ul>
        <!-- End of Sidebar -->
       </aside>
</div>