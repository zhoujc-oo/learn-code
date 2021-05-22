package mode.instance.j2eemodel.businessdelegatepattern.mvcpattern;

public class MVCPatternDemo {
    public static void main(String[] args) {

        Student model  = retrieveStudentFromDatabase();//从数据库获取学生记录

        StudentView view = new StudentView();//创建一个视图：把学生详细信息输出到控制台
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        controller.setStudentName("John"); //更新模型数据
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
