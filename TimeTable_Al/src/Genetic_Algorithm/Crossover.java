package Genetic_Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import HeuristicOptimizer.HeuristicOptimizer;

public class Crossover {
    private static int recursiveCallCount = 0;
    public static Individual tournamentSelection(List<Individual> population, int tournamentSize) {
        Random random = new Random();
        List<Individual> tournamentParticipants = new ArrayList<>();

        for (int i = 0; i < tournamentSize; i++) {
            int randomIndex = random.nextInt(population.size());
            tournamentParticipants.add(population.get(randomIndex));
        }

        Individual bestIndividual = tournamentParticipants.get(0);
        for (Individual participant : tournamentParticipants) {
            if (participant.calculateFitness() > bestIndividual.calculateFitness()) {
                bestIndividual = participant;
            }
        }

		return bestIndividual;
	}

	public static Individual breedIndividuals(Individual parent1, Individual parent2, double crossoverRate) {
        Random random = new Random();
        Individual child;
		if (random.nextDouble() > crossoverRate) {
			return random.nextBoolean() ? parent1 : parent2;
		}
            child = new Individual();
            List<Gen> parent1Genes = parent1.getGenes();
            List<Gen> parent2Genes = parent2.getGenes();

//			int splitPoint = Math.min(parent1Genes.size(), parent2Genes.size()) / 2  ;
//                for (int i = 0; i < splitPoint; i++) {
//                    child.addGen(parent1Genes.get(i));
//                }
//                for (int i = splitPoint; i < parent2Genes.size(); i++) {
//                    child.addGen(parent2Genes.get(i));
//                }
//                HeuristicOptimizer.resolveTimeSlotConflicts(child);

//  -> Uniform Crossover
		for (int i = 0; i < parent1Genes.size(); i++) {
			// Chọn ngẫu nhiên gen từ một trong hai cha mẹ
			if (random.nextBoolean()) {
				child.addGen(parent1Genes.get(i));
			} else {
				child.addGen(parent2Genes.get(i));
			}
		}
        return child;
    }

	public static Individual checkStop(Individual parent1, Individual parent2, double crossoverRate) {
	    Individual child = breedIndividuals(parent1, parent2, crossoverRate);
	    int count = 0;
	    while (count < 1000) {
	        child = breedIndividuals(parent1, parent2, crossoverRate);
			count++;
			if (child.calculateFitness() == 1000) {
				System.out.println("Tìm thấy cá thể đạt 1000đ sau khi lai " + count + " thế hệ.");
				return child;

			}
		}
		System.out.println("Không tìm được cá thể đạt 1000 điểm sau 1000 thế hệ. Tiếp tục với đột biến.");
		recursiveCallCount++;
	    return checkStop(mutate(parent1), parent2, crossoverRate);
	}
	
	 public static int getRecursiveCallCount() {
	        return recursiveCallCount;
	    }


	public static Individual mutate(Individual individual) {
	    Random random = new Random();

	    List<Gen> genes = individual.getGenes();

	    if (!genes.isEmpty()) {
	        int indexToMutate = random.nextInt(genes.size());
	        Gen genToMutate = genes.get(indexToMutate);

	        int oldTimeSlot = genToMutate.getTimeSlot();

	        int newTimeSlot = random.nextInt(20) + 1;
	        genToMutate.setTimeSlot(newTimeSlot);

	        System.out.println("Mutation occurred:");
	        System.out.println(" - Vị trí gen: " + indexToMutate);
	        System.out.println(" - Giờ cũ: " + oldTimeSlot);
	        System.out.println(" - Giờ mới: " + newTimeSlot);

	        HeuristicOptimizer.resolveTimeSlotConflicts(individual);
	    }
	    return individual;
	}

}
