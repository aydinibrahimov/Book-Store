package com.aydin.bookstore.auth.dto;

import com.aydin.bookstore.model.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @NotNull
    private String name;
    private int age;
    private String role;
    @Email
    @NotNull
    private String email;
    @Size(min = 8, max = 21)
    private String password;
}
