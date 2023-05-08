/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author casa
 */

public class Compositor extends Persona {

    // Atributos normales de la clase Compositor
    private int numeroDeComposiciones;
    private List<Cantante> cancionesTop100Bilboard;
    private List<Cantante> clientes;
    
    // Constructor vacio
    public Compositor() {
    }
    // Constructor donde se encuentran los datos de la clase Compositor más los atributos de la clase padre Persona
    public Compositor(int numeroDeComposiciones, List<Cantante> cancionesTop100Bilboard, List<Cantante> clientes, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100Bilboard = cancionesTop100Bilboard;
        this.clientes = clientes;
    }

    // Getter y setter: Encapsulamiento de los atributos
    // Getter y setter del Atributo numero
    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }
    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }
    // Getter y setter del Atributo cancionesTop100Bilboard de la listaCantante
    public List<Cantante> getCancionesTop100Bilboard() {
        return cancionesTop100Bilboard;
    }
    public void setCancionesTop100Bilboard(List<Cantante> cancionesTop100Bilboard) {
        this.cancionesTop100Bilboard = cancionesTop100Bilboard;
    }
    // Getter y setter del Atributo clientes de la listaCantante
    public List<Cantante> getClientes() {
        return clientes;
    }
    public void setClientes(List<Cantante> clientes) {
        this.clientes = clientes;
    }

    // Metodo hashCode: 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.numeroDeComposiciones;
        hash = 17 * hash + Objects.hashCode(this.cancionesTop100Bilboard);
        hash = 17 * hash + Objects.hashCode(this.clientes);
        return hash;
    }

    // Metodo equals: Metodo que permite comparar objetos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compositor other = (Compositor) obj;
        if (this.numeroDeComposiciones != other.numeroDeComposiciones) {
            return false;
        }
        if (!Objects.equals(this.cancionesTop100Bilboard, other.cancionesTop100Bilboard)) {
            return false;
        }
        return Objects.equals(this.clientes, other.clientes);
    }

    // Metodo calcularSalario sobreescrito de la clase padre Persona 
    @Override
    public double calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Metodo To String 
    @Override
    public String toString() {
        return "Compositor{" + "numeroDeComposiciones=" + numeroDeComposiciones + ", cancionesTop100Bilboard=" + cancionesTop100Bilboard + ", clientes=" + clientes + '}';
    }
}