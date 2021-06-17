package com.example.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class catIn {
    String catID;
    String catCategoryName;
    String employName;
    int age;
    String gender;
    String itemsName;
    String costumeType;
    String insectTime;
    String vaccinationTime;
    String isHealth;
}
