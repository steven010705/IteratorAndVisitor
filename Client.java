import iterator.concreteCollections.CodeCollection;
import iterator.concreteCollections.PersonCollection;
import model.Person;
import model.Student;
import model.Teacher;
import visitor.ValidationVisitor;
import visitor.Visitor;

import java.util.Arrays;
import java.util.Iterator;

public class Client {

    public static void main(String[] args) {

        CodeCollection codeCollection = new CodeCollection();
        codeCollection.add("1001");
        codeCollection.add("2002");
        codeCollection.add("90001");  

        PersonCollection personCollection = new PersonCollection();
        personCollection.add(new Student("1001", "Ana Ruiz", "Calle 10",
                Arrays.asList("3001111111")));

        personCollection.add(new Teacher("2002", "Luis Torres", "Calle 20",
                Arrays.asList("3222222222")));

        personCollection.add(new Teacher("90001", "Pedro Lopez", "Calle 30",
                Arrays.asList("3111111111")));  

        personCollection.add(new Student("3003", "", "Calle 40",
                null));

        Visitor validator = new ValidationVisitor();

        // Recorrer códigos
        System.out.println("===== RECORRIDO CODIGOS =====");
        Iterator<String> codeIterator = codeCollection.createIterator();
        while (codeIterator.hasNext()) {
            validator.visit(codeIterator.next());
        }

        // Recorrer personas
        System.out.println("\n===== RECORRIDO PERSONAS =====");
        Iterator<Person> personIterator = personCollection.createIterator();
        while (personIterator.hasNext()) {
            Person p = personIterator.next();

            if (p instanceof Student s) validator.visit(s);
            else if (p instanceof Teacher t) validator.visit(t);
        }
    }
}
