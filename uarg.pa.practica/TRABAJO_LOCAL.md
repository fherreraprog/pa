# Guía de Trabajo Local

Esta guía es para quienes prefieren trabajar sin Codespaces: ya sea para programar sin conexión, ahorrar horas de Codespaces, o porque les resulta más cómodo trabajar en su propia máquina. El objetivo es reproducir localmente el mismo entorno que usamos en la nube, para que el corrector automático de Classroom50 evalúe su código sin sorpresas.

## Prerrequisitos

Antes de empezar, instalen:

1. **Git** — [git-scm.com/downloads](https://git-scm.com/downloads)
2. **JDK 17** — la misma versión que usa el Codespace. Pueden instalar la distribución [Eclipse Temurin 17](https://adoptium.net/temurin/releases/?version=17).
3. **Visual Studio Code** — [code.visualstudio.com](https://code.visualstudio.com/)
4. **Extension Pack for Java** (de Microsoft) — se instala desde VS Code, en la sección de extensiones (ícono de bloques en la barra lateral). Es la misma extensión que trae preinstalada el Codespace, no hace falta ninguna otra.
5. **GitHub Desktop** — [desktop.github.com](https://desktop.github.com/), si prefieren manejar Git con interfaz gráfica en lugar de la terminal.

## Paso a paso

### 1. Aceptar la invitación en Classroom50

Ingresen a [classroom50.org](https://classroom50.org/) con su cuenta de GitHub y acepten la invitación al trabajo práctico correspondiente. Esto crea su repositorio privado.

### 2. Clonar el repositorio

**Con GitHub Desktop:**
- Vayan al repositorio en github.com, botón **Code → Local → Open with GitHub Desktop**.
- Elijan una carpeta local y clonen.

**Con terminal:**
```bash
git clone https://github.com/<su-usuario>/<su-repositorio>.git
```

### 3. Abrir el proyecto en VS Code

Abran la carpeta clonada con VS Code (`code .` desde la terminal, o "Abrir carpeta" desde el menú).

### 4. Verificar el JDK

VS Code debería detectar el JDK automáticamente gracias al Extension Pack for Java. Para confirmarlo:
```bash
java -version
javac -version
```
Ambos deberían indicar la versión 17. Si VS Code no lo detecta solo, vayan a la paleta de comandos (`Ctrl+Shift+P` / `Cmd+Shift+P`) y busquen **Java: Configure Java Runtime**.

### 5. Ubicar su trabajo práctico

Dentro del respositorio van a encontrar un carpeta `src` con los archivos `.java` a completar. En la raiz del proyecto estan las consignas del trabajo en un archivo un `.md` 

**No modifiquen** la estructura de carpetas, los `package` ni el nombre de los archivos de test: el corrector automático depende de que se mantengan intactos. Trabajen únicamente dentro de las secciones marcadas con:
```java
// --- TU CÓDIGO AQUÍ ---
```

### 6. Programar y probar

Escriban su código en VS Code y ejecútenlo o depúrenlo con el botón **Run/Debug** o desde la terminal integrada, igual que en Codespaces.

### 7. Confirmar y subir cambios

**Con GitHub Desktop:**
- Revisen los cambios, escriban un mensaje de commit descriptivo y hagan clic en **Commit**.
- Luego **Push origin** para subir los cambios.

**Con terminal:**
```bash
git add .
git commit -m "feat: completar ejercicio de scanner"
git push
```
> Recuerden usar el estándar de mensajes de commit visto en clase (tipo + descripción en modo imperativo).

### 8. Revisar el autograde

Cada `push` dispara la corrección automática. Entren a [classroom50.org](https://classroom50.org/), abran su entrega y revisen el puntaje y el detalle en **"Failure details"** si algún ejercicio no pasó.

### 9. Traer feedback o actualizaciones

Si el profesor deja comentarios o actualiza el template, bajen los cambios antes de seguir trabajando:

**GitHub Desktop:** botón **Pull origin**.
**Terminal:** `git pull`

## Sobre el uso de asistentes de IA (Copilot y similares)

En Codespaces, Copilot y las sugerencias inline vienen deshabilitados a propósito: el objetivo de esta etapa es que resuelvan los ejercicios con su propio razonamiento. Si trabajan localmente y tienen Copilot u otro asistente instalado en su VS Code personal, les pedimos que lo desactiven mientras resuelven los TPs (**Extensiones → Copilot → Disable**, o directamente desinstalen la extensión), para mantener las mismas condiciones que sus compañeros y que el ejercicio realmente les sirva para aprender.

## ¿Problemas con la instalación?

Los inconvenientes más comunes son versión de JDK incorrecta o el `PATH` mal configurado. Si `java -version` no muestra la versión 17, revisen que el JDK instalado esté correctamente agregado al `PATH` de su sistema operativo, o reinstalen usando el instalador de Temurin, que lo configura automáticamente.

Para cualquier otra consulta, usen los mismos canales que en el resto de la cursada.
