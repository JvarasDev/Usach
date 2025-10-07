/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usach;

/**
 *
 * @author Duoc
 */
public class Estudiantes extends Persona {
    private String carrera;
    private int nota_1;
    private int nota_2;
    private int nota_3;
    private int Promedio_final;

    public Estudiantes(String carrera, int nota_1, int nota_2, int nota_3, int Promedio_final, int id, String nombre, int anio_nacimiento, String rol) {
        super(id, nombre, anio_nacimiento, rol);
        this.carrera = carrera;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.nota_3 = nota_3;
        this.Promedio_final = Promedio_final;
    }
    
    


    
}
