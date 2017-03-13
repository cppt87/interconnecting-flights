package com.ryanair.apis.services;

import com.ryanair.apis.models.RyanairRouteResource;
import com.ryanair.apis.models.RyanairScheduleResource;

public interface IRyanairAPIsService {
	/*
	 * returns a list of all available routes based on the airport's IATA codes
	 */
	RyanairRouteResource[] routesAPI();

	/*
	 * returns a list of available flights for a given departure airport IATA
	 * code, an arrival airport IATA code, a year and a month
	 */
	RyanairScheduleResource schedulesAPI(String departure, String arrival, int year, int month);
}