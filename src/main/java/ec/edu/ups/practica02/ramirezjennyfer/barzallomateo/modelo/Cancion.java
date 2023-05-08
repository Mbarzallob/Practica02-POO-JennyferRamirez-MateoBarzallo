/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo;
import java.util.Objects;
/**
 *
 * @author casa
 */

public class Cancion {

    // Atributos normales de la clase Canción
    private int cancion;
    private String titulo;
    private String letra;
    private double tiempoEnMinutos;
    
    // Constructor vacio
    public Cancion() {
    }
    
    // Constructor donde se encuentran los datos de la clase Canción más los atributos de la clase padre Persona
    public Cancion(int cancion, String titulo, String letra, double tiempoEnMinutos) {
        this.cancion = cancion;
        this.titulo = titulo;
        this.letra = letra;
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    // Getter y setter: Encapsulamiento de los atributos
    // Getter y setter del Atributo canción
    public int getCancion() {
        return cancion;
    }
    public void setCancion(int cancion) {
        this.cancion = cancion;
    }
    // Getter y setter del Atributo titulo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    // Getter y setter del Atributo letra
    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    // Getter y setter del Atributo tiempoEnMinutos
    public double getTiempoEnMinutos() {
        return tiempoEnMinutos;
    }
    public void setTiempoEnMinutos(double tiempoEnMinutos) {
        this.tiempoEnMinutos = tiempoEnMinutos;
    }
    
    // Metodo hashCode: 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.cancion;
        hash = 59 * hash + Objects.hashCode(this.titulo);
        hash = 59 * hash + Objects.hashCode(this.letra);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.tiempoEnMinutos) ^ (Double.doubleToLongBits(this.tiempoEnMinutos) >>> 32));
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
        final Cancion other = (Cancion) obj;
        if (this.cancion != other.cancion) {
            return false;
        }
        if (Double.doubleToLongBits(this.tiempoEnMinutos) != Double.doubleToLongBits(other.tiempoEnMinutos)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.letra, other.letra);
    }
    
    // Metodo To String
    @Override
    public String toString() {
        return "Cancion{" + "cancion=" + cancion + ", titulo=" + titulo + ", letra=" + letra + ", tiempoEnMinutos=" + tiempoEnMinutos + '}';
    }
}