# 📚 Ejercicios de Programación Orientada a Objetos (POO)

## 1️⃣ Ejercicio 1: Área y Perímetro de un Cuadrilátero

Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados. Los valores de la longitud deberán introducirse por línea de comandos. Si es un cuadrado, solo se proporcionará la longitud de uno de los lados al constructor.

---

## 2️⃣ Ejercicio 2: Vehículo Más Barato

Construir un programa que dada una serie de vehículos caracterizados por su **marca**, **modelo**, y **precio**, imprima las propiedades del vehículo más barato. Para ello, se deberán leer por teclado las características de cada vehículo y crear una clase que los represente.

---

## 3️⃣ Ejercicio 3: Triángulos Isósceles

Diseñar un programa para trabajar con **triángulos isósceles**. Definir los atributos necesarios, proporcionar un método constructor y métodos para calcular el **perímetro** y el **área** de un triángulo. Además, implementar un método que, a partir de un arreglo de triángulos, devuelva el área del triángulo de mayor superficie.

---

## 4️⃣ Ejercicio 4: Competencia de Atletismo

Construir un programa para una competencia de atletismo. El programa debe gestionar una serie de **atletas** caracterizados por su **número de atleta**, **nombre** y **tiempo de carrera**. Al final, el programa debe mostrar los datos del atleta **ganador** de la carrera.

---

## 5️⃣ Ejercicio 5: Gestión Bancaria

Crear un programa sencillo para realizar gestiones en un banco. Tendremos dos clases:

- **Cliente**: caracterizado por su **nombre**, **apellido** y **DNI**. El cliente puede consultar saldo, ingresar y retirar dinero de sus cuentas.
- **Cuenta**: caracterizada por un **número de cuenta** y un **saldo**.

---

## 6️⃣ Ejercicio 6: Figuras Geométricas

Hacer un programa para calcular el área de **Polígonos** (Triángulos y Rectángulos). El programa debe ser capaz de almacenar en un arreglo **N** triángulos y rectángulos, y al final mostrar el área y los datos de cada uno. Se deben definir las siguientes clases:

- **Polígono** (superclase)
- **Rectángulo** (subclase)
- **Triángulo** (subclase)

---

## 7️⃣ Ejercicio 7: Equipo de Fútbol

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

## 8️⃣ Ejercicio 8: Validación de Fechas

Desarrollar un programa que permita ingresar una **fecha** por teclado. La cadena debe validarse según el formato `dd-mm-aaaa` o `dd/mm/aaaa`, y la fecha debe ser coherente con el calendario. Si la fecha es incorrecta (ej. 30-02-1999), el programa debe lanzar una excepción y explicar por qué no es válida.

---

## 9️⃣ Ejercicio 9: Juego del Gato (Tic-Tac-Toe)

Desarrollar un programa que permita jugar al **Gato** (Tic-Tac-Toe), en una grilla de 3x3 entre dos jugadores. Requisitos:

- Permitir el juego por turnos.
- Imprimir el estado del tablero en cada turno.
- Determinar el **ganador**.
- Almacenar hasta 5 partidas, identificando los jugadores y el ganador.

---

## 🔟 Ejercicio 10: Listado de Tareas

Desarrollar un programa que permita gestionar un **listado de tareas** por hacer. Cada tarea tiene un **título**, una **descripción** y una **fecha límite**. El usuario puede:
- Ingresar tarea.
- Mostrar tareas.
- Editar tareas.
- Eliminar tareas.

---

## 1️⃣1️⃣ Ejercicio 11: Juego del Ahorcado

Desarrollar un programa que simule el juego del **Ahorcado**. Requisitos:

- Permitir ingresar la palabra oculta.
- Mostrar el estado del **sujeto** (imaginario) en todo momento.
- Mostrar los espacios vacíos y algunas letras como pista.
- Determinar si el jugador ha ganado o perdido.

---

## 1️⃣2️⃣ Ejercicio 12: Buscaminas

Desarrollar un programa que simule el juego del **Buscaminas**. Requisitos:

- Implementar una matriz de botones que representen las celdas del juego.
- Detectar si una celda contiene una bomba o está libre.
- Terminar el juego si el jugador selecciona una bomba.
