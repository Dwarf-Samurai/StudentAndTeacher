package StudentAndTeacher;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private List<Teacher> teacherList;
    int counter = 0;
    public TeacherGroupIterator(TeacherGroup teacherGroup){this.teacherList = teacherGroup.teacherList;}

    @Override
    public boolean hasNext() {
        return counter < teacherList.size();
    }

    @Override
    public Teacher next() {
        if(!hasNext()){
            return null;
        }
        return teacherList.get(counter++);
    }

    @Override
    public void remove() {
        teacherList.remove(--counter);
    }

}
