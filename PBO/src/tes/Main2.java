package tes;

/**
 *
 * @author ardan
 */
public class Main2 {
    public static void main(String[] args) {
        TelevisiModern tM = new TelevisiModern();
        TelevisiJadul tJ = new TelevisiJadul();
        Manusia ardan = new Manusia();
        
        ardan.nyalakanPerangkat(tJ);
        ardan.nyalakanPerangkat(tM);
    }
}
