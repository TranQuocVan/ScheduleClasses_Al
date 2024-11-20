package Genetic_Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Individual {
    private List<Gen> genes;  // Danh sách các Gen

    // Constructor
    public Individual() {
        this.genes = new ArrayList<>();
    }

    // Thêm Gen
    public void addGen(Gen gen) {
        this.genes.add(gen);
    }

    // Getter cho danh sách Gen
    public List<Gen> getGenes() {
        return genes;
    }

    // Tính điểm Fitness
    public int calculateFitness() {
        int penalty = 0;

        // Điều kiện cứng: Không trùng giờ thi cùng ngày
        Map<Integer, List<Integer>> studentTimeSlots = new HashMap<>();
        for (Gen gen : genes) {
            studentTimeSlots.putIfAbsent(gen.getStudentId(), new ArrayList<>());
            if (studentTimeSlots.get(gen.getStudentId()).contains(gen.getTimeSlot())) {
                penalty += 100; // Phạt nặng nếu vi phạm
            } else {
                studentTimeSlots.get(gen.getStudentId()).add(gen.getTimeSlot());
            }
        }

        // Điều kiện mềm: Phân bổ đều các môn qua các ngày
        Map<Integer, List<Integer>> studentDays = new HashMap<>();
        for (Gen gen : genes) {
            int day = (gen.getTimeSlot() - 1) / 4 + 1; // Tính ngày từ khung giờ
            studentDays.putIfAbsent(gen.getStudentId(), new ArrayList<>());
            studentDays.get(gen.getStudentId()).add(day);
        }

        for (Map.Entry<Integer, List<Integer>> entry : studentDays.entrySet()) {
            List<Integer> days = entry.getValue();
            long uniqueDays = days.stream().distinct().count(); // Số ngày khác nhau
            if (uniqueDays < 3) { // Ít hơn 3 ngày bị phạt
                penalty += (3 - uniqueDays) * 10;
            }
        }

        return Math.max(0, 1000 - penalty); // Điểm Fitness cao nhất là 1000
    }

    @Override
    public String toString() {
        return "Individual{" +
                "genes=" + genes +
                ", fitness=" + calculateFitness() +
                '}';
    }
}
