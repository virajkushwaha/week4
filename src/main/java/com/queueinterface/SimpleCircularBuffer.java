package com.queueinterface;

public class SimpleCircularBuffer {
    //INstance variable
    private int[] buffer;
    private int head;
    private int tail;
    private int capacity;

    // Constructor to initialize the buffer
    public SimpleCircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
    }

    // Add an element to the buffer
    public void add(int value) {
        // Add the element
        buffer[tail] = value;
        // Move the tail to the next position
        tail = (tail + 1) % capacity;

        // If the buffer is full, move the head to overwrite the oldest element
        if (tail == head) {
            head = (head + 1) % capacity;
        }
    }

    // Print the buffer contents in order
    public void printBuffer() {
        int index = head;
        System.out.print("Buffer: [");
        for (int i = 0; i < capacity; i++) {
            System.out.print(buffer[index]);
            index = (index + 1) % capacity;
            if (i != capacity - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        SimpleCircularBuffer buffer = new SimpleCircularBuffer(3);

        // Insert elements
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.printBuffer();

        // Add more elements to overwrite the oldest
        buffer.add(4);
        buffer.printBuffer();

        buffer.add(5);
        buffer.printBuffer();

        buffer.add(6);
        buffer.printBuffer();
    }
}

