package example;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String groupId;
    private List<Double> grades = new ArrayList<>();

    public Student(String firstName, String lastName,String mail, String groupId) {
        super(firstName, lastName, mail);
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getGradesAverage()
    {
        double suma=0;
        int rozmiar = grades.size();
        for(int i = 0; i< rozmiar; i++)
        {
            suma += grades.get(i);
        }
        return (suma/rozmiar);
    }
}

