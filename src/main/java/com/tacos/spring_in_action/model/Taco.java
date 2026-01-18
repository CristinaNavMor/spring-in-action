package com.tacos.spring_in_action.model;

import lombok.Data;
import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;

}
