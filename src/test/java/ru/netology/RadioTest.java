package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(5, 9, 0, 10,100,0);

    @Test
    void increaseCurrentStation() {
        radio.setCurrentStation(radio.getMaxStation());
        radio.increaseCurrentStation();
        assertEquals(radio.getMinStation(),radio.getCurrentStation());
        radio.increaseCurrentStation();
        assertEquals(1,radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStation() {
        radio.setCurrentStation(radio.getMinStation());
        radio.decreaseCurrentStation();
        assertEquals(radio.getMaxStation(),radio.getCurrentStation());
        radio.decreaseCurrentStation();
        assertEquals(8,radio.getCurrentStation());
    }

    @Test
    void increaseCurrentVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseCurrentVolume();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseCurrentVolume();
        assertEquals(radio.getMinVolume(),radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        assertEquals(4,radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolume() {
        radio.setCurrentVolume(101);
        assertEquals(10, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void setCurrentStation() {
        radio.setCurrentStation(11);
        assertEquals(5, radio.getCurrentStation());
        radio.setCurrentStation(-1);
        assertEquals(5, radio.getCurrentStation());
    }
}