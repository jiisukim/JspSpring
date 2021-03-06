<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
	<div class="card shadow mb-4">
		<div class="card-header py-3">
			<h6 class="m-0 font-weight-bold text-primary">사용자 상세 보기</h6>
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<div id="dataTable_wrapper" class="dataTables_wrapper dt-bootstrap4">
					<div class="row">
						<div class="col-sm-12">
							<table class="table table-bordered dataTable" id="dataTable" width="100%" cellspacing="0" role="grid" aria-describedby="dataTable_info" style="width: 100%;">
								<tr role="row">
									<th class="sorting sorting_asc" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Name: activate to sort column descending" style="width: 88px;">
										Name
									</th>
									<td class="sorting_1">Airi Satou</td>
								</tr>
								<tr>
									<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width: 126px;">
										Position
									</th>
									<td>Accountant</td>
								</tr>
								<tr class="even">
									<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Office: activate to sort column ascending" style="width: 66px;">
										Office
									</th>
									<td>Tokyo</td>
								</tr>
								<tr class="odd">
									<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 31px;">
										Age
									</th>
									<td>33</td>
								<tr class="even">
									<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width: 72px;">
										Start date
									</th>
									<td>2008/11/28</td>
								</tr>
								<tr class="odd">
									<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 67px;">
										Salary
									</th>
									<td>$162,700</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="row">
						<a href="#" class="btn btn-primary btn-icon-split" > 
							<span class="icon text-white-50"> 
								<i class="fas fa-user"></i>
							</span> 
							<span class="text">사용자 수정하기</span>
						</a>
						&nbsp;
						<a href="#" class="btn btn-primary btn-icon-split" > 
							<span class="icon text-white-50"> 
								<i class="fas fa-user"></i>
							</span> 
							<span class="text">사용자 삭제하기</span>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	</table>
</body>
</html>