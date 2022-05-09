package com.sgaraba.library.service.mapper;

import com.sgaraba.library.domain.Beneficiaire;
import com.sgaraba.library.service.dto.BeneficiaireDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Beneficiaire} and its DTO {@link BeneficiaireDTO}.
 */
@Mapper(componentModel = "spring")
public interface BeneficiaireMapper extends EntityMapper<BeneficiaireDTO, Beneficiaire> {}
