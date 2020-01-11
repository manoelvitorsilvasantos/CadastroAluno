/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.mvictor.service;

import br.app.mvictor.entidade.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mvictor
 */
public interface ModeloConstantes {
    
    /**
     * A linhas contendo o conteudo da tabela.
     */
    public List <Aluno> listaAluno=  new ArrayList();

    /**
     * as colunas da tabelas custumizavéis, contendo os titulo para cada coluna.
     */
    public String[] colunas = new String[]
    {
        "Matricula", "Nome", "Curso", "Nota 1", "Nota 2", "Nota 3", "Nota 4"
    };
}
