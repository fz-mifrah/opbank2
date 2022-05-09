package com.sgaraba.library.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sgaraba.library.domain.enumeration.TypeOperation;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Operation.
 */
@Entity
@Table(name = "operation")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Operation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "num_operation", nullable = false)
    private String numOperation;

    @Column(name = "date")
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_operatin")
    private TypeOperation typeOperatin;

    @Column(name = "etat_operation")
    private String etatOperation;

    @NotNull
    @Column(name = "montant", nullable = false)
    private Double montant;

    @ManyToOne
    @JsonIgnoreProperties(value = { "operations", "banque" }, allowSetters = true)
    private Compte compte;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Operation id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumOperation() {
        return this.numOperation;
    }

    public Operation numOperation(String numOperation) {
        this.setNumOperation(numOperation);
        return this;
    }

    public void setNumOperation(String numOperation) {
        this.numOperation = numOperation;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public Operation date(LocalDate date) {
        this.setDate(date);
        return this;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TypeOperation getTypeOperatin() {
        return this.typeOperatin;
    }

    public Operation typeOperatin(TypeOperation typeOperatin) {
        this.setTypeOperatin(typeOperatin);
        return this;
    }

    public void setTypeOperatin(TypeOperation typeOperatin) {
        this.typeOperatin = typeOperatin;
    }

    public String getEtatOperation() {
        return this.etatOperation;
    }

    public Operation etatOperation(String etatOperation) {
        this.setEtatOperation(etatOperation);
        return this;
    }

    public void setEtatOperation(String etatOperation) {
        this.etatOperation = etatOperation;
    }

    public Double getMontant() {
        return this.montant;
    }

    public Operation montant(Double montant) {
        this.setMontant(montant);
        return this;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Compte getCompte() {
        return this.compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Operation compte(Compte compte) {
        this.setCompte(compte);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Operation)) {
            return false;
        }
        return id != null && id.equals(((Operation) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Operation{" +
            "id=" + getId() +
            ", numOperation='" + getNumOperation() + "'" +
            ", date='" + getDate() + "'" +
            ", typeOperatin='" + getTypeOperatin() + "'" +
            ", etatOperation='" + getEtatOperation() + "'" +
            ", montant=" + getMontant() +
            "}";
    }
}
