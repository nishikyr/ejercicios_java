
package java_desde_cero;

public class ejercicio_fibonacci {
    public static void main (String args[]){
        int a = 0, b = 1, c = 0;
        int i;
        for(i = 0; i < 10; i++){
            if (a < 34){
                System.out.print(a + ",");  
            }
            else {
                System.out.print(a);
            }
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("");
        
        i = 0;
        b = 1;
        a = 0;
        c = 0;
        
        System.out.println("Serie con while");
        while(i < 10){
            if (a < 34){
                System.out.print(a + ",");  
            }
            else {
                System.out.print(a);
            }
            i++;
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("");
        
        i = 0;
        b = 1;
        a = 0;
        c = 0;
        
        System.out.println("Serie con do-while");
        do{
            if (a < 34){
                System.out.print(a + ",");  
            }
            else {
                System.out.print(a);
            }
            i++;
            c = a + b;
            a = b;
            b = c;
        } while( i < 10);
    }
}
