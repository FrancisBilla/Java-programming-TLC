import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class Register extends Nameable {
    private List<Nameable> nameables;
    private List<Student> std;


    public Register(List<Nameable> nameables, List<Student> std) {
        this.nameables = nameables;

        this.std = std;
    }




   public List<String> getRegister(){
        List<String> names = new ArrayList<>();
        Stream<String> name = names.stream().filter(s ->s.)
       for(Nameable nameable: nameables){
           names.add(nameable.getName());
       }
       return names;
   }

    public Map<Level, List<Student>> getRegisterByLevel(Level level) {
        Map<Level, List<Student>> names = new HashMap<>();

        return names;
    }


   public void PrintReport(){
        List<String> all = new ArrayList<>();
       List<String> year1 = new ArrayList<>();
       List<String> year2 = new ArrayList<>();
       List<String> year3 = new ArrayList<>();

       for (Nameable name: nameables) {
        switch (name.getLevel()){
            case First:
                year1.add(name.getName());
                break;
            case Second:
                year2.add(name.getName());
                break;
            case Third:
                year3.add(name.getName());
                break;

        }

       }
   }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public Level getLevel() {
        return null;
    }
}
