/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;

/**
 *
 * @author User
 */
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordem_servico")
public class OrdemServico implements Serializable{
    
    //cd_ordem_servico
    @Column(name = "cd_ordem_servico")
    @Id
    private Integer ordemservico;
    @Column(name = "dt_ordem_servico")
    private Date data;
    @Column(name = "vl_total_numeric")
    private Double valorTotal;
   @Column(name = "funcionario_cd_funcionario")
   @OneToOne(targetEntity = Funcionario.class,
           cascade = CascadeType.REMOVE,
           fetch = FetchType.EAGER)
    private Funcionario funcionario;
    @Column(name = "cliente_cd_cliente")
    private Cliente cliente;
    @Column(name = "bool_fechado")
    @OneToOne(targetEntity = Cliente.class,
            cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER)
    private Double fechado;
   


    /**
     * @return the ordemservico
     */
    public Integer getOrdemservico() {
        return ordemservico;
    }

    /**
     * @param ordemservico the ordemservico to set
     */
    public void setOrdemservico(Integer ordemservico) {
        this.ordemservico = ordemservico;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the valorTotal
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the fechado
     */
    public Double getFechado() {
        return fechado;
    }

    /**
     * @param fechado the fechado to set
     */
    public void setFechado(Double fechado) {
        this.fechado = fechado;
    }
    
}