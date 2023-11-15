
package java_desde_cero;

public class ejercicio2 {
    public static void main (String args[]){
        int num_uno = 1;
        int num_dos = 99;
        
        for( num_uno = 1; num_uno <= 5; num_uno++){
            if(num_uno < 5){
                System.out.print(num_uno + ",");
                System.out.print(num_dos + ",");
            } else {
                System.out.print(num_uno + ",");
                System.out.print(num_dos);
            }
            num_dos--;
        }
        System.out.println("");
        
        num_uno = 1;
        num_dos = 99;
        System.out.println("Serie con while");
        
        while(num_uno <= 5){
            if(num_uno < 5){
                System.out.print(num_uno + ",");
                System.out.print(num_dos + ",");
            } else {
                System.out.print(num_uno + ",");
                System.out.print(num_dos);
            }
            num_dos--;
            num_uno++;
        }
        System.out.println("");
        num_uno = 1;
        num_dos = 99;
        System.out.println("Serie con do-while");
        
        do{
            if(num_uno < 5){
                System.out.print(num_uno + ",");
                System.out.print(num_dos + ",");
            } else {
                System.out.print(num_uno + ",");
                System.out.print(num_dos);
            }
            num_dos--;
            num_uno++;
        }while( num_uno <= 5);
    }
}
