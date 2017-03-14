package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eli on 2017-03-11.
 */
public class PicturePanel extends JPanel {
    private Canvas canvas;
    private List<Shape> shapes = new ArrayList<Shape>();
    private JLabel titleTextLabel;
    private CanvasIcon icon;
    private JLabel iconLabel;
    private String titleText;
    public PicturePanel(String titleText, int width, int height){
        this.titleText = titleText;
        this.titleTextLabel = new JLabel(this.titleText);
        this.canvas = new Canvas(width,height);
        this.icon = new CanvasIcon(this.canvas);
        this.iconLabel = new JLabel(this.icon);
    }
    public void addFront (Shape shape){
        this.shapes.add(shape);
        remakeIcon();
    }

    public void addBack(Shape shape){
        this.shapes.add(shape);
    }

    private void remakeIcon() {
        for (Shape shape: this.shapes) {
            shape.draw(this.canvas);
            this.icon.paintIcon(this.iconLabel,getGraphics(),0,0);
        }

        this.iconLabel.setIcon(this.icon);
    }
}
