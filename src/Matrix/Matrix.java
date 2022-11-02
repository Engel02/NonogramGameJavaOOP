/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Angelius
 */
public class Matrix {
    
     int columns, rows;
    JButton bMatrix[][];
    

    public Matrix(int x, int y) {
      int i, j;

        columns = x;
        rows = y;
        JButton buttonos;
        Font font;

        font = new Font("A ver", Font.BOLD, 9);

        bMatrix = new JButton[columns][rows];

        for (i = 0; i < columns; i++)
            for (j = 0; j < rows; j++) {

                buttonos = new JButton();
                buttonos.setSize(90, 90);
                buttonos.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 27));
                buttonos.setBackground(Color.white);
                buttonos.setIconTextGap(0);

                bMatrix[i][j] = buttonos;
            }
    }
    
    public String saveContents(){
        String NEWLINE = System.getProperty("line.separator");
        String output = "";
        
        int itwo, j;
        
        
        for (int i=0;i<225;i++) {
            
            itwo = i % 15;
            j = i/15;
            output = output + bMatrix[itwo][j].getIconTextGap()+NEWLINE;
        }
        return output;
    }
}
