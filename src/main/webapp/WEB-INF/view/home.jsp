<%@include file="globe.jsp"%><html>
<head>
    <meta name="description" content="service job search">
    <title><spring:message code="home.title"/></title>
</head>
<body>
<!--start content -->
		<section id="content">
			<div class="two-third">
				<div id="searchmodule" class="tabs">
					<ul class="tab-control">
						<li><a href="#flight-search">Search Flight</a></li>
						<li><a href="#hotel-search">Find Hotel</a></li>
						<li><a href="#travel-search">Holiday Plan</a></li>
					</ul>
					<div id="flight-search" class="tab-content">
						<form action="#">
							<div class="field">
								<label for="flight-from">From:</label>
								<input type="text" id="flight-from" class="input-text" placeholder="Origin" autocomplete="off" />
							</div>
							<div class="field">
								<label for="flight-to">To:</label>
								<input type="text" id="flight-to" class="input-text" placeholder="Destination" autocomplete="off" />
							</div>
							<div class="field half">
								<label for="flight-depart">Depart:</label>
								<input type="text" id="flight-depart" class="input-text input-cal" placeholder="2012-10-01" autocomplete="off" />
							</div>
							<div class="field half even">
								<label for="flight-return">Return:</label>
								<input type="text" id="flight-return" class="input-text input-cal" placeholder="2012-10-01" autocomplete="off" />
							</div>
							<div class="field half">
								<label for="flight-class">Class:</label>
								<select id="flight-class">
									<option>Any</option>
									<option>VIP</option>
									<option>Business</option>
								</select>
							</div>
							<div class="field half even">
								<label for="flight-person">Person:</label>
								<select id="flight-person">
									<option>1</option>
									<option>2</option>
									<option>3</option>
								</select>
							</div>
							<button type="submit" class="submit">Search</button>
							<br class="clear" />
						</form>
					</div>
					<!--flight search -->

					<div id="hotel-search" class="tab-content">
						<form action="#">
							<div class="field">
								<label for="hotel-to">City:</label>
								<input type="text" id="hotel-to" class="input-text" placeholder="Destination" autocomplete="off" />
							</div>
							<div class="field half">
								<label for="hotel-depart">Check-In:</label>
								<input type="text" id="hotel-depart" class="input-text input-cal" placeholder="2012-10-01" autocomplete="off" />
							</div>
							<div class="field half even">
								<label for="hotel-return">Check-Out:</label>
								<input type="text" id="hotel-return" class="input-text input-cal" placeholder="2012-10-01" autocomplete="off" />
							</div>
							<div class="field half">
								<label for="hotel-class">Class:</label>
								<input type="text" id="hotel-class" class="input-text" autocomplete="off" />
							</div>
							<div class="field half even">
								<label for="hotel-room">Person:</label>
								<select id="hotel-room">
									<option>1</option>
								</select>
							</div>
							<button type="submit" class="submit">Search</button>
							<br class="clear" />
						</form>
					</div>
					<!--hotel search -->

					<div id="travel-search" class="tab-content">
						<form action="#">
							<div class="field">
								<label for="travel-from">From:</label>
								<input type="text" id="travel-from" class="input-text" placeholder="Origin" autocomplete="off" />
							</div>
							<div class="field">
								<label for="travel-to">To:</label>
								<input type="text" id="travel-to" class="input-text" placeholder="Destination" autocomplete="off" />
							</div>
							<div class="field half">
								<label for="travel-depart">Depart:</label>
								<input type="text" id="travel-depart" class="input-text input-cal" placeholder="2012-10-01" autocomplete="off" />
							</div>
							<div class="field half even">
								<label for="travel-return">Return:</label>
								<input type="text" id="travel-return" class="input-text input-cal" placeholder="2012-10-01" autocomplete="off" />
							</div>
							<div class="field half">
								<label for="travel-class">Class:</label>
								<input type="text" id="travel-class" class="input-text" autocomplete="off" />
							</div>
							<div class="field half even">
								<label for="travel-person">Person:</label>
								<select id="travel-person">
									<option>1</option>
								</select>
							</div>
							<button type="submit" class="submit">Search</button>
							<br class="clear" />
						</form>
					</div>
					<!--travel search -->
				</div>
			</div>
			<!--searchmodule -->

			<div class="one-third last">
				<div id="newsletter" class="module">
					<div class="module-content">
						<div class="module-content-wrap">
							<div class="h3">Newsletter</div>
							<p>Subscribe to get travel deals sent to your email each week!</p>
							<p>
								<label for="newsletter-email">Your Email :</label>
								<input type="text" id="newsletter-email" class="input-text" />
							</p>
							<div>
								<button type="submit">Subscribe</button>
							</div>

							<br class="clear" />
						</div>
					</div>
				</div>
			</div>
			<!--newsletter -->
			<div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>
			<div class="hr"><hr /></div>

			<div class="one-third">
				<h3 class="icon32 icon-tick thin">Book Easy</h3>
				<p>Lorem ipsum dolor sit amet consectetur incididunt ut labore et dolore magna aliqua adipisicing elit seddo eiusmod tempor.</p>
			</div>

			<div class="one-third">
				<h3 class="icon32 icon-tick thin">Save Cost</h3>
				<p>Lorem ipsum dolor sit amet consectetur incididunt ut labore et dolore magna aliqua adipisicing elit seddo eiusmod tempor.</p>
			</div>

			<div class="one-third last">
				<h3 class="icon32 icon-tick thin">Enjoy Flight</h3>
				<p>Lorem ipsum dolor sit amet consectetur incididunt ut labore et dolore magna aliqua adipisicing elit seddo eiusmod tempor.</p>
			</div>

			<div class="hr"><hr /></div>

			<!--newsection -->
			<div class="section-title">
				<span class="h3">Popular Destination</span>
				<a class="right" href="">See all destination</a>
			</div>

			<div class="one-fourth">
				<div class="post-item">
					<div class="image-place">
						<img src="images/uploads/220x135/auckland-city.jpg" alt="image" />
					</div>
					<div class="post-content">
						<h4 class="post-title">Maldives Travel</h4>
						<p class="post-excerpt">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce luctus vehicula dui.</p>
					</div>
					<div class="post-meta">
						<span class="comment-count">12 Comments</span>
						<a class="read-more" href="#">Read More</a>
					</div>
				</div>
			</div>

			<div class="one-fourth">
				<div class="post-item">
					<div class="image-place">
						<img src="images/uploads/220x135/rio-de-jainero.jpg" alt="image" />
					</div>
					<div class="post-content">
						<h4 class="post-title">Maldives Travel</h4>
						<p class="post-excerpt">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce luctus vehicula dui.</p>
					</div>
					<div class="post-meta">
						<span class="comment-count">27 Comments</span>
						<a class="read-more" href="#">Read More</a>
					</div>
				</div>
			</div>

			<div class="one-fourth">
				<div class="post-item">
					<div class="image-place">
						<img src="images/uploads/220x135/stupa.jpg" alt="image" />
					</div>
					<div class="post-content">
						<h4 class="post-title">Maldives Travel</h4>
						<p class="post-excerpt">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce luctus vehicula dui.</p>
					</div>
					<div class="post-meta">
						<span class="comment-count">51 Comments</span>
						<a class="read-more" href="#">Read More</a>
					</div>
				</div>
			</div>

			<div class="one-fourth last">
				<div class="post-item">
					<div class="image-place">
						<img src="images/uploads/220x135/st-basil-2.jpg" alt="image" />
					</div>
					<div class="post-content">
						<h4 class="post-title">Maldives Travel</h4>
						<p class="post-excerpt">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce luctus vehicula dui.</p>
					</div>
					<div class="post-meta">
						<span class="comment-count">32 Comments</span>
						<a class="read-more" href="#">Read More</a>
					</div>
				</div>
			</div>

			<br class="clear" />

			<div class="action-box">
				<div class="left">
					<div class="action-title">30% Discount : 3 Nights Deluxe Escape to Kuta Bali</div>
					<div class="action-desc">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla fringilla mi et eros ornare quis</div>
				</div>
				<div class="right">
					<a class="button">
						Book Now
					</a>
				</div>
			</div>
			<!--action-box -->


			<br class="clear" />
		</section>
		<!--end content -->
</body>
</html>