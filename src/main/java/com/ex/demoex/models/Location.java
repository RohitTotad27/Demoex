package com.ex.demoex.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
//@NoArgsConstructor
@AllArgsConstructor
public class Location {

//    @Id
    private String id;
    private String name;


}
