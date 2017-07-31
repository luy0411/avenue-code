#language:pt

Funcionalidade: Listagem de dados, filtrados e agrupados por ids de alguma entidade

  Contexto:
    Dado que o banco de dados esteja populado:
      | # | name  |
      | 1 | test1 |
      | 1 | test2 |
      | 1 | test3 |

#  Cenario: Obtenção de métricas agrupando por idCreative e filtrando por idGroup
#    Quando o serviço para obter metricas de anuncios for chamado com o id de grupo "2"
#    Entao as métricas obtidas serão:
#      | id | totalImpressions | totalClicks | totalCost |
#      | 1  | 800              | 30          | 90.00     |
#      | 2  | 700              | 90          | 110.40    |
