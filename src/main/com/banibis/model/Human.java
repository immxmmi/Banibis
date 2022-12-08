package main.com.banibis.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public abstract class Human {
    @SerializedName("id")
    public int id;
}
