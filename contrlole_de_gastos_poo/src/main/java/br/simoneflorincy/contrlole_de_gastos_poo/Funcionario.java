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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable {
    //cd_funcionario
    @Column(name = "cd_funcionario")
    @Id
    private String funcionario;
    @Column(name = "tp_nick")
    private String nick;
    @Column(name = "nm_funcionario")
    private String nome;
    @Column(name = "ds_senha")
    private String senha;
    @Column(name = "funcao_cd_funcao")
    private Funcao funcao_do_funcionario;
    @Column(name = "endereco_cd_endereco")
    @OneToOne(targetEntity = Endereco.class,
            cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER)
    private Endereco endereco_do_funcionario;
    @Column
    private Character tp_invisivel;
    @Column(name = "funcao_cd_funcao")
    @ManyToOne(targetEntity = Funcao.class,
            cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER)
    
      

    /**
     * @return the funcionario
     */
    public String getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the tp_invisivel
     */
    public Character getTp_invisivel() {
        return tp_invisivel;
    }

    /**
     * @param tp_invisivel the tp_invisivel to set
     */
    public void setTp_invisivel(Character tp_invisivel) {
        this.tp_invisivel = tp_invisivel;
    }
    
}
