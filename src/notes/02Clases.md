# ¿QUÉ SON LAS CLASES?

### Clases
- Es una plantilla, o molde que permite construir objetos. **Por ejemplo si tuviéramos
 la clase Auto, ésta sería el plano para construir un Objeto (en este caso uno o
 varios autos)**.
- Representan entidades del mundo real.
- Poseen atributos y métodos
- No pueden ser utilizados directamnte (sino mediante instancias a objetos).


- Una clase es un tipo de dato definido por el programador especificamente para crear objetos.
- Por convención los nombres de las clases siempre empiezan por mayusculas.
- **Enjemplos:** Auto, Persona, Departamento, Factura, Recibo, Producto, etc.

 La clase es la desripción de un conjunto de objetos similares, es decir, que comparten
 los mismos atributos y los mismos métodos.
> **La clase es el bloque constructor más importante en cualquier lenguaje de POO.**


Sintaxis para definir una clase en java:

    public class <NombreClase>{
        <definición de los atributos>
        <definición de los constructores>
        <definición de los métodos>
    }

> Por convención, el nombre de una clase debe tenr inicial mayúscula y el resto en minúsculas.
> En caso de nombres compuestos, se utiliza las iniciales de cada palabra en mayúsula.
------------

### Los Atributos
- Los atributos definen la estructura de datos de una clase.
> Por convención, los nombres deben escribirse en minúsculas. En el caso de nombrs compuestos, cada palabra
> intermedia debe iniciar con mayúsculas.

- **Ejemplos:** 
> private int **promedio**;
> 
> private float **saldoCuentaCredito**;
------------

### Los Métodos
- Los métodos constituyen el comportamiento de los objetos de la clase.
- La definición de un método es muy similar a la de una función. 
- Los métos públicos son las _operaciones_ que los objetos externos realizan con el objeto en cuestión.
- Los métodos privados son las _operaciones internas_ que no se pueden invocar desde el exterior, pero si desde otro método dentro de la clase.

Sintaxis para escribir un método público:
> public < TipoDatoRetorno> < nombreMetodo> (< listaParametros>){
> ...

Sintaxis para escribir un método privado úblico:
> private < TipoDatoRetorno> < nombreMetodo> (< listaParametros>){
> ...
>}