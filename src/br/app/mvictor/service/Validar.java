/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.mvictor.service;

/**
 * classe que valida as informações ou verifica se elas são válidas para serem,
 * salvas, atualizadas.
 * @author mvictor
 */
public final class Validar{

    /**
     * Método que verifica se o campo está vázio
     * @param campo - o nome do componente de entrada de texto.
     * @return isEmpty(javax.swing.JTextField campo) - retorna true se estiver vázio, caso contrário false.
     */
    public static boolean isEmpty(javax.swing.JTextField campo)
    {
        return campo.getText().isEmpty();
    }
    
    /**
     *  Método que verifica se o campo está com caracteres alfabético.[letras]
     * @param campo- O componente que você que será análisado.
     * @return isNotLetters(JTextField) - Retorna true se tiver letras, caso contrário false.
     */
    public static boolean isNotLetters(javax.swing.JTextField campo)
    {
        String texto = campo.getText();
        if(Character.isAlphabetic((texto.charAt(0))) && Character.isAlphabetic((texto.charAt(texto.length()-1))))
        {
            return true;
        }
        return false;
    }
    
    /**
     * Método que verifica se o aluno está aprovado.
     * @param nota1 - a primeira nota do aluno.
     * @param nota2 - a segunda nota do aluno.
     * @param nota3 - a terceira nota do aluno.
     * @param nota4 - a quarta nota do aluno.
     * @param notaMinimaParaAprovacao - o valor da nota de aprovação minima para passar.
     * @return isAproved(nota1, nota2, nota3, nota4, notaMinimaParaAprovacao) - retorna true se a médiao for igual,
     * a nota de aprovação, caso contrário false.
     */
    public static boolean isAproved(float nota1, float nota2, float nota3, float nota4, float notaMinimaParaAprovacao)
    { 
        float mediaTotal = (nota1+nota2+nota3+nota4)/4;
        return mediaTotal >= notaMinimaParaAprovacao;
    }
    
    
    
}
