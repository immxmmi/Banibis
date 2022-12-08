package main.com.banibis.models;

import lombok.Data;
import main.com.banibis.models.client.Shipping;

@Data
public class AllDocuments extends AbstractElement{
    public Embedded<Shipping> _embedded;
}
