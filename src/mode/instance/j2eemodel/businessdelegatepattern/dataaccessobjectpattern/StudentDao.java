package mode.instance.j2eemodel.businessdelegatepattern.dataaccessobjectpattern;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
