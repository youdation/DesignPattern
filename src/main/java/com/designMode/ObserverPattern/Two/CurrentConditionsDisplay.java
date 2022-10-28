package com.designMode.ObserverPattern.Two;

import com.designMode.ObserverPattern.One.Display.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer , DisplayElement {
    Observable observable;

    private float temperature;

    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = (float) arg;
            display();
        }
    }
    public void display(){
        System.out.println("Current Conditions"+temperature +"F degree and" +humidity +"humidity");
    }
}
