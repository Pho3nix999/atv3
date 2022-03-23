/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11211100076;

/**
 *
 * @author alunocmc
 */
public class Ser_humano1 {
    public static void main(String[] args) {
        corpo_humano c1 = new corpo_humano(80,60, 1.80f);
        //c1.massa = 2;
        System.out.println(c1.calcIMC());
    }

    

}

/*
Respondendo as questões:
1- é apontado um erro dizendo que e preciso tornar a classe pública, e a conclusão é que não rodou quando era privada, mas rodou quando se tornou pública

2- quando é public roda de forma normal, isso demonstra que quando está privado a main não consegue acessar a massa

3- não é possível acessar pelo fato de estar privado 
*/