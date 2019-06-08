public class Cilindru {
    private double raza;
    private double inaltimea;

    public Cilindru(double raza, double inaltimea) {
        this.raza = raza;
        this.inaltimea = inaltimea;
    }

    public double CalculeazaSuprafata(){
    return 2*Math.PI*raza*(raza+inaltimea);
    }

    public double CalculeazaVolumul(){
    return Math.PI*Math.pow(raza,2)*inaltimea;
    }
    public String toString(){
        return "Cilindrul cu raza "+ raza +" si "+inaltimea;
    }
}
