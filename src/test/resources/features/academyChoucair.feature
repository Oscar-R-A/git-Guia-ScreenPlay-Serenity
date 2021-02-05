#AUTOR Oscar Roa
#language:es

@Historia
Característica: Academia Choucair
  Como usuario, yo quiero aprender como automatizar en ScreenPLay con el curso de automatizacion en la academia de Choucair

  @Escenario1
  Escenario: Buscar el curso de automatizacion
    Dado que Oscar quiere aprender automatizacion en la academia de Choucair
    | strUser   | strPassword |
    | tuUsuario | tuClave     |

    Cuando Oscar busca el curso Recursos en la plataforma de la academia Choucair
    | strCourse               |
    | Metodología Bancolombia |

    Entonces Oscar encuentra los cursos llamados recursos

    |  strCourse            |
    |Metodología Bancolombia|

