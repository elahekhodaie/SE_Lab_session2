public class Rectangle implements Shape{
    private float height;
    private float width;

    public Rectangle(float width, float height) {
        this.height = height;
        this.width = width;
    }

    public double computeArea() {
        return this.width * this.height;
    }


    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

}