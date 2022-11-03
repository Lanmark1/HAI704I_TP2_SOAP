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
import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
import client.consumer.service.ExceptionGetReferenceException;
import client.consumer.service.IAgenceServiceUtilisateur;
import client.consumer.service.InfosPersonnes;
import client.consumer.service.Offre;
import client.consumer.service.Paiement;
import client.consumer.service.ParseException_Exception;


public class InterfaceGUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField nomVille;
	private JTextField prixMaximum;
	private JTextField dateArrivee;
	private JTextField dateDepart;
	private DefaultTableModel model;
	JComboBox<String> comboBox;
	JComboBox<String> comboBox_1;
	JComboBox<String> comboBoxAgences;

//	ArrayList<Animal> cab;

	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	
	URL url = new URL("http://localhost:8088/agencewebservice?wsdl");
	
	
	AgenceServiceUtilisateurImplService agenceImpl = new AgenceServiceUtilisateurImplService(url);
	IAgenceServiceUtilisateur proxy = agenceImpl.getAgenceServiceUtilisateurImplPort();
	
	
	
	String header[] = new String[] {"Lieu", "Identifiant", "Prix", "Etoiles"};
	int row, col;
	private JTable table;
	private JTextField prixMaximum_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JToggleButton tglbtnSupprimer;
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
		comboBox.setBounds(174, 58, 69, 24);
//		comboBox.addItemListener(this);
		contentPane.add(comboBox);
		
		
		JLabel lblNomAnimal_1_1_1 = new JLabel("Prix maximum : ");
		lblNomAnimal_1_1_1.setBounds(10, 105, 144, 15);
		contentPane.add(lblNomAnimal_1_1_1);
		
		JLabel lblDateArrivee = new JLabel("Date de départ : ");
		lblDateArrivee.setBounds(492, 63, 144, 15);
		contentPane.add(lblDateArrivee);
		
		JLabel lblNomAnimal_1_1_1_1 = new JLabel("Date d'arrivée : ");
		lblNomAnimal_1_1_1_1.setBounds(492, 28, 144, 15);
		contentPane.add(lblNomAnimal_1_1_1_1);
		
		nomVille = new JTextField();
		nomVille.addActionListener(this);
		nomVille.setBounds(174, 26, 143, 19);
		contentPane.add(nomVille);
		nomVille.setColumns(10);
		                                  
		
		tglbtnSupprimer = new JToggleButton("Reserver");
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
		prixMaximum.setBounds(174, 103, 69, 19);
		contentPane.add(prixMaximum);
		
		dateArrivee = new JTextField();
		dateArrivee.setColumns(10);
		dateArrivee.setBounds(654, 25, 151, 19);
		contentPane.add(dateArrivee);
		
		dateDepart = new JTextField();
		dateDepart.setColumns(10);
		dateDepart.setBounds(654, 60, 151, 19);
		contentPane.add(dateDepart);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem("");
		
		for (String s : proxy.getAgenceNames()) {
			comboBox_1.addItem(s);
		}
		comboBox_1.setBounds(654, 105, 151, 24);
		contentPane.add(comboBox_1);
		
		JLabel lblDateArrivee_1 = new JLabel("Agence : ");
		lblDateArrivee_1.setBounds(492, 105, 144, 15);
		contentPane.add(lblDateArrivee_1);
	
	}

	// Je récupère la valeur des buttons
	
	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand(); 
		if(command.equals("Validez")) {
				
				String agenceName = String.valueOf(comboBox.getSelectedItem()).trim();

			
				if(!agenceName.equals("") && !prixMaximum.getText().trim().equals("") && !dateArrivee.getText().equals("") && !dateDepart.getText().equals("") && !nomVille.getText().equals("")) {
				
			
				ArrayList<Offre> lstOffres = new ArrayList<>();
				lstOffres.clear();
				
				model.setRowCount(row);
				
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
					lstOffres = (ArrayList<Offre>) proxy.consultationOffre(agenceName,prix,nomVille.getText(),etoiles,dateArriveeXMLGC, dateDepartXMLGC);
					
					for (Offre o : lstOffres) {
						model.addRow(new Object[]
								{ nomVille.getText(), o.getIdentifiant(), o.getPrix(), 3});
						}

				if(!lstOffres.isEmpty()) {
					tglbtnSupprimer.setVisible(true);
				}
				else {
					tglbtnSupprimer.setVisible(false);
				}
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
		
				}else {
					JOptionPane.showMessageDialog(null, "Vous n'avez pas saisis tous les champs.");
				}
		}
		
		if(command.equals("Reserver")) {
			if(!table.getSelectionModel().isSelectionEmpty()) {
			
			int identifiant = Integer.parseInt(table.getModel().getValueAt(table.getSelectedRow(), 1).toString());
			String agenceName = String.valueOf(comboBox_1.getSelectedItem()).trim();
			
			JTextField nom = new JTextField();
			JTextField numero = new JTextField();
			JTextField cvv = new JTextField();
			JTextField dateExpiration = new JTextField();
			
			
			Object[] message = {
				    "Nom : ", nom,
				    "Numero carte : ", numero,
				    "Date expiration : ", dateExpiration,
				    "CVV : ", cvv
				};
			int option = 0;
			do {
			option = JOptionPane.showConfirmDialog(null, message, "Paiement", JOptionPane.OK_CANCEL_OPTION);
			} while (cvv.getText().equals("") && dateExpiration.getText().equals("") && numero.getText().equals("") && option == 0);
		
			if(option != 0) {
				JOptionPane.showMessageDialog(null,"Vous venez d'annuler votre réservation");
				return;
			}
			Paiement paiement = new Paiement(Integer.parseInt(cvv.getText().trim()), dateExpiration.getText().trim(), numero.getText().trim());
			InfosPersonnes ip = new InfosPersonnes(nom.getText().trim(), paiement);
			
		
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
				
			
				JOptionPane.showMessageDialog(null,"Vous venez de payer : " + proxy.reservation(agenceName, ip, identifiant, dateArriveeXMLGC, dateDepartXMLGC) + ", votre identifiant de réservation est : " + proxy.getReferenceResa());
				if(table.getSelectedRow() != -1) {
		               
		               model.removeRow(table.getSelectedRow());
		             
		        }
			} catch (DatatypeConfigurationException | DatatypeConfigurationException_Exception | ExceptionGetReferenceException | ParseException_Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
			else {
				JOptionPane.showMessageDialog(null,"Veuillez séléctionner une offre dans la table ");
			}
		}
	}
}