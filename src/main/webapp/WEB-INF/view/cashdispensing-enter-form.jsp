<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
	<title>Save Customer</title>
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">
		  
  	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

</head>

<body>
<div class="jumbotron text-center">	
	<div class="container">	
		<p><h1>Cash dispensing</h1></p>
	
		<form:form class="form-inline" action="cashDispensing" method="POST" style="padding:2%">
		  <div class="form-group">
		    <p class="form-control-static"><b> Enter Money: </b></p>
		  </div>
		  <div class="form-group mx-sm-3">
		    <input type="number" class="form-control input-lg" name="user_amount_enter" oninvalid="this.setCustomValidity('Please Enter Money')" maxlength="9" required>
		  </div>
		  <button type="submit" class="btn btn-default btn-lg"> Submit </button>
		</form:form>

		    <c:if test="${not empty msg}">
				<div class="row" style="margin-top:1%">
				    <div class="col-md-6 col-md-offset-3">
						<div class="alert alert-info" role="alert">
						         <p>${msg}</p>
						</div>		    
				    </div>
				</div>	
		    </c:if>    
 	 
		<c:if test="${not empty cashDispensing}">
		  <p> you enter money is ${cashDispensing.user_amount_enter}</p>
		  <table class="table table-bordered">
		      <tr>
		        <th>amount</th><td>money</td>
		      </tr>
		      <tr>
		        <th>1000</th><td>${cashDispensing.number_of_thousand_card_dispensing}</td>
		      </tr>
		      <tr>
		        <th>500</th><td>${cashDispensing.number_of_fivehundred_card_dispensing}</td>
		      </tr>
		      <tr>
		        <th>100</th><td>${cashDispensing.number_of_hundred_card_dispensing}</td>
		      </tr>
		      <tr>
		        <th>50</th><td>${cashDispensing.number_of_fifty_card_dispensing}</td>
		      </tr>
		      <tr>
		        <th>20</th><td>${cashDispensing.number_of_twenty_card_dispensing}</td>
		      </tr>		      		      		           		      		      		      
		  </table>
  		 </c:if>	
 
 		<c:if test="${not empty cashDispensing}">
		  <p> you money is in atm </p>
		  <table class="table table-bordered">
		      <tr >
		        <th>amount</th><td>money</td>
		      </tr>
		      <tr>
		        <th>1000</th><td>${cashDispensing.number_of_thousand_card}</td>
		      </tr>
		      <tr>
		        <th>500</th><td>${cashDispensing.number_of_fivehundred_card}</td>
		      </tr>
		      <tr>
		        <th>100</th><td>${cashDispensing.number_of_hundred_card}</td>
		      </tr>
		      <tr>
		        <th>50</th><td>${cashDispensing.number_of_fifty_card}</td>
		      </tr>
		      <tr>
		        <th>20</th><td>${cashDispensing.number_of_twenty_card}</td>
		      </tr>		      		      		           		      		      		      
		  </table>
  		 </c:if>
  		  		 
  		<!--  <p>
			<a href="${pageContext.request.contextPath}/cashdispensing/list">go to report</a>
		</p> -->
		
  		</div>		
	</div>	



</body>

</html>










