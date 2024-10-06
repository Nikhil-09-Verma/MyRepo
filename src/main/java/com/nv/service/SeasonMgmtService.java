package com.nv.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service("seasonService")
public class SeasonMgmtService implements IFindSeasonService {

	@Override
	public String findSeasonName() 
	{
		LocalDate ldt= LocalDate.now();
		int month= ldt.getMonthValue();
		
		if(month<6) 
			return " Summer  Season";
		else if(month<10)
			return" Rainy season";
		else
			return" winter season";
			
		
	}

}
