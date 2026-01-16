# Actividad 2 — Reporte de Buenas Prácticas y Documentación de Código

**Alumno:** Gomez Almaraz Armando Emmanuel  
**Grupo:** 2DSM-G3  
**Fecha:**14 de enero del 2026  
**Unidad:** 2  

---

## 1. Objetivo del reporte

- Aplicar buenas prácticas de codificación para mejorar la legibilidad, mantenimiento y calidad del código.
- Analizar estándares y herramientas de documentación del código y justificar su uso en el contexto académico y profesional.

---

## 2. Buenas prácticas de codificación

Las buenas prácticas de codificación permiten que el software sea comprensible, escalable y fácil de mantener. No solo indican *qué* hace el código, sino *por qué* está escrito de esa manera.

### 2.1 Nombres de variables

- **Reglas:**
  - Deben ser descriptivos y representar claramente su propósito.
  - Evitar abreviaturas confusas o letras sin significado.
  - Seguir la convención del lenguaje utilizado (por ejemplo, `camelCase` en Java).

- **Ejemplo:**
  - Incorrecto: `x`, `y`, `r`
  - Correcto: `base`, `altura`, `areaRectangulo`

El uso de nombres claros reduce la necesidad de comentarios adicionales y facilita la lectura del código.

---

### 2.2 Comentarios

- **Cuándo comentar:**
  - Para explicar lógica compleja.
  - Para documentar funciones, métodos o clases.
  - Cuando el propósito del código no es evidente.

- **Qué evitar:**
  - Comentarios que repitan exactamente lo que hace el código.
  - Comentarios obsoletos.
  - Uso excesivo de comentarios innecesarios.

Un buen comentario aporta contexto y justificación, no redundancia.

---

### 2.3 Estructura del código

- **Indentación:**
  - Debe ser consistente y seguir las reglas del lenguaje.
  - Facilita la lectura y detección de errores.

- **Modularidad:**
  - Dividir el programa en funciones pequeñas.
  - Cada función debe tener una sola responsabilidad.

- **Evitar duplicidad:**
  - Reutilizar funciones.
  - Aplicar el principio DRY (Don’t Repeat Yourself).

Una estructura clara convierte el código en un mapa, no en un laberinto.

---

## 3. Documentación del código

La documentación es esencial para que otros desarrolladores (o el mismo autor en el futuro) comprendan el funcionamiento del sistema.

### 3.1 Estándares

- **Estándar elegido:**
  - Javadoc.

- **Elementos recomendados:**
  - Descripción general del método.
  - Parámetros (`@param`).
  - Valor de retorno (`@return`).
  - Información adicional relevante.

El uso de un estándar asegura consistencia y claridad en la documentación.

---

### 3.2 Herramientas / enfoque

- **README / generadores / extensiones:**
  - README.md
  - Javadoc
  - GitHub

- **Ventajas:**
  - Generación automática de documentación.
  - Facilita el trabajo colaborativo.
  - Mejora la comprensión general del proyecto.

Estas herramientas permiten mantener documentación actualizada sin esfuerzo excesivo.

---

## 4. Ejemplos prácticos

### 4.1 Antes / Después (Ejemplo 1)

**Antes:**
```txt
int x = 8;
int y = 9;
int r = x * y;
int base = 8;
int altura = 9;
int areaRectangulo = base * altura;
public static void f(int a, int b){
    System.out.println(a + b);
}
public static int sumar(int numero1, int numero2){
    return numero1 + numero2;
}
/**
 * Calcula el promedio de tres calificaciones.
 *
 * @param cal1 Primera calificación
 * @param cal2 Segunda calificación
 * @param cal3 Tercera calificación
 * @return Promedio final del alumno
 */
public static double calcularPromedio(double cal1, double cal2, double cal3) {
    return (cal1 + cal2 + cal3) / 3;
}
