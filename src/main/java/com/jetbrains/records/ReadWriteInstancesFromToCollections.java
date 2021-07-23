package com.jetbrains.records;

import java.util.List;

public class ReadWriteInstancesFromToCollections {

    public static void main(String[] args) {
        List<Point> points = List.of(
                new Point(12, 19),
                new Point(10, 18),
                new Point(11, 10)
        );

        System.out.println(points.contains(new Point(12, 19)));
    }
}
