


public class Hospital extends Building {
    private int numBeds;

    public Hospital(String name, String address, int foundedYear, int numStaff, int numBeds) {
        super(name, address, foundedYear, numStaff);
        this.numBeds = numBeds;
    }

    @Override
    public double calculateProfit() {
        return (5000000 * numBeds) - (100000 * numStaff);
    }

    @Override
    public void printDetails() {
        System.out.printf("%s at %s was founded in %d has %d staff and %d beds with a profit of $%,.2f%n",
                name, address, foundedYear, numStaff, numBeds, calculateProfit());
    }
}
