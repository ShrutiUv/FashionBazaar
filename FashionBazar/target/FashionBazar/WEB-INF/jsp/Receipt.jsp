<%@page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="resources/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<jsp:include page="navBar.jsp"></jsp:include>
<br><br><br>

<%
String qs[]=(String []) session.getAttribute("qty");


int count=0;
%>


<div class="container">
    <div class="row">
        <div class="well col-xs-10 col-sm-10 col-md-6 col-xs-offset-1 col-sm-offset-1 col-md-offset-3">
            <div class="row">
                <div class="col-xs-6 col-sm-6 col-md-6">
                    <address>
                    
                    <strong>${user.customerName}</strong>
                    <br>
                      <strong>${user.address}</strong>
                        
                    </address>
                </div>
                <div class="col-xs-6 col-sm-6 col-md-6 text-right">
                    <p>
                        <em>Date: <%=new Date().toString() %></em>
                    </p>
                    <p>
                        <em>Receipt #: 34522677W</em>
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="text-center">
                    <h1>Receipt</h1>
                </div>
                </span>
                <table class="table table-hover">
                
                
                
                <tr>
				<th>Cart Id</th>
				<th>Product Name</th>
				<th>Quantity</th>
				<th>Product Price</th>


			</tr>
			<c:forEach var="cart" items="${cartList}">
				<tr>
					<td>${cart.cartId }</td>
					<td>${cart.product.productName }</td>
					<td><%=qs[count] %></td>       <!-- to take quantity -->
					<td>${cart.product.price}</td>

					<%count++; %> 

				</tr>
			</c:forEach>
                
                
                    
                   <tr>
                            <td>   </td>
                            <td>   </td>
                            <td class="text-right">
                            <p>
                                <strong>Subtotal: </strong>
                            </p>
                            <p>
                                <strong>Tax(18%): </strong>
                            </p></td>
                            <td class="text-center">
                            <p>
                                <strong>${totalBill}</strong>
                            </p>
                            <p>
                                <strong>${Math.round(totalBill * 18/100)}</strong>
                            </p></td>
                        </tr>
                        <tr>
                            <td>   </td>
                            <td>   </td>
                            <td class="text-right"><h4><strong>Total: </strong></h4></td>
                            
                            
                            <td class="text-center text-danger"><h4><strong>${totalBill+Math.round(totalBill * 18/100)}</strong></h4></td>
                        </tr>
                    </tbody>
                </table>
                
                </button></td>
            </div>
        </div>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>