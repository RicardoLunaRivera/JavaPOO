# CLASES ABSTRACTAS EN JAVA
- Son un **tipo particular de clase** cuya principal característica es que **no pueden ser instanciadas**.
- Generalmente **declara al existencia de un método pero no su implementación**, convirtiéndola así en una **clase padre.**
- Al menos **uno** de sus **métodos** debe ser **abstracto** (puede tener métodos no abstractos).
- Sus niveles de visualización deben ser **public** o **protected**, nunca **private**.
- Cuando se utilizan clases abstractas una clase **no puede heredar de varias clases abstractas a la vez** (como es
el caso de las interfaces).
- generalmente las clases abstractas indican el **"ES/SER"** de un objeto. 

### ¿Cuándo se utilizan las clases abstractas?
- Cuando deseamos definir una **abstracción** que englobe objetos de distintos tipos y queremos hacer uso del
**polimorfismo**. 

Por ejemplo:
![abstracta.PNG](..%2Fimgs%2Fabstracta.PNG)