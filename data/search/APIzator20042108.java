package com.stackoverflow.api;

/**
 * Java: Integer division round up
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20042108">https://stackoverflow.com/a/20042108</a>
 */
public class APIzator20042108 {

  public static void java(
    int totalRooms,
    int totalRoomsOccupied,
    double roomsOccPercentage
  ) throws Exception {
    roomsOccPercentage = (totalRoomsOccupied * 100.0) / totalRooms;
  }
}
