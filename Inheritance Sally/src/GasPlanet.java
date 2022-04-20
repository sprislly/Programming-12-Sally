public class GasPlanet extends Planet{
    boolean hasRings;
    Color Color;
    int;


    GasPlanet(int, String, boolean, Color){

    }

    public boolean isHasRings() {
        return hasRings;
    }

    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "GasPlanet{" +
                "hasRings=" + hasRings +
                ", Color=" + Color +
                '}';
    }
}
