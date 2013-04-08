ejblookup
=========

The goal of this POC is to show out JEE6 code portability.
The different aspects tested on different JEE6 application servers.

Sample code is minimalistic in order to avoid confusion.

* EJB lookup between 2 wars

ejblookup-ui.war  =>  ejblookup-engine.war

The ejblookup-ui/index.jsp is calling an Ejb running on the ejblookup-engine.war.

JNDI Lookup name should be transparent on the different AS.

* Security

Both Princial and roles captured in ejblookup-ui must be caught in EJB ejblookup-engine.war






