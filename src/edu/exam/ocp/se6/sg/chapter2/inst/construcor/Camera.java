package edu.exam.ocp.se6.sg.chapter2.inst.construcor;

/**
 * Example of constructor
 * Method can have the same name as Constructor, but it should have return value
 */
public class Camera {
    public int imageCount;

    public Camera() {
        System.out.println("Inside no-arg constructor");
    }

    //The following is not a constructor. It is a method.
    public void Camera(int imageCount) {
        this.imageCount = imageCount;
    }

    public static void main(String[] args) {
        Camera c = new Camera();
//        Camera c = new Camera(60); //compile error
    }
}