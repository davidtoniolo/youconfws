youconfws
=========

RESTful webservices as backend for Android Apps, websites or other consumers.

Author: David Toniolo <youconfapp@unittestcloud.com>

Partner projects: [youconfweb](https://github.com/davidtoniolo/youconfweb) & [youconfapp](https://github.com/davidtoniolo/youconfapp)


Prepare, install, deploy & run
==============================

Edit your hosts (local DNS) file:

	127.0.0.1 youconfws.development


Compile and run youconfws:

	cd <your-local-path>/youconfws
	mvn clean install
	cd <your-local-path>/youconfws/ycws-webservice
	mvn jetty:run


Ready! Test the RESTful URLs in your browser, e.g. http://youconfws.development:8080/json/yc/event

See all configured RESTful URLs in the web.xml file of ycws-webservice submodule.


Open Source Software
====================

This project uses the following great libraries:

[Apache Wicket](http://wicket.apache.org)
[Apache Maven](http://maven.apache.org)
[JUnit](http://junit.org)
