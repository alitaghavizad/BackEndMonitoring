package com.example.monitoringbackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalDataRepository extends JpaRepository<TerminalData,String > {
}
