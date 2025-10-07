/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usach;

/**
 *
 * @author Duoc
 */
public class Docente extends Persona{
    private int sueldo_base;
    private double afp = 0.13;
    private double salud = 0.07;
    private int sueldo_final;
    
     

    public Docente(int sueldo_base, int id, String nombre, int anio_nacimiento, String rol) {
        super(id, nombre, anio_nacimiento, rol);
        this.sueldo_base = sueldo_base;
       
    }

    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getAfp() {
        return afp;
    }

    public void setAfp(double afp) {
        this.afp = afp;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public int getSueldo_final() {
        return sueldo_final;
    }

    public void setSueldo_final(int sueldo_final) {
        this.sueldo_final = sueldo_final;
    }

    public int getEdad_actual() {
        return edad_actual;
    }

    public void setEdad_actual(int edad_actual) {
        this.edad_actual = edad_actual;
    }

    public void sueldo_final(){
        if(sueldo_base != 0){
           sueldo_final = (int) (sueldo_base * afp * salud);
            
        }else{
            System.out.println(" Error! Debes Ingresar numero valido distinto a 0");
        }
        
    }
    
}
