#AUTOR Oscar Roa
#language:es

@Historia
Característica: Academia Choucair
  Como usuario, yo quiero aprender como automatizar en ScreenPLay con el curso de automatizacion en la academia de Choucair

  @Escenario1
  Escenario: Buscar el curso de automatizacion
    Dado que Juan quiere aprender automatizacion en la academia de Choucair
    | strUser | strPassword |
    | TuUsuario | TuClave   |

    Cuando Juan busca el curso en la plataforma de la academia Choucair
    | strCourse             |
    |Metodología Bancolombia|

    Entonces Juan encuentra los cursos llamados
    | strCourse               |
    | Metodología Bancolombia |