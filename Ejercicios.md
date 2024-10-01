# 📚 Ejercicios de Programación Orientada a Objetos (POO)

## 1️⃣ Ejercicio: Área y Perímetro de un Cuadrilátero

Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados. Los valores de la longitud deberán introducirse por línea de comandos. Si es un cuadrado, solo se proporcionará la longitud de uno de los lados al constructor.

---

## 2️⃣ Ejercicio: Vehículo Más Barato

Construir un programa que dada una serie de vehículos caracterizados por su **marca**, **modelo**, y **precio**, imprima las propiedades del vehículo más barato. Para ello, se deberán leer por teclado las características de cada vehículo y crear una clase que los represente.

---

## 3️⃣ Ejercicio: Triángulos Isósceles

Diseñar un programa para trabajar con **triángulos isósceles**. Definir los atributos necesarios, proporcionar un método constructor y métodos para calcular el **perímetro** y el **área** de un triángulo. Además, implementar un método que, a partir de un arreglo de triángulos, devuelva el área del triángulo de mayor superficie.

---

## 4️⃣ Ejercicio: Competencia de Atletismo

Construir un programa para una competencia de atletismo. El programa debe gestionar una serie de **atletas** caracterizados por su **número de atleta**, **nombre** y **tiempo de carrera**. Al final, el programa debe mostrar los datos del atleta **ganador** de la carrera.

---

## 5️⃣ Ejercicio: Gestión Bancaria

Crear un programa sencillo para realizar gestiones en un banco. Tendremos dos clases:

- **Cliente**: caracterizado por su **nombre**, **apellido** y **DNI**. El cliente puede consultar saldo, ingresar y retirar dinero de sus cuentas.
- **Cuenta**: caracterizada por un **número de cuenta** y un **saldo**.

---

## 6️⃣ Ejercicio: Figuras Geométricas

Hacer un programa para calcular el área de **Polígonos** (Triángulos y Rectángulos). El programa debe ser capaz de almacenar en un arreglo **N** triángulos y rectángulos, y al final mostrar el área y los datos de cada uno. Se deben definir las siguientes clases:

- **Polígono** (superclase)
- **Rectángulo** (subclase)
- **Triángulo** (subclase)

---

## 7️⃣ Ejercicio: Equipo de Fútbol

Simular un equipo de fútbol compuesto por **futbolistas**, **entrenador** y **doctor**. Se debe crear una subclase llamada **Persona** con los atributos comunes:

- **Nombre**
- **Apellido**
- **Edad**

Las subclases serán:

- **Futbolista**: con los atributos **dorsal** y **posición**.
- **Entrenador**: con el atributo **estrategia**.
- **Doctor**: con los atributos **titulación** y **años de experiencia**.

Se debe implementar un menú con las siguientes opciones:
- Viaje de equipo
- Entrenamiento
- Partido de fútbol
- Planificar entrenamiento
- Entrevista
- Curar lesión

---

## 8️⃣ Ejercicio: Validación de Fechas

Desarrollar un programa que permita ingresar una **fecha** por teclado. La cadena debe validarse según el formato `dd-mm-aaaa` o `dd/mm/aaaa`, y la fecha debe ser coherente con el calendario. Si la fecha es incorrecta (ej. 30-02-1999), el programa debe lanzar una excepción y explicar por qué no es válida.

---

## 9️⃣ Ejercicio: Juego del Gato (Tic-Tac-Toe)

Desarrollar un programa que permita jugar al **Gato** (Tic-Tac-Toe), en una grilla de 3x3 entre dos jugadores. Requisitos:

- Permitir el juego por turnos.
- Imprimir el estado del tablero en cada turno.
- Determinar el **ganador**.
- Almacenar hasta 5 partidas, identificando los jugadores y el ganador.

---

## 🔟 Ejercicio: Listado de Tareas

Desarrollar un programa que permita gestionar un **listado de tareas** por hacer. Cada tarea tiene un **título**, una **descripción** y una **fecha límite**. El usuario puede:
- Ingresar tarea.
- Mostrar tareas.
- Editar tareas.
- Eliminar tareas.

---

## 1️⃣1️⃣ Ejercicio: Juego del Ahorcado

Desarrollar un programa que simule el juego del **Ahorcado**. Requisitos:

- Permitir ingresar la palabra oculta.
- Mostrar el estado del **sujeto** (imaginario) en todo momento.
- Mostrar los espacios vacíos y algunas letras como pista.
- Determinar si el jugador ha ganado o perdido.

---

## 1️⃣2️⃣ Ejercicio: Buscaminas

Desarrollar un programa que simule el juego del **Buscaminas**. Requisitos:

- Implementar una matriz de botones que representen las celdas del juego.
- Detectar si una celda contiene una bomba o está libre.
- Terminar el juego si el jugador selecciona una bomba.

---

# 1️⃣3️⃣ Ejercicio: Banco ULagosBank 🏦

El **Banco ULagosBank** es una institución anexa a la Universidad de Los Lagos que permite a los estudiantes acceder a servicios bancarios aceptados en el mercado, tales como tarjetas de crédito y préstamos.

Se te ha solicitado desarrollar una solución a través de **Programación Orientada a Objetos** que incluya los siguientes puntos:

## 🔹 Requisitos del Proyecto

### 1️⃣ Diagrama de Clases
Diseñar un **Diagrama de Clases** de la solución.

### 2️⃣ Clase Persona
Crear una clase llamada `Persona` con los siguientes atributos:
- **Nombre**
- **Fecha de nacimiento**
- **RUT**

