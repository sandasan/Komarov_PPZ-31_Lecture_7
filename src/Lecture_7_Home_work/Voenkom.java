package Lecture_7_Home_work;

import java.util.ArrayList;
import java.util.Arrays;

public interface Voenkom {
    default ArrayList<Student> chooseOlder18(Student[] students) {
        ArrayList result = new ArrayList<Student>();
        String[] sortingFields = {"age"};
        Student.setSortingFields(sortingFields);
        Arrays.sort(students);
        for (Student student :
                students) {
            if (student.getAge() < 19) continue;
            result.add(student);
        }
        return result;
    }
}
