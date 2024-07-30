package Sem1;

public class HotDrinks extends Product{

    private  int volume;
    private int temperature;

    public HotDrinks(String name, int price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        return "Sem1.HotDrinks{" +
                "volume= " + volume + ", name " + getName() + "температура " + temperature +
                '}';
    }
}
