class Cuboid {

    private static int idGenerator = 1;
    private int cuboidID;
    private int lenght;
    private int breadth;
    private int height;

    public Cuboid(int lenght, int breadth, int height) {
        this.breadth = breadth;
        this.lenght = lenght;
        this.height = height;
        this.cuboidID = idGenerator++;

    }

    public double getSurfaceArea() {
        double totalSA = (2 * ((lenght * breadth) + (breadth * height) + (height * lenght)));

        return totalSA;

    }

    public double getVolume() {
        return lenght * breadth * height;

    }

    double getVolume(double radius) {
        double volOfSphere = 4 * (Math.PI) * radius * radius * radius / 3;

        return (lenght * breadth * height) - volOfSphere;

    }

    public int getCuboidID() {
        return cuboidID;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }

    public int getLenght() {
        return lenght;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setCuboidID(int cuboidID) {
        this.cuboidID = cuboidID;
    }
}