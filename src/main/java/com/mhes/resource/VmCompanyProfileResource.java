/**
 * 
 */
package com.mhes.resource;
import com.mhes.domain.VmCompanyProfile;
import com.mhes.service.VmCompanyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
