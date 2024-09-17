package com.nit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class EmpAddressDTO {

	private Integer eid;
    private String ename;
    private Double sal;
    private Integer aid;
    private String city;
    private String country;
    private String state;
    private String type;
}
