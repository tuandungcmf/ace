<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<label>Giá:</label>
<select name="cb">Từ 
	<option value="0.0">下限なし</option>
	<option value="3.0">3万円</option>
	<option value="3.5">3.5万円</option>
	<option value="4.0">4万円</option>
	<option value="4.5">4.5万円</option>
	<option value="5.0">5万円</option>
	<option value="5.5">5.5万円</option>
	<option value="6.0">6万円</option>
	<option value="6.5">6.5万円</option>
	<option value="7.0">7万円</option>
	<option value="7.5">7.5万円</option>
	<option value="8.0">8万円</option>
	<option value="8.5">8.5万円</option>
	<option value="9.0">9万円</option>
	<option value="9.5">9.5万円</option>
	<option value="10.0">10万円</option>
	<option value="10.5">10.5万円</option>
	<option value="11.0">11万円</option>
	<option value="11.5">11.5万円</option>
	<option value="12.0">12万円</option>
	<option value="12.5">12.5万円</option>
	<option value="13.0">13万円</option>
	<option value="13.5">13.5万円</option>
	<option value="14.0">14万円</option>
	<option value="14.5">14.5万円</option>
	<option value="15.0">15万円</option>
	<option value="15.5">15.5万円</option>
	<option value="16.0">16万円</option>
	<option value="16.5">16.5万円</option>
	<option value="17.0">17万円</option>
	<option value="17.5">17.5万円</option>
	<option value="18.0">18万円</option>
	<option value="18.5">18.5万円</option>
	<option value="19.0">19万円</option>
	<option value="19.5">19.5万円</option>
	<option value="20.0">20万円</option>
	<option value="21.0">21万円</option>
	<option value="22.0">22万円</option>
</select>
<select name="ct"> Đến
	<option value="0.0">下限なし</option>
	<option value="3.0">3万円</option>
	<option value="3.5">3.5万円</option>
	<option value="4.0">4万円</option>
	<option value="4.5">4.5万円</option>
	<option value="5.0">5万円</option>
	<option value="5.5">5.5万円</option>
	<option value="6.0">6万円</option>
	<option value="6.5">6.5万円</option>
	<option value="7.0">7万円</option>
	<option value="7.5">7.5万円</option>
	<option value="8.0">8万円</option>
	<option value="8.5">8.5万円</option>
	<option value="9.0">9万円</option>
	<option value="9.5">9.5万円</option>
	<option value="10.0">10万円</option>
	<option value="10.5">10.5万円</option>
	<option value="11.0">11万円</option>
	<option value="11.5">11.5万円</option>
	<option value="12.0">12万円</option>
	<option value="12.5">12.5万円</option>
	<option value="13.0">13万円</option>
	<option value="13.5">13.5万円</option>
	<option value="14.0">14万円</option>
	<option value="14.5">14.5万円</option>
	<option value="15.0">15万円</option>
	<option value="15.5">15.5万円</option>
	<option value="16.0">16万円</option>
	<option value="16.5">16.5万円</option>
	<option value="17.0">17万円</option>
	<option value="17.5">17.5万円</option>
	<option value="18.0">18万円</option>
	<option value="18.5">18.5万円</option>
	<option value="19.0">19万円</option>
	<option value="19.5">19.5万円</option>
	<option value="20.0">20万円</option>
	<option value="21.0">21万円</option>
	<option value="22.0">22万円</option>
</select>
<br>
<label>Kiểu nhà:</label>
<div class="checkbox">
	<label class="checkbox-inline">
		<input type="checkbox" value="01" name="md"/>ワンルーム
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="02" name="md"/>1K
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="03" name="md"/>1DK
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="04" name="md"/>1LDK
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="05" name="md"/>2K
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="06" name="md"/>2DK
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="07" name="md"/>2LDK
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="08" name="md"/>3K
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="09" name="md"/>3DK
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="10" name="md"/>3LDK
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="11" name="md"/>4K
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="12" name="md"/>4DK
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="13" name="md"/>4LDK
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="14" name="md"/>5K以上
	</label>
</div>
<div class="checkbox">
	<label class="checkbox-inline">
		<input type="checkbox" value="1" name="ts"/>マンション
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="2" name="ts"/>アパート
	</label>
	<label class="checkbox-inline">
		<input type="checkbox" value="3" name="ts"/>一戸建て・その他
	</label>
</div>