/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
public class Main {
    public static void main(String[] args) {
        // Creación de una Persona
        Persona persona1 = new Persona("Juan", "juan@example.com");

        // Acceso a la Reunion de la Persona y configuración de la misma
        Persona.Reunion reunionPersona1 = persona1.reunion; // Accedemos a la reunión desde la instancia de Persona
        reunionPersona1.setLugar("Sala de Conferencias");
        reunionPersona1.setFecha("2024-03-20");
        reunionPersona1.setHora("10:00");

        // Obtención de la información de la reunión de la Persona
        String infoReunionPersona1 = persona1.getInfoReunion();
        System.out.println("Información de la Reunión de " + persona1.getNombre() + ": " + infoReunionPersona1);
    }
}