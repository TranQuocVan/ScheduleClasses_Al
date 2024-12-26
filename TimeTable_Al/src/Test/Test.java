package Test;

import Genetic_Algorithm.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

// Lai, dotbien, tang mon, giam gio 
public class Test {
	public static void main(String[] args) {
		int populationSize = 100;
		List<String> rooms = new ArrayList<String>();
		rooms.add("PV100");
		rooms.add("TV212");
		rooms.add("RD102");
		rooms.add("HD101");
		rooms.add("P2");

		Map<Integer, List<String>> studentSubjects = new HashMap<>();
		studentSubjects.put(1, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "CTDLGT"));
		studentSubjects.put(2, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2"));
		studentSubjects.put(3, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LTW"));
		studentSubjects.put(4, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM"));
		studentSubjects.put(5, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM"));
		studentSubjects.put(6, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM"));
		studentSubjects.put(8, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(9, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(10, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(11, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(12, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LSD", "CSDL"));
		studentSubjects.put(13, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LTW", "CSDL"));
		studentSubjects.put(14, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(15, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "HDHNC", "CSDL"));
		studentSubjects.put(16, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM", "CSDL"));
		studentSubjects.put(17, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(18, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM", "CSDL"));
		studentSubjects.put(19, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CTDLGT"));
		studentSubjects.put(20, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(21, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "CTDLGT"));
		studentSubjects.put(22, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LTW"));
		studentSubjects.put(23, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
		studentSubjects.put(24, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(25, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(26, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM", "LTW"));
		studentSubjects.put(27, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM", "CSDL", "CTDLGT"));
		studentSubjects.put(28, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(29, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM", "CSDL"));
		studentSubjects.put(30, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(32, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LTW", "CSDL"));
		studentSubjects.put(33, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(34, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "HDHNC", "CSDL"));
		studentSubjects.put(35, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM", "CSDL"));
		studentSubjects.put(36, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(37, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM", "CSDL", "CTDLGT"));
		studentSubjects.put(38, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(39, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CTDLGT"));
		studentSubjects.put(40, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM", "CSDL"));
		studentSubjects.put(41, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "LSD"));
		studentSubjects.put(42, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LSD"));
		studentSubjects.put(43, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LTW"));
		studentSubjects.put(44, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(45, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(46, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(47, Arrays.asList("Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL", "LTW"));
		studentSubjects.put(48, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM", "CSDL"));
		studentSubjects.put(49, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(50, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(51, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "LSD", "CSDL"));
		studentSubjects.put(52, Arrays.asList("Math", "Physics", "English", "LTCB", "AV1", "LTW", "CSDL", "LSD", "CTDLGT"));
		studentSubjects.put(53, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM", "CSDL"));
		studentSubjects.put(54, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "HDHNC", "CSDL"));
		studentSubjects.put(55, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(56, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2", "TTHCM", "CSDL"));
		studentSubjects.put(57, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(58, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL", "LTW"));
		studentSubjects.put(59, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CTDLGT"));
		studentSubjects.put(60, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL", "LSD"));
		studentSubjects.put(61, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "CTDLGT"));
		studentSubjects.put(62, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LTW", "LSD"));
		studentSubjects.put(63, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LTW"));
		studentSubjects.put(64, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM", "CTDLGT"));
		studentSubjects.put(65, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(66, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(67, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(68, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(69, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(70, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(71, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LSD", "CSDL"));
		studentSubjects.put(72, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LTW", "CSDL"));
		studentSubjects.put(73, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(74, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "HDHNC", "CSDL"));
		studentSubjects.put(75, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM"));
		studentSubjects.put(76, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "CSDL"));
		studentSubjects.put(77, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(78, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "CSDL"));
		studentSubjects.put(79, Arrays.asList("Math", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CTDLGT"));
		studentSubjects.put(80, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "TTHCM", "CSDL"));

		Population population = new Population(populationSize, studentSubjects, rooms);
//            printPopulation(population);
		

		Individual parent1 = Crossover.tournamentSelection(population.getIndividuals(), 20);
		Individual parent2 = Crossover.tournamentSelection(population.getIndividuals(), 20);

		System.out.println(parent1);
		System.out.println(parent2);
		
		Individual child = Crossover.checkStop(parent1, parent2, 0.5);
		System.out.println(child);
		System.out.println(Crossover.getRecursiveCallCount() + " lần đột biến");

		displayScheduleViewer(child);
	}

	public static void displayScheduleViewer(Individual individual) {
		JFrame frame = new JFrame("Exam Schedule Viewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		JPanel searchPanel = new JPanel(new FlowLayout());
		JLabel label = new JLabel("Enter Student ID:");
		JTextField studentIdField = new JTextField(10);
		JButton searchButton = new JButton("Search");
		JButton updateButton = new JButton("Schedule full");

		searchPanel.add(label);
		searchPanel.add(studentIdField);
		searchPanel.add(searchButton);
		searchPanel.add(updateButton);  // Thêm nút update

		JPanel tablePanel = new JPanel(new BorderLayout());
		String[] columnNames = { "Ca thi", "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6" };
		String[][] initialData = new String[4][6];

		JTable table = new JTable(initialData, columnNames) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		table.setRowHeight(25);
		table.getTableHeader().setReorderingAllowed(false);
		JScrollPane scrollPane = new JScrollPane(table);

		tablePanel.add(scrollPane, BorderLayout.CENTER);

		frame.add(searchPanel, BorderLayout.NORTH);
		frame.add(tablePanel, BorderLayout.CENTER);

		// Xử lý sự kiện cho nút tìm kiếm
		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String studentId = studentIdField.getText().trim();
				if (studentId.isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Vui lòng hãy nhập ID sinh viên.", "Lỗi",
							JOptionPane.ERROR_MESSAGE);
					return;
				}

				try {
					int id = Integer.parseInt(studentId);

					boolean found = false;

					for (Gen gen : individual.getGenes()) {
						for (Student st : gen.getListSt()) {
							if (st.getId() == id) {
								JOptionPane.showMessageDialog(frame, "ID sinh viên: " + id + " đã tìm thấy", "Success",
										JOptionPane.INFORMATION_MESSAGE);

								updateTableDataById(individual, table, id);
								found = true;
								break;
							}
						}
						if (found) {
							break;
						}
					}

					if (!found) {
						JOptionPane.showMessageDialog(frame, "Không tìm thấy lịch cho sinh viên có ID : " + studentId,
								"Not Found", JOptionPane.WARNING_MESSAGE);
					}

					// Cập nhật lại bảng
					table.revalidate();
					table.repaint();

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Lỗi định dạng ", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		// Xử lý sự kiện cho nút update lịch thi
		updateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateTableData(individual, table); // Gọi lại hàm cập nhật bảng
			}
		});

		frame.setSize(800, 400);
		frame.setVisible(true);

		updateTableData(individual, table);  // Cập nhật bảng khi mở ứng dụng
	}

	private static void updateTableData(Individual individual, JTable table) {
		String[][] tableData = new String[4][6];

		for (Gen gen : individual.getGenes()) {
			int timeSlot = gen.getTimeSlot();
			int row = (timeSlot - 1) % 4;
			int col = (timeSlot - 1) / 4;

			if (col >= 0 && col < 5) {
				tableData[row][col+1] = gen.getSubject() + " - " + gen.getRoom();
				tableData[row][0] = "Ca " + (row + 1);
			}
		}

		// Cập nhật lại dữ liệu vào bảng
		for (int i = 0; i < tableData.length; i++) {
			for (int j = 0; j < tableData[i].length; j++) {
				table.setValueAt(tableData[i][j], i, j);
			}
		}
	}

	private static void updateTableDataById(Individual individual, JTable table, int id) {
		String[][] tableData = new String[4][6];

		for (Gen gen : individual.getGenes()) {
			for (Student st : gen.getListSt()) {
				if (st.getId()==id) {
									
				int timeSlot = gen.getTimeSlot();
				int row = (timeSlot - 1) % 4;
				int col = (timeSlot - 1) / 4;

				if (col >= 0 && col < 5) {
					tableData[row][col+1] = gen.getSubject() + " - " + gen.getRoom() ;
					tableData[row][0] = "Ca " + (row + 1);

				}
				}
			}
		}
		for (int i = 0; i < tableData.length; i++) {
			for (int j = 0; j < tableData[i].length; j++) {
				table.setValueAt(tableData[i][j], i, j);
			}
		}
	}

}
