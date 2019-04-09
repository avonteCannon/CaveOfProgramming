package pcAssignment;

public class Dimension {

    public int width;
    public int height;
    public int depth;

    public Dimension(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
