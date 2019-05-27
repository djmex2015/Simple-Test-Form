package com.mex.SpringBootProject.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntityForm implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nomeCliente;
    @Column
    private Integer limiteCredito;
    @Column
    @Enumerated(EnumType.STRING)
    private RiscoEnum risco;
    @Column
    private Integer taxaJuros;

    public EntityForm() {
    }

    public EntityForm(String nome) {
        this.nomeCliente = nome;
    }

    public EntityForm(Long id, String nomeCliente, Integer limiteCredito, RiscoEnum risco, Integer taxaJuros) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.limiteCredito = limiteCredito;
        this.risco = risco;
        this.taxaJuros = taxaJuros;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the limiteCredito
     */
    public Integer getLimiteCredito() {
        return limiteCredito;
    }

    /**
     * @param limiteCredito the limiteCredito to set
     */
    public void setLimiteCredito(Integer limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    /**
     * @return the risco
     */
    public RiscoEnum getRisco() {
        return risco;
    }

    /**
     * @param risco the risco to set
     */
    public void setRisco(RiscoEnum risco) {
        this.risco = risco;
    }

    /**
     * @return the taxaJuros
     */
    public Integer getTaxaJuros() {
        return taxaJuros;
    }

    /**
     * @param taxaJuros the taxaJuros to set
     */
    public void setTaxaJuros(Integer taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

}
