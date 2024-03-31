import java.util.ArrayList;
import java.util.List;

// Clase Persona
public class Persona {
    // Atributos de Persona
    private String nombre;
    private String email;
    private List<Reunion> reuniones;

    // Constructor de Persona
    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.reuniones = new ArrayList<Persona.Reunion>();
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

    // Método para agregar una reunión a la lista de reuniones
    public void agregarReunion(Reunion reunion) {
        reuniones.add(reunion);
    }

    // Método para obtener información de todas las reuniones de la persona
    public String getInfoReuniones() {
        StringBuilder infoReuniones = new StringBuilder();
        for (Reunion reunion : reuniones) {
            infoReuniones.append(reunion.getInfoReunion()).append("\n");
        }
        return infoReuniones.toString();
    }

    // Clase anidada Reunion
    public static class Reunion {
        // Atributos de Reunion
        private String nombre;
        private String lugar;
        private String fecha;
        private String hora;

        // Constructor de Reunion
        public Reunion(String nombre, String lugar, String fecha, String hora) {
            this.nombre = nombre;
            this.lugar = lugar;
            this.fecha = fecha;
            this.hora = hora;
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
          return "" + nombre + "\n" + "Lugar: " + lugar + "\n" + "Fecha: " + fecha + "\n" + "Hora: " + hora;
      }
      
    }
}
