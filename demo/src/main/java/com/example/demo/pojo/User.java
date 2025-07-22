package com.example.demo.pojo;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class User {
 private String userName;
 private String fullName;
 private String passWord;
 private String role;
}
