public class Rectangle {
    private int width;
    private int height;     

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getSquare() {
        return width * height;
    }
    // getter
    public int getWidth() {
        return this.width;
    }
    // setter
    public void setWidth(int width) {
        this.width = width;
    }
    // getter
    public int getHeight() {
        return this.height;
    }
    // setter
    public void setHeight(int height) {
        this.height = height;
    }
}
