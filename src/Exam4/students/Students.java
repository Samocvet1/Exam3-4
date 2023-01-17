package Exam4.students;

public class Students {
    private String name;
    private String group;
    private int course;
    private int subjectGrades;

    public Students(String name, String group, int course, int subjectGrades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjectGrades = subjectGrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getSubjectGrades() {
        return subjectGrades;
    }

    public void setSubjectGrades(int subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    public void NextCourse(){
        if(getSubjectGrades() >=3){
            System.out.println("Вы на след. курсе" + getSubjectGrades() + 1);
        }else{
            System.out.println("Вы остаетесь на след. год");
        }
    }

    @Override
    public String toString() {
        return "Name= " + name +
                ", group= " + group  +
                ", course= " + course +
                ", subjectGrades= " + subjectGrades;
    }
}
