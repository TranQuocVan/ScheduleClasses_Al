package Test;


import Genetic_Algorithm.Crossover;
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
            studentSubjects.put(21, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB"));
            studentSubjects.put(22, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
            studentSubjects.put(23, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
            studentSubjects.put(24, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
            studentSubjects.put(25, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
            studentSubjects.put(26, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
            studentSubjects.put(27, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(28, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(29, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(30, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(31, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LSD", "CSDL"));
            studentSubjects.put(32, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LTW", "CSDL"));
            studentSubjects.put(33, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(34, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "HDHNC", "CSDL"));
            studentSubjects.put(35, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(36, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(37, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(38, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(39, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CTDLGT"));
            studentSubjects.put(40, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(41, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB"));
            studentSubjects.put(42, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
            studentSubjects.put(43, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
            studentSubjects.put(44, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
            studentSubjects.put(45, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
            studentSubjects.put(46, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
            studentSubjects.put(47, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(48, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(49, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(50, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(51, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LSD", "CSDL"));
            studentSubjects.put(52, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LTW", "CSDL"));
            studentSubjects.put(53, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(54, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "HDHNC", "CSDL"));
            studentSubjects.put(55, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(56, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(57, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(58, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(59, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CTDLGT"));
            studentSubjects.put(60, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(61, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB"));
            studentSubjects.put(62, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
            studentSubjects.put(63, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
            studentSubjects.put(64, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
            studentSubjects.put(65, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
            studentSubjects.put(66, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
            studentSubjects.put(67, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(68, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(69, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(70, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(71, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LSD", "CSDL"));
            studentSubjects.put(72, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LTW", "CSDL"));
            studentSubjects.put(73, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(74, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "HDHNC", "CSDL"));
            studentSubjects.put(75, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM"));
            studentSubjects.put(76, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "CSDL"));
            studentSubjects.put(77, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
            studentSubjects.put(78, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "CSDL"));
            studentSubjects.put(79, Arrays.asList("Math", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CTDLGT"));
            studentSubjects.put(80, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "TTHCM", "CSDL"));




            // Tạo quần thể
            Population population = new Population(populationSize, studentSubjects, rooms);

            // In toàn bộ quần thể kèm điểm fitness
//            printPopulation(population);
            Crossover crs = new Crossover();
            System.out.println(crs.tournamentSelection(population.getIndividuals(), 20));
            System.out.println(crs.tournamentSelection(population.getIndividuals(), 20));
            
            
                      
        }
        

}
