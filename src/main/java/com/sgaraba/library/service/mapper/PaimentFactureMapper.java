package com.sgaraba.library.service.mapper;

import com.sgaraba.library.domain.PaimentFacture;
import com.sgaraba.library.service.dto.PaimentFactureDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link PaimentFacture} and its DTO {@link PaimentFactureDTO}.
 */
@Mapper(componentModel = "spring")
public interface PaimentFactureMapper extends EntityMapper<PaimentFactureDTO, PaimentFacture> {}
