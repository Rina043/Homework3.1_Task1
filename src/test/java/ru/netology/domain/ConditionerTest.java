package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldNotChangeFields() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(-100);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(21);
        conditioner.increaseCurrentTemperature();
        assertEquals(22, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldIncreaseTemperature1()
    {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(10);
        conditioner.increaseCurrentTemperature();
        assertEquals(11, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldNotIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(19);
        conditioner.decreaseCurrentTemperature();
        assertEquals(18, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldDecreaseTemperature1() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(30);
        conditioner.decreaseCurrentTemperature();
        assertEquals(29, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotDecreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());
    }

}