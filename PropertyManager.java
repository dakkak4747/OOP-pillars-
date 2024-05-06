public class PropertyManager {
    private Building[] buildings;

    public PropertyManager() {
        buildings = new Building[4]; // 2 hospitals and 2 schools as the instaction
        createBuildings();
    }

    public void createBuildings() {
        buildings[0] = new Hospital("Children's Hospital of Eastern Ontario", "401 Smyth Rd", 1974, 3200, 167);
        buildings[1] = new School("Sir Robert Borden High School", "131 Greenbank Rd", 1969, 85, 705);
        buildings[2] = new Hospital("Queensway Carleton Hospital", "3045 Baseline Rd", 1976, 2700, 355);
        buildings[3] = new School("Earl Of March Secondary School", "4 The Parkway", 1971, 250, 1974);
    }

    public void processDetails() {
        for (Building building : buildings) {
            building.printDetails();
        }
        System.out.println("Program created by Mohamad Al Dakkak");
    }
}
