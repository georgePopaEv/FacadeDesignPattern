public class Amplifier {
    String description;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on(){
        System.out.println(description + " on");
    }

    public void off(){
        System.out.println(description + " off");
    }

    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }

    public void setSurroundSound() {
        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level){
        System.out.println(description + " setting volume to " + level);
    }

    @Override
    public String toString() {
        return description;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public void setCd(CdPlayer cd) {
        this.cd = cd;
    }
}
