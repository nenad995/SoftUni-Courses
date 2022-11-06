package carShop;

import java.io.Serializable;

public interface Car extends Serializable {

    int TIERS = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();

}
