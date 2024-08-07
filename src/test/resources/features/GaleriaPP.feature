Feature: Mostrar galeria de procesos de produccion
  # Como comprador
  # Quiero poder visualizar los procesos de produccion
  # Para conocer sobre el producto de venta

  Scenario: Validar que se pueda ingresar datos como correo electronico y nombre
    Given Quiero cotizar un producto
    When Ingreso el nombre "<nombre>" y el correo "<correo>"
    Then Se debe validar que el correcto y el nombre sean correctos

    Examples:
      |       nombre     |        correo            |
      | Jonathan Garcia  | jdgarcia15@hotmail.com   |
      | Fernando Tipan843 | frtipan1@gmail.com      |
      | John Limones     | jjlimones@gmail.hasta    |

