package com.sgaraba.library.service.mapper;

import com.sgaraba.library.domain.Recharge;
import com.sgaraba.library.service.dto.RechargeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Recharge} and its DTO {@link RechargeDTO}.
 */
@Mapper(componentModel = "spring")
public interface RechargeMapper extends EntityMapper<RechargeDTO, Recharge> {}
