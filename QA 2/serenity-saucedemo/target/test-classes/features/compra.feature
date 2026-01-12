Feature: Flujo de compra en SauceDemo

Scenario: Compra exitosa de productos
    Given el usuario accede a SauceDemo
    When se autetifica con cedenciales validas
    And agrega dos productos al carrito
    And visualiza el carrito 
    And completa el formulario de compra
    Then finaliza la compra correctamente 

