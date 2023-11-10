package Metodo_Filter;

import java.util.Arrays;
import java.util.List;

public class MainNominatedPerson {
    public static void main(String[] args) {
        List<NominatedPerson> Picklist= Arrays.asList(
                new NominatedPerson(1,"Daniela",4,"Escritora"),
                new NominatedPerson(2,"Carlos",2,"Pintor"),
                new NominatedPerson(3,"Isabella",7,"Ing.Software")
        );

        List<NominatedPerson> check = Picklist.stream()
                .filter(e -> e.getYearsOfExperience() > 4)
                .toList();
        check.forEach(s-> System.out.println(s.getName() + " ha sido contratada."));
    }
}
