package main.com.banibis.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import main.com.banibis.models.client.ShippingClient;

@Data
public class AllDocuments extends AbstractElementList {
    @SerializedName("_embedded")
    public Embedded<ShippingClient> embedded;
    @Override
    public void printClass() {
        System.out.println("allDocuments");
    }
}
