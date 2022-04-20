public class Moon {
    boolean atmosphere;
    String designation;
    Planet planet;
    int orbitTime;
    Moon(Planet planet, int orbitTime, boolean atmosphere, String designation){
    }

    public String getDesignation() {

        return designation;
    }

    public void setDesignation(String designation) {

        this.designation = designation;
    }

    public Planet getPlanet() {

        return planet;
    }

    public void setPlanet(Planet planet) {

        this.planet = planet;
    }

    public int getOrbitTime() {

        return orbitTime;
    }

}
