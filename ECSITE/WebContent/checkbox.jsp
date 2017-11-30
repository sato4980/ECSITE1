<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script>
$(function(){
  $("button").click(function () {
    var text = $(this).text();
    $("input").val(text);
  });
});

//$(function(){
//$("h1").click(function(){
//$("h1").css("color","red");
//});
//});

</script>
  <style>
  button { margin:4px; cursor:pointer; }
  input { margin:4px; color:blue; }
  </style>
</head>
<body>
<div>
 <button>ボタン１</button>
 <button>ボタン２</button>
 <button>ボタン３</button>
 <button>ボタン４</button>
 <button>ボタン５</button>
 <button>ボタン６</button>
 <button>ボタン７</button>
 <button>ボタン８</button>
 <button>ボタン９</button>
</div>
<input type="text" value="click a button" />
</body>
</html>