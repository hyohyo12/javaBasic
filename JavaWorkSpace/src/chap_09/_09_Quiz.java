package chap_09;

import java.util.ArrayList;
import java.util.Iterator;

public class _09_Quiz {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("유재석","파이썬"));
        students.add(new Student("박명수","자바"));
        students.add(new Student("김종국","자바"));
        students.add(new Student("조세호","C"));
        students.add(new Student("서장훈","파이썬"));

        Iterator<Student> itList = students.iterator();
        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("---------------------");
        while(itList.hasNext()){
            Student student = itList.next();
            if (student.getCertification().equals("자바")){
                System.out.println(student.Name);
            }
        }

    }

}
class Student{
    String Name;
    String certification;

    public String getName() {
        return Name;
    }

    public String getCertification() {
        return certification;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public Student(String name, String certification) {
        Name = name;
        this.certification = certification;
    }
}
