/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador;
/**
 *
 * @author casa
 */

public interface IControlador {
    
    // Metodos que pasan o trabajan solo con objetos(CRUD)
        public abstract void create(Object obj); //C
        public abstract Object read(Object obj); //R
        public abstract void update(Object obj); //U
        public abstract void delete(Object obj); //D
        public abstract void list();
}