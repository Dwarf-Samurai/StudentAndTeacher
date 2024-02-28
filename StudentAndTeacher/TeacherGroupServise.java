package StudentAndTeacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherGroupServise {
    TeacherGroup teacherGroup;
    public TeacherGroupServise(TeacherGroup teacherGroup){this.teacherGroup = teacherGroup;}
    public List<Teacher> getSortedTeacherGroup(){
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.teacherList);
        Collections.sort(teacherList);
        return teacherList;
    }
    public void soutList(List<Teacher> teacherList){
        for(Teacher s : teacherList){
            System.out.println(s);
        }
    }
    public List<Teacher> getSortedStudentGroupByFIO() {
        List<Teacher> resoult = new ArrayList<>(teacherGroup.teacherList);
        resoult.sort(new UserComparator<Teacher>());
        return resoult;
    }
}
