package com.andy.shardingjdbc.user.model;

import java.io.Serializable;
import java.util.Date;

public class StoreOrder implements Serializable {
    /**
    * 
    */
    private Long orderId;

    /**
    * 
    */
    private Date createTime;

    /**
    * 
    */
    private Date updateTime;

    /**
    * 
    */
    private Long commodityId;

    /**
    * 
    */
    private Long userId;

    /**
    * 
    */
    private String shippingAddress;

    /**
    * 
    */
    private String recivingPhone;

    /**
    * 
    */
    private Long orderAmount;

    private static final long serialVersionUID = 1L;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getRecivingPhone() {
        return recivingPhone;
    }

    public void setRecivingPhone(String recivingPhone) {
        this.recivingPhone = recivingPhone;
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", commodityId=").append(commodityId);
        sb.append(", userId=").append(userId);
        sb.append(", shippingAddress=").append(shippingAddress);
        sb.append(", recivingPhone=").append(recivingPhone);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append("]");
        return sb.toString();
    }
}