package com.sgaraba.library.service.mapper;

import com.sgaraba.library.domain.Client;
import com.sgaraba.library.service.dto.ClientDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Client} and its DTO {@link ClientDTO}.
 */
@Mapper(componentModel = "spring")
public interface ClientMapper extends EntityMapper<ClientDTO, Client> {}
