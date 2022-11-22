package com.lucero.maintenance.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.lucero.maintenance.models.maintenanceEvent;
import com.lucero.maintenance.repository.EventRepository;

@RestController
@RequestMapping(value = "/api")
public class maintenanceEventResource {
	
	
	@Autowired
	EventRepository eventRepository;
	
	@GetMapping("/events")
	public List<maintenanceEvent> listOfEvents(){
		return eventRepository.findAll();
	}
	
	@GetMapping("/event/{id}")
	public maintenanceEvent listOfEvent(@PathVariable(value="id") long id) { 
			return eventRepository.findById(id);
	}
	
	@GetMapping("/event/tag/{tag}")
	public List<maintenanceEvent> listOfEventByTag (@PathVariable(value="tag") String tag) {
		return eventRepository.findByTag(tag);
	}
	
	
	@GetMapping("/event/local1/{local1}")
	public List<maintenanceEvent> listOfRequiredLocal1(@PathVariable(value="local1") String local1){
		return eventRepository.findByLocal1(local1);
		
	}

	@GetMapping("/event/local2/{local2}")
	public List<maintenanceEvent> listOfRequiredLocal2(@PathVariable(value="local2") String local2){
		return eventRepository.findByLocal2(local2);
	}
	
	@GetMapping("/event/equipamento/{equipamento}")
	public List<maintenanceEvent> listOfRequiredEquipment(@PathVariable(value="equipamento")String equipamento){
			return eventRepository.findByEquipamento(equipamento);
		
	}

	
	
	@PostMapping("/event")
	public maintenanceEvent RegisterEvent (@RequestBody maintenanceEvent event) {
		System.out.println("Event Registered");
		return eventRepository.save(event);
		
	}
	
	
	
	
}

