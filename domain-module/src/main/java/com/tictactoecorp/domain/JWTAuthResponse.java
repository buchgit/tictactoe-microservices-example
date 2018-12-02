package com.tictactoecorp.domain;

import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JWTAuthResponse {
  private String token;
  private String username;
}