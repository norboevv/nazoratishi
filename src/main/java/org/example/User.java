package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class User {
    List<User> users = new ArrayList<>();
    private String name;
    private int age;
    private int phone;
    private String email;
}
