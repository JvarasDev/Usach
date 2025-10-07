/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usach;


public class Persona {
    private int id;
    private String nombre;
    private int anio_nacimiento;
    private String rol;
    private int anio_actual;
    protected int edad_actual;

    public Persona(int id, String nombre, int anio_nacimiento, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.anio_nacimiento = anio_nacimiento;
        this.rol = rol;
        this.anio_actual = 2025;
        this.edad_actual= 0;
    }

    public Persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getAnio_actual() {
        return anio_actual;
    }

    public void setAnio_actual(int anio_actual) {
        this.anio_actual = anio_actual;
    }
    
    public final int edad_actual(){
        this.edad_actual = anio_actual - anio_nacimiento;
        return edad_actual;
        
    
}
    
    
}
