/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javier
 */

public class Persona {
// Clase Persona
    // Atributos de Persona
    private String nombre;
    private String email;
    Reunion reunion;

    // Constructor de Persona
    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.reunion = new Reunion();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para obtener la información de la reunión
    public String getInfoReunion() {
        return reunion.getInfoReunion();
    }

    // Clase anidada Reunion
    public class Reunion {
        // Atributos de Reunion
        private String lugar;
        private String fecha;
        private String hora;

        // Constructor de Reunion
        public Reunion() {
            this.lugar = "Por definir";
            this.fecha = "Por definir";
            this.hora = "Por definir";
        }

        // Getters y Setters de Reunion
        public String getLugar() {
            return lugar;
        }

        public void setLugar(String lugar) {
            this.lugar = lugar;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        // Método para obtener información de la reunión
        public String getInfoReunion() {
            return "Lugar: " + lugar + ", Fecha: " + fecha + ", Hora: " + hora;
        }
    }
}