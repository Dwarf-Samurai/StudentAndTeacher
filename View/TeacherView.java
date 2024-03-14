package View;

import User.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for(Teacher s : list) {
            System.out.println(s);
        }
    }
}
