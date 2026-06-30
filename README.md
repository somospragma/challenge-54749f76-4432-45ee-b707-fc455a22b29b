# Diseñar una arquitectura SOA para un sistema de banca en línea

Una institución financiera necesita implementar una arquitectura de Servicios Orientados (SOA) para su sistema de banca en línea. El objetivo es mejorar la flexibilidad, reutilización de servicios y escalabilidad del sistema. La arquitectura debe incorporar patrones de integración y principios de APIs y microservicios.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Diseño de la arquitectura SOA |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8-10 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración y Modelado del Dominio

**Objetivo:** Identificar los servicios necesarios y sus interacciones en el sistema de banca en línea.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica las funcionalidades clave del sistema de banca en línea (ej. gestión de cuentas, transferencias, pagos).
- Modela los servicios que serán necesarios para implementar estas funcionalidades.
- Define las interacciones entre servicios y cómo se comunicarán.

**Entregable:** Diagrama de servicios y sus interacciones.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo cada servicio puede ser reutilizado en diferentes contextos.
- Considera los patrones de integración que podrían ser útiles (ej. orquestación, coreografía).

</details>

### Fase 2: Definición de APIs y Principios de Microservicios

**Objetivo:** Definir las APIs para cada servicio y aplicar principios de microservicios.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Define las APIs RESTful para cada servicio identificado.
- Aplica principios de microservicios como independencia de despliegue, escalabilidad y falla aislada.

**Entregable:** Especificación de APIs y aplicación de principios de microservicios.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que cada microservicio debe ser desplegable de forma independiente.
- Considera cómo manejarías la escalabilidad y las fallas en cada servicio.

</details>

### Fase 3: Implementación de Patrones de Integración

**Objetivo:** Implementar patrones de integración en la arquitectura SOA.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Selecciona y aplica patrones de integración como orquestación o coreografía.
- Define cómo los servicios se integran y comunican utilizando estos patrones.

**Entregable:** Descripción de la implementación de patrones de integración.

<details>
<summary>Pistas de conocimiento</summary>

- Evalúa los pros y contras de cada patrón de integración.
- Considera cómo manejarías las transacciones distribuidas y la consistencia de datos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un servicio en una arquitectura SOA y cómo se diferencia de un microservicio?
- **paraQueSirve**: ¿Para qué sirven los patrones de integración en una arquitectura SOA?
- **comoSeUsa**: ¿Cómo se aplican los principios de microservicios en la arquitectura de un sistema de banca en línea?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una arquitectura SOA?
- **queDecisionesImplica**: ¿Qué decisiones implica la elección de un patrón de integración en una arquitectura SOA?

## Criterios de Evaluacion

- Identificación correcta de servicios y sus interacciones.
- Definición adecuada de APIs RESTful para cada servicio.
- Aplicación efectiva de principios de microservicios.
- Implementación correcta de patrones de integración.
- Manejo adecuado de transacciones distribuidas y consistencia de datos.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
