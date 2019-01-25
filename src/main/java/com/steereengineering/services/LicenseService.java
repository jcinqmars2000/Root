package com.steereengineering.services;

import java.util.Set;

import com.steereengineering.model.License;

public interface LicenseService {
	
    	public String getHost();
		public String getPort();
		Set<License> getLicenseList();
		Set<License> getVendorLicenses(Long vender_id);
		License findById(Long l);
		void deleteById(Long idToDelete);

}
