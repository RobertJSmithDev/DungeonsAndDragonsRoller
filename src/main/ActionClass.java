package main;

import java.awt.event.*;

class ActionClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        int action = Integer.parseInt(e.getActionCommand());
        switch (action) {
        case 1:
        	GUI.r.setText("Roll 1d4 = " + Dice.roll("d4", 1));
        	Dice.resetNum();
            break;
        case 2:
        	GUI.r.setText("Roll 1d6 = " + Dice.roll("d6", 1));
        	Dice.resetNum();
            break;  
        case 3:
        	GUI.r.setText("Roll 1d8 = " + Dice.roll("d8", 1));
        	Dice.resetNum();
            break;
        case 4:
        	GUI.r.setText("Roll 1d10 = " + Dice.roll("d10", 1));
        	Dice.resetNum();
            break;  
        case 5:
        	GUI.r.setText("Roll 1d100 = " + Dice.roll("d100", 1));
        	Dice.resetNum();
            break;
        case 6:
        	GUI.r.setText("Roll 1d12 = " + Dice.roll("d12", 1));
        	Dice.resetNum();
            break;  
        case 7:
        	GUI.r.setText("Roll 1d20 = " + Dice.roll("d20", 1));
        	Dice.resetNum();
            break;
        case 8:
        	GUI.r.setText("<html>Roll 2d4 = " + Dice.roll("d4", 2) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        case 9:
        	GUI.r.setText("<html>Roll 2d6 = " + Dice.roll("d6", 2) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;  
        case 10:
        	GUI.r.setText("<html>Roll 2d8 = " + Dice.roll("d8", 2) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        case 11:
        	GUI.r.setText("<html>Roll 2d10 = " + Dice.roll("d10", 2) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        case 12:
        	GUI.r.setText("<html>Roll 2d12 = " + Dice.roll("d12", 2) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;  
        case 13:
        	GUI.r.setText("<html>Roll 2d20 = " + Dice.roll("d20", 2) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        case 14:
        	GUI.r.setText("<html>Roll 3d4 = " + Dice.roll("d4", 3) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        case 15:
        	GUI.r.setText("<html>Roll 3d6 = " + Dice.roll("d6", 3) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;  
        case 16:
        	GUI.r.setText("<html>Roll 3d8 = " + Dice.roll("d8", 3) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        case 17:
        	GUI.r.setText("<html>Roll 3d10 = " + Dice.roll("d10", 3) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        case 18:
        	GUI.r.setText("<html>Roll 3d12 = " + Dice.roll("d12", 3) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        case 19:
        	GUI.r.setText("<html>Roll 4d4 = " + Dice.roll("d4", 4) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        case 20:
        	GUI.r.setText("<html>Roll 4d6 = " + Dice.roll("d6", 4) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;  
        case 21:
        	GUI.r.setText("<html>Roll 4d8 = " + Dice.roll("d8", 4) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        case 22:
        	GUI.r.setText("<html>Roll 4d10 = " + Dice.roll("d10", 4) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        case 23:
        	GUI.r.setText("<html>Roll 4d12 = " + Dice.roll("d12", 4) + "  " + Dice.getString() + "<html>");
        	Dice.resetNum();
            break;
        default:
            break;
        }
    }
}
