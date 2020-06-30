package ru.netology;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation > this.maxStation){
            return;
        }
        if(currentStation < this.minStation){
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void increaseCurrentStation() {
        if(this.currentStation == this.maxStation) {
          this.currentStation = this.minStation;
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

    public int getCurrentVolume() {
        return currentVolume;
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

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }


    public void increaseCurrentVolume() {
        if(this.currentVolume == this.maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseCurrentVolume(){
        if(this.currentVolume == this.minVolume){
            return;
        }
        currentVolume--;
    }

}