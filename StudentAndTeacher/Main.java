package StudentAndTeacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        TeacherGroup teacherGroup = new TeacherGroup(new ArrayList<>());

        studentGroup.studentList.add(new Student(3L, "Jack","Sergeivich","Bertin"));
        studentGroup.studentList.add(new Student(1L, "Ivan","Ivanovich","Ivanov"));
        studentGroup.studentList.add(new Student(2L, "Oleg","Nikiloevich","Pupkin"));

        teacherGroup.teacherList.add(new Teacher(3L, "Igor","Viktorovich","Gutalev"));
        teacherGroup.teacherList.add(new Teacher(1L, "Lena","Ivanovich","Ivanova"));
        teacherGroup.teacherList.add(new Teacher(2L, "Oliga","Egorevna","Berhlinson"));


        StudentView studentView = new StudentView();
        TeacherView teacherView = new TeacherView();
        studentView.sendOnConsole(studentGroup.studentList);
        teacherView.sendOnConsole(teacherGroup.teacherList);

    }
}
