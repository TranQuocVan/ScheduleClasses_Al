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
	public static Individual breedIndividuals(Individual parent1, Individual parent2, double crossoverRate) {
        Random random = new Random();
        Individual child;
        int count = 0;
            child = new Individual();
            // Thực hiện phép lai (ví dụ: chọn ngẫu nhiên gen từ cha mẹ)
            List<Gen> parent1Genes = parent1.getGenes();
            List<Gen> parent2Genes = parent2.getGenes();
            // Giả sử chúng ta lấy một nửa gen từ mỗi cha mẹ
//            int splitPoint = random.nextInt(Math.min(parent1Genes.size(), parent2Genes.size()));
        int splitPoint = Math.min(parent1Genes.size(), parent2Genes.size()) / 2;
            if (random.nextDouble() <= crossoverRate) {
                for (int i = 0; i < splitPoint; i++) {
                    child.addGen(parent1Genes.get(i));
                }
                for (int i = splitPoint; i < parent2Genes.size(); i++) {
                    child.addGen(parent2Genes.get(i));
                }
                // Tối ưu hóa cá thể và xử lý xung đột
                HeuristicOptimizer.resolveTimeSlotConflicts(child);
            }
        return child;
    }


	// Phương thức đột biến cá thể
//	public static void mutate(Individual individual) {
//		List<Gen> genes = individual.getGenes();
//
//		// Thực hiện đột biến bằng cách thay đổi một gen ngẫu nhiên
//		if (!genes.isEmpty()) {
//			int indexToMutate = random.nextInt(genes.size());
//			Gen genToMutate = genes.get(indexToMutate);
//
//			// Thay đổi một thuộc tính của gen (ví dụ: thời gian hoặc phòng)
//			int newTimeSlot = random.nextInt(10) + 1; // Giả sử có 10 thời gian khác nhau
//			genToMutate.setTimeSlot(newTimeSlot);
//
//			// T���i ưu hóa lại cá thể sau khi đột biến
//			HeuristicOptimizer.resolveTimeSlotConflicts(individual);
//		}
//	}
}
