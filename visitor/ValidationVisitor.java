package visitor;

import model.Student;
import model.Teacher;

public class ValidationVisitor implements Visitor {

    @Override
    public void visit(String code) {
        System.out.println("Validando código: " + code);

        if (code == null || code.isEmpty()) {
            System.out.println("Código vacío");
        } else if (code.length() != 4) {
            System.out.println("Código incorrecto (debe tener 4 dígitos)");
        } else {
            System.out.println("Código correcto");
        }
    }

    @Override
    public void visit(Student student) {
        System.out.println("\nValidando estudiante: " + student.getName());

        boolean valid = true;

        if (student.getId() == null || student.getId().length() != 4) {
            System.out.println("Código inválido para estudiante");
            valid = false;
        }

        if (student.getName() == null || student.getName().isBlank()) {
            System.out.println("Nombre vacío");
            valid = false;
        }

        if (student.getPhones() == null || student.getPhones().isEmpty()) {
            System.out.println("Estudiante sin teléfonos");
            valid = false;
        }

        if (valid) System.out.println("Estudiante válido");
    }

    @Override
    public void visit(Teacher teacher) {
        System.out.println("\nValidando profesor: " + teacher.getName());

        boolean valid = true;

        if (teacher.getId() == null || teacher.getId().length() != 4) {
            System.out.println("Código inválido para profesor");
            valid = false;
        }

        if (teacher.getName() == null || teacher.getName().isBlank()) {
            System.out.println("Nombre vacío");
            valid = false;
        }

        if (teacher.getPhones() == null || teacher.getPhones().isEmpty()) {
            System.out.println("Profesor sin teléfonos");
            valid = false;
        }

        if (valid) System.out.println("Profesor válido");
    }
}
