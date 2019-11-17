import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.lang.Double.max;

public class Lecture extends Student{
    List<Student> studentsArrayList = new ArrayList<>();
    private Student s;

    public Lecture(Student s) {
        super(Student);
        this.studentsArrayList.add(s);
    }


    public void Enter(Student students){
        //add student to collection
        List<Student> studentArrayList = new ArrayList<>();


    }
    public Double getHighestAverageGrade(){
        //List<Student> studentArrayList = new ArrayList<>();

       // return studentsArrayList.stream().map(stu -> stu.getAverageGrade());

        //Map<Student, List<Student>> studentListMap

        double sum = 0.0;

        //Stream<Double> sum = studentsGrades.stream.map(Student::getAverageGrade);
        for (Double grade: studentsGrades){
            sum +=grade;
        }

        return max(sum/studentsGrades.size());

     }
}
