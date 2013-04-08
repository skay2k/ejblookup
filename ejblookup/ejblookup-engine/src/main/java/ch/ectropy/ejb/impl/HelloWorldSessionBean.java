package ch.ectropy.ejb.impl;

import java.security.Principal;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Remote;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import ch.ectropy.poc.ejb.HelloWorldSessionBeanRemote;

/**
 * Session Bean implementation class HelloWorldSessionBean
 */
@Stateless
@Remote(HelloWorldSessionBeanRemote.class)
public class HelloWorldSessionBean implements HelloWorldSessionBeanRemote {
	@Resource
	private SessionContext sessionContext;

	/**
	 * Default constructor.
	 */
	public HelloWorldSessionBean() {
		// TODO Auto-generated constructor stub
	}

	@RolesAllowed("guest")
	public String sayHelloCheckRole(String txt) {
		return sayHello(txt);
	}

	public String sayHello(String txt) {
		Principal p = sessionContext.getCallerPrincipal();
		return "Hello " + ((p == null) ? "null" : p.getName()) + ", " + txt;
	}

}
