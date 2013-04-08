
<%@page import="ch.ectropy.ejb.EjbClient"%>
<%@page import="ch.ectropy.poc.ejb.HelloWorldSessionBeanRemote"%>

<title>index.jsp</title>
<h1 />
<%
	HelloWorldSessionBeanRemote bean = new EjbClient().getRemote();
%>

HelloWorldSessionBeanRemote.sayHello("ggg") :
<br />
<%=bean.sayHello("ggg")%>

