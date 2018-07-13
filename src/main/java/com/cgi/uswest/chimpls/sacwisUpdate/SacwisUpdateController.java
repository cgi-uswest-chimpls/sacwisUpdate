package com.cgi.uswest.chimpls.sacwisUpdate;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller 
@RequestMapping(path="/sacwisupdate")
public class SacwisUpdateController {
	@Autowired
	
	private SacwisUpdateRepository sacwisUpdateRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewSacwisUpdate (
			//@RequestParam BigDecimal id_sacwis_update,
			@RequestParam BigDecimal id_grp,
			@RequestParam String cd_grp,
			@RequestParam BigDecimal cd_type,
			@RequestParam String tx_update,
			@RequestParam BigDecimal id_cr,
			@RequestParam String cd_stat
			) {
		
		SacwisUpdate n = new SacwisUpdate();
		n.setId_grp(id_grp);
		n.setCd_grp(cd_grp);
		n.setCd_type(cd_type);
		n.setTx_update(tx_update);
		n.setId_cr(id_cr);
		
		Date date = new Date();
		n.setTs_cr(new Timestamp(date.getTime()));
		
		n.setCd_stat(cd_stat);
		
		sacwisUpdateRepository.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<SacwisUpdate> getAllSacwisUpdates() {
		// This returns a JSON or XML with the users
		return sacwisUpdateRepository.findAll();
	}
	
	@GetMapping(path="/delete")
	public @ResponseBody String deleteSacwisUpdates(@RequestParam BigDecimal id_sacwis_update) {
		// This returns a JSON or XML with the users
		sacwisUpdateRepository.deleteById(id_sacwis_update);
		return "Deleted Record Id: " +id_sacwis_update;
	}
}
