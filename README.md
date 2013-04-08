ejblookup
=========

The goal of this POC is to show out portabiliy different aspects of JEE6 on different JEE6 application servers.
Sample code is minimalistic in order to avoid confusion.

* lookup between 2 wars

ejblookup-ui.war  =>  ejblookup-engine.war

The ejblookup-ui/index.jsp is calling an EjbRemote on the ejblookup-engine.war.

JNDI Lookup name and retrieved Remote interface should be OK.

* Security

Both Princial and roles captured in ejblookup-ui must be caught in EJB ejblookup-engine.war






