package com.server.app.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.server.app.model.UserProfileModel;
import com.server.app.service.UserService;

@Component
@Path("/user")
public class UserController {

	private Logger logger = LogManager.getLogger(this.getClass().getName());
	@Autowired
	private UserService userService;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/save")
	public Response saveUser(UserProfileModel user) {
		userService.saveUser(user);
		logger.debug("User Saved In DB");
		return Response.status(Status.CREATED).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public Response getUserList() {
		List<UserProfileModel> lisUsers = userService.getUserList();
		logger.debug("User Saved In DB");
		return Response.status(Status.OK).entity(lisUsers).build();
	}
}
