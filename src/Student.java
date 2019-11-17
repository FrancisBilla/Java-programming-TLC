import java.util.List;

public class Student implements Nameable, HasLevel {

    private List<Double> studentsGrades;
    private String name;
    private Level level;

    //CONSTRUCTOR
    public Student(List<Double> studentsGrades, Level level, String name) {
        this.studentsGrades = studentsGrades;
        this.level = level;
        this.name = name;
    }

    //LISTING STUDENTS



    //GETTER AVERAGE GRADE
    public double getAverageGrade() {
        double sum = 0.0;

        //Stream<Double> sum = studentsGrades.stream.map(Student::getAverageGrade);
        for (Double grade: studentsGrades){
            sum +=grade;
        }

        return sum/studentsGrades.size();
      //return sum;
    }

    //GETTER FOR NAME
    public String getName() {
        return name;
    }

    //GETTER FOR LEVEL

    @Override
    public Level getLevel(){
        return level;
    }

}
