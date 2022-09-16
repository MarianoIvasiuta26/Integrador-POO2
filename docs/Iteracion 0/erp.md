# Especificación de requisitos de software
## Integrantes
* Colman Hernan Lucas
* Ivasiuta Mariano
* Berent Nataly
* Anton Belen
* Martinez Alejandro

---
## **Enunciado del problema**
En un consultorio, se brinda atención psicológica a pacientes que previamente hayan solicitado un turno, para trabajar cuestiones personales, laborales, sociales o de la índole de incumbencia de cada sujeto. Los trabajos que se realizan son amplios que van desde tareas psicodiagnósticas, análisis clínicos, realización de informes en casos judicializados, exámenes para evaluación de apto psicológicos, entre otros.
La informacion es almacenada de manera escrita y las tareas realizadas por el psicologo de igual manera se realizan de manera escrita. Por este motivo suelen surgir los siguientes problemas:
* Desorganización en el manejo de los turnos
* Desorganización en el seguimiento de los pacientes
* Falta de seguridad
* Falta de confiabilidad
* Falta de eficacia en el almacenamiento de la información
* Desprolijidad

---

## **Clientes potenciales**
Los usuarios que se veran afectados por el desarrollo del software son:
* El psicologo: asignar turnos, agregar datos de las sesiones, almacenar información clínica de los pacientes y registrar pacientes.
* El secretario: administrar los turnos para pacientes registrados, consultar y eliminar pacientes del sistema. 
* Los pacientes: solicitar turnos, efectuar pago. 
Para solicitar una consulta sin registro previo, el paciente deberá completar un fomrulario rellenando su datos personales, que son: nombre y apellido completo, número de celular, email y el tipo de consulta que necesita. La medida de seguridad tomada a la hora de recibir un turno, es usar un captcha para comprobar que se trata de una persona real la que solicita la consulta. 
---
## **Solución propuesta**
La solucion propuesta es el desarrollo de un sistema que tratará de organizar el manejo de los turnos, realizar el seguimiento de los pacientes, mejorar la seguridad de la información, aumentar la confiabilidad a los pacientes y la eficacia en el almacenamiento de información. Todo esto hará efecto en los pacientes, entregándoles un servicio más rápido y organizado, como así también ayudará al psicólogo y secretarios a realizar sus tareas de manera más eficiente.

---


## **Requisitos**
### Requisitos Funcionales
* El sistema deberá permitir el registro, consulta y eliminación de pacientes
* El sistema permitirá la solicitud de turnos para una consulta.
* El sistema permitirá manejar los turnos de los pacientes registrados y asignar turnos.
* El sistema permitirá realizar el almacenamiento de la información clínica de los pacientes
* El sistema permitirá realizar cobros a los pacientes
* El sistema permitirá generar informes de salud.
* El sistema se podrá realizar anotaciones durante las consultas

---
## **Arquitectura de software**
El proyecto presentado se trata de una aplicación web, la cuál se ajusta a la arquitectura cliente-servidor.
La aplicacion sera desarrollada con el lenguaje de programacion Java
* Base de Datos: PostgreSQL
* FrontEnd: HTML, CSS, Bootstrap, JavaScript.
* BackEnd: Java/Spring.


