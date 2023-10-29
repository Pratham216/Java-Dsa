public class Classes_Object {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.SetColor("blue");
        System.out.println(p1.color);
        p1.SetTip(10);
        System.out.println(p1.tip);
        Student pratham = new Student();
        pratham.Cal_percentage(50, 60, 85);
    }

}

class Pen{
    
    String color;
    int tip;

    void SetColor(String newColor){
        color= newColor;

    }

    void SetTip(int newTip){
        tip = newTip;
    }

}

class Student{
    String name;
    int age;
    int percentage;

    void Cal_percentage(int physics, int chemistry, int maths){
        percentage = (physics+chemistry+maths)/3;
        System.out.println( percentage);
    }
}