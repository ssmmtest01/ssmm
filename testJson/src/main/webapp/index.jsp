<html>
<head>
<script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#testJson").click(function() {
			var url = this.href;
			var args = {};
			$.post(url, args, function(data) {
				for (var i = 0; i < data.length; i++) {
					var id = data[i].id;
					var lastName = data[i].lastName;

					alert(id + ": " + lastName);
				}
			});
			return false;
		});
	})
</script>
</head>

<body>
	<h2>test Json!</h2>

	<a href="testJson" id="testJson">test json</a>

</body>
</html>
