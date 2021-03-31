// Модель, клас, що імплементує певні дані з БД, (виконує маніпуляцію над ними).
public class ManipulatorDB implements Model {
    @Override
    public Student getStudent() {
        return new Student();
    }
}