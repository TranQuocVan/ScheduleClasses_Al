package Genetic_Algorithm;


import java.util.*;

public class Individual {
    private List<Gen> genes; // Danh sách các Gen
    private Map<Integer, Set<Integer>> studentTimeSlotMap;

    public Individual() {
        this.genes = new ArrayList<>();
        this.studentTimeSlotMap = new HashMap<>();
    }

    public void addGen(Gen gen) {
        this.genes.add(gen);
        for (Student st : gen.getListSt()) {
            studentTimeSlotMap.putIfAbsent(st.getId(), new HashSet<>());

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

        Map<Integer, Map<Integer, Integer>> studentDayMap = new HashMap<>();
        for (Gen gen : genes) {
        	for (Student st : gen.getListSt()) {					
            int studentId = st.getId();
            int day = (gen.getTimeSlot() - 1) / 4 + 1;

            studentDayMap.putIfAbsent(studentId, new HashMap<>());
            studentDayMap.get(studentId).put(day, studentDayMap.get(studentId).getOrDefault(day, 0) + 1);
        }
        }

        for (Map.Entry<Integer, Map<Integer, Integer>> entry : studentDayMap.entrySet()) {
            Map<Integer, Integer> dayMap = entry.getValue();

            for (int exams : dayMap.values()) {
                if (exams > 2) {
                    penalty += (exams - 2) * 10;
                }
            }

            if (dayMap.size() < 3) {
                penalty += (2 - dayMap.size()) * 50;
            }
        }


        return Math.max(0, 1000 - penalty);
    }

    @Override
    public String toString() {
        return "genes: " + genes + ", fitness: " + calculateFitness();
    }
}
