public class Nurse extends HospitalEmployee {
    protected int numOfPatients;

    public Nurse(String name, int number, int numOfPatients){
        super(name, number);
        this.numOfPatients = numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }
    public int getNumOfPatients() {
        return numOfPatients;
    }

    @Override
    public String toString() {
        return name + " " + number + " has " + numOfPatients + " patients";
    }

    @Override
    public void work(){
        System.out.println(name + " works for the hospital. " + name + " is a nurse with " + numOfPatients + " patients.");
    }

    
    
}
