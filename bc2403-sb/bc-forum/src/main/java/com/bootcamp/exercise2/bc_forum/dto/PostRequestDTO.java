package com.bootcamp.exercise2.bc_forum.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PostRequestDTO {
 private String title;
 private String body;
}
