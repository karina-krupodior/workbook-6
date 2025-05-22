package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a list of people
        people.add(new Person("Emma", "Johnson", 25));
        people.add(new Person("Liam", "Smith", 32));
        people.add(new Person("Olivia", "Brown", 19));
        people.add(new Person("Noah", "Jones", 41));
        people.add(new Person("Ava", "Garcia", 28));
        people.add(new Person("Elijah", "Martinez", 35));
        people.add(new Person("Sophia", "Davis", 22));
        people.add(new Person("James", "Rodriguez", 30));
        people.add(new Person("Isabella", "Lopez", 27));
        people.add(new Person("Benjamin", "Gonzalez", 18));

        // Step 2: Prompt user for a name
        System.out.print("Enter a first or last name to search: ");
        String nameToSearch = scanner.nextLine().toLowerCase();

        List<Person> matchedPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().toLowerCase().equals(nameToSearch) ||
                    person.getLastName().toLowerCase().equals(nameToSearch)) {
                matchedPeople.add(person);
            }
        }

        if (matchedPeople.isEmpty()) {
            System.out.println("No people found with the name: " + nameToSearch);
        } else {
            System.out.println("Matching people:");
            for (Person p : matchedPeople) {
                System.out.println(p);
            }
        }

        // Step 3: Calculate average, min, and max age
        if (!people.isEmpty()) {
            int totalAge = 0;
            int minAge = people.get(0).getAge();
            int maxAge = people.get(0).getAge();

            for (Person person : people) {
                int age = person.getAge();
                totalAge += age;
                if (age < minAge) minAge = age;
                if (age > maxAge) maxAge = age;
            }

            double averageAge = (double) totalAge / people.size();

            System.out.printf("Average age: %.2f%n", averageAge);
            System.out.println("Youngest person age: " + minAge);
            System.out.println("Oldest person age: " + maxAge);
        }

        scanner.close();
    }
}
