/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.mvictor.service;

import br.app.mvictor.entidade.Aluno;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 * Classe responsável por criar um modelo para a tabela,
 * essa classe cria um tabela custizavel, além disso possui algumas funções,
 * importantissimo para remoção e inserção e atualização das informações na nossa,
 * tabela.
 * @author mvictor
 */
public class ModeloTabela extends AbstractTableModel implements ModeloConstantes{

    /**
     * @param listaAluno - o conteudo em si da tabela contendo as informações.
     * @param colunas - o titulo das colunas
     */
    
    
    /**
     * Método que retorna o texto para cada título.
     * @param linha - a linha que você que setar o texto..
     */
    @Override
    public String getColumnName(int linha)
    {
        return this.colunas[linha];
    }
    
    /**
     * Método que retorna o número de linhass da tabela.
     */
    @Override
    public int getRowCount() {
        return this.listaAluno.size();
    }
    
    /**
     * Método que retorna o número de colunas.
     */
    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }
    
    /**
     * Método que gera o modelo da nossa tabela.
     * @param linhas - o número da linha que você que modificar.
     * @param colunas - o número da coluna que você que modificar.
     */
    @Override
    public Object getValueAt(int linhas, int colunas) {
        switch(colunas)
        {
            case 0: 
                return this.listaAluno.get(linhas).getMatricula();
            case 1:
                return this.listaAluno.get(linhas).getNome();
            case 2:
                return this.listaAluno.get(linhas).getCurso();
            case 3:
                return this.listaAluno.get(linhas).getNota1();
            case 4:
                return this.listaAluno.get(linhas).getNota2();
            case 5:
                return this.listaAluno.get(linhas).getNota3();
            case 6:
                return this.listaAluno.get(linhas).getNota4();    
        }
        return null;
    }
    
    /**
     * Método que adicionar um novo elemento na linha da tabela.
     * @param a - a classe entidade contendo as informações a serem adicionados na tabela.
     */
    public void adicionarNovoElementoNaLinhaDaTabela(Aluno a)
    {
        this.listaAluno.add(a);
        this.fireTableDataChanged();
    }
    
    /**
     * Método que adicionar um novo elemento na linha da tabela, especificando o index da linha.
     * @param index - o index da linha da tabela.
     * @param a - a classe entidade contendo as informações a serem adicionadas na tabela. 
     */
    public void adicionarNovaLinhaNaTabela(int index, Aluno a)
    {
        this.listaAluno.add(index, a);
        this.fireTableDataChanged();
    }
    
    /**
     * Método que remova uma linha da tabela por do index dessa linha.
     * @param index - a posição da linha.
     */
    public void removerLinhaDaTabela(int index)
    {
        this.listaAluno.remove(index);
        this.fireTableDataChanged();
    }
    
    /**
     * Método responsável por limparTabela a tabela.
     */
    public void limparTabela()
    {
        this.listaAluno.clear();
        this.fireTableDataChanged();
    }
    
    /**
     * Método que atualiza as informações da tabela recebendo com paramentro uma lista.
     * @param lista - a lista contendo os dados.
     */
    public void atualizarListaTabela(List<Aluno> lista)
    {
        this.listaAluno.clear();
        this.listaAluno.addAll(lista);
        this.fireTableDataChanged();
    }
    
}
