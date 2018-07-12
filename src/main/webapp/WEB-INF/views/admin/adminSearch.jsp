<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/views/define.jsp" %>
<div class="container">
	<c:out value="${page}"></c:out>
	Page: <a href="<c:out value="${page}"></c:out>&pn=2">Next page</a>
	<p class="h2">Kết quả tìm kiếm nhà: <span class="countResult">${results}</span></p>
	<p class="h6">Info: <a href="${params}">Chi tiết liên kết</a></p>
	<hr>
	<c:forEach items="${rows}" var="row" varStatus="count">			
		<div class="row">
			<div class="col-md-3" id="img_${count.index}">
				<p><c:out value="${row.title}"/></p>
				<a href="<c:out value="${row.link}"/>" target="_blank">Liên kết chi tiết</a>
			</div>
			<div class="col-md-6 detail" id="detail_${count.index}"></div>
			<div class="col-md-3">
				<input type="button" class="btn btn-outline-primary" 
				onClick="addNewThread('<c:out value="${row.link}"/>')" value="Thêm vào danh sách"/>
			</div>		
		</div>
		<textarea style="display:none" id="itemsHide_${count.index}" rows="" cols=""><c:out value="${row.items}"/></textarea>
		<textarea style="display:none" id="detailHide_${count.index}" rows="" cols=""><c:out value="${row.body}"/></textarea>
		<textarea style="display:none" id="imgHide_${count.index}" rows="" cols=""><c:out value="${row.img}"/></textarea>
		<script>
			$( document ).ready(function() {
				var count=${count.index};
				var itemId ='#items_'+count;
				var detailId = '#detail_'+count;
				var imgId = '#img_'+count;
				
				var itemHideId ='itemsHide_'+count;
				var detailHideId = 'detailHide_'+count;
				var imgHideId = 'imgHide_'+count;
				
				
				var items = document.getElementById(itemHideId);
				var detail = document.getElementById(detailHideId);	
				var img = document.getElementById(imgHideId);	
				$(itemId).append(items.value);
				$(detailId).append(detail.value);
				
				var rel = (img.value).match(/rel="([^"]*)/)[1];	
				//$(sliderId).append(img.value);
				$("#img_"+${count.index}).append("<img src=\""+rel+"\" width=\"210px\" height=\"280px\"/> ");
				
				$('table.cassetteitem_other').addClass('table');
			});
			
			function sendBeaconSiteCatalystClick(a,b,link,c){
				var rel = link.match(/href="([^"]*)/)[1];
				console.log(rel);
			}
			
			function addNewThread(ref){
				console.log(ref);
				$.ajax({
					type: "GET",
					url:"../thread/detail",
					data: {"link":ref},
					datatype: 'json;charset=UTF-8',
					success: function(data){
						console.log(data);
					}
				})
			}
		</script>
		<hr>
	</c:forEach>
</div>  
<%@include file="/WEB-INF/views/common/footer.jsp" %>