package com.pluralsight.collection;

import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // should fail
        System.out.println("Number of items in numbers: " + numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        // dates.add(15); // ❌ This line would cause a compile-time error (15 is not a LocalDate)
        dates.add(LocalDate.of(2024, 12, 25)); // Should fail due to limit
        System.out.println("Number of items in dates: " + dates.getItems().size());
    }
}
