/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author KoL
 */
public class Respostas {

    void questao1() {
        int linha;
        int col;
        Matriz a = new Matriz();
        linha=Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linha:"));
        col=Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas:"));
        a.ordemMatriz(linha, col);
        a.criaMatriz();
        a.mostraMatriz();
        a.mostraClassicacaoMatriz();
        a.mostraMatrizTransposta();
    }

    void questao2() {
        Matriz a=new Matriz();
        a.geraMatrizAleat();
        a.criaMatrizTransposta();
        a.mostraMatriz();
        a.mostraMatrizTransposta();
    }

    void questao3() {
        Matriz a=new Matriz();
        Matriz b=new Matriz();
        int randomLinha = (int)Math.round(Math.random()*10);
        int randomColuna = (int)Math.round(Math.random()*10);
        a.geraMatrizAleat();
        b.geraMatrizAleat();
        a.mostraMatriz();
        b.mostraMatriz();
        String s = new String();
        
        int[][]matrizA=a.getMatriz();
        int[][]matrizB=b.getMatriz();
        int[][]matrizSoma=new int[randomLinha][randomColuna];
        
        for(int i=0; i<a.getLinha(); i++){
            for(int j=0; j<a.getColuna();j++){
                matrizSoma[i][j]=matrizA[i][j]+matrizB[i][j];
            }
        }
        for(int i=0; i<randomLinha; i++){
            for(int j=0; j<randomColuna; j++){
                s+=matrizSoma[i][j]+"    ";
            }
            s+="\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }

    void questao4() {

    }

    void questao5() {

    }

    void questao6() {

    }
}

class Matriz{
    int linha;
    int col;
    int coluna;
    int[][] matriz;
    int[][] matrizTransposta;
    boolean matrizQuadrada=false;
    boolean matrizLinha=false;
    boolean matrizColuna=false;
    boolean matrizNula=true;
    boolean matrizDiagonal=false;
    boolean matrizIdentidade=false;
    boolean matrizSimetrica=false;
    
    void ordemMatriz(int i, int j){
        linha=i;
        col=j;
        matriz=new int[linha][col];
    }
    void criaMatriz(){
        for(int i=0; i<linha; i++){
            for(int j=0; j<col; j++){
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do elemento da linha "+(i+1)+", coluna "+(j+1)));
            }
        }
        this.criaMatrizTransposta();
        this.classificaMatriz();
    }
    void criaMatrizTransposta(){
        matrizTransposta=new int [col][linha];
        for(int i=0; i<linha; i++){
            for(int j=0; j<col; j++){
                matrizTransposta[j][i]=matriz[i][j];
            }
        }
    }
    
    void classificaMatriz(){
        for(int i=0; i<linha; i++){
            for(int j=0; j<col; j++){
                if(matriz[i][j]!=0){
                    matrizNula=false;
                }
                if(matriz[i][j]==1 && i==j && linha==col){
                    matrizIdentidade=true;
                }
                if(matriz[i][j]!=0 && i==j && matrizIdentidade==false && linha==col){
                    matrizDiagonal=true;
                }
                if(matriz[i][j]==matrizTransposta[j][i] && linha==col){
                    matrizSimetrica=true;
                }
            }
        }
        if(linha==1){
            matrizLinha=true;
        }
        if(col==1){
            matrizColuna=true;
        }
        if(linha==col){
            matrizQuadrada=true;
        }
    }
    
    void mostraClassicacaoMatriz(){
        if(matrizQuadrada==true){
            JOptionPane.showMessageDialog(null, "Classificação: Matriz Quadrada\n");
        }
        if(matrizLinha==true){
            JOptionPane.showMessageDialog(null, "Classificação: Matriz Linha\n");
        }
        if(matrizColuna==true){
            JOptionPane.showMessageDialog(null, "Classificação: Matriz Coluna\n");
        }
        if(matrizNula==true){
            JOptionPane.showMessageDialog(null, "Classificação: Matriz Nula\n");
        }
        if(matrizDiagonal==true){
            JOptionPane.showMessageDialog(null, "Classificação: Matriz Diagonal\n");
        }
        if(matrizIdentidade==true){
            JOptionPane.showMessageDialog(null, "Classificação: Matriz Identidade\n");
        }
        if(matrizSimetrica==true){
            JOptionPane.showMessageDialog(null, "Classificação: Matriz Simétrica\n");
        }
    }
    
    void mostraMatriz(){
        String s = new String();
        for(int i=0; i<linha; i++){
            for(int j=0; j<col; j++){
                s+=matriz[i][j]+"    ";
            }
            s+="\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
    void mostraMatrizTransposta(){
        String s = new String();
        for(int i=0; i<col; i++){
            for(int j=0; j<linha; j++){
                s+=matrizTransposta[i][j]+"    ";
            }
            s+="\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
     void geraMatrizAleat(){
        int randomLinha = (int)Math.round(Math.random()*10);
        int randomColuna = (int)Math.round(Math.random()*10);
        linha=randomLinha;
        coluna=randomColuna;
        matriz=new int[linha][coluna];
        for(int i=0; i<linha; i++){
            for(int j=0; j<coluna; j++){
                int randomNumber = (int)Math.round(Math.random()*10);
                matriz[i][j]=randomNumber;
            }
        }
    }
    
     int[][] getMatriz(){
        return matriz;
    }
    int getLinha(){
        return linha;
    }
    int getColuna(){
        return coluna;
    }
}

