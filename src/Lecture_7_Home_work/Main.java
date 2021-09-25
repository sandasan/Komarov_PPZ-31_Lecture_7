package Lecture_7_Home_work;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Name1", "Surname1", 20, 4, "Faculty2", 1, "Group1");
        Student st2 = new Student("Name2", "Surname2", 17, 5, "Faculty3", 1, "Group2");
        Student st3 = new Student("Name4", "Surname1", 21, 1, "Faculty2", 2, "Group1");
        Student st4 = new Student("Name1", "Surname5", 20, 9, "Faculty1", 2, "Group1");
        Student st5 = new Student("Name3", "Surname1", 16, 5, "Faculty2", 3, "Group2");
        Student st6 = new Student("Name5", "Surname3", 21, 3, "Faculty1", 3, "Group3");
        Student st7 = new Student("Name1", "Surname1", 17, 5, "Faculty3", 1, "Group2");
        Student st8 = new Student("Name4", "Surname3", 20, 5, "Faculty1", 2, "Group1");
        Student st9 = new Student("Name1", "Surname4", 22, 2, "Faculty3", 3, "Group3");
        Student st10 = new Student("Name5", "Surname1", 24, 5, "Faculty1", 5, "Group1");

        Student[] studentsArray = { st1, st2, st3, st4, st5, st6, st7, st8, st9, st10 };

//        String[] sortingFields = {"name", "faculty", "course"};
//        String[] sortingFields = {"surname"};
        String[] sortingFields = {"surname", "academicPerformance", "faculty", "course"};

        Student.setSortingFields(sortingFields);

        Arrays.sort(studentsArray);

        for (Student student :
                studentsArray) {
            System.out.println(student);
        }

        Voenkom voenkom = new Voenkom() {
            @Override
            public ArrayList<Student> chooseOlder18(Student[] students) {
                return Voenkom.super.chooseOlder18(students);
            }
        };

        System.out.println("Students older 18: ");
        for (Student student :
                voenkom.chooseOlder18(studentsArray)) {
            System.out.println(student);
        }
    }
}
