package org.example;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void sort() {
        assertEquals("Jane Doe,Jane Dane,David Goodman,Mark Rose",
                Student.sort(Student.getStudents()));

    }
}