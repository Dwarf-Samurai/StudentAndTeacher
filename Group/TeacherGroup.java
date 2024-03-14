package Group;

import User.Teacher;
import Iterator.TeacherGroupIterator;

import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{
    public List<Teacher> teacherList;
    public TeacherGroup(List<Teacher> teacherList){this.teacherList = teacherList;}

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }
}
