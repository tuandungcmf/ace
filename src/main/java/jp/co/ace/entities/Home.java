package jp.co.ace.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "house_detail")
public class Home {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "HOUSE_NAME")
	private String houseName;

	@Column(name = "HOUSE_DETAIL")
	private String houseDetail;

	@Column(name = "HOUSE_PRICE")
	private int housePrice;
	
	@Column(name = "HOUSE_ADDRESS")
	private String houseAddress;
	
	public String getHouseName() {
		return houseName;
	}

	public String getHouseDetail() {
		return houseDetail;
	}

	public int getHousePrice() {
		return housePrice;
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public void setHouseDetail(String houseDetail) {
		this.houseDetail = houseDetail;
	}

	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	
	public Home() {
	}

	public Home(int id, String houseName, int housePrice) {
		this.id = id;
		this.houseName = houseName;
		this.housePrice = housePrice;
	}

	public Home(String houseName, int housePrice) {
		this.houseName = houseName;
		this.housePrice = housePrice;
	}
}
