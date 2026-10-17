
package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.FurnitureRental;

public interface FurnitureRentalService
{
    FurnitureRental addFurnitureRental(FurnitureRental furnitureRental);

    List<FurnitureRental> displayAllFurnitureRentals();

    String deleteFurnitureRentalById(Long id);
}
