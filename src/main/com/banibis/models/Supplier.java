package main.com.banibis.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import main.com.banibis.models.AbstractHuman;
import main.com.banibis.models.Logo;

@Data
public class Supplier extends AbstractHuman {
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

    @Override
    public String toString() {
        return "Supplier{" +
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
                ", paypalEmail='" + paypalEmail + '\'' +
                ", businessId='" + businessId + '\'' +
                ", vatPayer=" + vatPayer +
                ", registered='" + registered + '\'' +
                ", logo=" + logo +
                '}';
    }
}