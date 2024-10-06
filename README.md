# Dice Roller Simulation

This is a simple dice simulation application written in Java. It simulates the rolling of two dice 1,000 times, calculates the sum of their face values, and generates a histogram to display the frequency of each possible sum (from 2 to 12).

## Features

- **Simulates 1,000 dice rolls**: Two dice are rolled 1,000 times, and the sum of the face values is calculated and stored.
- **Histogram Generation**: The program generates a simple text-based histogram showing the frequency of each sum (2 to 12).
- **Graphical Output**: The frequency of sums is displayed in a visual format for easy understanding.
  
## How It Works

1. **Dice Simulation**:
   - The program uses a `Dice` class that holds two `Die` objects, each representing a single die.
   - Each die is rolled, and the sum of the two dice is calculated.
  
2. **Data Collection**:
   - The dice are rolled 1,000 times, and each sum (from 2 to 12) is stored in an array.

3. **Histogram Generation**:
   - After collecting the results of all dice rolls, the program counts the occurrences of each possible sum (2 to 12).
   - The counts are used to create a text-based histogram.

4. **Graph Output**:
   - The program prints a simple graph showing the number of times each sum was rolled using asterisks (`*`) to visually represent the frequency.

## Sample Output

<p align="center">
  <img src="https://i.gyazo.com/0b23f3d3f12a6cde783f7d8457c0bc70.png" alt="Image from Gyazo" width="299"/>
</p>

## Technologies Used

- **Java**: The core programming language used for developing this dice simulation.
- **Random Class**: Used to simulate the dice rolls.
  
## Class Structure

1. **Die Class**:
   - Simulates a single die, with methods to roll the die and get the face value.

2. **Dice Class**:
   - Holds two `Die` objects and calculates the sum of their face values.

3. **Main Class**:
   - Runs the simulation, generates the histogram, and prints the graph to the console.

## How to Run

To run, follow these steps:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/danrmzz/dice-roller-simulation.git
   cd dice-roller-simulation
   ```

2. **Compile and run the Java program**:
   ```bash
   javac Main.java
   java Main
   ```




