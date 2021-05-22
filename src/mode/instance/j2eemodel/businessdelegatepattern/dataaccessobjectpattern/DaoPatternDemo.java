package mode.instance.j2eemodel.businessdelegatepattern.dataaccessobjectpattern;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        for (Student student : studentDao.getAllStudents()) { //输出所有的学生
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }


        Student student =studentDao.getAllStudents().get(0); //更新学生
        student.setName("Michael");
        studentDao.updateStudent(student);

        studentDao.getStudent(0); //获取学生
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
