import java.util.Random;

public  class LabSixTask3 {
    public static void main(String[] args) {
        int amountOfForecasts = 1000000; // number of simulations
        String[] weatherTypes = {"Sunny", "Cloudy", "Rainy", "Stormy"}; // categories
        int[] weatherCounts = new int[4]; // counts for each category

        // probability distribution
        int[] weatherChanceArray = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3};
        Random rnd = new Random();


        // simulate forecasts
        for (int i = 0; i < amountOfForecasts; i++) {
            int randomPick = rnd.nextInt(weatherChanceArray.length);
            int categoryIndex = weatherChanceArray[randomPick]; // map to weather type
            weatherCounts[categoryIndex]++; // increase count
        }

        // print results with percentages
        for (int i = 0; i < weatherCounts.length; i++) {
            double percentage = 100.0 * weatherCounts[i] / amountOfForecasts;
            System.out.printf("%-7s: %,10d (%.2f%%)%n", weatherTypes[i], weatherCounts[i], percentage);
        }
    }
}