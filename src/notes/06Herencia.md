# HERENCIA
- Hay clases que comparten gran parte de sus características.
- EL mecanismo conocido con el nombre de herencia permite reutilizar clases: Se crea una nueva clase que extiende la
funcionalidad de una clase existente sin tener que reescribir el código asociado a esta última.
- La nueva clase, a la que se denomina *subclase*, puede poseer atributos y métodos que no existan en la clase original.
- Los objetos de la nueva clase *heredan los atributos y métodos de la clase original*,
que se denomina *superclase*.

![herencia.PNG](..%2Fimgs%2Fherencia.PNG)

- Herencia es una relación entre clases en las que hay una clase padre, llamada _superclase_,y
una o más clases hijas especializadas, a las que se les denomina _subclases_.

Se utiliza la palabra reservada _extends_ para aplicar herencia a una clase:
    
    public class Empleado extends Persona{
    }