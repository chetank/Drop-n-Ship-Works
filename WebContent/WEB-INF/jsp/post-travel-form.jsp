<form class="form-horizontal">
	<fieldset>
		<div class="control-group">
			<label for="input01" class="control-label">Your Name: </label>
			<div class="controls">
				<input type="text" id="input01" class="input-xlarge">
			</div>
		</div>

		<div class="control-group form-inline">
			<label for="textarea" class="control-label">Places:</label>
			<div class="controls">
				<input type="text" class="input-small" placeholder="From"> <input
					type="text" class="input-small" placeholder="To">
			</div>
		</div>

		<script language="Javscript">$('.input-append').datepicker({});</script>
		<div class="control-group">
			<label for="textarea" class="control-label">Date of Travel:</label>
			<div class="controls">
				<input class="input-append date span2" size="8" type="text"
					data-provide="datepicker"></input>
			</div>
		</div>

		<div class="control-group">
			<label for="textarea" class="control-label">Message for
				sender:</label>
			<div class="controls">
				<textarea rows="3" id="textarea" class="input-xlarge"></textarea>
			</div>
		</div>
		<div class="form-actions">
			<button class="btn btn-primary" type="submit">Submit my
				travel</button>
			<button class="btn">Reset</button>
		</div>
	</fieldset>
</form>