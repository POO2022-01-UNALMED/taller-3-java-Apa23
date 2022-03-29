package taller3.televisores;

import taller3.televisores.TV;

public class Control {
    private TV tv;


    public Control(){
    }
    
    public turnOn(){
     tv.turnOn()
    }
 
    public void turnOff(){
        tv.turnOff()
    }

    public void canalUp(){
        tv.canalUp()
    }
    
    public void canalDown(){
        tv.canalDown()
    }

    public void volumenUp(){
        tv.volumenUp()
    }
    
    public void volumenDown(){
        tv.volumenDown()
    }
    
    public void setCanal(canal){
        tv.setCanal(canal)
    }
        
    public void enlazar(tv){
        this.tv = tv
        tv.setControl()
    }
    
    public TV getTv(){
        return tv
    }
        
    public void setTv(tv){
        this.tv = tv
    }
        
    }
