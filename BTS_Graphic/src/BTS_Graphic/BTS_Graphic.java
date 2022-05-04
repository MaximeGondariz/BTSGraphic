package BTS_Graphic;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
//Import des fichiers
public class BTS_Graphic extends JFrame implements ActionListener {
		
		JLabel banniere = new JLabel("calcul de votre note de BTS", SwingConstants.CENTER);
		
		JLabel E1 = new JLabel("E1 : Culture et communication", SwingConstants.CENTER);
		JTextField E1_note = new JTextField(SwingConstants.CENTER);
		
		JLabel E2 = new JLabel("E2 : Mathématique pour l'informatique", SwingConstants.CENTER);
		JTextField E2_note = new JTextField(SwingConstants.CENTER);
		
		JLabel E3 = new JLabel("E3 : Analyse économique, managériale", SwingConstants.CENTER);
		JLabel E3_2 = new JLabel("et juridique des services informatiques", SwingConstants.CENTER);
		JTextField E3_note = new JTextField(SwingConstants.CENTER);
		
		
		JTextField E_option_note = new JTextField(SwingConstants.CENTER);
		
		JLabel EF1 = new JLabel("EF1 Langue Vivante", SwingConstants.CENTER);
		JTextField EF1_note = new JTextField("10",SwingConstants.CENTER);
		
		JLabel EF2 = new JLabel("EF2 Mathématiques Approfondies", SwingConstants.CENTER);
		JTextField EF2_note = new JTextField("10",SwingConstants.CENTER);
		
		JLabel Resultat = new JLabel ("Cette personne à une moyenne de : null",SwingConstants.CENTER);
		JLabel Resultat2 = new JLabel ("",SwingConstants.CENTER);
		
		JButton bouton = new JButton("Calcul"); 
		
		JLabel Error = new JLabel ("Erreur : insérer que des chiffres");
		
		JComboBox E_option = new JComboBox();
		
		Container cont = getContentPane();
		
		String E4 = "E4 Conception et maintenance de solution informatiques";
		String E5 = "E5 Production et fourniture de services informatiques";
		String E6 = "E6 Parcours de professionnalisation";
		//Initialisation de tous les JLabel, JTextField, ect.
		
		public BTS_Graphic(){
		//initialisation d'un constructeur
			
		Border bordure = BorderFactory.createLineBorder(Color.BLACK, 1);// initialisation d'une bordure
		
		
		banniere.setBounds(0,0,794,100);// emplacement du label
		banniere.setBorder(bordure);// bordure du label
		cont.add(banniere);// ajout du label
		
		
		E1.setBounds(50,80,200,100);// emplacement du label
		cont.add(E1);// ajout du label
		
		
		E1_note.setBounds(70,150,160,20);// emplacement du TextField
		cont.add(E1_note);// ajout du TextField
		
		
		
		E2.setBounds(260,80,220,100);// emplacement du label
		cont.add(E2);// ajout du label
		
		
		E2_note.setBounds(290,150,160,20);// emplacement du TextField
		cont.add(E2_note);// ajout du TextField
		
		
		
		E3.setBounds(500,70,230,100);// emplacement du label
		cont.add(E3);// ajout du label
		
		
		E3_2.setBounds(500,85,230,100);// emplacement du label
		cont.add(E3_2);// ajout du label
		
		
		E3_note.setBounds(520,150,160,20);// emplacement du TextField
		cont.add(E3_note);// ajout du TextField
		
		
		
		E_option.setBounds(200,200,350,20);// emplacement du ComboBox
		cont.add(E_option);// ajout du ComboBox
		
		E_option.addItem(E4);
		E_option.addItem(E5);
		E_option.addItem(E6);
		//Ajout des Strings dans la ComboBox
		
		E_option_note.setBounds(300,230,160,20);// emplacement du TextField
		cont.add(E_option_note);// ajout du TextField
		
	   
		
		EF1.setBounds(120,280,160,20);// emplacement du label
		cont.add(EF1);// ajout du label
		
		
		EF1_note.setBounds(120,300,160,20);// emplacement du TextField
		cont.add(EF1_note);// ajout du TextField
		
		
		
		EF2.setBounds(450,280,220,20);// emplacement du label
		cont.add(EF2);// ajout du label
		
		
		EF2_note.setBounds(480,300,160,20);// emplacement du TextField
		cont.add(EF2_note);// ajout du TextField
		
		
	    
	    bouton.setBounds(310,350,160,20);// emplacement du bouton
		bouton.addActionListener(new ActionListener() {// lorsque on appuie sur le bouton, une action se d�clenche 	
		public void actionPerformed(ActionEvent e){// Initialisation de l'action 
		calcul();
		} 
		
		}); 
		cont.add(bouton);// ajout du bouton
		
		
		Resultat.setBounds(270,380,230,20); // emplacement du label
		cont.add(Resultat);// ajout du label
		
		Resultat2.setBounds(240,400,290,20); // emplacement du label
		cont.add(Resultat2);// ajout du label
		
		
	    Error.setBounds(400,550,200,20);// emplacement du label (qui fait n'import quoi pour des raisons inconnus)
	    Error.setVisible(false);//Le label n'est pas visible
	    cont.add(Error);// ajout du label
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ajout d'un bouton de fermeture du container
		setBounds(500,225,800,600);//Emplacement du container
		
	    show();//On affiche le tout
		}
		
