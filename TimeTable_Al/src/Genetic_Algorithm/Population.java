package Genetic_Algorithm;

import HeuristicOptimizer.HeuristicOptimizer;

import java.util.*;

public class Population {
    private List<Individual> individuals;

    public Population(int populationSize, Map<Integer, List<String>> studentSubjects, List<String> rooms) {
        this.individuals = new ArrayList<>();
        initializePopulation(populationSize, studentSubjects, rooms);
    }

    private void initializePopulation(int populationSize, Map<Integer, List<String>> studentSubjects, List<String> rooms) {
        for (int i = 0; i < populationSize; i++) {
            Individual individual = new Individual();

            // Sử dụng hàm createInitialGenes để tạo Gen
            List<Gen> initialGenes = HeuristicOptimizer.createInitialGenes(studentSubjects, rooms);
            for (Gen gen : initialGenes) {
                individual.addGen(gen);
            }

            // Tối ưu hóa cá thể và xử lý xung đột
            HeuristicOptimizer.resolveTimeSlotConflicts(individual);
            this.individuals.add(individual);
        }
    }


    public List<Individual> getIndividuals() {
        return individuals;
    }

    public Individual getFittestIndividual() {
        return individuals.stream()
                .max(Comparator.comparingInt(Individual::calculateFitness))
                .orElse(null);
    }

    public static void printPopulation(Population population) {
        System.out.println("Population Details:");
        for (Individual individual : population.getIndividuals()) {
            for (Gen gen : individual.getGenes()) {
                System.out.println(gen);
            }
            System.out.println("Fitness: " + individual.calculateFitness());
            System.out.println("-----------------------------");
        }

        Individual fittest = population.getFittestIndividual();
        System.out.println("Fittest Individual:");
        System.out.println(fittest);
        System.out.println("Fitness: " + fittest.calculateFitness());
    }
}

