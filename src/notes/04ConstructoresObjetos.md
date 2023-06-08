# MÉTODOS CONSTRUCTORES Y OBJETOS EN JAVA

### Objetos
- Un objeto es una instancia de una clase.
- Es la representación de un objeto que generalmente existe en la vida real.
- Posee un **estado** (de acuerdo a sus atributos).
- Posee un **comportamiento** (realizan operaciones deacuerdo a sus metodos).

Ejemplo:
![objeto_alumno.PNG](..%2Fimgs%2Fobjeto_alumno.PNG)

- El operador **new** crea un nuevo objeto de la clase especificada (alojando suficiente memoria 
 para almacenar los datos del objeto) y regresa una referencia al objeto que se creo.

En general, la manera para crear un objeto de una clase X es la siguiente
>//primero declarar el objeto indicando su clase
>
> < Clase > < nombreObjeto >;
> 
> //después crear el objeto
> 
> < nombreObjeto > new < Clase >();

Lo anterior se crea en un solo enunciado:
> < Clase > < nombreObjeto > = new < Clase >();


------------

### Constructores
- Son funciones especiales que contienen las clases para **permitir la creación de objetos**.
- Pueden recibir datos/parámetros como no (constructor vacío)
- Se llaman SIEMPRE igual que la clase.
- No retornan NINGÚN VALOR (ni siquiera VOID).
- Generalmente se utilizan dos tipos de cnstructores
  - Constructor Vacío.
  - Constructor con todos los parámetros