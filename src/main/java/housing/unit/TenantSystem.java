package housing.unit;

import java.util.logging.Logger;

public class TenantSystem {
    private static final Logger logger = Logger.getLogger(TenantClass.class.getName());

	public static void viewAvailableHousing() {
	HousingSystem.printData(MyData.getAvilableHousing());
	}


	public static void book() {
		HousingUnit unit =HousingSystem.FindHouse(MyData.getAvilableHousing());
		int index=MyData.HousingUnitList.indexOf(unit);
		 MyData.HousingUnitList.get(index).setReservedFlag(true);
		MyData.addReservationsList(unit);
		logger.info("The house is booked");
	}


	
	
	
	
}
