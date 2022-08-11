package com.ex.demoex.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Posts {

    @Id
    private String id;
    private String postDate;
    private User userId;
    private String details;

}
