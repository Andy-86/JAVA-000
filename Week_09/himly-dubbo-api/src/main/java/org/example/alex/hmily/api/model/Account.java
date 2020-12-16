package org.example.alex.hmily.api.model;

/**
 * @author mac
 */
public class Account {
    /**
    * 
    */
    private Integer seqId;

    /**
    * 
    */
    private Integer userId;

    /**
    * 
    */
    private Long usdAmount;

    /**
    * 
    */
    private Long chnAmount;

    /**
    * 
    */
    private Long frozeUsd;

    /**
    * 
    */
    private Long frozeChn;

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getUsdAmount() {
        return usdAmount;
    }

    public void setUsdAmount(Long usdAmount) {
        this.usdAmount = usdAmount;
    }

    public Long getChnAmount() {
        return chnAmount;
    }

    public void setChnAmount(Long chnAmount) {
        this.chnAmount = chnAmount;
    }

    public Long getFrozeUsd() {
        return frozeUsd;
    }

    public void setFrozeUsd(Long frozeUsd) {
        this.frozeUsd = frozeUsd;
    }

    public Long getFrozeChn() {
        return frozeChn;
    }

    public void setFrozeChn(Long frozeChn) {
        this.frozeChn = frozeChn;
    }
}