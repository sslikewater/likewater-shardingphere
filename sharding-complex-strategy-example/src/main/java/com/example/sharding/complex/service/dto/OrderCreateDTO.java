package com.example.sharding.complex.service.dto;

/**
 * @Author: likewater
 * @Description: 订单创建DTO
 * @Date: Create in 9:16 下午 2022/3/2
 */
public class OrderCreateDTO {
    private Long payTime;
    private Long userId;
    private Long sellerId;
    private Long storeId;
    private Long totalItemsAmount;
    private Long discountAmount;
    private Long deliveryAmount;
    private Long totalAmount;
    private String deliveryAddress;


    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getTotalItemsAmount() {
        return totalItemsAmount;
    }

    public void setTotalItemsAmount(Long totalItemsAmount) {
        this.totalItemsAmount = totalItemsAmount;
    }

    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Long getDeliveryAmount() {
        return deliveryAmount;
    }

    public void setDeliveryAmount(Long deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
