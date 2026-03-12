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
        theStateName = stateName;
        theTotalDrugDeaths = totalDrugDeaths;
        theDrugDeathRate = drugDeathRate;
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
    public double minDrugDeathRate() {
        
    }
    // TODO: Override toString() to return a readable representation of your object

}