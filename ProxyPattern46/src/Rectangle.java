/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Rectangle implements IShape{

    @Override
    public void draw() {
        System.out.println("Rectangle drawn ");
    }

    @Override
    public void print() {
        System.out.println("Rectangle printed ");
    }

    @Override
    public void move() {
        System.out.println("Rectangle moved ");
    }

    @Override
    public void resize() {
        System.out.println("Rectangle resized ");
    }
    
}
