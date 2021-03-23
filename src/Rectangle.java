public class Rectangle implements Shape{
    private double height;
    private double width;

    public Rectangle(float width, float height) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public double computeArea() {
        return getWidth() * getHeight();
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

}