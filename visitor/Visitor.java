package visitor;

import model.Student;
import model.Teacher;

public interface Visitor {
    void visit(String code);
    void visit(Student student);
    void visit(Teacher teacher);
}
