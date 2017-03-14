package com.company;

/**
 * Created by Eli on 2017-03-11.
 */
public class TextBox extends Rectangle {
    private String message;
    public TextBox(int locationX, int locationY, int width, int height, String message) {
        super(locationX, locationY, width, height);
        this.message = message;
    }
    public String getMessage (){
        return this.message;
    }
    public void setMessage (String message){
        this.message = message;
    }
    @Override
    public void draw (Canvas canvas){
        for(int y = getLocationY(); y < (getLocationY() + getHeight() - 1); y++){
            for(int x = getLocationX(); x < (getLocationX() + getWidth() - 1); x++){
                if(isBorder(x,y)){
                    canvas.setPointColor(x,y,getColor());
                    canvas.setPointText(x,y,getBorderChar());
                }
                if(isInside(x,y)){ //re visit
                    canvas.setPointColor(x,y,getColor());
                    canvas.setPointText(x,y,getMessage().charAt(x-getLocationX()));
                }
            }
        }
    }
}
