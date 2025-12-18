# Tienda Virtual CheemsMart

CheemsMart es un sistema de tienda virtual desarrollado en Java que implementa múltiples patrones de diseño para gestionar ventas en línea. El sistema permite a usuarios de diferentes países (México, España y Estados Unidos) realizar compras en línea con una interfaz adaptada a su idioma y preferencias culturales.

### Características:
- Soporte multi-idioma (Español Latino, Español Castellano, Inglés)
- Sistema de ofertas dinámicas por categoría de producto
- Compra segura con verificación de cuenta bancaria
- Carrito de compras virtual
- Catálogo de productos organizado por departamentos
- Gestión de cuentas bancarias y saldos

---

## Estructura

```
src/
├── modelo/                             > Entidades
│   ├── producto/
│   │   ├── Articulo.java                >> Interfaz base para productos
│   │   ├── CarritoVirtual.java          >> Carrito de compras
│   │   ├── alimentos/                   >> 7 productos alimenticios
│   │   ├── electrodomesticos/           >> 5 electrodomésticos
│   │   └── electronica/                 >> 5 productos electrónicos
│   ├── usuario/
│   │   ├── Persona.java                > Datos personales
│   │   ├── Cuenta.java                  >> Interfaz de cuenta
│   │   ├── CuentaBancaria.java          >> Cuenta bancaria real
│   │   └── CuentaCheemsMart.java        >> Cuenta del sitio (Proxy)
│   └── excepciones/
│       └── SaldoInsuficienteException.java
│
├── catalogo/                           > Patrón Iterator
│   ├── Catalogo.java                    >> Interfaz de catálogo
│   ├── CatalogoAlimento.java
│   ├── CatalogoElectrodomestico.java
│   ├── CatalogoElectronica.java
│   └── iterador/
│       └── IteradorLista.java
│
├── descuento/                          > Patrón Decorator
│   ├── Descuento.java                   >> Clase abstracta
│   ├── DescuentoDiez.java               >> 10% descuento
│   ├── DescuentoVeinte.java             >> 20% descuento
│   └── DescuentoTreinta.java            >> 30% descuento
│
├── idioma/                             > Patrón State
│   ├── ModoIdioma.java                  >> Interfaz de estado
│   ├── Mexico.java                      >> Español Latino
│   ├── Espania.java                     >> Español Castellano
│   └── EEUU.java                        >> Inglés
│
├── tienda/                             > Lógica de negocio
│   ├── CheemsMart.java                  >> Gestión de usuarios
│   └── TiendaVirtual.java               >> Coordinador principal
│
└── main/
    └── TiendaCheemsMart.java           > Punto de entrada
```

---

## Patrones de Diseño Implementados

| Patrón | Ubicación | Propósito |
|--------|-----------|-----------|
| **Iterator** | `catalogo/` | Recorrer colecciones de productos sin exponer su estructura interna |
| **Decorator** | `descuento/` | Agregar descuentos dinámicamente a productos sin modificar su clase |
| **State** | `idioma/` | Cambiar comportamiento de la tienda según el país del usuario |
| **Proxy** | `modelo/usuario/` | Proteger acceso a `CuentaBancaria` a través de `CuentaCheemsMart` |

---

## Usuarios de Prueba

El sistema incluye 3 usuarios precargados:

| Usuario | Contraseña | País | Cuenta Bancaria | Saldo |
|---------|------------|------|-----------------|-------|
| `ArturoLemus` | `paella` | España | `ES1234` | $12,000 MXN |
| `RodrigoTA` | `pizza` | EEUU | `EU1234` | $13,000 MXN |
| `RosaUwU` | `cheems` | México | `ME1234` | $9,000 MXN |

---

## Cómo correr el programa

Nos situamos en la carpeta raíz, y luego ejecutamos los siguientes comandos:

### Compilación


- Windows PowerShell
    ```bash
    javac -d bin (Get-ChildItem -Path src -Recurse -Filter *.java).FullName
    ```

-  Linux
    ```bash
    javac -d bin src/main/TiendaCheemsMart.java src/**/*.java
    ```

### Ejecución

```bash
java -cp bin main.TiendaCheemsMart
```

## Guía de Uso

### 1. Iniciar Sesión
```
1. Iniciar sesion
0. Salir de la tienda
```
Ingresa usuario y contraseña de uno de los usuarios de prueba.

### 2. Menú Principal
Después de iniciar sesión, verás opciones en el idioma correspondiente:
- **Ver catálogo**: Muestra todos los productos disponibles
- **Comprar**: Permite agregar productos al carrito
- **Salir**: Cierra la sesión

### 3. Realizar una Compra
1. Selecciona "Comprar"
2. Ingresa el código de barras del producto (ej: `AL100` para Pan)
3. Agrega productos al carrito
4. Selecciona "Terminar compra"
5. Ingresa tu número de cuenta bancaria
6. ¡Compra completada!

### Códigos de Barras de Ejemplo

**Alimentos (AL):**
- `AL100` - Pan
- `AL101` - Cereal
- `AL102` - Caja de Galletas

**Electrónica (ET):**
- `ET200` - Televisión
- `ET201` - Laptop
- `ET204` - Celular

**Electrodomésticos (ED):**
- `ED300` - Lavadora
- `ED301` - Microondas
- `ED304` - Aspiradora

---

## Sistema de Ofertas

Las ofertas se generan aleatoriamente al iniciar sesión y varían según el país:

| País | Departamento con Ofertas |
|------|--------------------------|
| 🇲🇽 México | Alimentos |
| 🇪🇸 España | Electrodomésticos |
| 🇺🇸 EEUU | Electrónica |

Los descuentos pueden ser del 10%, 20% o 30%.

---

## Notas

- El programa no tiene interfaz gráfica, todo es en terminal.
- Todos los precios están en pesos mexicanos
- El catálogo de productos permanece en español independientemente del país
- Las fechas de entrega se generan aleatoriamente (5-7 días hábiles)
- No se requiere registro de usuarios nuevos (sistema de demostración)
- El sistema implementa un proceso de compra segura: verificación del número de cuenta bancaria, validación de saldo suficiente, máximo 3 intentos para ingresar la cuenta correcta y protección de datos mediante el patrón Proxy


---

## Autores

- @paolasanv
- @Supr-Lilito
- @JesusEVR

**Fecha:** Octubre 2023  

**Curso:** Modelado y Programación

---