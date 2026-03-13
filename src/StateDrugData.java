/**
 * Represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods
 */
public class StateDrugData {

    // TODO: Add at least 3 private attributes
    private String stateName;
    private int totalDrugDeaths;
    private double drugDeathRate;


    // TODO: Create a constructor that takes all attributes as parameters
    public StateDrugData (String theStateName, int theTotalDrugDeaths, double theDrugDeathRate) {
        stateName = theStateName;
        totalDrugDeaths = theTotalDrugDeaths;
        drugDeathRate = theDrugDeathRate;
    }

    // TODO: Add getters for attributes you need
    public String getStateName() {
        return stateName;
    }

    public int getTotalDrugDeaths() {
        return totalDrugDeaths;
    }

    public double getDrugDeathRate() {
        return drugDeathRate;
    }
    // TODO: Add other data analysis methods
    public static double minDrugDeathRate(StateDrugData[] array) {
        if (array.length == 0) {
            return 0.0; // or throw an exception, but for now return 0
        }
        double min = array[0].getDrugDeathRate();
        for (int i = 1; i < array.length; i++) {
            if (array[i].getDrugDeathRate() < min) {
                min = array[i].getDrugDeathRate();
            }
        }
        return min;
    }
    
    public static double maxDrugDeathRate(StateDrugData[] array) {
        if (array.length == 0) {
            return 0.0; // or throw an exception, but for now return 0
        }
        double max = array[0].getDrugDeathRate();
        for (int i = 1; i < array.length; i++) {
            if (array[i].getDrugDeathRate() > max) {
                max = array[i].getDrugDeathRate();
            }
        }
        return max;
    }
    // TODO: Override toString() to return a readable representation of your object
    @Override
    public String toString() {
        return "StateDrugData{" +
                "stateName='" + stateName + '\'' +
                ", totalDrugDeaths=" + totalDrugDeaths +
                ", drugDeathRate=" + drugDeathRate +
                '}';
    }

}