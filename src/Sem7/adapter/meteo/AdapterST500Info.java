package Sem7.adapter.meteo;

import java.time.LocalDateTime;

public class AdapterST500Info implements MeteoSensor {
    private SensorTemperature adapte;

    public AdapterST500Info(SensorTemperature adapte) {
        this.adapte = adapte;
    }

    @Override
    public int getId() {
        return adapte.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) adapte.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime date = LocalDateTime.of(adapte.year(),1,1,0,0);
        date = date.plusDays(adapte.day() - 1);
        date = date.plusDays(adapte.second());
        return date;
    }
}
