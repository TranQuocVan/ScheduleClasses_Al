package Test;


import Genetic_Algorithm.Population;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Genetic_Algorithm.Population.printPopulation;

// Lai, dotbien, tang mon, giam gio 
public class Test {
        public static void main(String[] args) {
            int populationSize = 100;
            List<String> rooms = new ArrayList<String>();
            rooms.add("PV100");
            rooms.add("TV212");
            rooms.add("RD102");
            rooms.add("HD101");
            rooms.add("P2");
            
            
            Map<Integer, List<String>> studentSubjects = new HashMap<>();
            studentSubjects.put(1, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB"));
            studentSubjects.put(2, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2"));
            studentSubjects.put(3, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1"));
            studentSubjects.put(4, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM"));
            studentSubjects.put(5, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM"));
            studentSubjects.put(6, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM"));
            studentSubjects.put(8, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(9, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(10, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(11, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(12, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LSD", "CSDL"));
            studentSubjects.put(13, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LTW", "CSDL"));
            studentSubjects.put(14, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(15, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "HDHNC", "CSDL"));
            studentSubjects.put(16, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(17, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(18, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(19, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CTDLGT"));
            studentSubjects.put(20, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));



            // Tạo quần thể
            Population population = new Population(populationSize, studentSubjects, rooms);

            // In toàn bộ quần thể kèm điểm fitness
            printPopulation(population);
            
            
            
            
        }
        

}
