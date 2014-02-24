<%@ include file="../tiles/jsp-tag.jsp"%>

<div class="container">
	<div class="hero-unit">
		<%@ include file="travel-post-form-success.jsp"%>
		<form:form method="post" commandName="travelPostDetails">
			<fieldset class="form-horizontal">
				<div class="row">
					<div class="col-md-8">
						<div class="control-group">
							<label for="input01" class="control-label">Your Name: </label>
							<div class="controls">
								<form:input path="name" />
								<form:errors path="name" />
							</div>
						</div>

						<div class="control-group form-inline">
							<label for="textarea" class="control-label">Travelling :</label>
							<div class="controls">
								<form:input path="goingFrom" />
								<form:errors path="goingFrom" />
								<form:input path="goingTo" />
								<form:errors path="goingTo" />
							</div>
						</div>

						<script language="Javscript">$('.input-append').datepicker({});</script>
						<div class="control-group">
							<label for="textarea" class="control-label">Date of
								Travel:</label>
							<div class="controls">
								<input class="input-append date span2" size="8" type="text"
									data-provide="datepicker" name="date"></input>
							</div>
						</div>

						<div class="control-group">
							<label for="textarea" class="control-label">Message for
								sender:</label>
							<div class="controls">
								<form:textarea path="message" rows="3" />
								<form:errors path="message" />
							</div>
						</div>
						<div class="form-actions center">
							<button class="btn btn-primary" type="submit">Submit my
								travel</button>
							<button class="btn">Reset</button>
						</div>
					</div>
				</div>
			</fieldset>
		</form:form>
	</div>
</div>
</div>
</div>


<!-- Nav tabs
		<ul class="nav nav-tabs">
			<li class="active"><a href="#travel-search" data-toggle="tab">I
					need to send something</a></li>
			<li class=""><a href="#travel-post" data-toggle="tab">I can
					carry something</a></li>
		</ul>

		<div class="tab-content">
			<div class="tab-pane" id="travel-search">
				<!-- <%@ include file="travel-search-form-view.jsp"%> 
			</div>
			<div class="tab-pane" id="travel-post">
			-->