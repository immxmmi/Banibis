package main.com.banibis.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AllDocuments extends AbstractElementList implements Printer{
    @SerializedName("_embedded")
    public Embedded<ShippingClient> embedded;
    @Override
    public void printClass() {
        System.out.println(this);
    }

}
