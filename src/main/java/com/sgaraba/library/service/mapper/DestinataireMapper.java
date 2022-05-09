package com.sgaraba.library.service.mapper;

import com.sgaraba.library.domain.Destinataire;
import com.sgaraba.library.service.dto.DestinataireDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Destinataire} and its DTO {@link DestinataireDTO}.
 */
@Mapper(componentModel = "spring")
public interface DestinataireMapper extends EntityMapper<DestinataireDTO, Destinataire> {}
