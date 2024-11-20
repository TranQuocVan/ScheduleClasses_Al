package Test;

import Genetic_Algorithm.Gen;
import Genetic_Algorithm.Individual;
import Genetic_Algorithm.Population;

public class Test {
    public static void main(String[] args) {
        int numberOfStudents = 50;
        String[] subjects = {"Môn Toán", "Môn Văn", "Môn Lí", "Môn Sinh"};
        int populationSize = 10;

        // Tạo quần thể
        Population population = new Population(populationSize, numberOfStudents, subjects);
        for (Individual individual : population.getIndividuals()) {
            System.out.println(individual);

        }
        System.out.println("Cá thể có fitness cao nhất");
        System.out.println(population.getFittestIndividual());


    }
}
