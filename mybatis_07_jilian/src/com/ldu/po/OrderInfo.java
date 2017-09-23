package com.ldu.po;

public class OrderInfo {
	private int oid;
	private int price;
	private String proName;
	private UserInfo userInfo;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	@Override
	public String toString() {
		return "OrderInfo [oid=" + oid + ", price=" + price + ", proName="
				+ proName + "]";
	}
	
}
