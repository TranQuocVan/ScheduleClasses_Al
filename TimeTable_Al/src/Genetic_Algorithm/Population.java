package Genetic_Algorithm;

import java.util.*;

public class
Population  {
    private List<Individual> individuals;


    public Population(int populationSize, Map<Integer, List<String>> studentSubjects) {
        this.individuals = new ArrayList<>();
        initializePopulation(populationSize, studentSubjects);
    }

    private void initializePopulation(int populationSize, Map<Integer, List<String>> studentSubjects) {
        Random random = new Random();

        for (int i = 0; i < populationSize; i++) {
            Individual individual = new Individual();
            Map<String, Integer> subjectToTimeSlot = new HashMap<>();

            // Duyệt qua từng sinh viên và các môn học của họ
            for (Map.Entry<Integer, List<String>> entry : studentSubjects.entrySet()) {
                int studentId = entry.getKey();
                List<String> subjects = entry.getValue();

                for (String subject : subjects) {
                    int timeSlot;

                    // Nếu môn đã có lịch thi, sử dụng lại
                    if (subjectToTimeSlot.containsKey(subject)) {
                        timeSlot = subjectToTimeSlot.get(subject);
                    } else {
                        // Chọn ngẫu nhiên một lịch thi phù hợp cho môn này
                        do {
                            timeSlot = random.nextInt(20) + 1;
                        } while (isTimeSlotConflictForStudentOptimized(individual, studentId, timeSlot));

                        // Lưu lịch thi đã được gán cho môn học này
                        subjectToTimeSlot.put(subject, timeSlot);
                    }

                    // Thêm Gen vào cá thể
                    individual.addGen(new Gen(studentId, subject, timeSlot));
                }
            }

            // Tối ưu hóa cá thể bằng thuật toán Heuristic trước khi thêm vào population
            individual.optimize();

            this.individuals.add(individual);
        }
    }

    private boolean isTimeSlotConflictForStudentOptimized(Individual individual, int studentId, int timeSlot) {
        Set<Integer> studentSlots = individual.getGenes().stream()
                .filter(gen -> gen.getStudentId() == studentId)
                .map(Gen::getTimeSlot)
                .collect(HashSet::new, HashSet::add, HashSet::addAll);

        return studentSlots.contains(timeSlot);
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
                System.out.println(gen); // Individual đã có fitness trong toString()
            }
            System.out.println("Fitness: " + individual.calculateFitness());
            System.out.println("-----------------------------");
        }

        // In cá thể có fitness cao nhất
        Individual fittest = population.getFittestIndividual();
        System.out.println("Fittest Individual:");
        System.out.println(fittest);
        System.out.println("Fitness: " + fittest.calculateFitness());
    }
}

