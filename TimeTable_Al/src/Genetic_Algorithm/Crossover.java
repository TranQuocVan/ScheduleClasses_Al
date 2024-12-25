package Genetic_Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import HeuristicOptimizer.HeuristicOptimizer;

public class Crossover {
    private static int recursiveCallCount = 0; // Biến tĩnh để đếm số lần gọi đệ quy
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
        int splitPoint = Math.min(parent1Genes.size(), parent2Genes.size()) / 2  ;  
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

	public static Individual checkStop(Individual parent1, Individual parent2, double crossoverRate) {
	    Individual child = breedIndividuals(parent1, parent2, crossoverRate);
	    int count = 0;
	    // Lặp lại cho đến khi cá thể con đạt fitness >= 1000 hoặc số lần lặp tối đa
	    while (child.calculateFitness() < 1000 && count < 1000) {
	        count++;
	        child = breedIndividuals(parent1, parent2, crossoverRate); // Cập nhật cá thể con mới
	    }
	    // Có thể thêm thông báo hoặc xử lý khác nếu cần
	    if (child.calculateFitness() >= 1000) {
	        System.out.println("Optimal individual found after " + count + " generations.");
	    } else {
	    	recursiveCallCount++ ;
	    	checkStop(mutate(parent1), parent2, crossoverRate);
	       
	    }
	    return child;
	}
	
	 public static int getRecursiveCallCount() {
	        return recursiveCallCount;
	    }


//	 Phương thức đột biến cá thể
	public static Individual mutate(Individual individual) {
	    Random random = new Random();

	    List<Gen> genes = individual.getGenes();

	    // Thực hiện đột biến bằng cách thay đổi một gen ngẫu nhiên
	    if (!genes.isEmpty()) {
	        int indexToMutate = random.nextInt(genes.size()); // Chọn ngẫu nhiên gen
	        Gen genToMutate = genes.get(indexToMutate);

	        // Lưu giá trị cũ của timeSlot để so sánh
	        int oldTimeSlot = genToMutate.getTimeSlot();

	        // Tạo giá trị mới cho timeSlot
	        int newTimeSlot = random.nextInt(20) + 1; // Giả sử có 20 thời gian khác nhau
	        genToMutate.setTimeSlot(newTimeSlot);     // Thay đổi giá trị timeSlot

	        // In thông tin đột biến
	        System.out.println("Mutation occurred:");
	        System.out.println(" - Gen index: " + indexToMutate);
	        System.out.println(" - Old timeSlot: " + oldTimeSlot);
	        System.out.println(" - New timeSlot: " + newTimeSlot);

	        // Tối ưu hóa lại cá thể sau khi đột biến
	        HeuristicOptimizer.resolveTimeSlotConflicts(individual);
	    }
	    return individual;
	}

}
