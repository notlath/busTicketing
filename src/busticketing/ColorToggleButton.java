/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busticketing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

/**
 *
 * @author Lathrell Pagsuguiron
 */
public class ColorToggleButton extends JToggleButton {
    public ColorToggleButton() {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateColors();
            }
        });
        updateColors();
    }
    
    private void updateColors() {
        if (isSelected()) {
            setBackground(Color.RED);
            setForeground(Color.WHITE);
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}

