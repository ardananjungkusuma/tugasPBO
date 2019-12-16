package projectakhir;

/**
 *
 * @author ardan & wahyu
 */
public class FoodTruck {
    private String jamBuka;
    private String jamTutup;
    private Makanan makanan;
    private Minuman minuman;
    

    public FoodTruck() {
    }

    public String getJamBuka() {
        return jamBuka;
    }

    public void setJamBuka(String jamBuka) {
        this.jamBuka = jamBuka;
    }

    public String getJamTutup() {
        return jamTutup;
    }

    public void setJamTutup(String jamTutup) {
        this.jamTutup = jamTutup;
    }

    public Makanan getMakanan() {
        return makanan;
    }

    public void setMakanan(Makanan makanan) {
        this.makanan = makanan;
    }

    public Minuman getMinuman() {
        return minuman;
    }

    public void setMinuman(Minuman minuman) {
        this.minuman = minuman;
    }
}
