package seven;

public class Block {
    private final int width;
    private final int length;
    private final int height;
    private final int volume;
    private final int surfaceArea;

    public Block(int[] sides) {
        this.width = sides[0];
        this.length = sides[1];
        this.height = sides[2];
        this.volume = this.width * this.length * this.height;
        this.surfaceArea = (this.length * this.width + this.width * this.height + this.length * this.height) * 2;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return volume;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }
}