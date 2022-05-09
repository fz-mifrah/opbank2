package com.sgaraba.library.service;

import com.sgaraba.library.service.dto.RechargeDTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link com.sgaraba.library.domain.Recharge}.
 */
public interface RechargeService {
    /**
     * Save a recharge.
     *
     * @param rechargeDTO the entity to save.
     * @return the persisted entity.
     */
    RechargeDTO save(RechargeDTO rechargeDTO);

    /**
     * Updates a recharge.
     *
     * @param rechargeDTO the entity to update.
     * @return the persisted entity.
     */
    RechargeDTO update(RechargeDTO rechargeDTO);

    /**
     * Partially updates a recharge.
     *
     * @param rechargeDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<RechargeDTO> partialUpdate(RechargeDTO rechargeDTO);

    /**
     * Get all the recharges.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<RechargeDTO> findAll(Pageable pageable);

    /**
     * Get the "id" recharge.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<RechargeDTO> findOne(Long id);

    /**
     * Delete the "id" recharge.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}