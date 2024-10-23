package com.pluralsight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    @DisplayName("This is initializing a room")
    public void testRoomInitialization() {
        Room room = new Room(2, 100.0, false, false);
        assertEquals(2, room.getNumberOfBeds());
        assertEquals(100.0, room.getPrice());
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
    }

    @Test
    @DisplayName("This is testing a room check in")
    public void isCheckIn(){
        Room room = new Room(2, 100, false, false);
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    @DisplayName("This is testing a room check out")
    public void isCheckOut() {
        Room room = new Room(2, 100, false, false);

        Exception e = assertThrows(Exception.class, () -> room.checkOut());
        assertFalse(room.isOccupied());
    }

    @Test
    @DisplayName("This is testing a clean room")
    public void cleanRoom() {
        Room room = new Room(2, 100, false, false);
        room.cleanroom();
        assertFalse(room.isDirty());
    }

    @Test
    @DisplayName("This is testing a is a room available")
    public void isAvailable() throws Exception {
        Room room = new Room(2, 100, false, false);
        assertTrue(room.isAvailable());
        room.checkIn();
        assertFalse(room.isAvailable());
        room.cleanroom();
        assertFalse(room.isAvailable());
        room.checkOut();
        assertTrue(room.isAvailable());
    }
}