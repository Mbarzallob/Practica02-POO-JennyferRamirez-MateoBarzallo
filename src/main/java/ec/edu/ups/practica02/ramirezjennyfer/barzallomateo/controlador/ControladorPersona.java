/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cancion;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Compositor;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Disco;
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
    // Metodo create el cual añade un objeto el cual se le pregunta si es instancia de la clase Persona
    @Override
    public void create(Object obj) {
        if (obj instanceof Persona) {
            personas.add((Persona) obj);
        }
    }

    // Metodo read el cual para leer un objeto tipo Persona mediante el codigo
    @Override
    public Persona read(Persona obj) {
        int codigo = obj.getCodigo();
        // for each: Persona persona (se esta declarando un objeto tipo Persona), : personas (lista de Persona)
        for (Persona persona : personas) {
            // La persona obtengo el codigo si es igual se retorna un objeto persona
            if (persona.getCodigo() == codigo) {
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
                // Si el objeto que le estoy pasando en este caso persona es igual al que ya tengo obtengo la cedula
                Persona persona = personas.get(i);
                // El nombre obtenido del objeto persona se compara con el metodo equals
                if (persona.getNombre().equals(nombre)) {
                    // metodo que permite incertar una persona o objeto en una posicion especifica
                    personas.set(i, (Persona) obj);
                }
                break;
            }
        }
    }

    // Metodo delete 
    @Override
    public void delete(Object obj) {
        // Se pregunta si el objeto que pase es una instancia de la clase Persona
        if (obj instanceof Persona) {
            // 
            for (int i = 0; i < personas.size(); i++) {
                // Si el objeto que le estoy pasando en este caso persona es igual al que ya tengo obtengo la cedula
                Persona persona = personas.get(i);
                // Comparar con el equals los objetos pasados
                if (persona.equals((Persona) obj)) {
                    personas.remove(i);
                }
            }
        }
    }

    
    public Persona buscarPorNombreDeDisco(String valor) {
        
        for (Persona persona : personas) {
            if (persona instanceof Cantante) {
                Cantante cantante = (Cantante) persona;
                for (Disco disco : cantante.getDiscografia()) {
                    if (disco.getNombre().equals(valor)) {
                        System.out.println(cantante.getNombre() + " " + cantante.getApellido());
                        return cantante;
                    }
                }
            }
        }
        return null;

    }

    public Persona buscarPorTituloDeCancion(String valor) {
        for (Persona per : personas) {
            if (per instanceof Compositor) {
                Compositor compositor = (Compositor) per;
                for (Cancion cancion : compositor.getCancionesTop100Bilboard()) {
                    if (cancion.getTitulo().equals(valor)) {
                        System.out.println(compositor.getNombre() + " " + compositor.getApellido());
                        return compositor;
                    }
                }
            }
        }
        return null;
    }

    public Persona buscarCantanteCodigo(int codigo) {
        for (Persona persona : personas) { 
            if (persona instanceof Cantante) {
                Cantante cantanteCasting = (Cantante) persona;
                if (cantanteCasting.getCodigo() == codigo) {
                    return persona;
                }
            }
        }
        return null;
    }

    public Persona buscarCompositorCodigo(int codigo) {
        for (Persona persona : personas) { 
            if (persona instanceof Compositor) {
                Compositor compositorCasting = (Compositor) persona;
                if (compositorCasting.getCodigo() == codigo) {
                    return persona; 
                }
            }
        }
        return null; 
    }

    // Metodo que permite imprimir
    public void imprimir() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    // Metodo To String
    @Override
    public String toString() {
        return "ControladorPersona{" + "personas=" + personas + '}';
    }

}
