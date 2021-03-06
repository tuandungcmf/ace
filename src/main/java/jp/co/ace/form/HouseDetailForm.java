package jp.co.ace.form;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class HouseDetailForm  implements Serializable {

	@Size(max=255)
	private String houseName;

	@Size(max=255)
	private String linkId;
	
	private String houseDetail;

	private String housePrice;

	@Size(max=255)
	private String houseAddress;

	private Date createDate;

	private Date updateDate;

	private Integer accountId;

	private Integer categoryId;

	private Integer exclusive;

//getter,setter
	public String getHouseName(){
		return houseName;
	}
	public void setHouseName(String houseName){
		this.houseName = houseName;
	}

	public String getHouseDetail(){
		return houseDetail;
	}
	public void setHouseDetail(String houseDetail){
		this.houseDetail = houseDetail;
	}

	public String getHousePrice(){
		return housePrice;
	}
	public void setHousePrice(String housePrice){
		this.housePrice = housePrice;
	}

	public String getHouseAddress(){
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress){
		this.houseAddress = houseAddress;
	}

	public Date getCreateDate(){
		return createDate;
	}
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}

	public Date getUpdateDate(){
		return updateDate;
	}
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}

	public Integer getAccountId(){
		return accountId;
	}
	public void setAccountId(Integer accountId){
		this.accountId = accountId;
	}

	public Integer getCategoryId(){
		return categoryId;
	}
	public void setCategoryId(Integer categoryId){
		this.categoryId = categoryId;
	}

	public Integer getExclusive(){
		return exclusive;
	}
	public void setExclusive(Integer exclusive){
		this.exclusive = exclusive;
	}
	public String getLinkId() {
		return linkId;
	}
	public void setLinkId(String linkId) {
		this.linkId = linkId;
	}
}