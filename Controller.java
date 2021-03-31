// Модель controller, займається тим, що витягує дані з моделі, (яка в свою чергу витягає дані з БД), та передає, (поміщає) їх у модель View.
public class Controller {
    Model model = new ManipulatorDB();
    View view = new ConsoleView();
    void execute() {
        Student student = model.getStudent();
        view.showStudent(student);
    }
}