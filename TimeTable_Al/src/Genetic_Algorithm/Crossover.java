package Genetic_Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import HeuristicOptimizer.HeuristicOptimizer;

public class Crossover {
	 // Phương thức chọn cha mẹ bằng cách sử dụng giải đấu
    public static Individual tournamentSelection(List<Individual> population, int tournamentSize) {
        Random random = new Random();
        List<Individual> tournamentParticipants = new ArrayList<>();

        // Chọn ngẫu nhiên các cá thể cho giải đấu
        for (int i = 0; i < tournamentSize; i++) {
            int randomIndex = random.nextInt(population.size());
            tournamentParticipants.add(population.get(randomIndex));
        }

        // Tìm cá thể có điểm fitness cao nhất trong nhóm
        Individual bestIndividual = tournamentParticipants.get(0);
        for (Individual participant : tournamentParticipants) {
            if (participant.calculateFitness() > bestIndividual.calculateFitness()) {
                bestIndividual = participant;
            }
        }

        return bestIndividual; // Trả về cá thể tốt nhất
    }
    
    // Phương thức lai giữa hai cá thể
    public static Individual breedIndividuals(Individual parent1, Individual parent2) {
        Individual child = new Individual();
        // Thực hiện phép lai (ví dụ: chọn ngẫu nhiên gen từ cha mẹ)
        List<Gen> parent1Genes = parent1.getGenes();
        List<Gen> parent2Genes = parent2.getGenes();

        // Giả sử chúng ta lấy một nửa gen từ mỗi cha mẹ
        int splitPoint = Math.min(parent1Genes.size(), parent2Genes.size()) / 2;

        for (int i = 0; i < splitPoint; i++) {
            child.addGen(parent1Genes.get(i));
        }
        for (int i = splitPoint; i < parent2Genes.size(); i++) {
            child.addGen(parent2Genes.get(i));
        }

        // Tối ưu hóa cá thể và xử lý xung đột
        HeuristicOptimizer.resolveTimeSlotConflicts(child);
        return child;
    }
}
