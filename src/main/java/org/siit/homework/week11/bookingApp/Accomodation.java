package org.siit.homework.week11.bookingApp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Accomodation {

    private int id;
    private String type;
    private String bed_type;
    private int maxGuests;
    private String description;
}