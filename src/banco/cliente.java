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
public class cliente {
    
    private int dni;
    private double sueldo;
    protected cuenta cuentacliente;
    //private static int numeroscuenta=1;
    
    public cliente(){
        dni=0;
        sueldo=0.0;
        cuentacliente = new cuenta();
        //numeroscuenta++;
    }
    
    public cliente(int Ndni, double Nsueldo, double Nsaldo){
        dni = Ndni;
        sueldo = Nsueldo;
        cuentacliente = new cuenta(Nsaldo, Ndni,Ndni);
        //numeroscuenta++;
    }
    
    //--------------get
    public double getsueldo(){
        return sueldo;
    }
    
    public int getdni(){
        return dni;
    }
    
    //--------------set
    public void setsueldo(double Nsueldo){
        if (Nsueldo>0)
            sueldo = Nsueldo;
    }
    
    public void setdni(int Ndni){
        if (Ndni>=10000000 && Ndni<=99999999)
            dni = Ndni;
    }
    
    public void ingresar_nomina(){
        cuentacliente.modificar_saldo(sueldo);
        
    }
    
    /**
     * 
     * @param dnirecibido dni para entrar
     * @param contraseñarecibida contraseña para entrar
     * @see validar_contraseña()
     * 
     */
    public void sacar_dinero(int dnirecibido, int contraseñarecibida){
        Scanner sc = new Scanner(System.in);
        
        if (dnirecibido==dni && cuentacliente.validar_contraseña(contraseñarecibida)) {
            System.out.println("introduce la cantidad a sacar");
            double cantidadsacar = sc.nextDouble();
            cantidadsacar=-1*cantidadsacar;
            cuentacliente.modificar_saldo(cantidadsacar);
            
            
        }
    }
    
    
    
    
}
