package com.sgaraba.library.service.impl;

import com.sgaraba.library.domain.Recharge;
import com.sgaraba.library.repository.RechargeRepository;
import com.sgaraba.library.service.RechargeService;
import com.sgaraba.library.service.dto.RechargeDTO;
import com.sgaraba.library.service.mapper.RechargeMapper;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Recharge}.
 */
@Service
@Transactional
public class RechargeServiceImpl implements RechargeService {

    private final Logger log = LoggerFactory.getLogger(RechargeServiceImpl.class);

    private final RechargeRepository rechargeRepository;

    private final RechargeMapper rechargeMapper;

    public RechargeServiceImpl(RechargeRepository rechargeRepository, RechargeMapper rechargeMapper) {
        this.rechargeRepository = rechargeRepository;
        this.rechargeMapper = rechargeMapper;
    }

    @Override
    public RechargeDTO save(RechargeDTO rechargeDTO) {
        log.debug("Request to save Recharge : {}", rechargeDTO);
        Recharge recharge = rechargeMapper.toEntity(rechargeDTO);
        recharge = rechargeRepository.save(recharge);
        return rechargeMapper.toDto(recharge);
    }

    @Override
    public RechargeDTO update(RechargeDTO rechargeDTO) {
        log.debug("Request to save Recharge : {}", rechargeDTO);
        Recharge recharge = rechargeMapper.toEntity(rechargeDTO);
        recharge = rechargeRepository.save(recharge);
        return rechargeMapper.toDto(recharge);
    }

    @Override
    public Optional<RechargeDTO> partialUpdate(RechargeDTO rechargeDTO) {
        log.debug("Request to partially update Recharge : {}", rechargeDTO);

        return rechargeRepository
            .findById(rechargeDTO.getId())
            .map(existingRecharge -> {
                rechargeMapper.partialUpdate(existingRecharge, rechargeDTO);

                return existingRecharge;
            })
            .map(rechargeRepository::save)
            .map(rechargeMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<RechargeDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Recharges");
        return rechargeRepository.findAll(pageable).map(rechargeMapper::toDto);
    }

    public Page<RechargeDTO> findAllWithEagerRelationships(Pageable pageable) {
        return rechargeRepository.findAllWithEagerRelationships(pageable).map(rechargeMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<RechargeDTO> findOne(Long id) {
        log.debug("Request to get Recharge : {}", id);
        return rechargeRepository.findOneWithEagerRelationships(id).map(rechargeMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Recharge : {}", id);
        rechargeRepository.deleteById(id);
    }
}
