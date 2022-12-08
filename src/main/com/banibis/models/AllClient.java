package main.com.banibis.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.com.banibis.models.client.Client;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class AllClient extends AbstractElement{
    public Embedded<Client> _embedded;
}
