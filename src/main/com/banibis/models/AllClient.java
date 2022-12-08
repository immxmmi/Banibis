package main.com.banibis.models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class AllClient extends AbstractElementList implements Printer {
    @SerializedName("_embedded")
    public Embedded<Client> embedded;
    @Override
    public void printClass() {
        embedded.getItems().forEach((client) -> client.printClass());
    }


}
