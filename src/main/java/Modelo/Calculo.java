/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *clase que realiza el calculo del salario dle trabajador
 * @author Jonathan
 */
public class Calculo {

    /**
     * constructor de la clase
     */
    public Calculo() {
    }//constructor
    
    /**
     * metodo que calcula el salario de un trabajador
     * @param salarioDia valor del dia de trabajo de un trabajador
     * @param diasTrabajados dias trabajados en un mes por un trabajador
     * @param idiomas idiomas que habla el trabajador
     * @return  total retorna el salario a pagar para el trabajador
     */
    public float CalcularSalario(float salarioDia, int diasTrabajados, String idiomas[]){
        float total = salarioDia * diasTrabajados;
        for (int i = 0; i < idiomas.length; i++) {
            if(idiomas[i].equals("espanol")){
                total = total + 50000;
            }else if(idiomas[i].equals("ingles")){
                total = total + 100000;
            }else if(idiomas[i].equals("frances")){
                total = total + 500000;
            }else if(idiomas[i].equals("mandarin")){
                total = total + 1000000;
            }//if
        }//for
        return total;
    }//CalcularSalario
    
    
}//Calculo
