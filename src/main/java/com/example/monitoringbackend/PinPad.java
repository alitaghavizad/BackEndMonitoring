package com.example.monitoringbackend;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PIN_PAD")
public class PinPad {
    @Id
    @Column(name = "TERMINAL_ID")
    public String terminalId;

    @Column(name = "ACTUAL_TERMINAL_ID")
    public String actualTerminalId;

    @Column(name = "BRANCH")
    public String branch;

    @Column(name = "LOCATION")
    public String location;

    @Column(name = "ADDRESS")
    public String address;

    @Column(name = "CONTACT_PERSON")
    public String contactPerson;

    @Column(name = "CONTACT_EMAIL")
    public String contactEmail;

    @Column(name = "CITY")
    public String city;

    @Column(name = "LINKED_USER_CODE")
    public String linkedUserCode;
}
