public class ConsoleView implements View {
    @Override
    public void showStudent(Student student) {
        System.out.println("Student name: " + student.getName() + "\n" + "Student age: " + student.getAge());
    }
}