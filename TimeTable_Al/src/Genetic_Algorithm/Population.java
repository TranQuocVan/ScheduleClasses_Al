package Genetic_Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Population {
    private List<Individual> individuals;

    // Constructor
    public Population(int populationSize, int numberOfStudents, String[] subjects) {
        this.individuals = new ArrayList<>();
        initializePopulation(populationSize, numberOfStudents, subjects);
    }

// Khởi tạo quần thể
    private void initializePopulation(int populationSize, int numberOfStudents, String[] subjects) {
        Random random = new Random();

        for (int i = 0; i < populationSize; i++) {
            Individual individual = new Individual();

            for (int studentId = 1; studentId <= numberOfStudents; studentId++) {
                for (String subject : subjects) {
                    int timeSlot;

                    // Đảm bảo không trùng giờ thi cùng ngày và giờ
                    do {
                        timeSlot = random.nextInt(20) + 1; // Random từ 1 đến 20
                    } while (isTimeSlotConflict(individual, studentId, timeSlot));

                    individual.addGen(new Gen(studentId, subject, timeSlot));
                }
            }

            // Thêm cá thể vào danh sách
            this.individuals.add(individual);
        }
    }


    // Phương thức kiểm tra sự trùng lặp giờ thi
    private boolean isTimeSlotConflict(Individual individual, int studentId, int timeSlot) {
        // Duyệt qua danh sách các gen để kiểm tra trùng lặp
        for (Gen gen : individual.getGenes()) {
            if (gen.getStudentId() == studentId && gen.getTimeSlot() == timeSlot) {
                return true; // Nếu có sự trùng lặp thì trả về true
            }
        }
        return false; // Nếu không có sự trùng lặp thì trả về false
    }


    // Lấy danh sách cá thể
    public List<Individual> getIndividuals() {
        return individuals;
    }

    // Tìm cá thể tốt nhất
    public Individual getFittestIndividual() {
        return individuals.stream()
                .max((ind1, ind2) -> Integer.compare(ind1.calculateFitness(), ind2.calculateFitness()))
                .orElse(null);
    }
}
