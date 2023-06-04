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
@Entity(name = "TERMINAL_DATA")
public class TerminalData {
    @Id
    @Column(name = "TERMINAL_ID")
    private String terminalId;
    @Column(name = "TERMINAL_IP")
    private String terminalIp;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "IS_CONNECTED")
    private String IsConnected;
    @Column(name = "LOGON_STATUS")
    private String logonStatus;

}
