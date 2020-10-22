package com.server.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
@Component
@Path("/ping")
public class HelloResource {
	private Logger logger = LogManager.getLogger(this.getClass().getName());

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGreeting() {

		logger.trace("This is a trace log example");
		logger.info("This is an info log example");
		logger.debug("This is a debug log example");
		logger.error("This is an error log example");
		logger.warn("This is a warn log example");

		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("name", "abc");
		map.put("address", "bangalore");
		return Response.ok(map).build();
	}

}
