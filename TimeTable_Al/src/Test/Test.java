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
		studentSubjects.put(1, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB"));
		studentSubjects.put(2, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV2"));
		studentSubjects.put(3, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1"));
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
		studentSubjects.put(16, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(17, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(18, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(19, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CTDLGT"));
		studentSubjects.put(20, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(21, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB"));
		studentSubjects.put(22, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
		studentSubjects.put(23, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
		studentSubjects.put(24, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(25, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(26, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(27, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(28, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(29, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(30, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(31, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LSD", "CSDL"));
		studentSubjects.put(32, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LTW", "CSDL"));
		studentSubjects.put(33, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(34, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "HDHNC", "CSDL"));
		studentSubjects.put(35, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(36, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(37, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(38, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(39, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CTDLGT"));
		studentSubjects.put(40, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(41, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB"));
		studentSubjects.put(42, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
		studentSubjects.put(43, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
		studentSubjects.put(44, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(45, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(46, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
		studentSubjects.put(47, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(48, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(49, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(50, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(51, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LSD", "CSDL"));
		studentSubjects.put(52, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "LTW", "CSDL"));
		studentSubjects.put(53, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(54, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "HDHNC", "CSDL"));
		studentSubjects.put(55, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(56, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(57, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(58, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(59, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CTDLGT"));
		studentSubjects.put(60, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV1", "TTHCM", "CSDL"));
		studentSubjects.put(61, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB"));
		studentSubjects.put(62, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "LTW"));
		studentSubjects.put(63, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3"));
		studentSubjects.put(64, Arrays.asList("Math", "Physics", "English", "LTNC", "LTCB", "AV3", "TTHCM"));
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

		// Tạo quần thể
		Population population = new Population(populationSize, studentSubjects, rooms);
		// In toàn bộ quần thể kèm điểm fitness
//            printPopulation(population);
		System.out.println(Crossover.tournamentSelection(population.getIndividuals(), 20));
		System.out.println(Crossover.tournamentSelection(population.getIndividuals(), 20));

		Individual parent1 = Crossover.tournamentSelection(population.getIndividuals(), 20);
		Individual parent2 = Crossover.tournamentSelection(population.getIndividuals(), 20);

		Individual child = Crossover.checkStop(parent1, parent2, 0.5);
		System.out.println(child);
		displayScheduleViewer(child);
	}

	public static void displayScheduleViewer(Individual individual) {
		// Tạo JFrame
		JFrame frame = new JFrame("Exam Schedule Viewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		// Panel tìm kiếm
		JPanel searchPanel = new JPanel(new FlowLayout());
		JLabel label = new JLabel("Enter Student ID:");
		JTextField studentIdField = new JTextField(10);
		JButton searchButton = new JButton("Search");

		searchPanel.add(label);
		searchPanel.add(studentIdField);
		searchPanel.add(searchButton);

		// Panel bảng hiển thị
		JPanel tablePanel = new JPanel(new BorderLayout());
		String[] columnNames = { "Ca thi", "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6" };
		String[][] initialData = new String[4][6]; // Bảng ban đầu trống

		JTable table = new JTable(initialData, columnNames) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false; // Không cho phép chỉnh sửa
			}
		};

		table.setRowHeight(25);
		table.getTableHeader().setReorderingAllowed(false); // Không cho phép kéo cột
		JScrollPane scrollPane = new JScrollPane(table);

		tablePanel.add(scrollPane, BorderLayout.CENTER);

		// Thêm panel vào frame
		frame.add(searchPanel, BorderLayout.NORTH);
		frame.add(tablePanel, BorderLayout.CENTER);

		// Hành động khi nhấn nút tìm kiếm
		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String studentId = studentIdField.getText().trim();
				if (studentId.isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Please enter a Student ID.", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}

				try {
					// Chuyển đổi ID thành kiểu số nguyên
					int id = Integer.parseInt(studentId);

					// Kiểm tra tìm kiếm trong danh sách các sinh viên của đối tượng individual
					boolean found = false; // Biến để kiểm tra xem có tìm thấy sinh viên không

					for (Gen gen : individual.getGenes()) {
						// Duyệt qua danh sách sinh viên trong gen
						for (Student st : gen.getListSt()) {
							if (st.getId() == id) {
								// Hiển thị thông báo thành công
								JOptionPane.showMessageDialog(frame, "Student ID: " + id + " found!", "Success",
										JOptionPane.INFORMATION_MESSAGE);

								// Cập nhật bảng khi tìm thấy sinh viên
								updateTableDataById(individual, table, id);
								found = true;
								break;
							}
						}
						if (found) {
							break; // Thoát ra khỏi vòng lặp nếu tìm thấy sinh viên
						}
					}

					// Nếu không tìm thấy sinh viên
					if (!found) {
						JOptionPane.showMessageDialog(frame, "No schedule found for Student ID: " + studentId,
								"Not Found", JOptionPane.WARNING_MESSAGE);
					}

					// Sau khi tìm thấy, làm mới bảng một lần nữa để chắc chắn bảng được cập nhật
					// đúng
					table.revalidate();
					table.repaint();

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Invalid Student ID format.", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		// Hiển thị frame
		frame.setSize(800, 400);
		frame.setVisible(true);

		// Nếu không có tìm kiếm, ngay lập tức hiển thị lịch thi của individual
		updateTableData(individual, table);
	}

	private static void updateTableData(Individual individual, JTable table) {
		// Định nghĩa dữ liệu mới
		String[][] tableData = new String[4][6]; // 4 rows (Ca), 6 columns (Days)

		// Điền dữ liệu vào bảng từ đối tượng Individual
		for (Gen gen : individual.getGenes()) {

			// Đảm bảo là tìm đúng lịch của sinh viên
			int timeSlot = gen.getTimeSlot();
			int row = (timeSlot - 1) % 4; // Xác định dòng (Ca)
			int col = (timeSlot - 1) / 4; // Xác định cột (Thứ)

			if (col >= 0 && col < 5) {
				tableData[row][col+1] = gen.getSubject() + " - " + gen.getRoom();
				  tableData[row][0] = "Ca " + (row + 1); // Cập nhật cột "Ca Thi"
			}

		}

		// Cập nhật model của JTable
		for (int i = 0; i < tableData.length; i++) {
			for (int j = 0; j < tableData[i].length; j++) {
				table.setValueAt(tableData[i][j], i, j);
			}
		}
	}

	private static void updateTableDataById(Individual individual, JTable table, int id) {
		// Định nghĩa dữ liệu mới
		String[][] tableData = new String[4][6]; // 4 rows (Ca), 5 columns (Days)

		// Điền dữ liệu vào bảng từ đối tượng Individual
		for (Gen gen : individual.getGenes()) {
			for (Student st : gen.getListSt()) {
				if (st.getId()==id) {
									
				// Đảm bảo là tìm đúng lịch của sinh viên
				int timeSlot = gen.getTimeSlot();
				int row = (timeSlot - 1) % 4; // Xác định dòng (Ca)
				int col = (timeSlot - 1) / 4; // Xác định cột (Thứ)

				if (col >= 0 && col < 5) {
					tableData[row][col+1] = gen.getSubject() + " - " + gen.getRoom();
					tableData[row][0] = "Ca " + (row + 1); // Cập nhật cột "Ca Thi"

				}
				}
			}
		}
		// Cập nhật model của JTable
		for (int i = 0; i < tableData.length; i++) {
			for (int j = 0; j < tableData[i].length; j++) {
				table.setValueAt(tableData[i][j], i, j);
			}
		}
	}

}
