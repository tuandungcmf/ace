/**
 * 
 */
var datatable_lang = {
  paginate: {
	  first:    '最初',
	  previous: '前へ',
	  next:     '次へ',
	  last:     '最後へ'
  },
  "info": "_START_-_END_/_TOTAL_",
  "infoEmpty": "",
  "zeroRecords": "データが存在しません。",
  "lengthMenu": "_MENU_件ずつ表示",
  "infoFiltered": ""
};

function ajax_datatables(table_id,search_id,ajax_defs,column_defs){
	
	var dt = $('#' + table_id).DataTable({
	  "ajax": ajax_defs,
	  "processing": true,
	  "serverSide": true,
	  "searching": false,
	  "stateSave":true,
	  "columns": column_defs,
	  "language": datatable_lang,
	  dom: 'B<"clear">lfrtip',
	  buttons: [{extend: 'colvis', text: '表示列切替'}]
	});
	
	init_search_condition(search_id, dt);
	dynamic_search(search_id, dt);
	return dt;
}

/*
 * 検索条件を初期化します。
 * テキストボックスやプルダウンなどの操作にAjax検索のイベントを割り当てます。
 */
function init_search_condition(search_id, datatable){
  $("#" + search_id).find("input,select").each(
    function(i, elem){
      var elem_type = $(elem).attr('type');
      if(elem_type == 'checkbox'){
        $(elem).click(
          function(){
            dynamic_search(search_id, datatable);
          }
        )
      }
      else if(elem_type == 'text'||elem_type == 'number'||elem_type == 'date'||elem_type == 'datetime-local'){
        $(elem).blur(
          function(){
            dynamic_search(search_id, datatable);
          }
        )
      }

      if($(elem).prop("tagName") == 'SELECT'){
        $(elem).change(
          function(){
            dynamic_search(search_id, datatable);
          }
        )
      }
    }
  );
//  load_search_condition(search_id);
}

function dynamic_search(search_id, datatable){
  datatable.ajax.reload();
  save_search_condition(search_id);
}

/*
 * SessionStrageに保存されている検索条件を読み込んで画面に反映します。
 */
function load_search_condition(search_id){
  $("#" + search_id).find("input,select").each(
    function(i, elem){
      if($(elem).attr('type') == 'checkbox' && sessionStorage.getItem(location.pathname + elem.name) == 'true'){
        $(elem).prop('checked', true);
      }
      else if($(elem).attr('type') == 'radio' ){
        if($(elem).val() == sessionStorage.getItem(location.pathname + elem.name)){
          $(elem).prop('checked', true);
        }
      }
      else{
        $(elem).val(sessionStorage.getItem(location.pathname + elem.name));
      }
    }
  )
}

/*
 * 検索条件をSessionStrageに保存します。
 */
function save_search_condition(search_id){
  $("#" + search_id).find("input,select").each(
		  
    function(i, elem){
      if($(elem).attr('type') == 'checkbox'){
        sessionStorage.setItem(location.pathname + elem.name, $(elem).prop('checked'));
      }
      else if($(elem).attr('type') == 'radio'){
        if($(elem).prop('checked')){
          sessionStorage.setItem(location.pathname + elem.name, $(elem).val());
        }
      }
      else{
        sessionStorage.setItem(location.pathname + elem.name, $(elem).val());
      }
    }
  )
}