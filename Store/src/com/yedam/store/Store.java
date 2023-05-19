package com.yedam.store;

public class Store {
	private int storeId;
	private String storeName;
	private String storeTel;
	private String storeAddr;
	private int storeSales;
	
	// 지역구별 매출 합계를 위한 필드
	private String storeLocation;
	private int sumSales;
	
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreTel() {
		return storeTel;
	}
	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}
	public String getStoreAddr() {
		return storeAddr;
	}
	public void setStoreAddr(String storeAddr) {
		this.storeAddr = storeAddr;
	}
	public int getStoreSales() {
		return storeSales;
	}
	public void setStoreSales(int storeSales) {
		this.storeSales = storeSales;
	}
	public String getStoreLocation() {
		return storeLocation;
	}
	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}
	public int getSumSales() {
		return sumSales;
	}
	public void setSumSales(int sumSales) {
		this.sumSales = sumSales;
	}
	
	
	
	
}
