package com.hoaxify.ws.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Table(name="users")
@Data
public class User {

@Id
@GeneratedValue
    private long id;
@NotNull
@Size(min = 4, max=255)
@UniqueUsername
    private String username;
@NotNull
@Size(min = 4, max=255)
    private String displayName;

@NotNull
@Size(min = 4, max=255)
//@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$")
    private String password;
}
