import java.util.ArrayList;

public class Zoo {
    private String location;
    private int numCompounds;
    public static int numZoos;
    private ArrayList<Compound> compounds;

    public Zoo(String location, int numCompounds) {
        setLocation(location);
        setNumCompounds(numCompounds);
        compounds = new ArrayList<Compound>();
        numZoos++;
        for (int i = 0; i < numCompounds; i++) {
            addCompound(new Compound());
        }
    }

    public Zoo() {
        this("Unknown", 30);
    }

    private void addCompound(Compound compound) {
        compounds.add(compound);
    }

    public void buildNewCompound() {
        numCompounds++;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumCompounds() {
        return numCompounds;
    }

    public void setNumCompounds(int numCompounds) {
        this.numCompounds = numCompounds;
    }

    public void printInfo() {
        System.out.println("Zoo location is " + location + ", has " + numCompounds + " compounds");
    }
}
