import models.*;

public class Main {
    public static void main(String[] args) {
        Coordination coordination = new Coordination(101, "Ingeniera en Sistemas");
        Faculty faculty = new Faculty("Edificio O", 1, "FIA", coordination);
        Professor professor = new Professor("123", "Ivan", "Arguello", "MsC", coordination);

        System.out.println("Nombre de la facultad: " + faculty.getName());
        System.out.println("Edificio de la facultad: " + faculty.getBuilding());
        System.out.println("Nombre de la coordinacion: " + faculty.getM_Coordination().getName());

        System.out.println("Nombre del profesor " + professor.getNames() + " " +
                professor.getSurnames() + " " + professor.getTitle());
        System.out.println("Coordinacion del profesor: " + professor.getM_Coordination().getName());

    }
}
