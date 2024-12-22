package Genetic_Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

}
