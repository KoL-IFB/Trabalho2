/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Mello e Luan Kol
 */
public class Trabalho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Respostas r = new Respostas();
        String[] opcoes = {"Questão 1","Questão 2","Questão 3", "Questão 4", "Questão 5", "Questão 6"};
        int opcao;
        do{
            opcao = JOptionPane.showOptionDialog(null,"Escolha uma opção ou clique no X para encerrar.","Trabalho 2", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, null);
            if (opcao == JOptionPane.YES_OPTION){
                r.questao1();
            }
            else if (opcao == JOptionPane.NO_OPTION){
                r.questao2();
            }
            else if (opcao == JOptionPane.CANCEL_OPTION){
                r.questao3();
            }
            else if (opcao == JOptionPane.CANCEL_OPTION+1){
                r.questao4();
            }
            else if (opcao == JOptionPane.CANCEL_OPTION+2){
                r.questao5();
            }
            else if (opcao == JOptionPane.CANCEL_OPTION+3){
                r.questao6();
            }
        }while(opcao != JOptionPane.CLOSED_OPTION);
    }
    
}