package main.com.banibis.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Embedded<T>{
    public ArrayList<T> items;
}
