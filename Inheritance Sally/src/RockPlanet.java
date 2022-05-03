public class RockPlanet extends Planet{
    boolean habitable;
    RockPlanet(boolean habitable, int orbitTime, String designation){
        this.habitable = habitable;
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
