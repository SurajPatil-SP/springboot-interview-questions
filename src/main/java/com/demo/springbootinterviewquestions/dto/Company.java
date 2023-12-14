package com.demo.springbootinterviewquestions.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    public String name;
    public String catchPhrase;
    public String bs;
}
