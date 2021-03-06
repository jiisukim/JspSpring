<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Ajax형식 파일 업로드</title>
<style type="text/css">
	img{
		width: 500px;
		height: 400px;
	}
</style>
<script src="/resources/js/jquery.min.js"></script>
<script type="text/javascript">
	//특정 확장자를 제외한 파일들의 업로드를 제한. 첨부파일을 이용한 웹 공격을 막기 위함
	// exe, sh, zip 등의 업로드는 제한. 특정 크기 이상의 파일은 업로드 제한
	var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$")
	var maxSize = 5242880; //5MB
	//파일명과파일의 크기를 파라미터로 받음
	
	function checkExtension(fileName, fileSize) {
		//5MB를 초과하지 못하게함
		if(fileSize >= maxSize){
			alert("파일 사이즈 초과");
			return false;
		}
		//파일명의 정규식 테스트
		if(regex.test(fileName)){
			alert("해당종류의 파일은 업로드 할 수 없습니다.")
			return false;
		}
		return true;
		
	}
	
	
	$(function() {
		//input
		function readURL(input) {
			//input 파라미터에 파일이 있다면...
			if(input.files && input.files[0]){
				//파일을 읽기 위한 FileReader 객체를 생성
				var reader = new FileReader();
				reader.onload = function(e){
					//파일 읽기 성공시 처리
					$("#blah").attr("src",e.target.result);
				}
				//File 내용을 읽어 dataURL 형식의 문자열로 저장
				reader.readAsDataURL(input.files[0]);
				
			}
		}
		
		$("#imgInp").change(function () {
			//선택한 이미지의 경로 표시
			console.log(this.value);
			//imgInp 즉 , 파일요소를 readURL 함수의 파라미터로 던짐
			readURL(this);
		});
		
		
		$("#uploadBtn").on("click",function(e){
			//파일 업로드시 jQuery를 이용하는 경우 FormData객체를 사용함
			//FormData는 가상의 <form>태그와 같다
			//Ajax를 이용한 파일 업로드는 FormData에 File 파라미터(name,value)를 담아 전송
			//File파라미터(name(String), value(File객체))
			
			var formData = new FormData();
			
			//input 태그들 중에서 name 속성의 값이 upload파일인 요소를 찾는다

			var inputFile = $("input[name='uploadFile']");
			//.files : 
			console.log(inputFile[0].files);
			var files = inputFile[0].files;
			//inputFile 객체에 들어있는 file들의 개수만큼 반복
			for(var i = 0; i<files.length; i++){
				//파일의 크기와확장자 테스트.(함수로 파일명과 파일 사이즈를 파라미터로 던짐)
				//!true => false
				if(!checkExtension(files[i].name,files[i].size)){
					return false;
				}
				
				//가상의 form태그 하위로 File파라미터를 넣어줌
				formData.append("uploadFile",files[i]);
			} // end for
			
			//첨부파일 데이터를 formData에 추가한 후 Ajax를 통해 formData 자체를 전송
			//processData와 contentType은 반드시 false로 지정해야만 전송이 됨.
			//컨트롤러에서는 MultipartFile 타입을 이용하여 첨부파일 데이터를 처리함
			$.ajax({
				url : '/uploadAjaxAction',
				processData : false,
				contentType : false,
				data: formData,
				type : 'POST',
				success:function(result){
					for(var i =0 in result){
						console.log(result[i]);
// 						$("#fileView").append("<img src='/resources/images/"+result[i]+ "'/>")
					}
					alert("Upload성공");
				}
			});// end ajax
			
			
		});
		
	});
</script>
</head>
<body>
<form>

</form>
<h1>Ajax를 이용하여 업로드</h1>
<div id="fileView">
	<img src="/resources/images/logo.png" alt="이미지 미리보기" id="blah">
</div>

<div class="uploadDiv">
	<input type="file" id="imgInp" name="uploadFile" multiple="multiple"> <!-- multiple: 이미지 여러개 -->
</div>
<button type="button" id="uploadBtn">upload</button>
</body>
</html>