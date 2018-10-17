
package boletin3;

public class Boletin3 {

    public static void main(String[] args) {
        //constructor sin parámetros
        consume consume= new consume();
        // valor a litros y precio gasolina
        consume.setlitros(50f);
        consume.setpGas(1.57f);
        // constructor con parametros
        consume consumo = new consume(1.90f,15f,170f,120f);
        //visualizar consumo medio
        System.out.println("El consumo medio es de: "+consumo.consumoMedio()+ " litros cada 100km");
        //dar valor a litros
        consume.setlitros(50f);
        //visualizar velocidad media
        consumo.vMed();
    
    }
}