#### Métodos:
- **Constructor**: inicializa los datos (pueden ser valores vacíos).
- **Setters y Getters**: para cada atributo, validando las entradas de datos. En el caso del **RUT**, se debe validar su formato y dígito verificador utilizando el algoritmo del RUT.
- **toString()**: organiza la información de la persona en una cadena legible.
- **esMayorDeEdad()**: verifica si la persona tiene 18 años o más.

### 3️⃣ Clase Cliente
Crear una clase llamada `Cliente` que hereda de `Persona`, con los siguientes atributos:
- **Password**: una cadena de texto de 10 caracteres.
- **Productos**: lista de productos bancarios que posee en el banco **ULagosBank**.

### 4️⃣ Clase Ejecutivo
Crear una clase llamada `Ejecutivo` que también hereda de `Persona`, con los siguientes atributos:
- **Usuario**: una cadena de texto de 10 caracteres que identifica al ejecutivo.
- **Password**: una cadena de texto de 10 caracteres.

### 5️⃣ Clase Cuenta
Crear una clase llamada `Cuenta` con los siguientes atributos:
- **Titular**: un objeto de la clase `Cliente`.
- **Saldo**: valor decimal que puede empezar vacío.
- **Movimientos**: lista de los registros de depósitos y retiros.

#### Métodos:
- **Constructor**: crea objetos vacíos.
- **Setters y Getters**: para cada atributo. 
- **Deposito()**: se pueden hacer depósitos mayores a 0.
- **Retiro()**: solo permite retirar montos menores o iguales al saldo disponible.
- **registrarMovimiento()**: registra cada transacción en la cuenta.
- **toString()**: organiza la información de la cuenta en una cadena legible.

### 6️⃣ Clase CuentaJoven
Crear una clase `CuentaJoven` que hereda de `Cuenta`, destinada a personas jóvenes (hasta 25 años). Incluye un atributo adicional:
- **Bonificación**: porcentaje de ganancia por ahorrar dinero.

#### Métodos:
- **Constructor**: solicita todos los datos de la cuenta al ser creada.
- **Setters y Getters**: para el atributo `Bonificación`.
- **esTitularValido()**: verifica si el titular está entre los 18 y 25 años. Devuelve un valor booleano.
- **Bonificar()**: se realiza al hacer un depósito, sumando el monto del depósito y aplicando la bonificación.
- **toString()**: organiza la información de la `CuentaJoven`.

### 7️⃣ Clase Main
Crear una clase `Main` que implemente un menú de opciones. Este debe ser diferenciado para **Clientes** y **Ejecutivos**:

- **Opciones para Ejecutivos**: 
  - Crear Clientes y Ejecutivos.
  - Crear Cuenta y/o Cuenta Joven.

- **Opciones para Clientes**:
  - Seleccionar producto bancario.
  - Realizar depósito.
  - Realizar retiro.

Puedes utilizar clases, atributos y métodos auxiliares según sea necesario.

---

# 1️⃣4️⃣  Ejercicio: Administración de Hotel 🏨

Un hotel requiere una solución que permita que los propios clientes soliciten sus reservas de habitaciones. Se pide implementar los siguientes ítems en **Java**:

### 🔹 Requisitos del Proyecto

1️⃣ **Creación de clase Habitación**: con su número de habitación y capacidad.

2️⃣ **Creación de clase Cliente**: con su RUT, nombre y tarjeta de crédito.

3️⃣ **Creación de clase Reserva**: con fecha de inicio y término de reserva, cantidad de personas y habitación seleccionada (la cantidad de personas no puede ser mayor que el total de personas en la reserva).

4️⃣ **Función principal (main)**: que permita a un cliente ver las habitaciones disponibles y crear una reserva.

---

# 1️⃣5️⃣ Ejercicio: LienzoApp 🎨

Existe una aplicación llamada **LienzoApp** que permite al usuario dibujar sobre una superficie blanca de forma digital. En esta parte del desarrollo, se está enfrentando un problema sobre los tipos de accesorios que se utilizan para realizar las líneas. Se pide implementar los siguientes ítems en **Python**:

### 🔹 Requisitos del Proyecto

1️⃣ **Creación de una super clase Accesorio de Dibujo**: que tenga un ID, nombre, color y ancho de línea, y el método **dibujar()** que retorne un número (que por defecto es el ancho de línea).

2️⃣ **Creación de subclases**:
   - `Lápiz`: tiene atributo transparencia.
   - `Pincel`: tiene atributo flexibilidad.
   - `Spray`: tiene atributo expansión.

3️⃣ **Uso de Polimorfismo** sobre el método `dibujar()` en cada subclase:
   - En la clase **Lápiz**, se retorna la diferencia entre el ancho de línea y la transparencia.
   - En la clase **Pincel**, se retorna la suma entre el ancho de línea y la flexibilidad.
   - En la clase **Spray**, se retorna la multiplicación entre el ancho de línea y la expansión.

4️⃣ **Función principal (main)**: que permita al usuario utilizar cada accesorio de dibujo. Imprimir por pantalla el tipo de accesorio y el valor.

---

# 1️⃣6️⃣  Ejercicio: Administración de Hospital 🏥

Un hospital requiere una solución que permita que los propios pacientes soliciten sus citas médicas. Se pide implementar los siguientes ítems en **Java**:

### 🔹 Requisitos del Proyecto

1️⃣ **Creación de clase Profesional de Salud**: con su identificación, nombre y especialidad.

2️⃣ **Creación de clase Paciente**: con su RUT, nombre y tarjeta de crédito.

3️⃣ **Creación de clase Reserva**: con fecha de la consulta, cantidad de sesiones (un profesional no puede ver a más de un paciente por vez).

4️⃣ **Función principal (main)**: que permita a un paciente ver los horarios disponibles y crear una reserva.

