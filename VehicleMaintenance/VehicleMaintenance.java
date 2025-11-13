package VehicleMaintenance;

import java.time.LocalDate;

public class VehicleMaintenance {
    public void checkMaintenance(LocalDate serviceDueDate, int mileage) 
            throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) throw new InvalidMileageException("Mileage cannot be negative.");
        if (LocalDate.now().isAfter(serviceDueDate)) {
            throw new ServiceOverdueException("Service is overdue since " + serviceDueDate);
        }
        System.out.println("Maintenance status: OK.");
    }
}