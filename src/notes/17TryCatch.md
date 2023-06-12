# ¿QUÉ SON LAS EXCEPCIONES?

- Una **excepción** es un elemento que ocurre durante la ejecución de un
programa que rompe con e flujo normal de ejecución.
- Cuando se habla de excepciones nos referimos a un **evento expecional**
  (algo muy difícil que pase o fuera de lo común).

### Tipos de Excepciones
- Hay dos tipos bien diferenciados:
  - Propias del lenguaje Java
  - Personalizados

![excepciones.PNG](..%2Fimgs%2Fexcepciones.PNG)


### Excepciones Personalizadas
- Para poder construir excepciones propias, hay que tener en cuenta los
siguientes bloques:
  - **try**: Bloque donde puede ocurrir la excepción.
  - **catch**: Es como el "else" del try (se ejecuta al dispararse una
  excepción ene l bloque try).
  - **finally**: Bloque de código que se ejecuta siempre (sin importar
  si hubieron errores o no).
  - **throw**: Lanzar una excepción cualquiera.
  - **throws**: Determinar qué excepción puede lanzar un método.
