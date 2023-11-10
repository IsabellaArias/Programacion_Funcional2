package Metodo_Filter;

public class NominatedPerson {
    private int id;
    private String name;
    private int yearsOfExperience;
    private String universityDegree;

    public NominatedPerson(int id, String name, int yearsOfExperience, String universityDegree) {
        this.id = id;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.universityDegree = universityDegree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getUniversityDegree() {
        return universityDegree;
    }

    public void setUniversityDegree(String universityDegree) {
        this.universityDegree = universityDegree;
    }
}