		public void calcul() {
        	try {
        		int notes[] = new int[6];
        		int coef[] = new int[4];
        		coef[0]=4;
        		coef[1]=3;
        		coef[2]=3;
        		
        		notes[0] = Integer.parseInt(E1_note.getText());
        		notes[1] = Integer.parseInt(E2_note.getText());
        		notes[2] = Integer.parseInt(E3_note.getText());
        		notes[3] = Integer.parseInt(E_option_note.getText());
        		notes[4] = Integer.parseInt(EF1_note.getText()) -10;
        		notes[5] = Integer.parseInt(EF2_note.getText()) -10;
    			//On prend le text des TextField et on les mets dans ses variables
    			
    			String comparaison = E_option.getSelectedItem().toString(); 
	    		
	    		if (comparaison == E4) {
	    		coef[3] = 4;
	    		} 
	    		else if (comparaison == E5) { 
	    		coef[3] = 5;
	    		}
	    		else { 
	    		coef[3] = 3;
	    		} 
	    		//On regarde quelle phrase � �t� choisie dans le ComboBox, on la compare avec les string et on applique le bon coef � Coef_option
	    		
	    		if (notes[4]<= 0) {
	    			notes[4] = 0;
	    		}
	    		
	    		if (notes[5]<= 0) {
	    			notes[5] = 0;
	    		}
	    		//On v�rifie que les notes facultatives ne soit pas n�gatives
	    		
	    		int note_final = (notes[0]*coef[0] + notes[1]*coef[1] + notes[2]*coef[2] + notes[3]*coef[3] + notes[4] + notes[5])/(coef[0]+coef[1]+coef[2]+coef[3]);
	    		
	    		Resultat.setText("Cette personne à une moyenne de : "+ note_final);
	    		
	    		if (note_final < 10) {
	    			Resultat2.setText("Cette personne est recall�.");
	    		} else if(note_final < 12) {
	    			Resultat2.setText("Cette personne est passable au BTS.");
	    		} else if(note_final < 14) {
	    			Resultat2.setText("Cette personne à eu la mention assez bien au BTS.");
	    		} else if(note_final < 16) {
	    			Resultat2.setText("Cette personne à eu la mention bien au BTS.");
	    		} else {
	    			Resultat2.setText("Cette personne à eu la mention trés bien au BTS.");
	    		}
	    		Error.setVisible(false);	
    		}
    		catch (NumberFormatException e) {
    			Error.setVisible(true);	
    		}
        	
        	
		}

		public void setLayout(BorderLayout borderLayout) {
			// TODO Auto-generated method stub
			
		}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTS_Graphic test = new BTS_Graphic();// Activation de la fen�tre
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
