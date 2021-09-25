package Example_7_1;

import java.util.Calendar;

public class SanStation {
    private String organizationName;

    public SanStation(String organizationName) {
        super();
        this.organizationName = organizationName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void check(SanitaryStation ss) {
        if (ss.getExpiryDate() < Calendar.getInstance().get(Calendar.YEAR)) {
            System.out.println("Expiry date of your product has come");
        } else {
            System.out.println("Your good pass");
        }
    }
}
