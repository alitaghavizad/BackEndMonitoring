package com.example.monitoringbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AppController {
    @Autowired
    public TerminalDataRepository terminalDataRepository;

    @Autowired
    public PinPadRepository pinPadRepository;

    @GetMapping("/populate")
    public void populate(){
        TerminalData terminalData = new TerminalData("1007","127.0.0.1","shiraz","true","Y");
        terminalDataRepository.save(terminalData);
        terminalData = new TerminalData("1003","127.1.0.2","karaj","false","N");
        terminalDataRepository.save(terminalData);
        terminalData = new TerminalData("1002","127.1.0.3","tabriz","true","N");
        terminalDataRepository.save(terminalData);
    }

    @GetMapping("/atm/monitoring/doMonitor")
    public TerminalDataList doMonitor(){
        List<TerminalData> terminalDataList = terminalDataRepository.findAll();
        TerminalDataList terminalDataList1 = new TerminalDataList(terminalDataList);
        return terminalDataList1;
    }

    @PostMapping("/general/add/pinPad")
    public void addPinPad(@RequestBody PinPadDto request){
        PinPad pinPad = new PinPad(request.getTerminalId(),
                request.getActualTerminalId(), request.getBranch(),
                request.getLocation(), request.getAddress(), request.getContactPerson(),
                request.getContactEmail(), request.getCity(), request.getLinkedUserCode());
        pinPadRepository.save(pinPad);

    }
}
