/**
 * 
 */
package com.acumen.iunit.resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.acumen.iunit.domain.VmCompanyProfile;
import com.acumen.iunit.service.VmCompanyProfileService;

/**
 * @author SureshKumar
 *
 */
@RestController
public class VmCompanyProfileResource {

	@Autowired
    private VmCompanyProfileService vmCompanyProfileService;

	
	@GetMapping("/getVmCompanyProfileDetails")
    public java.util.List<VmCompanyProfile> getVmCompanyProfileDetails() {
        return vmCompanyProfileService.findAll();
	}
}
