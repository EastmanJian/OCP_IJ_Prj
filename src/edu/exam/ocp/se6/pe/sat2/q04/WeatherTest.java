package edu.exam.ocp.se6.pe.sat2.q04;

/**
 * 每一个枚举值RAINY, SUNNY都有一个实例变量count, 初始化是执行了count++，所以都是1。
 */
public class WeatherTest {
    public static void main(String[] args) {
        System.out.print(Weather.RAINY.count + " " + Weather.Sunny.count + " ");
    }
}

/* ->
c c 1 1
*/