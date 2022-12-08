package main.com.banibis.models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.com.banibis.models.client.Client;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class AllClient extends AbstractElementList implements Printer {
    @SerializedName("_embedded")
    public Embedded<Client> embedded;

    @Override
    public void printClass() {
        System.out.println(this.embedded.getItems().get(0));
        System.out.println("allClient");
    }
}
