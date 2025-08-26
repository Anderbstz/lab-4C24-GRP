public class StudentModel {

    public void sayHello() {
        System.out.println("Hola, soy Deybit, modificando mi clase!");
    }

    public void sayHell() {
        System.out.println("dengue down");
    }

    private String name;
    private int age;

    public StudentModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
