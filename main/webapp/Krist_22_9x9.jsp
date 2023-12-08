<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
 	String start = request.getParameter("start");
 	String rows = request.getParameter("rows");
 	String cols = request.getParameter("cols");
 
 	final int START = start == null ? 2 : Integer.parseInt(start);
 	final int ROWS = start == null ? 2 : Integer.parseInt(rows);
 	final int COLS = start == null ? 4 : Integer.parseInt(cols);
 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form>

		String <input type="number" name="start"> <input type="number"
			name="rows"> 
			
		x <input type="number" name="cols"> <input
			type="submit" value="change">
	</form>

	<table border="1" width="100%">
		<tr>
			<td>
				<% 
			out.print("<tr");
		
			for (int n = 1; n<=3; n+=3) {
				for (int i = 2; i<=9; i++) {
					out.print("<td>");
					for (int j = 1; j<=9; j++){
						out.print("  " + i + "x" + j + "=" + i*j + "<br>");
					}
					
					out.print("<br>");
					 out.print("</td>");
					
					}
					
					out.print("</tr>");
					
			}
			
			%>
			</td>
		</tr>




	</table>

</body>
</html>