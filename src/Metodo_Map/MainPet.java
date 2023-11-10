package Metodo_Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainPet {
    public static void main(String[] args) {
        List<Pet> mascota = Arrays.asList(new Pet("Beily","Dog",1));
        List<Pet> mascotatransform = mascota.stream()
                .map(pet -> {
                            pet.setName(pet.getName());
                            pet.setType(pet.getType());
                            pet.setAge(pet.getAge() + 2);
                            return pet;
                        }
                )
                .collect(Collectors.toList());
        mascotatransform.forEach(pet -> System.out.println(pet.getName() + " " + pet.getType() + " " + pet.getAge() ));
    }
}
