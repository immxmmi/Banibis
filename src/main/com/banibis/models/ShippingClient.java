package main.com.banibis.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ShippingClient extends Client{
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

    @Override
    public String toString() {
        return "ShippingClient{" +
                ", id=" + id +
                ", country='" + country + '\'' +
                ", company='" + company + '\'' +
                ", fullname='" + fullname + '\'' +
                ", street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", fax='" + fax + '\'' +
                ", web='" + web + '\'' +
                ", email='" + email + '\'' +
                ", taxId='" + taxId + '\'' +
                ", vatId='" + vatId + '\'' +
                ", modified=" + modified +
                "street2='" + street2 + '\'' +
                ", province='" + province + '\'' +
                ", shippingCompany='" + shippingCompany + '\'' +
                ", shippingName='" + shippingName + '\'' +
                ", shippingSurname='" + shippingSurname + '\'' +
                ", shippingFullname='" + shippingFullname + '\'' +
                ", shippingStreet='" + shippingStreet + '\'' +
                ", shippingStreet2='" + shippingStreet2 + '\'' +
                ", shippingZip='" + shippingZip + '\'' +
                ", shippingCity='" + shippingCity + '\'' +
                ", shippingProvince='" + shippingProvince + '\'' +
                ", shippingCountry='" + shippingCountry + '\'' +
                ", ratings='" + ratings + '\'' +
                ", degree='" + degree + '\'' +
                ", salutation='" + salutation + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", created=" + created +
                ", note='" + note + '\'' +
                ", comId='" + comId + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", invoices=" + invoices +
                ", expenses=" + expenses +
                ", documents=" + documents +
                '}';
    }
}


