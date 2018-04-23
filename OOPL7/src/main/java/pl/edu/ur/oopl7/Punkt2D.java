/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Random;

/**
 *
 * @author Kasia
 */
public class Punkt2D {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;

    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    Random r = new Random();

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double Random() {
        double q = (r.nextDouble() - 0.5) * 20;
        q = q * 1000;
        q = Math.round(q);
        q = q / 1000;
        System.out.println(q);
        return q;
    }

    @Override
    public String toString() {
        return "X: " + getX() + "Y: " + getY();
    }
}
