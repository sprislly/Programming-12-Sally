public class GasPlanet extends Planet{
    boolean hasRings;
    Color color;
    GasPlanet(int orbitTime, String designation, boolean hasRings, Color color){

    }

    public boolean isHasRings() {
        return hasRings;
    }

    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        color = color;
    }

    @Override
    public String toString() {
        return "GasPlanet{" +
                "hasRings=" + hasRings +
                ", Color=" + color +
                '}';
    }
}
