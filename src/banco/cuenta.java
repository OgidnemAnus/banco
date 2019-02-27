/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class cuenta {

    private double saldo;
    private int numcuenta;
    private int contra;
    
    
    public cuenta(){
    
        saldo = 0.0;
        numcuenta = 0;
        contra = 0;
    }
    
    public cuenta(double Nsaldo, int Nnumcuenta, int Ncontra){
    
        saldo = Nsaldo;
        numcuenta = Nnumcuenta;
        contra = Ncontra;
        
    }
    
    public double getsaldo(){
    
        return saldo;
    }
    
    public int getnumcuenta(){
    
        return numcuenta;
    }
    
    public void modificar_saldo(double cantidad) {
    
        saldo = saldo + cantidad;
        
    }
    
    private int generar_contraseña(){
    
        return (int)Math.random()*8999+1000;
    }
    
    public void modificar_contraseña(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce la contraseña actual");
        int contraleida = sc.nextInt();
        
        if (contraleida==contra) {
            int nuevacontra = generar_contraseña();
            System.out.println("La nueva contraseña es: " + nuevacontra);
            contra = nuevacontra;
        }else{
            System.out.println("ERROR contraseña no coincide");
            
        }
        
    }
    
    public boolean validar_contraseña (int contrarecibida){
        
        if (contrarecibida==contra) {
            return true;
        }else{
            return false;
        }
        
    }
    
    public void mostrar_datos(int contrarecibida){
        if (validar_contraseña(contrarecibida)) {
            System.out.println("El saldo es: " + saldo);
            System.out.println("El numero de cuenta es: " + numcuenta);
            System.out.println("La contraseña es: " + contra);
        }else {
            System.out.println("ERROR de contraseña");
            
        }
   
    
    }
    
    

    
}
