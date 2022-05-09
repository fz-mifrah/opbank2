package com.sgaraba.library.service.mapper;

import com.sgaraba.library.domain.Compte;
import com.sgaraba.library.service.dto.CompteDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Compte} and its DTO {@link CompteDTO}.
 */
@Mapper(componentModel = "spring")
public interface CompteMapper extends EntityMapper<CompteDTO, Compte> {}
