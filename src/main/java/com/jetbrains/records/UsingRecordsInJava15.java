package com.jetbrains.records;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UsingRecordsInJava15 {
    public void createLocalInterface() {
        interface LocalInterface { }
    }

    public void createLocalEnum() {
        enum Color {RED, YELLOW, BLUE}
    }

    List<String> getTopPerformingStocks(List<Stock> allStocks, LocalDateTime dateTime) {
        record TopStock(Stock stock, double value) {
        }

        return allStocks.stream()
                        .map(s -> new TopStock(s, getStockValue(s, dateTime)))
                        .sorted(Comparator.comparingDouble(TopStock::value).reversed())
                        .limit(2)
                        .map(s -> s.stock().name())
                        .collect(Collectors.toList());
    }

    public double getStockValue(Stock stock, LocalDateTime dateTime) {
        // To do:
        // connect to an online data source and retrieve stock value
        return 100.00;
    }

    private Set<Pen> filterForPenWithFiveOrders(List<Pen> pens) {
        // Local Records
        record PenAndOrders(Pen pen, List<Pen> orders) { }
        return null;
    }

    private List<Pen> getOrdersFor(Pen pen) {
        return List.of(new Pen("Apsara", 20), new Pen("Camlin", 10));
    }
}

record Stock(String name, double value){ }

class Pen {
    String name;
    double length;

    public Pen(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
