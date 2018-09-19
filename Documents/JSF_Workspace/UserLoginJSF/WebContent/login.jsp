<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<html>
<head>
<title>Login Page</title>
</head>
<body>
	<f:view>
		<h1>
			<h:outputText value="Login Page" />
		</h1>
		<h:form id="LoginForm">
			<h:outputText value="Enter Your Name:" />
			<h:inputText value="#{loginBean.userName}" />
			<h:commandButton action="welcome" value="OK" />
		</h:form>
	</f:view>
</body>
</html>
