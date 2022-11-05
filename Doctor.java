public class Doctor extends HospitalEmployee {
    protected String specialty;

    public Doctor(String name, int number, String specialty){
        super(name, number);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + " " + number + " " + specialty;
    }

    @Override
    public void work(){
        System.out.printf("%s works for the hospital. %s is a(n) %s doctor.%n", name, name, specialty);
    }
    
}
