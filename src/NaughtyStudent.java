import java.util.List;

public class NaughtyStudent extends Student  {

    private Level level;

    public NaughtyStudent(List<Double> studentsGrades) {
        super(studentsGrades);
        // level;
    }

    @Override
    public double getAverageGrade(){
       double increasedValue =  super.getAverageGrade() + (0.10 * super.getAverageGrade());
        return increasedValue;

    }


}
