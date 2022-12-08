package main.com.banibis.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Date;
@Data
public abstract class AbstractHuman {
    @SerializedName("id")
    protected int id;
    @SerializedName("country")
    protected String country;
    @SerializedName("company")
    protected String company;
    @SerializedName("fullname")
    protected String fullname;
    @SerializedName("street")
    protected String street;
    @SerializedName("zip")
    protected String zip;
    @SerializedName("city")
    protected String city;
    @SerializedName("phone")
    protected String phone;
    @SerializedName("mobile")
    protected String mobile;
    @SerializedName("fax")
    protected String fax;
    @SerializedName("web")
    protected String web;
    @SerializedName("email")
    protected String email;
    @SerializedName("tax_id")
    protected String taxId;
    @SerializedName("vat_id")
    protected String vatId;
    @SerializedName("modified")
    protected Date modified;

}
