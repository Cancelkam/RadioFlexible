package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public void setCurrentStation(int currentStation) {
        if(currentStation > this.maxStation){
            return;
        }
        if(currentStation < this.minStation){
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseCurrentStation() {
        if(currentStation == maxStation) {
          currentStation = minStation;
          return;
        }
        currentStation++;
    }

    public void decreaseCurrentStation() {
        if(currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void setCurrentVolume(int currentVolume) {
        if(currentVolume > this.maxVolume) {
            return;
        }
        if(currentVolume < this.minVolume){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        if(currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseCurrentVolume(){
        if(currentVolume == minVolume){
            return;
        }
        currentVolume--;
    }
}