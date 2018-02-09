/**
 *
 * @author Juan Diego Muñoz 
 * @version 0.1
 */
public class pruebaLCD {

    /**
     * @param args the command line arguments
     * Pruebas Impresor LCD
     */
    public static void main(String[] args) {
       ImpresorLCD impresion = new ImpresorLCD();
       System.out.println("Probando con espacio 4 y tamaño 2");
       impresion.procesar("2,1234567890", 4);
       
       System.out.println("Probando con espacio 1 y tamaño 3");
       impresion.procesar("3,12345", 1);
       
    }
    
}
