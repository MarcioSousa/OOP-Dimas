package fatec.poo.model;

/**
 *
 * @author Marcio Sousa
 */
public class Comodo {
    private int tipo;
    private double medLarg;
    private double medComp;
    private double medAlt;
    private int potLampada;

    public Comodo(int tipo, int potLampada) {
        this.tipo = tipo;
        this.potLampada = potLampada;
    }

    public void setMedLarg(double medLarg) {
        this.medLarg = medLarg;
    }

    public void setMedComp(double medComp) {
        this.medComp = medComp;
    }

    public void setMedAlt(double medAlt) {
        this.medAlt = medAlt;
    }

    public int getTipo() {
        return tipo;
    }

    public int getPotLampada() {
        return potLampada;
    }
    
    public double calcQtdeLampada(){
        double watts = medLarg * medComp * medAlt;
        
        switch(tipo){
            case 1:
                return (watts * 20)/potLampada;
            case 2:
                return (watts * 25)/potLampada;
            case 3:
                return (watts * 18)/potLampada;
            case 4:
                return (watts * 15)/potLampada;
        }
        
        return 0;
        
    }
}
