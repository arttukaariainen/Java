public class Point {
    private int x;
    private int y;
    private int minX = 0;
    private int minY = 0;
    private int maxX = 640;
    private int maxY = 480;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int minX, int minY, int maxX, int maxY){
        this.x = x;
        this. y = y;
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void set(int x, int y){
        this.x = x < minX ? minX : (x > maxX ? maxX : x);
        this.y = y < minY ? minY : (x > maxY ? maxY : y);
    }

    public void move(int x, int y){
        set(x+this.x, y+this.y);
    }

    public String info(){
        return "(x= " + this.x + ",y= " + this.y + ")";
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getMinX() {
        return this.minX;
    }

    public int getMinY() {
        return this.minY;
    }

    public int getMaxX() {
        return this.maxX;
    }

    public int getMaxY() {
        return this.maxY;
    }
}
