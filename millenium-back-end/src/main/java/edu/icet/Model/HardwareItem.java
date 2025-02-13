package edu.icet.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HardwareItem {
    private Long itemID;
    private String itemName;
    private Double rentalPerDay;
    private Double FinePerDay;
    private String status;
}
