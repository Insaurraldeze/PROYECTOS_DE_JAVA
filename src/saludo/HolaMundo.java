
package saludo;

import java.util.Scanner;

public class HolaMundo {
    
    private String saludo;
    
    
    public HolaMundo()
    {
        this.saludo=saludo;
    }
    public String getSaludo()
    {
        return this.saludo;
    }
    
    public String  cargar()
    {
        System.out.println("ingrese el saludo:");
        Scanner sc=new Scanner (System.in);
        saludo=sc.nextLine();
        return saludo;
        
    }
    public void imprimir()
    {
        System.out.println("el saludo es: "+saludo);
    }
    
}

    
    

