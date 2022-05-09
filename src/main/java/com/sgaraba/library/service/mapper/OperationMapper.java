package com.sgaraba.library.service.mapper;

import com.sgaraba.library.domain.Operation;
import com.sgaraba.library.service.dto.OperationDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Operation} and its DTO {@link OperationDTO}.
 */
@Mapper(componentModel = "spring")
public interface OperationMapper extends EntityMapper<OperationDTO, Operation> {}
