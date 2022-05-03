import java.util.ArrayList;

public class Planet {
    int orbitTime;
    String designation;
    ArrayList<Moon> moons;
    Planet(){
    }
    Planet(int orbitTime, String designation){
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void addMoon(Moon moon) {
        moons.add(moon);
    }
    public ArrayList<Moon> getMoons() {
        return moons;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return "Planet{" +
                "orbitTime=" + orbitTime +
                ", designation='" + designation + '\'' +
                ", moons=" + moons +
                '}';
    }

}
