// Клас, (модель) Student - це клас, який містить в собі певний набір даних, (як аналог БД).
public class Student {
    String name = "Ivan";
    int age = 20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}