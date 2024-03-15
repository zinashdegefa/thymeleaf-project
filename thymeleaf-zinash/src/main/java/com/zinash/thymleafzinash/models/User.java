package com.zinash.thymleafzinash.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Component
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String role;
}
