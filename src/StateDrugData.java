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
    /**
     * Returns the name of the state.
     * @return the state name
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Returns the total number of drug deaths in the state.
     * @return the total drug deaths
     */
    public int getTotalDrugDeaths() {
        return totalDrugDeaths;
    }

    /**
     * Returns the drug death rate for the state.
     * @return the drug death rate
     */
    public double getDrugDeathRate() {
        return drugDeathRate;
    }
    // TODO: Add other data analysis methods
    /**
     * Computes the minimum drug death rate from an array of StateDrugData objects.
     * @param array
     * @return the minimum drug death rate
     */
    public static double minDrugDeathRate(StateDrugData[] array) {
        // Treat negative values as missing data and ignore them when computing the minimum.
        double min = Double.NaN;
        for (int i = 0; i < array.length; i++) {
            double rate = array[i].getDrugDeathRate();
            if (rate < 0) {
                continue;
            }
            if (Double.isNaN(min) || rate < min) {
                min = rate;
            }
        }
        // If all values were missing/negative, return 0; caller can interpret this as "no valid data".
        return Double.isNaN(min) ? 0.0 : min;
    }
    
    /**
     * Computes the maximum drug death rate from an array of StateDrugData objects.
     * @param array
     * @return the maximum drug death rate
     */
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