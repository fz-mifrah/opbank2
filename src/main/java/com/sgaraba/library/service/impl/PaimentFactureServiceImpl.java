package com.sgaraba.library.service.impl;

import com.sgaraba.library.domain.PaimentFacture;
import com.sgaraba.library.repository.PaimentFactureRepository;
import com.sgaraba.library.service.PaimentFactureService;
import com.sgaraba.library.service.dto.PaimentFactureDTO;
import com.sgaraba.library.service.mapper.PaimentFactureMapper;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link PaimentFacture}.
 */
@Service
@Transactional
public class PaimentFactureServiceImpl implements PaimentFactureService {

    private final Logger log = LoggerFactory.getLogger(PaimentFactureServiceImpl.class);

    private final PaimentFactureRepository paimentFactureRepository;

    private final PaimentFactureMapper paimentFactureMapper;

    public PaimentFactureServiceImpl(PaimentFactureRepository paimentFactureRepository, PaimentFactureMapper paimentFactureMapper) {
        this.paimentFactureRepository = paimentFactureRepository;
        this.paimentFactureMapper = paimentFactureMapper;
    }

    @Override
    public PaimentFactureDTO save(PaimentFactureDTO paimentFactureDTO) {
        log.debug("Request to save PaimentFacture : {}", paimentFactureDTO);
        PaimentFacture paimentFacture = paimentFactureMapper.toEntity(paimentFactureDTO);
        paimentFacture = paimentFactureRepository.save(paimentFacture);
        return paimentFactureMapper.toDto(paimentFacture);
    }

    @Override
    public PaimentFactureDTO update(PaimentFactureDTO paimentFactureDTO) {
        log.debug("Request to save PaimentFacture : {}", paimentFactureDTO);
        PaimentFacture paimentFacture = paimentFactureMapper.toEntity(paimentFactureDTO);
        paimentFacture = paimentFactureRepository.save(paimentFacture);
        return paimentFactureMapper.toDto(paimentFacture);
    }

    @Override
    public Optional<PaimentFactureDTO> partialUpdate(PaimentFactureDTO paimentFactureDTO) {
        log.debug("Request to partially update PaimentFacture : {}", paimentFactureDTO);

        return paimentFactureRepository
            .findById(paimentFactureDTO.getId())
            .map(existingPaimentFacture -> {
                paimentFactureMapper.partialUpdate(existingPaimentFacture, paimentFactureDTO);

                return existingPaimentFacture;
            })
            .map(paimentFactureRepository::save)
            .map(paimentFactureMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<PaimentFactureDTO> findAll(Pageable pageable) {
        log.debug("Request to get all PaimentFactures");
        return paimentFactureRepository.findAll(pageable).map(paimentFactureMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<PaimentFactureDTO> findOne(Long id) {
        log.debug("Request to get PaimentFacture : {}", id);
        return paimentFactureRepository.findById(id).map(paimentFactureMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete PaimentFacture : {}", id);
        paimentFactureRepository.deleteById(id);
    }
}
