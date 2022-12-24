/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectfour;

import java.awt.Color;

/**
 *
 * @author Ventsislav Peychev
 */
public class MyPanel extends javax.swing.JPanel{
    private Color col;
    
    public void setCol(Color col)
    {
        this.col = col;
    }
    
    public Color getCol()
    {
        return this.col;
    }
    
    public MyPanel()
    {
        super();
        col = Color.yellow;
    }
}
