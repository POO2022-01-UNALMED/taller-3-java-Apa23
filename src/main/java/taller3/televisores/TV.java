package taller3.televisores;

import taller3.televisores.Marca;

public class TV {
    private Marca marca;
    private boolean estado;
    private int canal = 1;
    private int volumen = 1;
    private int precio = 500;
    private static int numTV = 0;
    private Control control;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public String getMarca(){
        return marca;
    }
    
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    
    public Control getControl(){
        return control;
    }
    
    public void setControl(Control control){
        this.control = control;
    }

    public int getPrecio(){
        return precio;
    }
    
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    public void setVolumen(int volumen){
        if(volumen > 7 || volumen < 1){
            return;
        }
        if(estado == true){
            this.volumen = volumen;
        }
    }
    
    public int getCanal(){
        return canal;
    }
    
    public void setCanal(int canal){
        if(canal > 120 || canal<1){
            return;
        }
        if(estado == true){
            this.canal = canal;
        }
            self._canal = canal;
    }

    public boolean getEstado(){
        return estado;
    }
        
    public void turnOn(){
        estado = true;
    }
    
    public void turnOff(){
        estado = false;
    }

    public void canalUp(){
        if(estado==true){
            if(canal==120){
                return;
            }
            else{
                canal++;
            }
        }
    }

    public void canalDown(){
        if(estado==true){
            if(canal==1){
                return;
            }
            else{
                canal--;
            }
        }
    }

    public void volumenUp(){
        if(estado==true){
            if(volumen==7){
                return;
            }
            else{
                volumen++;
            }
        }
    }
    
    public void volumenDown(){
        if(estado==true){
            if(volumen==0){
                return;
            }
            else{
                volumen--;
            }
        }
    }
    
    public static int getNumTV(){
        return numTV;
    }    
    
    public static void setNumTV(int numTV){
        this.numTV = numTV;
    }

}
