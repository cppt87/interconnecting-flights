package com.ryanair.apis.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class InterconnectingFlightsUtils {

	/*
	 * REST URIs definition
	 */
	public static final String GET_INTERCONNECTIONS = "/interconnections";
	
	/*
	 * External services URIs definition
	 */
	public static final String ROUTES_ENDPOINT = "https://api.ryanair.com/core/3/routes/";
	public static final String SCHEDULES_ENDPOINT = "https://api.ryanair.com/timetable/3/schedules/{departure}/{arrival}/years/{year}/months/{month}";
	
	/*
	 * Global constants definition
	 */
	// All three characters long words (ignoring case)
	public static final String IATA_REGEXP = "^[a-zA-Z]{3}$";
	public static final String IATA_DEP_ERROR_VALIDATION_MSG = "Provided departure [%s] is not a valid IATA airport code. It must be 3 characters long";
	public static final String IATA_ARR_ERROR_VALIDATION_MSG = "Provided arrival [%s] is not a valid IATA airport code. It must be 3 characters long";
	public static final String DATE_DEP_ERROR_VALIDATION_MSG = "Departure date must be in the future";
	public static final String DATE_ARR_ERROR_VALIDATION_MSG = "Arrival date must be in the future";
	public static final int MAX_DAYS_RANGE = 5;

	/*
	 * Utility methods definition
	 */
	/**
	 * Converts a {@link Date} into {@link LocalDateTime}
	 * 
	 * @param date
	 *            {@link Date} object to be converted, not null
	 * 
	 * @return {@link LocalDateTime} version
	 */
	public static LocalDateTime dateToLocalDateTime(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	/**
	 * Converts a {@link LocalDateTime} into {@link Date}
	 * 
	 * @param localDateTime
	 *            {@link LocalDateTime} object to be converted, not null
	 * 
	 * @return {@link Date} version
	 */
	public static Date localDateTimeToDate(LocalDateTime localDateTime) {
		return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
	}
}
