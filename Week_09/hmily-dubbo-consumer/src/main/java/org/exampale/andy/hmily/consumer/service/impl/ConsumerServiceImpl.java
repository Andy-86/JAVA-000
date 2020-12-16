package org.exampale.andy.hmily.consumer.service.impl;

import org.dromara.hmily.annotation.HmilyTCC;
import org.example.alex.hmily.api.dot.TradeDto;
import org.exampale.andy.hmily.consumer.mapper.AccountMapper;
import org.example.alex.hmily.api.model.Account;
import org.example.alex.hmily.api.service.IConsumerService;
import org.example.alex.hmily.api.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mac
 */
@Service("consumerService")
public class ConsumerServiceImpl implements IConsumerService {
    @Autowired
    AccountMapper accountMapper;

    @Autowired
    IProviderService providerService;

    @Override
    @HmilyTCC(confirmMethod = "confirm", cancelMethod = "cancel")
    public boolean exchange(TradeDto dto) {
        providerService.exchange(dto);
        if ("C2U".equals(dto.getTradeType())) {
            return accountMapper.frozeCHN(dto) > 0;
        } else if ("U2C".equals(dto.getTradeType())) {
            return accountMapper.frozeUDS(dto) > 0;
        }
        return false;
    }

    public boolean confirm(TradeDto dto) {
        Account account = accountMapper.selectByUserId(dto.getUserId());
        return accountMapper.updateByUserId(getConfirmAccount(dto, account)) > 0;
    }

    public boolean cancel(TradeDto dto) {
        Account account = accountMapper.selectByUserId(dto.getUserId());
        return accountMapper.updateByUserId(getCancelAccount(dto, account)) > 0;
    }

    public Account getConfirmAccount(TradeDto dto, Account account) {
        if ("C2U".equals(dto.getTradeType())) {
            account.setFrozeChn(account.getFrozeChn() - dto.getAmount());
            account.setUsdAmount(account.getUsdAmount() + dto.getAmount() / 7);
        } else if ("U2C".equals(dto.getTradeType())) {
            account.setFrozeUsd(account.getFrozeUsd() - dto.getAmount());
            account.setChnAmount(account.getChnAmount() + dto.getAmount() * 7);
        }
        return account;
    }

    public Account getCancelAccount(TradeDto dto, Account account) {
        if ("U2C".equals(dto.getTradeType())) {
            account.setFrozeChn(account.getFrozeChn() - dto.getAmount());
            account.setUsdAmount(account.getUsdAmount() + dto.getAmount() / 7);
        } else if ("C2U".equals(dto.getTradeType())) {
            account.setFrozeUsd(account.getFrozeUsd() - dto.getAmount());
            account.setChnAmount(account.getChnAmount() + dto.getAmount() * 7);
        }
        return account;
    }
}
