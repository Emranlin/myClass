import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String subjects[] = {"Technical Java", "Session", "Soft Skills", "English"};
        for (String sub:subjects){


        }

        MyClass MyClass=new MyClass("Zhiidegul", "Zhalilova",29,"Soup","subjects");
        System.out.println("Let me tell about myself");
        System.out.println("My name is  "+MyClass.getName());
        System.out.println("My last name is "+MyClass.getLastName());
        System.out.println("I'm "+MyClass.getAge()+ " years old");
        System.out.println("My favourite food is "+MyClass.getFood());
        System.out.println("Peaksoft lessons which I study");
        String joinedString = String.join(" ",subjects);
        System.out.println(Arrays.toString(subjects));
    }


}