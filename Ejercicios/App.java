public class App{

public static void main(String [] args){

Casa casaAzul = new Casa("Azul");
Casa otraCasa = casaAzul;

    System.out.println(casaAzul.mostrarColor()); //Azul
    System.out.println(otraCasa.mostrarColor()); //Azul

    otraCasa.cambiarColor("Rojo");
    System.out.println(casaAzul.mostrarColor()); //Rojo
    System.out.println(otraCasa.mostrarColor()); //Rojo


    Casa casaVerde = new Casa("Verde");
    otraCasa = casaVerde;
    System.out.println(casaAzul.mostrarColor()); //Rojo
    System.out.println(casaVerde.mostrarColor()); //Verde
    System.out.println(otraCasa.mostrarColor()); //Verde

    Casa casaDesconocida = new Casa();

    System.out.println(casaDesconocida.mostrarColor());
    casaDesconocida = casaVerde;
    System.out.println(casaDesconocida.mostrarColor());
    System.out.println(casaVerde.mostrarColor());

    }
}