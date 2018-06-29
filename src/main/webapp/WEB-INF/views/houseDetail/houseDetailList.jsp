<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<link rel="stylesheet" type="text/css" href="/vendor/DataTables/datatables.css"/>
<script type="text/javascript" src="/vendor/js/jquery.js?${buildDatetime}"></script>
<script type="text/javascript" src="/vendor/DataTables/datatables.js?${buildDatetime}"></script>
<script type="text/javascript" src="/js/dataTables_presco.ai.js?${buildDatetime}"></script>

<script type="text/javascript">
$(document).ready(function(){
    ///////////////Datatables(Ajax版)の定義開始
    //表示列の定義
    var column_datas = [
		{"data": "id", "name": "ID"},
		{"data": "houseName", "name": "HOUSE_NAME", "defaultContent":"", render: $.fn.dataTable.render.text()},
		{"data": "houseDetail", "name": "HOUSE_DETAIL", "defaultContent":"", render: $.fn.dataTable.render.text()},
		{"data": "housePrice", "name": "HOUSE_PRICE", "defaultContent":"", render: $.fn.dataTable.render.text()},
		{"data": "houseAddress", "name": "HOUSE_ADDRESS", "defaultContent":"", render: $.fn.dataTable.render.text()},
		{"data": "createDate", "name": "CREATE_DATE", "defaultContent":"", render: $.fn.dataTable.render.text()},
		{"data": "updateDate", "name": "UPDATE_DATE", "defaultContent":"", render: $.fn.dataTable.render.text()},
		{"data": "accountId", "name": "ACCOUNT_ID", "defaultContent":"", render: $.fn.dataTable.render.text()},
		{"data": "categoryId", "name": "CATEGORY_ID", "defaultContent":"", render: $.fn.dataTable.render.text()},
		{
			"data": null, "name": null, "render": function ( data, type, row, meta ) {
				return '<form action="detail"><input type="hidden" name="houseDetailId" value="' + data.id + '"/><input type="submit" value="詳細"></form>';
			}
		},
		{
			"data": null, "name": null, "render": function ( data, type, row, meta ) {
				return '<form action="edit"><input type="hidden" name="houseDetailId" value="' + data.id + '"/><input type="submit" value="変更"></form>';
			}
		},
		{
			"data": null, "name": null, "render": function ( data, type, row, meta ) {
				return '<form action="deleteConfirm"><input type="hidden" name="houseDetailId" value="' + data.id + '"/><input type="submit" value="削除"></form>';
			}
		}
    ];
    //Ajax通信の定義
    var ajax_defs = {
      type: "post",
      url: "search",
      data: function(d) {
         d.search["id"] = $("[name=searchId]").val();
         d.search["houseName"] = $("[name=searchHouseName]").val();
         d.search["houseDetail"] = $("[name=searchHouseDetail]").val();
         d.search["housePrice"] = $("[name=searchHousePrice]").val();
         d.search["houseAddress"] = $("[name=searchHouseAddress]").val();
         d.search["createDate"] = $("[name=searchCreateDate]").val();
         d.search["updateDate"] = $("[name=searchUpdateDate]").val();
         d.search["accountId"] = $("[name=searchAccountId]").val();
         d.search["categoryId"] = $("[name=searchCategoryId]").val();
		 d.<c:out value="${_csrf.parameterName}"/> = "<c:out value='${_csrf.token}'/>";
     }
   };
   ajax_datatables("houseDetailTable", "search-box", ajax_defs, column_datas);
   ///////////////Datatables(Ajax版)の定義終了
});
</script>

<h1>house_detail一覧</h1>
<c:out value="${msg}"/>
<div>検索条件</div>
<dl id="search-box">

	<dt>house_detailID</dt>
	<dd><input type="text" name="searchId"></dd>

	<dt>TITLE</dt>
	<dd><input type="text" name="searchHouseName"></dd>

	<dt>CONTENT</dt>
	<dd><input type="text" name="searchHouseDetail"></dd>

	<dt>PRICE</dt>
	<dd><input type="text" name="searchHousePrice"></dd>

	<dt>ADDRESS</dt>
	<dd><input type="text" name="searchHouseAddress"></dd>

	<dt>CREATE_DATE</dt>
	<dd><input type="text" name="searchCreateDate"></dd>

	<dt>UPDATE_DATE</dt>
	<dd><input type="text" name="searchUpdateDate"></dd>

	<dt>ACCOUNT_INPUT_ID</dt>
	<dd><input type="text" name="searchAccountId"></dd>

	<dt></dt>
	<dd><input type="text" name="searchCategoryId"></dd>

</dl>
<div class="table-responsive">
	<table class="table table-striped" id="houseDetailTable">
		<thead>
		 <tr>
		  	<th>house_detailID</th>
		  	<th>TITLE</th>
		  	<th>CONTENT</th>
		  	<th>PRICE</th>
		  	<th>ADDRESS</th>
		  	<th>CREATE_DATE</th>
		  	<th>UPDATE_DATE</th>
		  	<th>ACCOUNT_INPUT_ID</th>
		  	<th></th>
			<th>詳細</th>
			<th>変更</th>
			<th>削除</th>
		 </tr>
		</thead>
		<tbody>
  		</tbody>
	</table>
</div>
<br>
<form action="input">
	<input type="submit" value="新規登録"/>
</form>