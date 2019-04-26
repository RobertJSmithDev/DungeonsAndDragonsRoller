package main;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class GUI
{
	static JPanel bottomPanel, topPanel, leftPanel, rightPanel, centerPanel, paneld4, paneld6, paneld8, paneld10, paneld100, paneld12, paneld20, rolls, panelStr, panelDex, panelCon, panelInt, panelCha, panelWis;
	public static JLabel labelAbout, labelMainText, r, textDiceRoller, labelStrMod, labelDexMod, labelConMod, labelIntMod, labelWisMod, labelChaMod;
	static JTextArea taStr, taDex, taCon, taInt, taWis, taCha;
	static GridBagLayout rightLayout, leftLayout;
	static GridBagConstraints rightgbc, leftgbc;
	static JButton reset, btnResetStats, btnResetStatMod, rolld4x1, rolld6x1, rolld8x1, rolld10x1, rolld100x1, rolld12x1, rolld20x1, rolld4x2, rolld6x2, rolld8x2, rolld10x2, rolld100x2, rolld12x2, rolld20x2, rolld4x3, rolld6x3, rolld8x3, rolld10x3, rolld100x3, rolld12x3, rolld20x3, rolld4x4, rolld6x4, rolld8x4, rolld10x4, rolld100x4, rolld12x4, rolld20x4;
	static ActionListener al;
	static Font title = new Font("Serif", Font.BOLD, 24);
	static Font text = new Font("Serif", Font.PLAIN, 18);
	
	static void createGUI()
	{	
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame window = new JFrame("D&D Character Generator");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(700, 400);
		window.setResizable(false);
		window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2);
		window.getContentPane().setBackground(new java.awt.Color(220, 220, 220));
		
		createPanels();		
		createRoller();
		createStats();
		Stats.generateStats();
		window.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
		//window.getContentPane().add(BorderLayout.NORTH, topPanel);
		window.getContentPane().add(BorderLayout.CENTER, centerPanel);
		window.getContentPane().add(BorderLayout.EAST, rightPanel);
		window.getContentPane().add(BorderLayout.WEST, leftPanel);
		window.setVisible(true);
	}
	
	static void createPanels()
	{
		// Create Bottom Panel
		bottomPanel = new JPanel();
		bottomPanel.setBackground(new java.awt.Color(169, 169, 169)); // Sets panel color
		// Create Top Panel
		//topPanel = new JPanel();
		//topPanel.setBackground(new java.awt.Color(169, 169, 169)); // Sets panel color
		// Create Left Panel
		leftPanel = new JPanel(new GridBagLayout());
		leftPanel.setBackground(new java.awt.Color(220, 220, 220)); // Sets panel color
		leftgbc = new GridBagConstraints();
		// Create Right Panel
		rightPanel = new JPanel();
		rightPanel.setBackground(new java.awt.Color(220, 220, 220)); // Sets panel color
		rightLayout = new GridBagLayout();
		rightPanel.setLayout(rightLayout);
		rightgbc = new GridBagConstraints();
	    rightgbc.weighty = 1;
		// Create Center Panel
		centerPanel = new JPanel();
		labelMainText = new JLabel();
		labelAbout = new JLabel("<html>This small applet is designed to generate a character idea and stats for a Dungeon and Dragons fifth edition character. I have also included a dice roller for if you don't have your dice with you or you don't have enough dice. Enjoy! <br>- Rob</html>");
		centerPanel.add(labelAbout);
		labelAbout.setPreferredSize(new Dimension(250,120));
		centerPanel.add(labelMainText);
		//centerPanel.setBackground(new java.awt.Color(238, 220, 238)); // Sets panel color
		
		// Create Center Panel
		paneld4 = new JPanel();
		paneld4.setBackground(new java.awt.Color(220, 220, 220)); // Sets panel color
		paneld6 = new JPanel();
		paneld6.setBackground(new java.awt.Color(220, 220, 220)); // Sets panel color
		paneld8 = new JPanel();
		paneld8.setBackground(new java.awt.Color(220, 220, 220)); // Sets panel color
		paneld10 = new JPanel();
		paneld10.setBackground(new java.awt.Color(220, 220, 220)); // Sets panel color
		paneld100 = new JPanel();
		paneld100.setBackground(new java.awt.Color(220, 220, 220)); // Sets panel color
		paneld12 = new JPanel();
		paneld12.setBackground(new java.awt.Color(220, 220, 220)); // Sets panel color
		paneld20 = new JPanel();
		paneld20.setBackground(new java.awt.Color(220, 220, 220)); // Sets panel color
		rolls = new JPanel();
		rolls.setBackground(new java.awt.Color(220, 220, 220)); // Sets panel color
		
		panelStr = new JPanel();
		panelDex = new JPanel();
		panelCon = new JPanel();
		panelInt = new JPanel();
		panelWis = new JPanel();
		panelCha = new JPanel();
		
		JButton reset = new JButton("Who is my Character?"); // Create Reset Button\
		bottomPanel.add(reset); //Add button to panel
		reset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Stats.generateStats();
				taStr.setText(Stats.getStrength());
				taDex.setText(Stats.getDexterity());
				taCon.setText(Stats.getConstitution());
				taInt.setText(Stats.getIntelligence());
				taWis.setText(Stats.getWisdom());
				taCha.setText(Stats.getCharisma());
				labelStrMod.setText(Stats.getStrengthMod());
				labelDexMod.setText(Stats.getDexterityMod());
				labelConMod.setText(Stats.getConstitutionMod());
				labelIntMod.setText(Stats.getIntelligenceMod());
				labelWisMod.setText(Stats.getWisdomMod());
				labelChaMod.setText(Stats.getCharismaMod());
				
				labelMainText.setText("<html>" + Main.characterIdeas[calc.random(0, 14)] + "</html>");
				labelMainText.setPreferredSize(new Dimension(250,80));
			}
		});
	}

	static void createStats()
	{
		btnResetStats = new JButton("Stats");
		btnResetStatMod = new JButton("Mods");
		Dimension d = new Dimension(40,20); 
		//btnResetStats.setPreferredSize(d);
		btnResetStats.setMargin(new Insets(2,2,2,2));
		//btnResetStatMod.setPreferredSize(d);
		btnResetStatMod.setMargin(new Insets(2,2,2,2));
		
		labelStrMod = new JLabel();
		labelDexMod = new JLabel();
		labelConMod = new JLabel();
		labelIntMod = new JLabel();
		labelWisMod = new JLabel();
		labelChaMod = new JLabel();
		
		Border border = BorderFactory.createLineBorder(Color.GRAY);
		taStr = new JTextArea(1,2);
		taDex = new JTextArea(1,2);
		taCon = new JTextArea(1,2);
		taInt = new JTextArea(1,2);
		taWis = new JTextArea(1,2);
		taCha = new JTextArea(1,2);
		
		taStr.setBorder(border);
		taStr.setMargin(new Insets(10,10,10,10));
		taStr.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (taStr.getText().length() >= 2 )
	                e.consume();
	        }
	    });
		
		taDex.setBorder(border);
		taDex.setMargin(new Insets(10,10,10,10));
		taDex.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (taDex.getText().length() >= 2 )
	                e.consume();
	        }
	    });
		
		taCon.setBorder(border);
		taCon.setMargin(new Insets(10,10,10,10));
		taCon.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (taCon.getText().length() >= 2 )
	                e.consume();
	        }
	    });
		
		taInt.setBorder(border);
		taInt.setMargin(new Insets(10,10,10,10));
		taInt.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (taInt.getText().length() >= 2 )
	                e.consume();
	        }
	    });
		
		taWis.setBorder(border);
		taWis.setMargin(new Insets(10,10,10,10));
		taWis.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (taWis.getText().length() >= 2 )
	                e.consume();
	        }
	    });
		
		taCha.setBorder(border);
		taCha.setMargin(new Insets(10,10,10,10));
		taCha.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            if (taCha.getText().length() >= 2 )
	                e.consume();
	        }
	    });
		
		leftgbc.fill = GridBagConstraints.HORIZONTAL;
		leftgbc.gridx = 0;
		leftgbc.gridy = 0;
		leftPanel.add(new JLabel("Strength: "), leftgbc);
		
		leftgbc.gridx = 1;
		leftgbc.gridy = 0;
		leftPanel.add(taStr, leftgbc);
		
		leftgbc.gridx = 2;
		leftgbc.gridy = 0;
		leftPanel.add(labelStrMod, leftgbc);
		
		leftgbc.fill = GridBagConstraints.HORIZONTAL;
		leftgbc.gridx = 0;
		leftgbc.gridy = 1;
		leftPanel.add(new JLabel("Dexterity: "), leftgbc);
		
		leftgbc.gridx = 1;
		leftgbc.gridy = 1;
		leftPanel.add(taDex, leftgbc);
		
		leftgbc.gridx = 2;
		leftgbc.gridy = 1;
		leftPanel.add(labelDexMod, leftgbc);
		
		leftgbc.fill = GridBagConstraints.HORIZONTAL;
		leftgbc.gridx = 0;
		leftgbc.gridy = 2;
		leftPanel.add(new JLabel("Constitution: "), leftgbc);
		
		leftgbc.gridx = 1;
		leftgbc.gridy = 2;
		leftPanel.add(taCon, leftgbc);
		
		leftgbc.gridx = 2;
		leftgbc.gridy = 2;
		leftPanel.add(labelConMod, leftgbc);
		
		leftgbc.fill = GridBagConstraints.HORIZONTAL;
		leftgbc.gridx = 0;
		leftgbc.gridy = 3;
		leftPanel.add(new JLabel("Inteligence: "), leftgbc);
		
		leftgbc.gridx = 1;
		leftgbc.gridy = 3;
		leftPanel.add(taInt, leftgbc);
		
		leftgbc.gridx = 2;
		leftgbc.gridy = 3;
		leftPanel.add(labelIntMod, leftgbc);
		
		leftgbc.fill = GridBagConstraints.HORIZONTAL;
		leftgbc.gridx = 0;
		leftgbc.gridy = 4;
		leftPanel.add(new JLabel("Wisdom: "), leftgbc);
		
		leftgbc.gridx = 1;
		leftgbc.gridy = 4;
		leftPanel.add(taWis, leftgbc);
		
		leftgbc.gridx = 2;
		leftgbc.gridy = 4;
		leftPanel.add(labelWisMod, leftgbc);
		
		leftgbc.fill = GridBagConstraints.HORIZONTAL;
		leftgbc.gridx = 0;
		leftgbc.gridy = 5;
		leftPanel.add(new JLabel("Charisma: "), leftgbc);
		
		leftgbc.gridx = 1;
		leftgbc.gridy = 5;
		leftPanel.add(taCha, leftgbc);
		
		leftgbc.gridx = 2;
		leftgbc.gridy = 5;
		leftPanel.add(labelChaMod, leftgbc);
		
		leftgbc.gridx = 0;
		leftgbc.gridy = 6;
		leftPanel.add(new JLabel("<html><BR></html>"), leftgbc);
		
		leftgbc.gridx = 0;
		leftgbc.gridy = 7;
		leftPanel.add(new JLabel("Reset "), leftgbc);
		
		leftgbc.gridx = 1;
		leftgbc.gridy = 7;
		leftPanel.add(btnResetStats, leftgbc);
		
		leftgbc.gridx = 2;
		leftgbc.gridy = 7;
		leftPanel.add(btnResetStatMod, leftgbc);
		
		btnResetStats.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Stats.generateStats();
				taStr.setText(Stats.getStrength());
				taDex.setText(Stats.getDexterity());
				taCon.setText(Stats.getConstitution());
				taInt.setText(Stats.getIntelligence());
				taWis.setText(Stats.getWisdom());
				taCha.setText(Stats.getCharisma());
				
				labelStrMod.setText(Stats.getStrengthMod());
				labelDexMod.setText(Stats.getDexterityMod());
				labelConMod.setText(Stats.getConstitutionMod());
				labelIntMod.setText(Stats.getIntelligenceMod());
				labelWisMod.setText(Stats.getWisdomMod());
				labelChaMod.setText(Stats.getCharismaMod());
			}
		});
		
		btnResetStatMod.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Stats.setStrength(Integer.parseInt(taStr.getText()));
				Stats.setDexterity(Integer.parseInt(taDex.getText()));
				Stats.setConstitution(Integer.parseInt(taCon.getText()));
				Stats.setIntelligence(Integer.parseInt(taInt.getText()));
				Stats.setWisdom(Integer.parseInt(taWis.getText()));
				Stats.setCharisma(Integer.parseInt(taCha.getText()));
				
				labelStrMod.setText(Stats.getStrengthMod());
				labelDexMod.setText(Stats.getDexterityMod());
				labelConMod.setText(Stats.getConstitutionMod());
				labelIntMod.setText(Stats.getIntelligenceMod());
				labelWisMod.setText(Stats.getWisdomMod());
				labelChaMod.setText(Stats.getCharismaMod());
			}
		});
	}
	
	static void createRoller()
	{
		//Roll text
		r = new JLabel();
		r.setFont(text);
		r.setText(" ");
		r.setHorizontalTextPosition(2);
		rolls.add(r);
		//Roll text
		textDiceRoller = new JLabel("Dice Roller", SwingConstants.CENTER);
		textDiceRoller.setFont(title);
						
		textDiceRoller = new JLabel("Dice Roller", SwingConstants.CENTER);
		textDiceRoller.setFont(title);
		
		rolld4x1= new JButton ("x1");
		rolld6x1= new JButton ("x1");
		rolld8x1= new JButton ("x1");
		rolld10x1= new JButton ("x1");
		rolld100x1= new JButton ("x1");
		rolld12x1= new JButton ("x1");
		rolld20x1= new JButton ("x1");
		
		rolld4x2= new JButton ("x2");
		rolld6x2= new JButton ("x2");
		rolld8x2= new JButton ("x2");
		rolld10x2= new JButton ("x2");
		rolld12x2= new JButton ("x2");
		rolld20x2= new JButton ("x2");
		
		rolld4x3= new JButton ("x3");
		rolld6x3= new JButton ("x3");
		rolld8x3= new JButton ("x3");
		rolld10x3= new JButton ("x3");
		rolld12x3= new JButton ("x3");
		
		rolld4x4= new JButton ("x4");
		rolld6x4= new JButton ("x4");
		rolld8x4= new JButton ("x4");
		rolld10x4= new JButton ("x4");
		rolld12x4= new JButton ("x4");
		
		ActionClass actionEvent = new ActionClass();
		
		rolld4x1.addActionListener(actionEvent);
		rolld6x1.addActionListener(actionEvent);
		rolld8x1.addActionListener(actionEvent);
		rolld10x1.addActionListener(actionEvent);
		rolld100x1.addActionListener(actionEvent);
		rolld12x1.addActionListener(actionEvent);
		rolld20x1.addActionListener(actionEvent);
		
		rolld4x2.addActionListener(actionEvent);
		rolld6x2.addActionListener(actionEvent);
		rolld8x2.addActionListener(actionEvent);
		rolld10x2.addActionListener(actionEvent);
		rolld12x2.addActionListener(actionEvent);
		rolld20x2.addActionListener(actionEvent);

		rolld4x3.addActionListener(actionEvent);
		rolld6x3.addActionListener(actionEvent);
		rolld8x3.addActionListener(actionEvent);
		rolld10x3.addActionListener(actionEvent);
		rolld12x3.addActionListener(actionEvent);
		
		rolld4x4.addActionListener(actionEvent);
		rolld6x4.addActionListener(actionEvent);
		rolld8x4.addActionListener(actionEvent);
		rolld10x4.addActionListener(actionEvent);
		rolld12x4.addActionListener(actionEvent);
		
        rolld4x1.setActionCommand("1");
        rolld6x1.setActionCommand("2");
        rolld8x1.setActionCommand("3");
        rolld10x1.setActionCommand("4");
        rolld100x1.setActionCommand("5");
        rolld12x1.setActionCommand("6");
        rolld20x1.setActionCommand("7");
        
        rolld4x2.setActionCommand("8");
        rolld6x2.setActionCommand("9");
        rolld8x2.setActionCommand("10");
        rolld10x2.setActionCommand("11");
        rolld12x2.setActionCommand("12");
        rolld20x2.setActionCommand("13");
        
        rolld4x3.setActionCommand("14");
        rolld6x3.setActionCommand("15");
        rolld8x3.setActionCommand("16");
        rolld10x3.setActionCommand("17");
        rolld12x3.setActionCommand("18");
        
        rolld4x4.setActionCommand("19");
        rolld6x4.setActionCommand("20");
        rolld8x4.setActionCommand("21");
        rolld10x4.setActionCommand("22");
        rolld12x4.setActionCommand("23");
		 
        paneld4.add(new JLabel("D4: "));
		paneld4.add(rolld4x1);
		paneld4.add(rolld4x2);
		paneld4.add(rolld4x3);
		paneld4.add(rolld4x4);
		
		paneld6.add(new JLabel("D6: "));
		paneld6.add(rolld6x1);
		paneld6.add(rolld6x2);
		paneld6.add(rolld6x3);
		paneld6.add(rolld6x4);
		
		paneld8.add(new JLabel("D8: "));
		paneld8.add(rolld8x1);
		paneld8.add(rolld8x2);
		paneld8.add(rolld8x3);
		paneld8.add(rolld8x4);
		
		paneld10.add(new JLabel("D10: "));
		paneld10.add(rolld10x1);
		paneld10.add(rolld10x2);
		paneld10.add(rolld10x3);
		paneld10.add(rolld10x4);
		
		paneld100.add(new JLabel("D100: "));
		paneld100.add(rolld100x1);
		
		paneld12.add(new JLabel("D12: "));
		paneld12.add(rolld12x1);
		paneld12.add(rolld12x2);
		paneld12.add(rolld12x3);
		paneld12.add(rolld12x4);
		
		paneld20.add(new JLabel("D20: "));
		paneld20.add(rolld20x1);
		paneld20.add(rolld20x2);
		
		rightgbc.fill = GridBagConstraints.HORIZONTAL;
		rightgbc.gridx = 0;
		rightgbc.gridy = 0;
        rightPanel.add(textDiceRoller, rightgbc);
		
        rightgbc.fill = GridBagConstraints.HORIZONTAL;
        rightgbc.gridx = 0;
        rightgbc.gridy = 1;
        rightPanel.add(paneld4, rightgbc);
        
        rightgbc.fill = GridBagConstraints.HORIZONTAL;
        rightgbc.gridx = 0;
        rightgbc.gridy = 2;
        rightPanel.add(paneld6, rightgbc);
        
        rightgbc.fill = GridBagConstraints.HORIZONTAL;
        rightgbc.gridx = 0;
        rightgbc.gridy = 3;
        rightPanel.add(paneld8, rightgbc);
        
        rightgbc.fill = GridBagConstraints.HORIZONTAL;
        rightgbc.gridx = 0;
        rightgbc.gridy = 4;
        rightPanel.add(paneld10, rightgbc);
        
        rightgbc.fill = GridBagConstraints.HORIZONTAL;
        rightgbc.gridx = 0;
        rightgbc.gridy = 5;
        rightPanel.add(paneld12, rightgbc);
        
        rightgbc.fill = GridBagConstraints.HORIZONTAL;
        rightgbc.gridx = 0;
        rightgbc.gridy = 6;
        rightPanel.add(paneld20, rightgbc);
        
        rightgbc.fill = GridBagConstraints.HORIZONTAL;
        rightgbc.gridx = 0;
        rightgbc.gridy = 7;
        rightPanel.add(paneld100, rightgbc);
        
        rightgbc.fill = GridBagConstraints.HORIZONTAL;
        rightgbc.gridx = 0;
        rightgbc.gridy = 8;
        rightPanel.add(rolls, rightgbc);
   	}
}
