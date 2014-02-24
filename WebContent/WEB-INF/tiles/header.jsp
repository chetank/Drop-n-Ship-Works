<%@ include file="jsp-tag.jsp"%>

<div class="container">
	<div class="row-fluid">
		<div class="span8">
			<h1>
				<a href="#">Drop-n-Ship</a>
			</h1>
		</div>
		<div class="span4 login">
			<div class="row-fluid">
				<div class="span4 offset6" id="user-name"></div>
				<div class="span2">
					<img id="user-picture" />
				</div>
			</div>
			<jsp:include page="fbLogin.jsp"></jsp:include>
		</div>
	</div>
</div>