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

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
