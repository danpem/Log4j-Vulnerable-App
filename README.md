# Vulnerable-App a simple application to show the problem the Log4shell (CVE-2021-44228)
A simple vulnerable App that shows the problem in log4j with the Log4shell vulnerability [CVE-2021-44228](https://www.cisa.gov/uscert/apache-log4j-vulnerability-guidance) .

This repository contains a basic application without any other library than the vulnerable one, vulnerable  to CVE-2021-44228, nicknamed Log4Shell and it was inspired in the [Spring Boot web application vulnerable](https://github.com/christophetd/log4shell-vulnerable-app.git) by Christopherd.

It uses Log4j 2.14.1  and the JDK 1.8.0_181.



## Description

This project  shows a  simple program that is affected by this vulnerability. There are some examples that show that a web application can be compromised. Processing files is another way to exploit the vulnerability, so this project includes a simple file processing and an example of how can be a batch process compromised.



The complete explanation is in the following link   [Log4Shell y la importancia de las pruebas de penetración](https://en1gm4.com/enigma/Log4j-pruebas-penetracion-pentest.html) and it is part of an awareness program. 



## Disclaimer

All information and code is provided solely for educational purposes and/or testing your own systems for these vulnerabilities.

## Todo


I need to complete the POM.xml file.









