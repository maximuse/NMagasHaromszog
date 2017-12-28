package hu.nyirszikszi.nmagasharomszog;

public class NMagasHaromszog {
    private int n;

    public NMagasHaromszog(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String haromszog() {
        String haromszog = "";

        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                haromszog += j+1 + " ";
            }
            haromszog += "\n";
        }

        return haromszog;
    }
}