<%@ page language="java" contentType="text/html; charset=gb2312"
	pageEncoding="gb2312"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<title>�����̳�</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" href="style.css" type="text/css">
</head>
<body bgcolor="#FFFFFF" text="#000000" topmargin="2">
	<table width="760" border="0" cellspacing="0" cellpadding="0"
		align="center">
		<tr>
			<td background="images/topback.gif" width="130"><img
				src="images/sitelogo.gif" height="88"></td>
			<td background="images/topback.gif" width="500" align="center"
				valign="middle"><a href="http://www.fans8.com" target="_blank"><img
					src="images/fans8.gif" width="468" height="60" border="0"></a></td>
			<td background="images/topback.gif" width="130">
				<table width="100%" border="0" cellspacing="2" cellpadding="2">
					<tr>
						<td valign="middle" align="center"><a href="cart.jsp"><img
								src="images/button_cart.gif" width="87" height="18" border="0"></a></td>
					</tr>
					<tr>
						<td valign="middle" align="center"><a href="checkorder.jsp"><img
								src="images/button_ddcx.gif" width="87" height="18" border="0"></a></td>
					</tr>
					<tr>

						<td valign="middle" align="center"><a
							href="customer_register.jsp"><img
								src="images/button_regist.gif" width="87" height="18" border="0"></a></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table width="760" border="0" cellspacing="1" cellpadding="0"
		align="center" bgcolor="#000000">
		<tr>
			<td bgcolor="#FF9900" height="22" valign="middle" align="center">
				<table width="80%" border="0" cellspacing="2" cellpadding="2">
					<tr align="center" valign="middle">
						<td><a href="product_new.do" class="white">��Ʒ���</a></td>

						<td><a href="product_commend.do" class="white">�ص��Ƽ�</a></td>

						<td><a href="product_sell.do" class="white">��������</a></td>

						<td><a href="product_price.do" class="white">�ؼ���Ʒ</a></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td bgcolor="#FFCC66" height="22">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td><a href="index.jsp" class="red">��ҳ</a> &gt; ������ѯ</td>
						<td>&nbsp;</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table width="760" border="0" cellspacing="0" cellpadding="0"
		align="center">
		<tr>
			<td><img src="images/checkorder.gif" width="190" height="30">
				<table width="90%" border="0" cellspacing="2" cellpadding="2"
					align="center">
						<tr align="center" valign="middle">
							<td height="24" class="productName" colspan="4">�����ţ�${order.orderId}
								�ܼƣ�${order.totalPrice}Ԫ</td>
						</tr>
						<tr align="center" valign="middle">
							<td height="24" class="productName" bgcolor="#5880A8"><font
								color="#FFFFFF">��Ʒ���</font></td>
							<td height="24" class="productName" bgcolor="#5880A8"><font
								color="#FFFFFF">��Ʒ����</font></td>
							<td height="24" class="productName" bgcolor="#5880A8"><font
								color="#FFFFFF">����</font></td>
							<td height="24" class="productName" bgcolor="#5880A8"><font
								color="#FFFFFF">��������</font></td>
						</tr>
						<!-- ������Ʒ�б� -->
						<c:forEach items="${order.orderdetails }" var="orderdetails">
						<tr align="center" valign="middle">
							<td height="24" bgcolor="#D9D9DB">${orderdetails.productId}</td>
							<td height="24" bgcolor="#D9D9DB">${orderdetails.productName}</td>
							<td height="24" bgcolor="#D9D9DB">${orderdetails.unitPrice}Ԫ</td>
							<td height="24" bgcolor="#D9D9DB">${orderdetails.quantity}</td>
						</tr>
						</c:forEach>
						<!-- ������Ʒ�б� -->
				</table>
				<p>&nbsp;</p></td>
		</tr>
	</table>
	<br>

	<table width="760" border="0" cellspacing="0" cellpadding="0"
		align="center">
		<tr>
			<td background="images/topback.gif" align="center" height="16"><font
				color="#FFFFFF">copyright 2001 Powered by Peter.HJ</font></td>
		</tr>
	</table>
</body>
</html>
