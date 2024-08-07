Feature: Mostrar Información General
  # Como propietario
  # Quiero poder mostrar informacion
  # Para dar a conocer el proposito del emprendimiento

  Scenario: Validar que haya datos visibles en mision y vision
    Given Quiero mostrar informacion
    When Ingreso a la pagina web "<pagina>" visualizo la vision "<vision>" y la mision "<mision>"
    Then Se debe validar que haya datos visibles en el apartado de mision y vision

    Examples:
      |                                       pagina                                        |        vision                                 |                        mision                  |
      #| file:///C:/Users/noobp/Desktop/Requisitos (1)/Requisitos/Pagina_Inicial.html      | ofrecer tilapias frescas y de alta calidad    | Convertirnos en el proveedor líder de tilapias |
      | file:///C:/Users/noobp/Desktop/Requisitos%20(1)/Requisitos/Visualizar_Producto.html | ofrecer tilapias frescas y de alta calidad    |vacio|
      #| file:///C:/Users/noobp/Desktop/Requisitos%20(1)/Requisitos/Cotizar.html             |vacio|vacio|


