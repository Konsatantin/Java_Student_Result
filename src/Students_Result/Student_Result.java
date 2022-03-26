package Students_Result;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.UIManager.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DropMode;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.StyledDocument;

import java.awt.SystemColor;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Student_Result {

	private JFrame frame;
	private JTable table;
	private JTextField jtxtID_Sudent;
	private JTextField jtxtMath;
	private JTextField jtxtFerstname;
	private JTextField jtxtEnglish;
	private JTextField jtxtSername;
	private JTextField jtxtBiolog;
	private JTextField jtxtHistory;
	private JTextField jtxtXimiy;
	private JTextField jtxtAverage;
	private JTextField jtxtFizical;
	private JTextField jtxtRanking;
	private JTextField jtxtFizra;
	private JTextField jtxtPsih;
	private JTextField jtxtTotalScore;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Result window = new Student_Result();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_Result() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0421\u0438\u0441\u0442\u0435\u043C\u0430 \u0440\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442\u043E\u0432 \u0441\u0442\u0443\u0434\u0435\u0442\u0430");
		frame.setBounds(100, 100, 1380, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(105, 105, 105), 4), "\u0421\u0442\u0443\u0434\u0435\u043D\u0447\u0435\u0441\u043A\u0430\u044F \u0417\u0430\u043F\u0438\u0441\u044C", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(29, 28, 826, 447);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Id_\u0421\u0442\u0443\u0434\u0435\u043D\u0442\u0430");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(21, 29, 185, 29);
		panel.add(lblNewLabel_2);
		
		jtxtID_Sudent = new JTextField();
		jtxtID_Sudent.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtID_Sudent.setColumns(10);
		jtxtID_Sudent.setBounds(216, 23, 206, 29);
		panel.add(jtxtID_Sudent);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u041C\u0430\u0442\u0438\u043C\u0430\u0442\u0438\u043A\u0430");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(432, 32, 153, 29);
		panel.add(lblNewLabel_1_1);
		
		jtxtMath = new JTextField();
		jtxtMath.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char iNumber =e.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		jtxtMath.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtMath.setColumns(10);
		jtxtMath.setBounds(598, 29, 206, 35);
		panel.add(jtxtMath);
		
		JLabel lblNewLabel = new JLabel("\u0418\u043C\u044F");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(21, 74, 160, 29);
		panel.add(lblNewLabel);
		
		jtxtFerstname = new JTextField();
		jtxtFerstname.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtFerstname.setColumns(10);
		jtxtFerstname.setBounds(216, 68, 206, 35);
		panel.add(jtxtFerstname);
		
		JLabel lblNewLabel_1 = new JLabel("\u0410\u043D\u0433\u043B\u0438\u0439\u0441\u043A\u0438\u0439");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(432, 77, 153, 29);
		panel.add(lblNewLabel_1);
		
		jtxtEnglish = new JTextField();
		jtxtEnglish.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
					char iNumber =e.getKeyChar();
					if(!(Character.isDigit(iNumber))
							||(iNumber == KeyEvent.VK_BACK_SPACE)
							||(iNumber == KeyEvent.VK_DELETE)) {
						e.consume();
			}}}
		);
		jtxtEnglish.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtEnglish.setColumns(10);
		jtxtEnglish.setBounds(598, 74, 206, 35);
		panel.add(jtxtEnglish);
		
		JLabel lblNewLabel_3 = new JLabel("\u0424\u0430\u043C\u0438\u043B\u0438\u044F");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(21, 119, 160, 29);
		panel.add(lblNewLabel_3);
		
		jtxtSername = new JTextField();
		jtxtSername.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtSername.setColumns(10);
		jtxtSername.setBounds(216, 113, 206, 35);
		panel.add(jtxtSername);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u0411\u0438\u043E\u043B\u043E\u0433\u0438\u044F");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(432, 122, 153, 29);
		panel.add(lblNewLabel_1_2);
		
		jtxtBiolog = new JTextField();
		jtxtBiolog.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtBiolog.setColumns(10);
		jtxtBiolog.setBounds(598, 120, 206, 35);
		panel.add(jtxtBiolog);
		
		JLabel lblNewLabel_7 = new JLabel("\u041A\u043E\u0434 \u041A\u0443\u0440\u0441\u0430");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_7.setBounds(21, 164, 160, 29);
		panel.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"28123", "28456", "28789"}));
		comboBox.setMaximumRowCount(10);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 24));
		comboBox.setEditable(true);
		comboBox.setBounds(216, 158, 206, 35);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1_3 = new JLabel("\u0418\u0441\u0442\u043E\u0440\u0438\u044F");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_3.setBounds(432, 162, 153, 29);
		panel.add(lblNewLabel_1_3);
		
		jtxtHistory = new JTextField();
		jtxtHistory.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtHistory.setColumns(10);
		jtxtHistory.setBounds(598, 166, 206, 35);
		panel.add(jtxtHistory);
		
		JLabel lblNewLabel_4 = new JLabel("\u041E\u0431\u0449\u0438\u0435 \u0431\u0430\u043B\u044B");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(21, 258, 185, 29);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u0425\u0438\u043C\u0438\u044F");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_5.setBounds(432, 212, 153, 29);
		panel.add(lblNewLabel_5);
		
		jtxtXimiy = new JTextField();
		jtxtXimiy.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtXimiy.setColumns(10);
		jtxtXimiy.setBounds(598, 209, 206, 35);
		panel.add(jtxtXimiy);
		
		JLabel lblNewLabel_4_1 = new JLabel("\u0421\u0440\u0435\u0434\u043D\u0438\u0439 \u0431\u0430\u043B");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4_1.setBounds(21, 303, 185, 29);
		panel.add(lblNewLabel_4_1);
		
		jtxtAverage = new JTextField();
		jtxtAverage.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtAverage.setColumns(10);
		jtxtAverage.setBounds(216, 297, 206, 35);
		panel.add(jtxtAverage);
		
		JLabel lblNewLabel_1_4 = new JLabel("\u0424\u0438\u0437\u0438\u043A\u0430");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_4.setBounds(432, 258, 160, 29);
		panel.add(lblNewLabel_1_4);
		
		jtxtFizical = new JTextField();
		jtxtFizical.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtFizical.setColumns(10);
		jtxtFizical.setBounds(598, 254, 206, 35);
		panel.add(jtxtFizical);
		
		JLabel lblNewLabel_6 = new JLabel("\u0420\u0435\u0439\u0442\u0438\u043D\u0433");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_6.setBounds(21, 348, 160, 29);
		panel.add(lblNewLabel_6);
		
		jtxtRanking = new JTextField();
		jtxtRanking.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtRanking.setColumns(10);
		jtxtRanking.setBounds(216, 342, 206, 35);
		panel.add(jtxtRanking);
		
		JLabel lblNewLabel_1_5 = new JLabel("\u0424\u0438\u0437-\u0440\u0430");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_5.setBounds(432, 303, 153, 29);
		panel.add(lblNewLabel_1_5);
		
		jtxtFizra = new JTextField();
		jtxtFizra.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtFizra.setColumns(10);
		jtxtFizra.setBounds(598, 299, 206, 35);
		panel.add(jtxtFizra);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("\u041F\u0441\u0438\u0445\u043E\u043B\u043E\u0433\u0438\u044F");
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_5_1.setBounds(432, 348, 153, 29);
		panel.add(lblNewLabel_1_5_1);
		
		jtxtPsih = new JTextField();
		jtxtPsih.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtPsih.setColumns(10);
		jtxtPsih.setBounds(598, 345, 206, 35);
		panel.add(jtxtPsih);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 225, 401, 2);
		panel.add(separator);
		
		jtxtTotalScore = new JTextField();
		jtxtTotalScore.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtTotalScore.setColumns(10);
		jtxtTotalScore.setBounds(216, 252, 206, 35);
		panel.add(jtxtTotalScore);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(100, 100, 100), 4), " \u041E\u0446\u0435\u043D\u043A\u0438", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(885, 28, 469, 447);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		
		JTextPane jtxtTranscript = new JTextPane();
		jtxtTranscript.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxtTranscript.setBounds(10, 22, 449, 414);
		panel_2.add(jtxtTranscript);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBorder(new LineBorder(SystemColor.windowBorder, 4));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id_\u0421\u0442\u0443\u0434\u0435\u043D\u0442\u0430 ", "\u041A\u043E\u0434_\u043A\u0443\u0440\u0441\u0430", "\u041C\u0430\u0442\u0438\u043C\u0430\u0442\u0438\u043A\u0430", "\u0410\u043D\u0433\u043B\u0438\u0439\u0441\u043A\u0438\u0439", "\u0411\u0438\u043E\u043B\u043E\u0433\u0438\u044F", "\u0418\u0441\u0442\u043E\u0440\u0438\u044F", "\u0425\u0438\u043C\u0438\u044F", "\u0424\u0438\u0437\u0438\u043A\u0430", "\u0424\u0438\u0437-\u0440\u0430", "\u041F\u0441\u0438\u0445\u043E\u043B\u043E\u0433\u0438\u044F", "\u041E\u0431\u0449\u0438\u0435_\u0431\u0430\u043B\u044B", "\u0421\u0440\u0435\u0434\u043D\u0438\u0439_\u0431\u0430\u043B", "\u0420\u0435\u0439\u0442\u0438\u043D\u0433"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(10).setPreferredWidth(87);
		table.getColumnModel().getColumn(11).setPreferredWidth(87);
		table.setBounds(29, 486, 1325, 123);
		frame.getContentPane().add(table);
		
		JButton jbtRanking = new JButton("\u0420\u0435\u0439\u0442\u0438\u043D\u0433");
		jbtRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double [] R = new double[14];
				R[0]=Double.parseDouble(jtxtMath.getText());
				R[1]=Double.parseDouble(jtxtEnglish.getText());
				R[2]=Double.parseDouble(jtxtBiolog.getText());
				R[3]=Double.parseDouble(jtxtHistory.getText());
				R[4]=Double.parseDouble(jtxtXimiy.getText());
				R[5]=Double.parseDouble(jtxtFizical.getText());
				R[6]=Double.parseDouble(jtxtFizra.getText());
				R[7]=Double.parseDouble(jtxtPsih.getText());
				R[8]=(R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7])/8;
				R[9]=R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7];
				String Average=String.format("%.0f", R[8]);
				jtxtAverage.setText(Average);
				String TotalScore=String.format("%.0f", R[9]);
				jtxtTotalScore.setText(TotalScore);
				if(R[9]>=700) {
					jtxtRanking.setText("топ 100");
				}else if (R[9]>=600) {
					jtxtRanking.setText("топ 200");
				}else if (R[9]>=500) {
					jtxtRanking.setText("Топ 300");
				}else if (R[9]>=400) {
					jtxtRanking.setText("Топ 400");
				}else if (R[9]>=500) {
					jtxtRanking.setText("Минимальное количество");
				}else if (R[9]>=200) {
					jtxtRanking.setText("Ошибка!");
				}
				DefaultTableModel model =(DefaultTableModel)table.getModel();
				model.addRow(new Object[] {
						jtxtID_Sudent.getText(),
						comboBox.getSelectedItem(),
						jtxtMath.getText(),
						jtxtEnglish.getText(),
						jtxtBiolog.getText(),
						jtxtHistory.getText(),
						jtxtXimiy.getText(),
						jtxtFizical.getText(),
						jtxtFizra.getText(),
						jtxtID_Sudent.getText(),
						jtxtPsih.getText(),
						jtxtTotalScore.getText(),
						jtxtAverage.getText(),
						jtxtRanking.getText(),
				});
			}
			
			
		});
		jbtRanking.setFont(new Font("Tahoma", Font.BOLD, 28));
		jbtRanking.setBounds(285, 621, 240, 57);
		frame.getContentPane().add(jbtRanking);
		JButton jbtTranscript = new JButton("Transcript");
		jbtTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				jtxtTranscript.setText("Система  результатов и рекордов студентов\n"
						+ "======================================\n"
						+ "Матиматика:\t"+jtxtMath.getText()+"\n"
						+ "Английский:\t\t"+jtxtEnglish.getText()+"\n"
						+"Биология:\t\t"+jtxtBiolog.getText()+"\n"
						+"История:\t\t"+jtxtHistory.getText()+"\n"
						+"Химия:\t\t"+jtxtXimiy.getText()+"\n"
						+"Физика:\t\t"+jtxtFizical.getText()+"\n"
						+"Физра:\t\t"+jtxtFizra.getText()+"\n"
						+"Психолгия:\t\t"+jtxtPsih.getText()+"\n"
						+"======================================\n"
						+"Общие балы:\t\t"+jtxtTotalScore.getText()+"\n"
						+"Средний бал:\t\t"+jtxtAverage.getText()+"\n"
						+"Рейтинг:\t\t\t"+jtxtRanking.getText()+"\n");
				
			}
		});
		jbtTranscript.setFont(new Font("Tahoma", Font.BOLD, 28));
		jbtTranscript.setBounds(39, 620, 235, 58);
		frame.getContentPane().add(jbtTranscript);
		
		JButton jbtExit = new JButton("\u0412\u044B\u0445\u043E\u0434");
		
		jbtExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame;
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Подтвердите если хотите выйти", "Очистить систему текстовых полей",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
 				
			}
		});
		jbtExit.setFont(new Font("Tahoma", Font.BOLD, 28));
		jbtExit.setBounds(1101, 620, 240, 58);
		frame.getContentPane().add(jbtExit);
		
		JButton jbtnReset = new JButton("\u041E\u0447\u0438\u0441\u0442\u0438\u0442\u044C");	
				jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 28));
		jbtnReset.setBounds(851, 620, 240, 58);
		frame.getContentPane().add(jbtnReset);
		
		JButton jbtDelit = new JButton("\u0423\u0434\u0430\u043B\u0438\u0442\u044C");
		jbtDelit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to dalite",
								"Student Result System",JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Select a row to delete",
								"Student Result System",JOptionPane.OK_OPTION);
					}
					
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		jbtDelit.setFont(new Font("Tahoma", Font.BOLD, 28));
		jbtDelit.setBounds(568, 620, 240, 57);
		frame.getContentPane().add(jbtDelit);
		
		jbtnReset.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e) {
				JTextField temp=null;
				for(Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						temp=(JTextField)c;
						temp.setText(null);
				
			}
				}	
					}
						});

	}
}
