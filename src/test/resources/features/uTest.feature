#AUTOR Oscar Roa
#language:es

@Historia
Característica: UTest
  Yo como usuario de utest deseo deseo realizar un registro en la página para acceder a sus funcionalidades

  @CrearUsuario
  Escenario: Crear un nuevo usuario
    Dado que Oscar ingresa a la pagina

    Cuando Oscar complete el formulario de registro
      | strName   | strLastName | strMail             | strMonth  | strDay | strYear | strCity | strPostalCode |
      |tuUsuario  | tuClave     | ejemplo@ejemplo.com | October   | 10     |   1990  |  Bogotá | 760002        |



    Entonces Oscar puede comprobar la creacion del usuario

