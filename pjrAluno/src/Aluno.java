/**
 * @author Marcio Sousa
 */
public class Aluno {
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    
    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public double getNtPrv1() {
        return NtPrv1;
    }

    public void setNtPrv1(double NtPrv1) {
        this.NtPrv1 = NtPrv1;
    }

    public double getNtPrv2() {
        return NtPrv2;
    }

    public void setNtPrv2(double NtPrv2) {
        this.NtPrv2 = NtPrv2;
    }

    public double getNtTrab1() {
        return NtTrab1;
    }

    public void setNtTrab1(double NtTrab1) {
        this.NtTrab1 = NtTrab1;
    }

    public double getNtTrab2() {
        return NtTrab2;
    }

    public void setNtTrab2(double NtTrab2) {
        this.NtTrab2 = NtTrab2;
    }

    public double calcMediaProva(){
        double resultado =  (0.75 * (NtPrv1 + 2 * NtPrv2))/3;
        return resultado;
    }
    
    public double calcMediaTrab(){
        double resultado = (0.25 * (NtTrab1 + NtTrab2))/2;
        return resultado;
    }
    
    public double calcMediaFinal(){
        double resultado = (calcMediaProva() + calcMediaTrab())/2;
        return resultado;
    }
    
}
