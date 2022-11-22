package com.lucero.maintenance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucero.maintenance.models.maintenanceEvent;

public interface EventRepository extends JpaRepository<maintenanceEvent, Long> {
	
	maintenanceEvent findById (long id);
	List<maintenanceEvent> findByTag(String tag);
	List<maintenanceEvent> findByLocal1(String local1);
	List<maintenanceEvent> findByLocal2(String local2);
	List<maintenanceEvent> findByEquipamento(String equipamento);

}
