public class Student {

    double grade;
    double age;
    double kg;

    Student(double grade,double age){
        this.grade = grade;
        this.age = age;
    }
    Student(double grade,double age,double kg){
        this.grade = grade;
        this.age = age;
        this.kg =kg;
    }

    public void print(){
        System.out.println(this.grade);
        System.out.println(this.age);
    }



}
