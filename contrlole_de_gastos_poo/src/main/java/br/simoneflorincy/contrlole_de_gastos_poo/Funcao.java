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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcao")
public class Funcao implements Serializable {
    
    @Column(name = "cd_funcao")
    @Id
    private Boolean acessoRestrito;

    @Column(name = "ds_funcao")
    private String descricao;

    @Column(name = "tp_visivel")
    private Character tp_visivel;

    /**
     * @return the acessoRestrito
     */
    public Boolean getAcessoRestrito() {
        return acessoRestrito;
    }

    /**
     * @param acessoRestrito the acessoRestrito to set
     */
    public void setAcessoRestrito(Boolean acessoRestrito) {
        this.acessoRestrito = acessoRestrito;
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
     * @return the acessoRestrito
     */
    public boolean isAcessoRestrito() {
        return getAcessoRestrito();
    }

    /**
     * @param acessoRestrito the acessoRestrito to set
     */
    public void setAcessoRestrito(boolean acessoRestrito) {
        this.setAcessoRestrito((Boolean) acessoRestrito);
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}