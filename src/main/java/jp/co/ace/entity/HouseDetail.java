package jp.co.ace.entity;

import java.io.Serializable;
import java.util.Date;

public class HouseDetail implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_detail.ID
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_detail.HOUSE_NAME
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    private String houseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_detail.HOUSE_DETAIL
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    private String houseDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_detail.HOUSE_PRICE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    private Integer housePrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_detail.HOUSE_ADDRESS
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    private String houseAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_detail.CREATE_DATE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_detail.UPDATE_DATE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_detail.ACCOUNT_ID
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    private Integer accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_detail.CATEGORY_ID
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_detail.EXCLUSIVE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    private Integer exclusive;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table house_detail
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_detail.ID
     *
     * @return the value of house_detail.ID
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_detail.ID
     *
     * @param id the value for house_detail.ID
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_detail.HOUSE_NAME
     *
     * @return the value of house_detail.HOUSE_NAME
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public String getHouseName() {
        return houseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_detail.HOUSE_NAME
     *
     * @param houseName the value for house_detail.HOUSE_NAME
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_detail.HOUSE_DETAIL
     *
     * @return the value of house_detail.HOUSE_DETAIL
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public String getHouseDetail() {
        return houseDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_detail.HOUSE_DETAIL
     *
     * @param houseDetail the value for house_detail.HOUSE_DETAIL
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public void setHouseDetail(String houseDetail) {
        this.houseDetail = houseDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_detail.HOUSE_PRICE
     *
     * @return the value of house_detail.HOUSE_PRICE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public Integer getHousePrice() {
        return housePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_detail.HOUSE_PRICE
     *
     * @param housePrice the value for house_detail.HOUSE_PRICE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public void setHousePrice(Integer housePrice) {
        this.housePrice = housePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_detail.HOUSE_ADDRESS
     *
     * @return the value of house_detail.HOUSE_ADDRESS
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public String getHouseAddress() {
        return houseAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_detail.HOUSE_ADDRESS
     *
     * @param houseAddress the value for house_detail.HOUSE_ADDRESS
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_detail.CREATE_DATE
     *
     * @return the value of house_detail.CREATE_DATE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_detail.CREATE_DATE
     *
     * @param createDate the value for house_detail.CREATE_DATE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_detail.UPDATE_DATE
     *
     * @return the value of house_detail.UPDATE_DATE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_detail.UPDATE_DATE
     *
     * @param updateDate the value for house_detail.UPDATE_DATE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_detail.ACCOUNT_ID
     *
     * @return the value of house_detail.ACCOUNT_ID
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_detail.ACCOUNT_ID
     *
     * @param accountId the value for house_detail.ACCOUNT_ID
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_detail.CATEGORY_ID
     *
     * @return the value of house_detail.CATEGORY_ID
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_detail.CATEGORY_ID
     *
     * @param categoryId the value for house_detail.CATEGORY_ID
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_detail.EXCLUSIVE
     *
     * @return the value of house_detail.EXCLUSIVE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public Integer getExclusive() {
        return exclusive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_detail.EXCLUSIVE
     *
     * @param exclusive the value for house_detail.EXCLUSIVE
     *
     * @mbg.generated Fri Jun 29 11:42:52 JST 2018
     */
    public void setExclusive(Integer exclusive) {
        this.exclusive = exclusive;
    }
}