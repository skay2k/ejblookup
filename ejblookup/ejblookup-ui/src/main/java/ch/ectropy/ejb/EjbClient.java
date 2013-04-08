package ch.ectropy.ejb;

import java.util.Properties;

import javax.naming.InitialContext;

import ch.ectropy.poc.ejb.HelloWorldSessionBeanRemote;

public class EjbClient {
	private String backendModuleName = "ejblookup-engine";

	public HelloWorldSessionBeanRemote getRemote() throws Exception {
		Properties p = new Properties();
		// p.put("java.naming.factory.initial",
		// "org.apache.openejb.client.LocalInitialContextFactory");
		p.put("java.naming.factory.initial",
				"org.apache.openejb.client.RemoteInitialContextFactory");
		p.put("java.naming.provider.url", "https://127.0.0.1:8443/tomee/ejb");
		// InitialContext ctx = new InitialContext(p);
		InitialContext ctx = new InitialContext();

		String lookupName = "java:global/" + backendModuleName
				+ "/HelloWorldSessionBean";
		System.out.println("Looking up :" + lookupName);
		Object ref = ctx.lookup(lookupName);

		return (HelloWorldSessionBeanRemote) ref;
	}
}
