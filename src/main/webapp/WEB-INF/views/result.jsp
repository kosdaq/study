<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../../resources/script/jquery-3.3.1.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue"></script>
</head>
<body>
<div id="app">
{{ message }}
</div>
<script type="text/javascript">
	var app = new Vue({
	  el: '#app',
	  data: {
	    message: '안녕하세요 Vue!'
	  }
	});
</script>
</body>
</html>