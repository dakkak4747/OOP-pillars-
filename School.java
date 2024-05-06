


public class School extends Building {
	
	
    private int numStudents;

    public School(String name, String address, int foundedYear, int numStaff, int numStudents) {
        super(name, address, foundedYear, numStaff);
        this.numStudents = numStudents;
    }

    @Override
    public double calculateProfit() {
        return (10000 * numStudents) - (60000 * numStaff);
    }

    @Override
    public void printDetails() {
        System.out.printf("%s at %s was founded in %d has %d staff and %d students with a profit of $%,.2f%n",
                name, address, foundedYear, numStaff, numStudents, calculateProfit());
    }
}
