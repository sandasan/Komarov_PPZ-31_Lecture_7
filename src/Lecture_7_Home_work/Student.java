package Lecture_7_Home_work;

import java.util.ArrayList;

public class Student implements Comparable{

    private static String[] sortingFields; // for example: {"name", "academicPerformance", "faculty"}

    private ArrayList fieldName = new ArrayList<String>();
    private ArrayList fieldType = new ArrayList<String>();
    private ArrayList fieldValue = new ArrayList<Object>();

    public Student(
            String name,
            String surname,
            int age,
            int academicPerformance,
            String faculty,
            int course,
            String group
            ) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setAcademicPerformance(academicPerformance);
        setFaculty(faculty);
        setCourse(course);
        setGroup(group);
    }

    public String getName() {
        int nameIndex = fieldName.indexOf("name");
        String nameValue = String.valueOf(fieldValue.get(nameIndex));
        return nameValue;
    }

    public void setName(String name) {
        fieldName.add("name");
        fieldType.add("String");
        fieldValue.add(name);
    }

    public String getSurname() {
        int surnameIndex = fieldName.indexOf("surname");
        String surnameValue = String.valueOf(fieldValue.get(surnameIndex));
        return surnameValue;
    }

    public void setSurname(String surname) {
        fieldName.add("surname");
        fieldType.add("String");
        fieldValue.add(surname);
    }

    public int getAcademicPerformance() {
        int academicPerformanceIndex = fieldName.indexOf("academicPerformance");
        int academicPerformanceValue = (Integer) fieldValue.get(academicPerformanceIndex);
        return academicPerformanceValue;
    }

    public void setAcademicPerformance(int academicPerformance) {
        fieldName.add("academicPerformance");
        fieldType.add("int");
        fieldValue.add(academicPerformance);
    }

    public int getAge() {
        int ageIndex = fieldName.indexOf("age");
        int ageValue = (Integer) fieldValue.get(ageIndex);
        return ageValue;
    }

    public void setAge(int age) {
        fieldName.add("age");
        fieldType.add("int");
        fieldValue.add(age);
    }

    public String getFaculty() {
        int facultyIndex = fieldName.indexOf("faculty");
        String facultyValue = String.valueOf(fieldValue.get(facultyIndex));
        return facultyValue;
    }

    public void setFaculty(String faculty) {
        fieldName.add("faculty");
        fieldType.add("String");
        fieldValue.add(faculty);
    }

    public int getCourse() {
        int courseIndex = fieldName.indexOf("course");
        int courseValue = (Integer) fieldValue.get(courseIndex);
        return courseValue;
    }

    public void setCourse(int course) {
        fieldName.add("course");
        fieldType.add("int");
        fieldValue.add(course);
    }

    public String getGroup() {
        int groupIndex = fieldName.indexOf("group");
        String groupValue = String.valueOf(fieldValue.get(groupIndex));
        return groupValue;
    }

    public void setGroup(String group) {
        fieldName.add("group");
        fieldType.add("String");
        fieldValue.add(group);
    }

    public String[] getSortingFields() {
        return sortingFields;
    }

    public static void setSortingFields(String[] sortingFields) {
        Student.sortingFields = sortingFields;
    }

    private int getIntValue(String fName) {
        int fIndex = fieldName.indexOf(fName);
        int fValue = (Integer) fieldValue.get(fIndex);
        return fValue;
    }

    private String getStringValue(String fName) {
        int fIndex = fieldName.indexOf(fName);
        String fValue = (String) fieldValue.get(fIndex);
        return fValue;
    }

    @Override
    public int compareTo(Object o) {
        Student d = (Student) o;
        return compare(this, d);
    }

    private int compare(Object o1, Object o2) {
        Student d1 = (Student) o1;
        Student d2 = (Student) o2;
        int result = 0;
        // Если не "заказано" сортировки, возвращаем результат, как будто объекты одинаковые
        if (sortingFields == null) {
            return result;
        } else {
            // Проходим по полям для сортировки
            loop: for (String sortingField : sortingFields) {
                int sortingFieldIndex = fieldName.indexOf(sortingField);
                String sortingFieldType = String.valueOf(fieldType.get(sortingFieldIndex));
                switch (sortingFieldType) {
                    case "int":
                        int intValue1 = d1.getIntValue(sortingField);
                        int intValue2 = d2.getIntValue(sortingField);
                        // Сравниваем значения как числа и устанавливаем результат
                        if (intValue1 != intValue2) {
                            if (intValue1 < intValue2) {
                                result = -1;
                            } else {
                                result = 1;
                            }
                            break loop;
                        }
                        break;
                    case "String":
                        String stringValue1 = d1.getStringValue(sortingField);
                        String stringValue2 = d2.getStringValue(sortingField);
                        // Сравниваем значения как строки и устанавливаем результат
                        if (CharSequence.compare(stringValue1, stringValue2) != 0) {
                            if (CharSequence.compare(stringValue1, stringValue2) < 0) {
                                result = -1;
                            } else {
                                result = 1;
                            }
                            break loop;
                        }
                        break;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String name = String.valueOf(getName());
        String surname = String.valueOf(getSurname());
        String age = String.valueOf(getAge());
        String academicPerformance = String.valueOf(getAcademicPerformance());
        String faculty = String.valueOf(getFaculty());
        String course = String.valueOf(getCourse());
        String group = String.valueOf(getGroup());

        return "Student{" +
                "name = " + name +
                ", surname = " + surname +
                ", age = " + age +
                ", academicPerformance = " + academicPerformance +
                ", faculty = " + faculty +
                ", course = " + course +
                ", group = " + group +
                '}';
    }
}
