package User;

public class Teacher extends User implements Comparable<Teacher> {
    public Long teacherId;
    public Teacher(Long teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        if(this.teacherId > o.teacherId)
            return 1;
        else if(this.teacherId < o.teacherId)
            return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId + " " +
                super.toString() +
                '}';
    }
}

