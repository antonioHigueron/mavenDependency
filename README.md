# para ejecutar el proyecto, se ha hecho con:
maven = 3.8.1
java = 16-zulu

# comando para generar el jar ha sido:
mvn clean package shade:shade

mvn = maven <br>
clean = borra la carpeta target, es decir los compilados <br>
package = empaqueta el jar, en esta phase es cuando a continuacion se definen los plugin:goals  <br>
shade:shade = primero es el plugin, en este caso maven-shade-plugin(usamos shade), segundo el goals, definimos para la phase package el goal shade.  <br>


