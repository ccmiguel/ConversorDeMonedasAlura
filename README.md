
# Conversor de Monedas en Java

## Descripción 📄

Este proyecto es un **conversor de monedas** desarrollado en Java como parte del curso de Alura Latam. Permite convertir valores entre diferentes monedas de manera sencilla y rápida. Es una herramienta útil para estudiantes y profesionales interesados en aprender sobre el manejo de operaciones con divisas, interfaces gráficas (si corresponde), y conceptos básicos de programación orientada a objetos.

---

## Funcionalidades ✨

- **Conversión entre monedas populares**:
  - Dólar estadounidense (USD)
  - Euro (EUR)
  - Peso argentino (ARS)  

  
- **Entrada personalizada**:
  - El usuario puede ingresar el monto que desea convertir.

- **Salida clara y precisa**:
  - Muestra el resultado con la tasa de cambio actualizada (si es estática, se especificará la tasa utilizada).

---

## Tecnologías utilizadas 🛠️

- **Lenguaje de programación**: Java 8+  
- **IDE utilizado**: IntelliJ IDEA
- **Paradigma**: Programación Orientada a Objetos (POO)  
- **Herramientas adicionales**:  
  - Gestión de tasas de cambio (hardcoded o API externa si corresponde)

---

## Estructura del proyecto 📂

```
ConversorDeMonedas/
├── src/
│   ├── ConseguirValorMoneda.java
│   ├── TransformarMoneda.java
│   ├── ValorMonedas.java
│   ├── Principal.java
├── .gitignore
├── ConversorDeMonedas.iml
├── README.md
```

### Explicación de las clases principales:
- **ConseguirValorMoneda.java**: Contiene las tasas de cambio predefinidas o el método para obtenerlas desde una API externa.  
- **TransformarMoneda.java**: Lógica principal para realizar las conversiones entre diferentes divisas.  
- **ValorMonedas.java**: Modelo de datos para representar las monedas disponibles y sus valores.  
- **Principal.java**: Punto de entrada del programa (puede incluir una interfaz gráfica o una consola interactiva).

## Cómo ejecutar el proyecto ▶️

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/conversor-de-monedas-java.git
   ```
2. **Abre el proyecto en tu IDE favorito**.
3. **Compila y ejecuta**:
   - Si usas consola:
     ```bash
     javac src/*.java
     java src/Principal
     ```
   - O simplemente ejecuta desde el IDE.
4. **Sigue las instrucciones en pantalla para convertir monedas.**

---

## Próximas mejoras 🚀

- Integrar una API para obtener tasas de cambio en tiempo real (por ejemplo, [Exchangerates API](https://exchangeratesapi.io/)).
- Añadir soporte para más monedas.
- Implementar una interfaz gráfica (GUI) utilizando JavaFX o Swing.
- Crear un módulo de prueba unitaria con JUnit para validar el correcto funcionamiento del conversor.

---

## Contribuciones 🤝

Si deseas contribuir a este proyecto, puedes hacer lo siguiente:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tu funcionalidad o corrección.
   ```bash
   git checkout -b nueva-funcionalidad
   ```
3. Realiza tus cambios y sube el código.
4. Abre un pull request y explica qué mejoras has implementado.

---

## Licencia 📜

Este proyecto está bajo la licencia MIT. Puedes consultar más detalles en el archivo [LICENSE](LICENSE) del repositorio.
