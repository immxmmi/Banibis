package main.com.banibis.models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Logo {
    @SerializedName("_links")
    public Links links;
    @SerializedName("href")
    public String href;
}
