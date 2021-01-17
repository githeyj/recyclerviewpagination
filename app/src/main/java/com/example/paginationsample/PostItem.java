package com.example.paginationsample;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PostItem {
    private String description;
    private String time;
    private String title;
}
