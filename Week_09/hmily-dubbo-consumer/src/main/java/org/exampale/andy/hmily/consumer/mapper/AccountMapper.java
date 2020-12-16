package org.exampale.andy.hmily.consumer.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.alex.hmily.api.dot.TradeDto;
import org.example.alex.hmily.api.model.Account;

/**
 * @author mac
 */
@Mapper
public interface AccountMapper {

    int deleteByPrimaryKey(Integer seqId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByUserId(@Param("userId") Integer userId);

    int updateByPrimaryKeySelective(Account record);

    int updateByUserId(Account record);


    int frozeUDS(@Param("dto") TradeDto dto);

    int frozeCHN(@Param("dto") TradeDto dto);
}