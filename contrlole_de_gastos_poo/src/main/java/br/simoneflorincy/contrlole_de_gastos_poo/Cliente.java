/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

/**
 *
 * @author User
 */
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    //cd_cliente
    @Column(name = "cd_cliente")
    @Id
    private Integer codCliente;
    @Column(name = "cod_identificacao")
    private String codIdentificacao;
    @Column(name = "ds_emal")
    private String email;
    @Column(name = "nm_fantasia")
    private String nomeFantasia;
    @Column(name = "nm_razaosocial")
    private String razaoSocial;
    @Column(name = "cd_cliente")
    private String tipoCliente;
    @Column(name = "endereco_cd_endereco")
    private Endereco enderecoDoCliente;
    @Column(name = "tipo_cliente")
    private Character tipo_cliente;
    @Column
    private Character tp_visivel;
    @Column(name = "endereco_cd_endereco")
    @OneToOne(targetEntity = Endereco.class,
            cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER)
    private Endereco enderecodoCliente;
    
    
    /**
     * @return the codCliente
     */
    public Integer getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    /**
     * @return the codIdentificacao
     */
    public String getCodIdentificacao() {
        return codIdentificacao;
    }

    /**
     * @param codIdentificacao the codIdentificacao to set
     */
    public void setCodIdentificacao(String codIdentificacao) {
        this.codIdentificacao = codIdentificacao;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the tipoCliente
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * @param tipoCliente the tipoCliente to set
     */
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    /**
     * @return the enderecoDoCliente
     */
    public Endereco getEnderecoDoCliente() {
        return enderecoDoCliente;
    }

    /**
     * @param enderecoDoCliente the enderecoDoCliente to set
     */
    public void setEnderecoDoCliente(Endereco enderecoDoCliente) {
        this.enderecoDoCliente = enderecoDoCliente;
    }

    /**
     * @return the tipo_cliente
     */
    public Character getTipo_cliente() {
        return tipo_cliente;
    }

    /**
     * @param tipo_cliente the tipo_cliente to set
     */
    public void setTipo_cliente(Character tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    /**
     * @return the tp_visivel
     */
    public Character getTp_visivel() {
        return tp_visivel;
    }

    /**
     * @param tp_visivel the tp_visivel to set
     */
    public void setTp_visivel(Character tp_visivel) {
        this.tp_visivel = tp_visivel;
    }

    /**
     * @return the enderecodoCliente
     */
    public Endereco getEnderecodoCliente() {
        return enderecodoCliente;
    }

    /**
     * @param enderecodoCliente the enderecodoCliente to set
     */
    public void setEnderecodoCliente(Endereco enderecodoCliente) {
        this.enderecodoCliente = enderecodoCliente;
    }
 
}
