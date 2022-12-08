package main.com.banibis.models.client;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ShippingClient extends Client {
    @SerializedName("street2")
    private String street2;
    @SerializedName("province")
    private String province;
    @SerializedName("shipping_company")
    private String shippingCompany;
    @SerializedName("shipping_name")
    private String shippingName;
    @SerializedName("shipping_surname")
    private String shippingSurname;
    @SerializedName("shipping_fullname")
    private String shippingFullname;
    @SerializedName("shipping_street")
    private String shippingStreet;
    @SerializedName("shipping_street2")
    private String shippingStreet2;
    @SerializedName("shipping_zip")
    private String shippingZip;
    @SerializedName("shipping_city")
    private String shippingCity;
    @SerializedName("shipping_province")
    private String shippingProvince;
    @SerializedName("shipping_country")
    private String shippingCountry;
    @SerializedName("ratings")
    private String ratings;
}