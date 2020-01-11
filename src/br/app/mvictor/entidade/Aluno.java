/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.mvictor.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Classe entidade que fica responsável por gerar as tabelas, e realizar outras operações,
 * na base de dados, como insert, update, delete e list, essa classe herda da classe Pessoa,
 * que possui um id, para posteriomente caso seja adicionado uma nova entidade.
 * @author mvictor
 */
@Entity
@Table(name="aluno")
public class Aluno extends Pessoa{
    
    @Column(nullable=false)
    private String nome;
    
    @Column(nullable=false)
    private String curso;
    
    @Column(nullable=false)
    private float nota1;
    
    @Column(nullable=false)
    private float nota2;
    
    @Column(nullable=false)
    private float nota3;
    
    @Column(nullable=false)
    private float nota4;

    
    /**
     * Método que retorna o nome do aluno.
     * @return getNome() - o nome do aluno que será retornado.
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Método que recebe o nome do aluno.
     * @param nome -o nome do aluno.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Método que retorna o nome do curso.
     * @return getCurso() - o nome do curso que irá retornar.
     */
    public String getCurso() {
        return curso;
    }
    
    /**
     * Método que recebe o nome do curso.
     * @param curso - o nome do curso.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    /**
     * Método que retorna a nota do primeiro semestre.
     * @return getNota1() - a nota do primeiro semestre que irá retorna.
     */
    public float getNota1() {
        return nota1;
    }
    
    /**
     * Método que recebe a nota do primeiro semestre.
     * @param nota1 - a nota do primeiro semestre.
     */
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    /**
     * Método que retorna a nota do segundo semestre.
     * @return getNota2() - a nota do segunda semestre que será retornada.
     */
    public float getNota2() {
        return nota2;
    }

    /**
     * Método que recebe a nota do segundo semestre.
     * @param nota2 - a nota do segundo semestre.
     */
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    /**
     * Método que retorna a nota do terceiro semestre.
     * @return getNota3() - a nota que será retornada do terceiro semestre.
     */
    public float getNota3() {
        return nota3;
    }
    
    /**
     * Método que recebe a nota do terceiro semestre.
     * @param nota3 - a nota do terceiro semestre.
     */
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    
    /**
     * Método que retorna a nota do quarto semestre.
     * @return getNota4() - a nota do quarto semestre que irá retorna.
     */
    public float getNota4() {
        return nota4;
    }

    /**
     * Método que recebe a nota do quarto semestre.
     * @param nota4 - a nota do quarto semestre.
     */
    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }
    
}
