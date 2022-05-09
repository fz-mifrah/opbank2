package com.sgaraba.library.service.mapper;

import com.sgaraba.library.domain.Destinataire;
import com.sgaraba.library.domain.Virement;
import com.sgaraba.library.service.dto.DestinataireDTO;
import com.sgaraba.library.service.dto.VirementDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Destinataire} and its DTO {@link DestinataireDTO}.
 */
@Mapper(componentModel = "spring")
public interface DestinataireMapper extends EntityMapper<DestinataireDTO, Destinataire> {
    @Mapping(target = "virement", source = "virement", qualifiedByName = "virementId")
    DestinataireDTO toDto(Destinataire s);

    @Named("virementId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    VirementDTO toDtoVirementId(Virement virement);
}
