#                                                                              **MANUAL TÉCNICO**
##  Requerimientos de la aplicacion:
*Solaris OS versión 10 (x86/x64 Platform Edition): Procesador: AMD Opteron serie 1200 a 1,8 GHz. Memoria: 512 MB. Espacio en disco: 650 MB de espacio libre en el disco. 
 
*Macintosh OS X 10.5 Intel: Procesador: Intel Dual-Core (32 o 64 bits) Memoria: 512 MB. Espacio en disco: 650 MB de espacio libre en el disco. 
 
*Windows 7 de 32 o 64 bits, Procesador: Intel Dual-Core ,Memoria 512 MB, Espacio en disco: 650 MB de espacio libre en el disco. 

## Diagrama de clases (General)
![DIAGRAMA DE CLASES PROYECTO 2](https://user-images.githubusercontent.com/66354474/86331330-2ed8b080-bc06-11ea-819d-b4cf8fffd647.png)
## métodos utilizados

## Clases utilizadas    
1. proyecto2 (main)
 - PROYECTO2
  - RecogeBloques
2. Hilos
 - hilo_temporal
3. Listas_simples
 - Cola
  - Nodo
   - NodoBoton
   - Pila
   - Lista_objetos
   - lista_simple
4. Listas_Doblemente_Enlazadas
 - NodoCircularDoble
  - NodoDoble
   - lista_circular_doblemente_enlazada
   - lista_doble
   
   ## Lógica utilizada para resolver problemas
   
   ### Llenar el tablero:
   Para llenar el tablero se creó un método que lee cada línea del documento elegido, y se utilizó un Split para separar las palabras de cada línea, luego se almaceno en la lista simple la información. En el mismo método durante el análisis del archivo dependiendo del color, se iban guardando en listas para llevar el control en el hilo del tiempo.
   
   ### Hilos para choques de botones con jugador
   Se utilizo un hilo del tiempo para que siempre que el jugador se topara con otro botón este desapareciera, se guardara el valor del botón en la lista correspondiente.
   
 El método de cada lista de tipo de color de botones se utilizó en este hilo, y no tiene un tiempo de descanso, y ya que se llamo el hilo desde el constructor del jframe de la ventana principal, este hilo ocurrirá durante toda la ejecución del programa, incluso después de reiniciar el juego.
 
 ### Evitar duplicación de valores al recorrer el tablero y eliminar botones al chocar
 Para evitar que los valores en las listas se duplicaran al mover el botón negro que representaba al jugador, se hizo un método de comprobación para saber si existía un nodo en la lista con ese valor, si era cierto entonces no se agregaba a la lista, pero sino existía se agregaba un nuevo nodo a la lista del color indicado, al insertar el valor en la lista, el botón desaparecía del tablero.
 
 ### Generar código graphviz
 Para generar el código graphviz se utilizo la referencia de los ID de cada uno y sus relaciones siguiente en las listas. En el caso de la pila y la cola, se utilizo un valor como anterior, pero este no es una relación, sino un valor de referencia pues al llegar al final en este tipo de listas es imposible regresar debido a que son listas simplemente enlazadas. Cada vez que se recorría la lista en el método de generar listas se actualizaba una cadena de texto que contenía como inicio el encabezado y cerraba con un corchete
 
 ### Evitar errores al ingresar valores
 Para evitar errores al ingresar valores en agregar y eliminar a las listas, se utilizo try catch, para los casos en que no se ingrese nada, o en el caso de los valores no se ingresen números, de esta forma se muestra un joptionpane cuando se presentan este tipo de errores, y la ejecución del programa no se ve afectada
 
 ### Permitir duplicacion de valores en listas al agregar manualmente
 Cuando se va a agregar un valor a la lista manualmente, no se realiza el proceso de verificación que se hacía cuando se recorría el tablero, pues se permite que hallan nodos con valores repetidos, pero para diferenciarlos cada nodo contiene un ID único, el cual es utilizado en el proceso de eliminar un nodo.
 
 ### Eliminar únicamente el primer valor encontrado en las listas
 Para eliminar un nodo, primero se verifica si existe el valor ingresado en la lista seleccionada, sino existe se muestra un joption pane indicando que no se encontró ese valor en la lista, si se encuentra uno o mas nodos con ese valor procede a verificar los ID de los nodos que coinciden con el valor a eliminar. Al verificar los ID almacena en un vector el ID del nodo en la posición de un contador que inicia en 0 y va aumentando cada vez que el valor de un nodo coincide con el valor a eliminar, posteriormente se elimina el nodo que contiene el id igual al valor almacenado en el vector en la posición 0, pues ese fue el primer nodo que coincidió. Este proceso se realizó en todas las listas, de esta forma siempre se eliminará solo al primer nodo que se encuentre con el valor deseado. Al terminar el proceso de eliminación se le asigna valor 0 al contador nuevamente para poder repetir el proceso posteriormente si el usuario lo desea
 
 ### Reinicio
 Para el reinicio, en la eliminación de nodos de las listas, se eliminaron las relaciones que tenia el nodo cabeza o primero, y luego se le asigno nulo a la cabeza, de esta forma se pierden las referencias a los nodos que contenía la lista y se pueden ingresar nodos nuevamente. Además, los contadores que se utilizaban para los ID de cada lista se les asigno valor 0 para poder ingresar nuevos nodos de la misma forma que se hizo en un inicio.
 
 ### Evitar problemas al ingresar un archivo para llenar el tablero
 Para la lectura del archivo en cargar datos, se puso de restricción que solo se pudieran ingresar archivos con extensión ipc1 para evitar errores al llenar el tablero y la carga de datos en la lista simple.
 
 ### inicializar movimientos del jugador 
 Para inicializar los movimientos del jugador se debe de dar clic en el botón negro, pues sino se pone la condición y el usuario presiona las flechas del teclado durante la ejecución de otra tarea este se moverá sin que se percate y puede asignar valores a las listas sin que se dé cuenta.
