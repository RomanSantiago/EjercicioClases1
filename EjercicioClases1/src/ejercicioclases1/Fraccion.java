/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclases1;

/**
 *
 * @author Milzork
 */
public class Fraccion 
{
    private int denominador;
    private int numerador;

    public Fraccion() 
    {
        
    }

    public Fraccion(int denominador, int numerador) 
    {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public int getDenominador() 
    {
        return denominador;
    }

    public void setDenominador(int denominador) 
    {
        this.denominador = denominador;
    }

    public int getNumerador() 
    {
        return numerador;
    }

    public void setNumerador(int numerador) 
    {
        this.numerador = numerador;
    }

   public double multiply()
   {
       double numero=0;
       return numerador*numero;
   }
   
   public void invertir()
   {
       int aux;
       aux=denominador;
       numerador=denominador;
       numerador=aux;              
   }
   
   public double dividir()
   {
       return numerador/denominador;
   }
}
