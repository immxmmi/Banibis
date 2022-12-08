package main.com.banibis.models.client;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import main.com.banibis.models.Logo;

@Data
public class Supplier extends Human {
    @SerializedName("street2")
    private String street2;
    @SerializedName("province")
    private String province;
    @SerializedName("paypal_email")
    private String paypalEmail;
    @SerializedName("business_id")
    private String businessId;
    @SerializedName("vat_payer")
    private int vatPayer;
    @SerializedName("registered")
    private String registered;
    @SerializedName("logo")
    private Logo logo;
}