import java.util.Arrays;

public class MyClass {
    private String name;
    private String lastName;
    private int age;
    private String food;
    private String subjects[];



    public MyClass(String name, String lastName,int age,String food){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.food=food;
    }
    public MyClass(String name,String lastName,int age,String food,String...subjects) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.food = food;
        this.subjects = subjects;
        for (int i = 0; i < subjects.length; i++) {
            System.out.println( );


        }

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setAge(int ade) {
        this.age = ade;
    }

    public int getAge() {
        return age;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }
}
