/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.mvictor.entidade;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * classe com  o valor id,
 * essa classe tem como finalidade, dispensar incrementar um primary key, para cada tabela,q
 * quando for gerado um nova entidade, como as classes herdarão dessa classe, podemos gerar um id,
 * para todas entidades, que for herdar da classe 'Pessoa'.
 * @author mvictor
 */

@MappedSuperclass
public class Pessoa {
    
   
    @Id
    private long matricula;
    
    /**
     * Método que retorna o número da matricula.
     * @return getMatricula() - o número da matricula.
     */
    public long getMatricula() {
        return matricula;
    }

    /**
     * Método que recebe um valor da matricula do aluno.
     * @param matricula - o número da matricula.
     */
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    
}
