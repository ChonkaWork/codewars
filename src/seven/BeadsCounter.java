package seven;

public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
        return nBlue > 1 ? (nBlue-1) * 2 : 0;
    }
}