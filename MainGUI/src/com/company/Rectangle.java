package com.company;

/**
 * Created by Eli on 2017-03-11.
 */
public class Rectangle extends ShapeImpl{
    public Rectangle(int locationX, int locationY, int width, int height) {
        super(locationX, locationY, width, height);
    }

    @Override
    protected boolean isBorder(int x, int y) {
        boolean isCoordinatesBorder = false;
        for(int yCoordinate = this.getLocationY(); yCoordinate > (this.getLocationY() - this.getHeight() + 1); yCoordinate--){
            if(x == getLocationX() && y == yCoordinate){
                isCoordinatesBorder = true;
            }
        }
        for(int yCoordinate = this.getLocationY(); yCoordinate > (this.getLocationY() - this.getHeight() + 1); yCoordinate--){
            if(x == this.getWidth() && y == yCoordinate){
                isCoordinatesBorder = true;
            }
        }
        for (int xCoordinate = this.getLocationX(); xCoordinate < (this.getLocationX() + this.getWidth()); xCoordinate++) {
            if (x == xCoordinate && y == this.getLocationY()) {
                isCoordinatesBorder = true;
            }
        }
        for (int xCoordinate = this.getLocationX(); xCoordinate < (this.getLocationX() + this.getWidth()); xCoordinate++) {
            if (x == xCoordinate && y == this.getHeight()) {
                isCoordinatesBorder = true;
            }
        }
        return isCoordinatesBorder;
    }

    @Override
    protected boolean isInside(int x, int y) {
        boolean isCoordinatesInside = false;
        for(int yCoordinate = this.getLocationY(); yCoordinate > (this.getLocationY() - this.getHeight() + 1); yCoordinate--){
            for (int xCoordinate = this.getLocationX(); xCoordinate < (this.getLocationX() + this.getWidth()); xCoordinate++){
                if(x == xCoordinate && y == yCoordinate){
                    isCoordinatesInside = true;
                }
            }
        }
        return isCoordinatesInside;
    }
}
