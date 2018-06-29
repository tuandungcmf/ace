<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/views/define.jsp" %>
<div class="container">
	<p class="h2">Lựa chọn thông tin tìm kiếm nhà:</p>
	<p class="small">
		Thông tin tìm kiếm đã được tạo sẵn, lựa chọn khu vực tương ứng ! 
	</p>
	<div class="row">
		<div class="col-sm groupSearch">
			<form:form action="search/result">
			  	<div class="form-group">
			  		<img class="img-thumbnail" src="${pageContext.request.contextPath}/resources/images/logoSuumo.png"/><br>
			  		<hr>
			  		<label>賃貸 > 東京都 > 新宿区 > <b>新宿駅</b>の賃貸情報</label>
			  		<input type="hidden" name="condition" value="https://suumo.jp/jj/chintai/ichiran/FR301FC005/&ar=030&bs=040&pc=30&smk=&po1=25&po2=99&shkr1=03&shkr2=03&shkr3=03&shkr4=03&cb=0.0&ct=10.0&md=01&md=02&md=03&md=04&ts=1&ts=2&et=15&mb=0&mt=9999999&cn=9999999&ra=013&ek=000519670&rn=0005"/>
					<input type="submit" class="btn btn-outline-primary" value="Check House"/>
				</div>
			</form:form>
		</div>
		<div class="col-sm groupSearch">
			<form:form action="search/result">
			  	<div class="form-group">
			  		<img class="img-thumbnail" src="${pageContext.request.contextPath}/resources/images/logoSuumo.png"/><br>
			  		<hr>
			  		<label>賃貸 > 東京都 > 渋谷区 > <b>渋谷駅</b>の賃貸情報</label>
			  		<input type="hidden" name="condition" value="https://suumo.jp/jj/chintai/ichiran/FR301FC005/?url=%2Fchintai%2Fichiran%2FFR301FC005%2F&ar=030&bs=040&smk=&po1=25&po2=99&shkr1=03&shkr2=03&shkr3=03&shkr4=03&cb=0.0&ct=10.0&md=01&md=02&md=03&md=04&ts=1&ts=2&et=15&mb=0&mt=9999999&cn=9999999&ra=013&ek=000517640&rn=0005&pc=100"/>
					<input type="submit" class="btn btn-outline-primary" value="Check House"/>
				</div>
			</form:form>
		</div>
		<div class="col-sm groupSearch">
			<form:form action="search/result">
			  	<div class="form-group">
			  		<img class="img-thumbnail" src="${pageContext.request.contextPath}/resources/images/logoSuumo.png"/><br>
			  		<hr>
			  		<label>賃貸 > 東京都 > 新宿区 > <b>高田馬場駅</b>の賃貸情報</label>
			  		<input type="hidden" name="condition" value="https://suumo.jp/jj/chintai/ichiran/FR301FC005/?shkr1=03&shkr3=03&cb=0.0&rn=0005&shkr2=03&ts=1&ts=2&smk=&mt=9999999&ar=030&bs=040&shkr4=03&ct=10.0&url=/chintai/ichiran/FR301FC001/&ra=013&md=01&md=02&md=03&md=04&cn=9999999&ek=000522350&mb=0&et=15"/>
					<input type="submit" class="btn btn-outline-primary" value="Check House"/>
				</div>
			</form:form>
		</div>
	</div>
</div>
<%@include file="/WEB-INF/views/common/footer.jsp" %>