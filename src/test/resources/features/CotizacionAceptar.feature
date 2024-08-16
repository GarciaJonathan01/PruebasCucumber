Feature: Cotizar productos enviar.
  # Como comprador
  # Quiero poder cotizar productos
  # Para enviar al vendedor

  Scenario Outline: Validar que se pueda enviar la cotizacion.
    Given Quiero enviar la cotizacion.
    When Doy click en el bot2 "<boton2>" se envian los datos nombre "<nombre>" y correo "<correo>".
    Then Se debe validar que los productos y datos se envien correctamente de la lista.

    Examples:
      |boton2| nombre            | correo             |
      |COTIZAR| Fernando Tipan | frtipan1@gmail.com |

  Scenario Outline: Validar que se pueda enviar la cotizacion
    Given Quiero enviar la cotizacion
    When Doy click en el bot2 "<boton2>" se envian los datos nombre "<nombre>" y correo "<correo>".
    Then Se debe validar que los productos y datos se envien correctamente de la lista.

    Examples:
      |boton2     | nombre            | correo              |
      |COTIZAR    | Fernando Tipan123 | frtipan1@gmail.com  |
      |COTIZAR    | Fernando Tipan    | frtipan1@gmail.pret |
      |    otro   | Fernando Tipan    | frtipan1@gmail.com  |

