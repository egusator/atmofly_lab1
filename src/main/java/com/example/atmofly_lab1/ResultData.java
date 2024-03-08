package com.example.atmofly_lab1;

public class ResultData {
    private double timeStep;

    private double maxHeight;

    private double distance;

    private double speed;

    public double getTimeStep() {
        return timeStep;
    }

    public void setTimeStep(double timeStep) {
        this.timeStep = timeStep;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public ResultData(double timeStep, double distance, double maxHeight, double speed) {
        this.timeStep = timeStep;
        this.distance = distance;
        this.maxHeight = maxHeight;
        this.speed = speed;
    }
}
