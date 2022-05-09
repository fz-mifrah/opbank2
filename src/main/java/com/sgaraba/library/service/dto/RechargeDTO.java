package com.sgaraba.library.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.sgaraba.library.domain.Recharge} entity.
 */
public class RechargeDTO implements Serializable {

    private Long id;

    @NotNull
    private Long numTel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumTel() {
        return numTel;
    }

    public void setNumTel(Long numTel) {
        this.numTel = numTel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RechargeDTO)) {
            return false;
        }

        RechargeDTO rechargeDTO = (RechargeDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, rechargeDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "RechargeDTO{" +
            "id=" + getId() +
            ", numTel=" + getNumTel() +
            "}";
    }
}
