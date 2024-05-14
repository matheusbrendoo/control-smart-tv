public class SmartTv {
        boolean ligada;
        int canal;
        int volume;
    
    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

    public boolean desligar = false;
    
    public int mudarCanal = (canal++);

    public void diminuirVolume (){
        volume--;
    }

    public void aumentarVolume (){
        volume++;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }



    }

