package client.consumer.main;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import client.consumer.service.AgenceServiceUtilisateurImplService;
import client.consumer.service.DatatypeConfigurationException_Exception;
import client.consumer.service.IAgenceServiceUtilisateur;


public class InterfaceGUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField nomVille;
	private JTextField prixMaximum;
	private JTextField dateArrivee;
	private JTextField dateDepart;
	private DefaultTableModel model;
	JComboBox<String> comboBox;
	JComboBox<String> comboBoxAgences;

//	ArrayList<Animal> cab;

	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	
	URL url = new URL("http://localhost:8088/agencewebservice?wsdl");
	
	
	AgenceServiceUtilisateurImplService agenceImpl = new AgenceServiceUtilisateurImplService(url);
	IAgenceServiceUtilisateur proxy = agenceImpl.getAgenceServiceUtilisateurImplPort();
	
	
	
	String header[] = new String[] {"Lieu", "Prix", "Etoiles"};
	int row, col;
	private JTable table;
	private JTextField prixMaximum_1;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 * @throws RemoteException 
	 * @throws NotBoundException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
	
	
		
		// On suppose le cabinet déjà créer
			// On demande d'ajouter un animal 
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGUI frame = new InterfaceGUI();
					frame.setVisible(true);
					Toolkit toolkit = Toolkit.getDefaultToolkit();  
					Dimension screenSize = toolkit.getScreenSize();  
					int x = (screenSize.width - frame.getWidth()) / 2;  
					int y = (screenSize.height - frame.getHeight()) / 2; 
					frame.setLocation(x, y); 
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws RemoteException 
	 * @throws NotBoundException 
	 * @throws MalformedURLException 
	 */
	public InterfaceGUI() throws RemoteException, NotBoundException, MalformedURLException {
	
		
		
		
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100,100,1200,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNomVille = new JLabel("Ville souhaitée : ");
		lblNomVille.setBounds(12, 28, 144, 15);
		contentPane.add(lblNomVille);

		JLabel lblNomAnimal_1_1 = new JLabel("Nombre d'étoiles : ");
		lblNomAnimal_1_1.setBounds(12, 63, 144, 15);
		contentPane.add(lblNomAnimal_1_1);
		
		comboBox = new JComboBox<String>();
		comboBox.addItem("");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.addItem("5");
		comboBox.setBounds(130, 58, 69, 24);
//		comboBox.addItemListener(this);
		contentPane.add(comboBox);
		
		
		JLabel lblNomAnimal_1_1_1 = new JLabel("Prix maximum : ");
		lblNomAnimal_1_1_1.setBounds(10, 105, 144, 15);
		contentPane.add(lblNomAnimal_1_1_1);
		
		JLabel lblDateArrivee = new JLabel("Date de départ : ");
		lblDateArrivee.setBounds(538, 63, 144, 15);
		contentPane.add(lblDateArrivee);
		
		JLabel lblNomAnimal_1_1_1_1 = new JLabel("Date d'arrivée : ");
		lblNomAnimal_1_1_1_1.setBounds(538, 28, 144, 15);
		contentPane.add(lblNomAnimal_1_1_1_1);
		
		nomVille = new JTextField();
		nomVille.addActionListener(this);
		nomVille.setBounds(130, 25, 143, 19);
		contentPane.add(nomVille);
		nomVille.setColumns(10);
		                                  
		
		JToggleButton tglbtnSupprimer = new JToggleButton("Reserver");
		tglbtnSupprimer.addActionListener(this);
		tglbtnSupprimer.setBounds(150, 182, 123, 25);
		contentPane.add(tglbtnSupprimer);
		tglbtnSupprimer.setVisible(false);
		
		
	
		
		
		
		JToggleButton tglbtnValidez_1 = new JToggleButton("Validez");
		tglbtnValidez_1.addActionListener(this);
		tglbtnValidez_1.setBounds(31, 182, 86, 25);
		contentPane.add(tglbtnValidez_1);
		
		
		
		model = new DefaultTableModel(header,0);
		
		table = new JTable(model) {
			private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) {                
	                return false;               
	        };	
		};
	
	
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setVisible(true);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(185, 349, 731, 187);
		contentPane.add(scrollPane);
		
		prixMaximum = new JTextField();
		prixMaximum.setColumns(10);
		prixMaximum.setBounds(130, 102, 69, 19);
		contentPane.add(prixMaximum);
		
		dateArrivee = new JTextField();
		dateArrivee.setColumns(10);
		dateArrivee.setBounds(654, 25, 151, 19);
		contentPane.add(dateArrivee);
		
		dateDepart = new JTextField();
		dateDepart.setColumns(10);
		dateDepart.setBounds(654, 60, 151, 19);
		contentPane.add(dateDepart);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem("");
		
		for (String s : proxy.lstAgences) {
			comboBox_1.addItem(s.getLogin());
		}
		comboBox_1.addItem("2");
		comboBox_1.setBounds(654, 105, 151, 24);
		contentPane.add(comboBox_1);
		
		JLabel lblDateArrivee_1 = new JLabel("Agence : ");
		lblDateArrivee_1.setBounds(538, 114, 144, 15);
		contentPane.add(lblDateArrivee_1);
	
	}

	// Je récupère la valeur des buttons
	
	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand(); 
		if(command.equals("Validez")) {
			
				String x = String.valueOf(comboBox.getSelectedItem()).trim();
				int etoiles = Integer.parseInt(x);
				

				int prix =  Integer.parseInt(prixMaximum.getText().trim());
				
				GregorianCalendar dateArriveeGC = new GregorianCalendar();
				GregorianCalendar dateDepartGC = new GregorianCalendar();

			
				try {
					dateArriveeGC.setTime(df.parse(dateArrivee.getText()));
					dateDepartGC.setTime(df.parse(dateDepart.getText()));

				} catch (ParseException e2) {
					e2.printStackTrace();
				}
				
				try {
					XMLGregorianCalendar dateArriveeXMLGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateArriveeGC);
					XMLGregorianCalendar dateDepartXMLGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateDepartGC);
					System.out.println(proxy.consultationOffre(prix,nomVille.getText(),etoiles,dateArriveeXMLGC, dateDepartXMLGC));
				} catch (DatatypeConfigurationException e1) {
					e1.printStackTrace();
				} catch (DatatypeConfigurationException_Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//
//				
				
//				model.addRow(new Object[] { nomAnimal.getText(), nomMaitre.getText()});

//				
//				if(!nomAnimal.getText().equals("") && !nomMaitre.getText().equals("") && !espece.equals("") && !nomRace.getText().equals("") && !etatSante.getText().equals("") && !cabinet.animalExists(nomAnimal.getText(), nomMaitre.getText())) {
//				cabinet.addAnimal(nomAnimal.getText(), nomMaitre.getText(), espece, nomRace.getText(), etatSante.getText());
//				
//				model.addRow(new Object[] { nomAnimal.getText(), nomMaitre.getText()});
//				
//				
//				lbltaillecabinet.setText("Nombre d'animaux : " + cabinet.size());
//				JOptionPane.showMessageDialog(null, "Vous venez d'ajouter un animal");
//				if(cabinet.size() > 30) {
//					lbltaillecabinet.setForeground(Color.red);
//					JOptionPane.showMessageDialog(null, "Votre cabinet contient plus de 30 animaux");
//				}
//				}
//				else{
//					JOptionPane.showMessageDialog(null, "Vous n'avez pas saisis tous les champs ou vous avez voulu insérer un animal déjà existant");
//				}
//			
		
		
		}
	}
}