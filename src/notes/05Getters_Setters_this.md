# La palabra reservada _this_ y los métodos "_getters_" y "_setters_"

- En java se utiliza la palabra reservada _this_ para denotar desde el interior de un objeto una referencia al propio
objeto. 
- Cuando los atributos son privados, entonces se codifican métodos para que otros objetos tengan acceso
al valor.
- A este tipo de médotos se les conoce como _getter_.
- Si además queremos que los otros objetos también puedan modificar el valor de esos atributos, entonces usamos los métodos _setters_.

Muchos ambientes de desarrollo orientado a objetos codifican automáticamente lo _getter_ y _setters_
con las siguientes reglas:
1. Tant _getters_ como _setter_ son públicos.
2. Los _getters_ no reciben parámetros y el tipo de dato que regresan es el mismo al del atributo
correspondiente. Su nombre comienza con el _get_ seguido del nombre del atributo pero iniciado con
mayúscula y regresa el valor del atributo. Por ejemplo:
> public double getSaldo() { return saldo; }
> 
> public int getNumero(){ return numero; }
3. Los _setters_ reciben como parámetro el mismo tipo de dato que el atributo.
El nombre de los métodos _setters_ se construye de forma análoga a la de los _getters_ pero iniciando
con la palabra _set_, y sin asignar al atributo el valor del parámetro recibido. El parámetro recibido
tiene el mismo nombre que el aributo. 
4. Para diferenciar entre el valor enviado como parámetro y el nombre del atributo se utiliza la palabra _this_.nombreAtributo
se refiere al atributo del objeto. Por ejemplo:
>   public void setSaldo( double saldo){ this.saldo = saldo;  }
> 
> public void setNumero ( int numero ) { this.numero = numero }

