package Genetic_Algorithm;


import java.util.*;
import HeuristicOptimizer.HeuristicOptimizer;

public class Individual {
    private List<Gen> genes; // Danh sách các Gen
    private Map<Integer, Set<Integer>> studentTimeSlotMap; // Lưu thời gian thi đã được gán cho từng sinh viên

    public Individual() {
        this.genes = new ArrayList<>();
        this.studentTimeSlotMap = new HashMap<>();
    }

    public void addGen(Gen gen) {
        this.genes.add(gen);
        for (Student st : gen.getListSt()) {
            // Cập nhật map thời gian thi cho sinh viên
            studentTimeSlotMap.putIfAbsent(st.getId(), new HashSet<>());

            // Kiểm tra xung đột thời gian trước khi thêm
            if (!studentTimeSlotMap.get(st.getId()).contains(gen.getTimeSlot())) {
                studentTimeSlotMap.get(st.getId()).add(gen.getTimeSlot());
            } else {
            }
        }
    }

    public List<Gen> getGenes() {
        return genes;
    }

    public int calculateFitness() {
        int penalty = 0;

        // Bước 1: Gom nhóm các môn thi theo sinh viên
        Map<Integer, Map<Integer, Integer>> studentDayMap = new HashMap<>();
        for (Gen gen : genes) {
        	for (Student st : gen.getListSt()) {					
            int studentId = st.getId();
            int day = (gen.getTimeSlot() - 1) / 4 + 1; // Mỗi ngày có 4 slot

            studentDayMap.putIfAbsent(studentId, new HashMap<>());
            studentDayMap.get(studentId).put(day, studentDayMap.get(studentId).getOrDefault(day, 0) + 1);
        }
        }

        // Bước 2: Tính điểm phạt cho mỗi sinh viên
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : studentDayMap.entrySet()) {
            Map<Integer, Integer> dayMap = entry.getValue();

            // Kiểm tra số môn thi trong từng ngày
            for (int exams : dayMap.values()) {
                if (exams > 2) {
                    penalty += (exams - 2) * 10; // Phạt 10 điểm/môn thi thừa
                }
            }

            // Kiểm tra số ngày thi
            if (dayMap.size() < 3) {
                penalty += (2 - dayMap.size()) * 50; // Phạt 50 điểm/ngày còn thiếu
            }
        }

        // Bước 3: Tính điểm fitness
        return Math.max(0, 1000 - penalty);
    }

    @Override
    public String toString() {
        return "genes: " + genes + ", fitness: " + calculateFitness();
    }
}
