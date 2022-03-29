package taller3.televisores;

public class TV {
    private String marca;
    private boolean estado;
    private int canal = 1;
    private int volumen = 1;
    private int precio = 500;
    private static int numTV = 0;
    private Control control;

    public TV(marca, estado){
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public String getMarca(){
        return marca;
    }
    
    public void setMarca(marca){
        this.marca = marca;
    }
    
    public Control getControl(){
        return control;
    }
    
    public void setControl(control){
        this.control = control;
    }

    public int getPrecio(){
        return precio;
    }
    
    public void setPrecio(precio){
        this.precio = precio;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    public void setVolumen(volumen){
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
    
    public void setCanal(canal){
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
    
    def volumenDown(){
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
        return numTV
    }    
    
    public static void setNumTV(numTV){
        this.numTV = numTV;
    }

}
