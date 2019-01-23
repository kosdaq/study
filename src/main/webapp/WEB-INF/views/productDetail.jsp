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
	<div id="name">{{ name }}</div>
	<div id="price">{{ price }}</div>

<script>
	var name = new Vue({
		el: '#name',
		data: {
			name: '${productVO.name}'
		}
	});
	
	var price = new Vue({
		el: '#price',
		data: {
			price: '${productVO.price}'
		}
	});
</script>
</body>
</html>