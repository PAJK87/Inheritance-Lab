public class Surgeon extends Doctor{

    protected Boolean operating;

    public Surgeon(String name, int number, String specialty, Boolean operating){
        super(name, number, specialty);
        this.operating = operating;
    }

    public Boolean getOperating() {
        return operating;
    }
    public void setOperating(Boolean operating) {
        this.operating = operating;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + " " + number + " " + specialty + " Operating: " + operating;
    }
    @Override
    public void work(){
        if(operating == true){
            System.out.printf("%s works for the hospital. %s is operating now%n", name, name);
        }
        else System.out.printf("%s works at the hospital. %s is not operating now%n", name, name);
    }
    
}
