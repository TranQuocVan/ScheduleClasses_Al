package Test;

import Genetic_Algorithm.Gen;
import Genetic_Algorithm.Individual;
import Genetic_Algorithm.Population;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Genetic_Algorithm.Population.printPopulation;

// Lai, dotbien, tang mon, giam gio 
public class Test {
        public static void main(String[] args) {
            int populationSize = 100;
            Map<Integer, List<String>> studentSubjects = new HashMap<>();
            studentSubjects.put(1, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB"));
            studentSubjects.put(2, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2"));
            studentSubjects.put(3, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1"));
            studentSubjects.put(4, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM"));
            studentSubjects.put(5, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM"));
            studentSubjects.put(6, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM"));

            studentSubjects.put(7, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));

            // Tạo quần thể
            Population population = new Population(populationSize, studentSubjects);

            // In toàn bộ quần thể kèm điểm fitness
            printPopulation(population);
        }

}
