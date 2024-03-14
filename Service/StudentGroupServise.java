package Service;

import User.Student;
import Group.StudentGroup;
import User.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupServise {
    StudentGroup studentGroup;
    public StudentGroupServise(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    public List<Student> getSortedStudentGroup(){
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        Collections.sort(studentList);
        return studentList;
    }
    public void soutList(List<Student> studentList){
        for(Student s : studentList){
            System.out.println(s);
        }
    }
    public List<Student> getSortedStudentGroupByFIO() {
        List<Student> resoult = new ArrayList<>(studentGroup.studentList);
        resoult.sort(new UserComparator<Student>());
        return resoult;
    }
}
