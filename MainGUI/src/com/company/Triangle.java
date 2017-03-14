package com.company;

/**
 * Created by Eli on 2017-03-11.
 */
public class Triangle extends ShapeImpl {
    public Triangle(int locationX, int locationY, int size) {
        super(locationX, locationY, size, size);
    }

    @Override
    protected boolean isBorder(int x, int y) {
        boolean isCoordinatesBorder = false;
        for(int yCoordinate = this.getLocationY(); yCoordinate > (this.getLocationY() - this.getHeight() + 1); yCoordinate--){
            if(x == getLocationX() && y == yCoordinate){
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
    protected boolean isInside(int x, int y) { // re visit
        boolean isCoordinatesInside = false;
        for(int yCoordinate = this.getLocationY() - 1; yCoordinate > ((this.getLocationY()-1) - this.getHeight() + 1); yCoordinate--) {
            for (int xCoordinate = this.getLocationX() + 1; xCoordinate < (Math.abs(yCoordinate-this.getLocationY()) - 1); xCoordinate++){
                if(x == xCoordinate && y == yCoordinate){
                    isCoordinatesInside = true;
                }
            }
        }
        /*for(int yCoordinate = this.getLocationY(); yCoordinate > (this.getLocationY() - this.getHeight() + 1); yCoordinate--){
            for (int xCoordinate = this.getLocationX(); xCoordinate < (this.getLocationX() + this.getWidth()); xCoordinate++){
                if(x == xCoordinate && y == yCoordinate){
                    isCoordinatesInside = true;
                }
            }
        }*/
        return isCoordinatesInside;
    }
}
