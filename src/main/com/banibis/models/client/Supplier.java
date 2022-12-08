package main.com.banibis.models;

import lombok.Data;
import main.com.banibis.models.client.Human;

@Data
public class Supplier extends Human {
    private String street2;
    private String province;
    private String paypal_email;
    private String business_id;
    private int vat_payer;
    private String registered;
    private Logo logo;
}