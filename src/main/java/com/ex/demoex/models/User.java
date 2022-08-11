package com.ex.demoex.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;
import org.springframework.data.annotation.Id;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    private String id;
    private String Firstname;
    private String Lastname;
    private Location location;
    private String email_id;

}
