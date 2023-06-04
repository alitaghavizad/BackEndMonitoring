package com.example.monitoringbackend;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PinPadDto {
    public String terminalId;
    public String actualTerminalId;
    public String branch;
    public String location;
    public String address;
    public String contactPerson;
    public String contactEmail;
    public String city;
    public String linkedUserCode;
}
