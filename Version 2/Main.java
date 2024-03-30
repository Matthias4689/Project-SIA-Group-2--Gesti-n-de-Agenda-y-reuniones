import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int opcion;
        //Creacion lista de personas
        List<Persona> personas = new ArrayList<>();

        // Creación de Personas
        Persona persona1 = new Persona("Juan", "juan@example.com");
        Persona persona2 = new Persona("María", "maria@example.com");
        personas.add(persona1);
        personas.add(persona2);

        // Creación de algunas reuniones y agregación a la lista de reuniones de la persona1
        Persona.Reunion reunion1 = new Persona.Reunion("Reunion Ventas","Sala de Conferencias", "2024-03-20", "10:00");
        Persona.Reunion reunion2 = new Persona.Reunion("Reunion Jefe","Oficina", "2024-03-22", "15:00");
        persona1.agregarReunion(reunion1);
        persona1.agregarReunion(reunion2);

        persona2.agregarReunion(reunion1);
        persona2.agregarReunion(reunion2);

        do{
            System.out.println("1. Agregar Persona");
            System.out.println("2. Agregar Reunion");
            System.out.println("3. Ver Reunion");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = Integer.parseInt(System.console().readLine());

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la persona:");
                    String nombre = System.console().readLine();
                    System.out.println("Ingrese el correo electrónico de la persona:");
                    String email = System.console().readLine();
                    personas.add(new Persona(nombre, email));
                    System.out.println("Persona creada correctamente.");
                    break;
                case 2:
                    System.out.println("Seleccione la persona a la que desea agregar la reunión:");
                    for (int i = 0; i < personas.size(); i++) {
                        System.out.println((i + 1) + ". " + personas.get(i).getNombre());
                    }
                    int indicePersonaAgregar = Integer.parseInt(System.console().readLine()) - 1;

                    System.out.println("Ingrese el nombre de la reunión:");
                    String nombreReunion = System.console().readLine(); // Cambio de nombre de la variable
                    System.out.println("Ingrese el lugar:");
                    String lugar = System.console().readLine();
                    System.out.println("Ingrese la fecha (YYYY-MM-DD):");
                    String fecha = System.console().readLine();
                    System.out.println("Ingrese la hora (HH:MM):");
                    String hora = System.console().readLine();

                    personas.get(indicePersonaAgregar).agregarReunion(new Persona.Reunion(nombreReunion, lugar, fecha, hora));
                    System.out.println("Reunión agregada correctamente.");
                    break;
                
                case 3:
                    System.out.println("Seleccione la persona de la que desea ver las reuniones:");
                    for (int i = 0; i < personas.size(); i++) {
                        System.out.println((i + 1) + ". " + personas.get(i).getNombre());
                    }
                    int indicePersonaVer = Integer.parseInt(System.console().readLine()) - 1;

                    System.out.println("Información de las Reuniones de " + personas.get(indicePersonaVer).getNombre() + ":\n" + personas.get(indicePersonaVer).getInfoReuniones());
                    break;

                case 4:
                    break;
            }

        } while(opcion != 5);
    }
}
