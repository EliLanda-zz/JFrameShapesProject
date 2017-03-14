package com.company;

import java.awt.*;

/**
 * Created by Eli on 2017-03-11.
 */
public abstract class ShapeImpl implements Shape {
    private int locationX;
    private int locationY;
    private char borderChar = '*';
    private Color color = Color.YELLOW;
    private int width;
    private int height;

    public ShapeImpl(int locationX, int locationY, int width, int height) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.width = width;
        this.height = height;
    }

    @Override
    public int getLocationX() {
        return locationX;
    }

    @Override
    public int getLocationY() {
        return locationY;
    }

    @Override
    public void setBorderChar(char borderChar) {
        this.borderChar = borderChar;
    }

    @Override
    public char getBorderChar() {
        return this.borderChar;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void draw(Canvas canvas) {
        /*for(int y = this.locationY; y > (locationY - height + 1); y--){
            for(int x = this.locationX; x < (locationX + width - 1); x++){
                if(isBorder(x,y)){
                    canvas.setPointColor(x,y,color);
                    canvas.setPointText(x,y,borderChar);
                }
                if(isInside(x,y)){
                    canvas.setPointColor(x,y,color);
                }
            }
        }*/
        for(int i = 0; i < 5; i++){
            for(int k = 0; k < 5; k++){
                canvas.setPointColor(i,k,Color.black);
            }
        }
    }

    protected int getWidth (){
        return this.width;
    }

    protected int getHeight (){
        return this.height;
    }

    abstract protected boolean isBorder (int x, int y);
    abstract protected boolean isInside (int x, int y);
}
