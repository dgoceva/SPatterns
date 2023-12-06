/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.*;
/**
 * Class Client6.
 * Interacts with a Rectangle Shape through a dynamically
 * generated proxy and a Generic Logger.
 */
public class Client6 {
  public static void main(String[] args) {
    IShape rect = new Rectangle();
    ClassLoader cl = IShape.class.getClassLoader();
    IShape s = (IShape) Proxy.newProxyInstance(cl,
      new Class[] {IShape.class}, new GenericLogger(rect));
    s.draw();
    s.move();
    s.resize();
  }
}
