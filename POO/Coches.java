import java.io.*;
class coche {

  //Atributos
  String color; 
  String marca;
  int km;

  //Metodo
  Public static void main(String[] args) {

    //Crear objeto
    coche coche1 = new coche();
    
    //modificar atributos
    coche1.color= "Rojo";
    coche1.marca= "Mitsubishi";
    coche1.km= "0";

    //Mostrar por pantalla valore del objeto
    System.out.println("El color del coche es:"+coche1.color);
    System.out.println("La Marca del coche es:"+coche1.marca);
    System.out.println("El km del coche es:"+coche1.km);