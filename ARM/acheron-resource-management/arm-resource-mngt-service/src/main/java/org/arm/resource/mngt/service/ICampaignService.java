package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Campaign;
import org.arm.resource.mngt.exception.CampaignNotFoundException;
import org.hibernate.ObjectNotFoundException;

public interface ICampaignService {

	public List<Campaign> getAllCampaign();

	public void createCampaign(Campaign campaign);

	public Campaign findById(int l) throws ObjectNotFoundException;
	
	List<Campaign> getAllResourcesCampaignDetails();
	
	List<Campaign> getByRegion(String region) throws CampaignNotFoundException;
}
