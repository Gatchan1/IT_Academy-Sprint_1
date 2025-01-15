## Tutorial para usuarios de Windows.

Para compilar cada programa necesitas tener instalado el Java Development Kit (JDK).
<br>Abre una terminal (por ejemplo desde Símbolo de sistema) y navega entre los directorios (son especialmente útiles los comandos cd y dir) hasta la ubicación del proyecto java S1_05.
<br>Ejemplo: _cd C:\Users\usuarioX\Documents\it_academy\S1_05_

Para poder ejecutar cada ejercicio son necesarios dos pasos:
### 1) Compilación:
Ejecuta el siguiente comando:
<br>***javac src/n1exercici1/\*.java -d classes***
<br>Se compilarán solo los archivos .java que están dentro del package n1exercici1, y se almacenarán dentro de la carpeta "classes".
<br>(Si lo que quieres ejecutar es un ejercicio diferente, en lugar de n1exercici1 escribe n1exercici2, o el que quieras, y tenlo en cuenta también para los siguientes comandos propuestos en esta guía)

> Si el comando javac no es reconocido, comprueba que tienes instalado el JDK, y si es así tienes dos opciones:
<br>a) localiza el archivo javac.exe dentro de la carpeta bin de la carpeta de instalación del JDK.
Al ejecutar el comando puedes sustituir la palabra clave "javac" por la ruta a ese archivo.
Ejemplo: "C:\Program Files\Java\jdk-22\bin\javac" src/n1exercici1/*.java -d classes
<br>b) añade la ruta a la carpeta bin de la carpeta de instalación del JDK a la variable de entorno del sistema llamada Path.
Tras hacer esto ya deberías poder utilizar el comando javac con normalidad.

### 2) Ejecución:
Ejecuta el siguiente comando:
<br>***java -cp classes n1exercici1.Main***
<br>Necesitamos "apuntar" a un archivo compilado .class que tenga un método main. De modo que primero indicamos la carpeta en la que están almacenados (-cp classes) y después indicamos el nombre del package seguido del nombre de la clase que queremos ejecutar (n1exercici1.Main).
<br>Si queremos añadir algún argumento, el comando ejecutado tendría esta estructura:
<br>_java -cp classes nombre-de-package.NombreDeClaseQueContieneMetodoMain argumento1 argumento2_

---

# Exercise Guidelines
These exercises need to be executed through the command line, and not through the IDE as we usually do. Thus, part of the goal hear was to make an explanation on how to execute the exercises. 

# Level 1
- ## Exercise 1
    Create a class that lists the contents of a directory received by parameter alphabetically.

- ## Exercise 2
    Add to the class of the previous exercise, the functionality of listing a directory tree with the content of all its levels (recursively) so that they are printed on screen in alphabetical order within each level, also indicating if it is a directory (D) or a file (F), and its last modification date.

- ## Exercise 3
    Modify the previous exercise. Now, instead of showing the result on the screen, save the result in a TXT file.

- ## Exercise 4
    Add the functionality of reading any TXT file and display its content per console.

- ## Exercise 5
    The program must now serialize a Java Object to a .ser file and then deserialize it.
