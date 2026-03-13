import java.io.File;
import java.util.Scanner;

/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class App {

    public static void main(String[] args) {

        // TODO: Update this with your CSV file path
        File file = new File("data/StateData2020-CDC-Census.csv");

        // TODO: Create an array of Data objects to store data
        StateDrugData[] stateList = new StateDrugData[52];

        // TODO: Read file using Scanner
        // - Skip header if needed
        // - Loop through rows
        // - Split each line by commas
        // - Convert text to numbers when needed
        // - Create new Data objects
        // - Add to your array
        try (Scanner scan = new Scanner(file)) {
            int i = 0;
            while(scan.hasNext() && i < stateList.length) {
                if (i == 0) {
                    scan.nextLine();
                }
                String line = scan.nextLine();
                String[] parts = line.split(",");
                String stateName = parts[0];
                int totalDeaths = Integer.parseInt(parts[6]);
                double rate = Double.parseDouble(parts[5]);
                StateDrugData s = new StateDrugData(stateName, totalDeaths, rate);
                stateList[i] = s;
                i++;
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // TODO: Call your analysis methods
        // Example:
        // double maxValue = findMaxValue(dataList);
        // double average = computeAverageValue(dataList);
        double minRate = StateDrugData.minDrugDeathRate(stateList);
        double maxRate = StateDrugData.maxDrugDeathRate(stateList);


        // TODO: Print insights
        // - Number of rows loaded
        // - Min, max, average, or any other findings
        // - Final answer to your guiding question
            System.out.println("Number of states loaded: " + stateList.length);
            System.out.println("Minimum drug death rate: " + minRate);
            System.out.println("Maximum drug death rate: " + maxRate);
            System.out.println("The state that had the highest drug death rate was West Virginia with a rate of 52.0 per 100,000 people in 2020.");

        // OPTIONAL TODO:
        // Add user interaction:
        // Ask the user what kind of analysis they want to see
    }


}