/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 * 
 * @author SANTIAGO
 * @version 1.0
 * 
 */
public class cajero {
    
    /**
     *  1. consultar/modificar datos personales 
     *  2. ingresar nomina {@link cliente#ingresarnomina() }
     *  3. consultar datos bancarios
     *  4. sacar dinero
     *  5. modificar contraseña
     *  6. salir
     */
    public static void pintamenu(){
        
        System.out.println("CAJERO AUTOMATICO");
        System.out.println("-----------------");
        System.out.println("1. consultar/modificar datos personales");
        System.out.println("2. ingresar nomina");
        System.out.println("3. consultar datos bancarios");
        System.out.println("4. sacar dinero");
        System.out.println("5. modificar contraseña");
        System.out.println("6. salir");
        
    }
    
    /**
     * 
     * muestras el menu {@link cajero#pintamenu()} para realizar las funciones.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        
        
        
        cliente c1 = new cliente(987654,1200.0,15000.0);
        boolean salir = false;
        do {
            pintamenu();
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    
                    System.out.println(c1.getdni()+ " " +c1.getsueldo());
                    System.out.println("cambiar datos personales? pulsa s");
                    char opcioncambiar = sc.next().charAt(0);
                    if (opcioncambiar=='s') {
                        System.out.println("introduce dni");
                        c1.setdni(sc.nextInt());
                        System.out.println("introduce sueldo");
                        c1.setsueldo(sc.nextDouble());
                    }
                    break;
                    
                case 2:
                    
                    c1.ingresar_nomina();
                    break;
                    
                case 3:
                    
                    System.out.println("introduce la contraseña actual");
                    int contraleida = sc.nextInt();
                    if (c1.cuentacliente.validar_contraseña(contraleida)){
                        c1.cuentacliente.mostrar_datos(contraleida);
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("introduce cantidad a retirar");
                    double retirar = sc.nextDouble();
                    retirar = 1*retirar;
                    c1.cuentacliente.modificar_saldo(retirar);
                    
                    break;
                    
                case 5:
                    c1.cuentacliente.modificar_contraseña();
                    break;
                    
                case 6:
                    salir = true;
                    break;
                
            }
            
        } while (!salir);
        
        
        
        
    }
}
