## Requerimientos del Proyecto

### Requerimientos Funcionales:
1. El sistema debe permitir a los usuarios registrarse utilizando cuentas Gmail.
2. El sistema debe permitir a los usuarios ingresar datos de vehículos como marca, modelo, cilindrada, tipo de combustible, y capacidad en pasajeros.
3. El sistema debe calcular el costo de despacho según las reglas de negocio establecidas:
    - Compras sobre 50 mil pesos tienen despacho gratuito dentro de un radio de 20 km.
    - Compras entre 25 mil y 49.999 pesos se cobrarán $150 por km.
    - Compras menores a 25 mil pesos se cobrarán $300 por km.

### Requerimientos No Funcionales:
1. El sistema debe ser fácil de usar y comprensible para usuarios no técnicos.
2. El sistema debe ser robusto y manejar entradas inválidas de manera adecuada.
3. El sistema debe ser documentado adecuadamente para facilitar el mantenimiento futuro.

## Historias de Usuario

### Historia de Usuario 1:
**Como** cliente registrado, **quiero** ingresar datos sobre el vehículo que compraré, **para** que el sistema calcule el costo de despacho basado en las reglas de negocio.

**Criterios de Aceptación:**
- El usuario debe poder ingresar datos como marca, modelo, cilindrada, tipo de combustible y capacidad de pasajeros.
- El sistema debe mostrar los datos ingresados y calcular el costo de despacho correctamente según el total de la compra.

### Historia de Usuario 2:
**Como** cliente potencial, **quiero** registrarme utilizando mi cuenta de Gmail, **para** poder realizar compras y utilizar el servicio de despacho.

**Criterios de Aceptación:**
- El sistema debe permitir el registro mediante Gmail.
- El usuario debe recibir una confirmación del registro exitoso.
