package VehicleMaintenance;

import java.time.LocalDate;

public class VehicleMain {
    public static void main(String[] args) {
        VehicleMaintenance vm = new VehicleMaintenance();
        try {
            vm.checkMaintenance(LocalDate.now().minusDays(2), 12000);
        } catch (ServiceOverdueException | InvalidMileageException e) {
            System.out.println("Maintenance alert: " + e.getMessage());
        }
    }
}