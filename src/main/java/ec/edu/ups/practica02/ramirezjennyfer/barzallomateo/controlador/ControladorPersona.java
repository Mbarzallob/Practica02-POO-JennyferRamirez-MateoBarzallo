/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Persona;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author casa
 */

public class ControladorPersona implements IControlador {
    
    // Atributo de la clase ControladorPersona
    private List<Persona> personas;

    // Controlador de la clase ControladorPersona
    public ControladorPersona() {
        personas = new ArrayList<>();
    }

    // CRUD
    // Metodo create 
    @Override
    public void create(Object obj) {
        if (obj instanceof Persona){
            personas.add((Persona)obj);
        }
    }

    // Metodo read 
    @Override
    public Object read(Object obj) {
        int codigo = (int)obj;
        // for each: Persona persona (se esta declarando un objeto tipo Persona), : personas (lista de Persona)
        for (Persona persona: personas){
            // La persona obtengo al cedula si es igual se retorna un objeto persona
            if (persona.getCodigo()==codigo){
                return persona;
            }
        }
        return null;
    }

    // Metodo update 
    @Override
    public void update(Object obj) {
        // Comparando si el objeto es una instancia de Persona
        if (obj instanceof Persona) {
            // Casting dentro de los parentesis, una vez convertida se puede obtener la cedula y se guarda en String cedula
            String nombre = ((Persona) obj).getNombre();
            // for normal: obtengo la persona de la lista
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                // El nombre obtenido del objeto persona se compara con el metodo equals
                if (persona.getNombre().equals(nombre)) {
                    // metodo que permite incertar una persona o objeto en una posicion especifica
                    personas.set(i, (Persona) obj);
                } break;
            }
        }
    }

    // Metodo delete 
    @Override
    public void delete(Object obj) {
        if (obj instanceof Persona) {
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                // Comparar con el equals los objetos pasados
                if (persona.equals((Persona) obj)) {
                    personas.remove(i);
                }
            }
        }
    }

    // Metodo list el cual enlista e imprimir todas las personas
    @Override
    public void list() {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }

    // Metodo To String
    @Override
    public String toString() {
        return "ControladorPersona{" + "personas=" + personas + '}';
    }
}