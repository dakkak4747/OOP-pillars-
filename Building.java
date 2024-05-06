/*Mohamad Al Dkkak
 * LabExam_W24-301
 * lab prof: Howard
 */




public abstract class Building {
    protected String name;
    protected String address;
    protected int foundedYear;
    protected int numStaff;

    public Building(String name, String address, int foundedYear, int numStaff) {
        this.name = name;
        this.address = address;
        this.foundedYear = foundedYear;
        this.numStaff = numStaff;
    }

    public abstract double calculateProfit();

    public abstract void printDetails();
}
