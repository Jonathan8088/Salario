/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Calculo;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Jonathan
 */
@ManagedBean
@RequestScoped
public class Resultado {

    private String nombre; //nombre del trabajador
    private float salarioDia; //valor del dia de trabajo de un trabajador
    private int diasTrabajados; //cantidad de dias trabajados en un mes por el trabajador
    private String idiomas[]; //idiomas que habla el trabajador
    
    /**
     * constructor de la clase
     */
    public Resultado() {
    }//constructor

    /**
     * metodo que envia los datos del trabajador para calcular el salario
     * @param salarioDia valor de un dia de trabajo de un trabajador
     * @param diasTrabajados total de dias trabajados en un mes por un trabajador
     * @param idiomas idiomas que habla el trabajador
     * @return salario valor total a pagar al trabajador
     */
    public float CalculoSalario(float salarioDia, int diasTrabajados, String idiomas[]){
        Calculo calculo = new Calculo();
        float salario = calculo.CalcularSalario(salarioDia, diasTrabajados, idiomas);
        return salario;
    }//CalculoSalario
    
    /**
     * retorna el valor del nombre 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }//getNombre

    /**
     * modifica el valor del nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//setNombre

    /**
     * retorna el valor del dia de trabajo de un trabajador
     * @return salarioDia
     */
    public float getSalarioDia() {
        return salarioDia;
    }//getSalarioDia
    
    /**
     * modiifica el valor del dia de trabajo de un trabajador
     * @param salarioDia 
     */
    public void setSalarioDia(float salarioDia) {
        this.salarioDia = salarioDia;
    }//setSalarioDia
    /**
     * retorna los dias trabajados
     * @return diasTrabajados
     */
    public int getDiasTrabajados() {
        return diasTrabajados;
    }//getDiasTrabajados

    /**
     * modifica los dias trabajados
     * @param diasTrabajados 
     */
    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }//setDiasTrabajaos

    /**
     * retorna la matriz de idiomas que habla el trabajador
     * @return idiomas
     */
    public String[] getIdiomas() {
        return idiomas;
    }//getIdiomas
    
    /**
     * modifica la matriz de idiomas que habla el trabajador
     * @param idiomas 
     */
    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }//setIdiomas
    
}//Resultado
