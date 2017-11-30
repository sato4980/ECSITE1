<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<script type="text/javascript"
  src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
  $(function() {
    $('a[href^=#]').click(function() {
      var speed = 4000;
      var href = $(this).attr("href");
      var target = $(href == "#" || href == "" ? 'html' : href);
      var position = target.offset().top;
      $("html, body").animate({scrollTop : position}, speed, "swing");
      return false;
    });
  });
</script>
</head>
<body>
  <a href="#bottom" id="top">下へスムース！</a>
  <img src="images/tatenaga.jpg" width="200" height="10000" alt="画像の川流れ">
  <br>

</body>
</html>