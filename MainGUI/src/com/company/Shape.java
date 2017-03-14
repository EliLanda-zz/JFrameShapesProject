package com.company;

import java.awt.*;

/**
 * Created by Eli on 2017-03-11.
 */
public interface Shape {
    public int getLocationX ();
    public int getLocationY ();
    public void setBorderChar(char borderChar);
    public char getBorderChar ();
    public void setColor (Color color);
    public Color getColor ();
    public void draw (Canvas canvas);
}
