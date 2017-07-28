#language:pt

Funcionalidade: Listagem de dados, filtrados e agrupados por ids de alguma entidade

  Contexto:
    Dado que o banco de dados esteja populado:
      | # | totalImpressions | totalClicks | totalCPMAndCPCRevenue | status        | date     | hour | idOrder | idLineItem | idCreative |
      | 1 | 200              | 10          | 130.30                | NOT_PROCESSED | 20170101 | 01   | 1       | 1          | 1          |
      | 2 | 700              | 90          | 110.40                | NOT_PROCESSED | 20170101 | 15   | 1       | 2          | 2          |
      | 3 | 400              | 50          | 99.00                 | PROCESSED     | 20170102 | 03   | 2       | 3          | 3          |
      | 4 | 500              | 40          | 40.00                 | PROCESSING    | 20170101 | 05   | 4       | 1          | 1          |
      | 5 | 800              | 30          | 90.00                 | PROCESSED     | 20170101 | 06   | 5       | 2          | 1          |
      | 6 | 600              | 80          | 80.00                 | PROCESSED     | 20170103 | 03   | 6       | 1          | 1          |
      | 7 | 600              | 80          | 80.00                 | NOT_PROCESSED | 20170103 | 19   | 5       | 7          | 1          |
      | 8 | 150              | 20          | 75.50                 | NOT_PROCESSED | 20170104 | 12   | 6       | 8          | 1          |

#  Cenario: Obtenção de métricas agrupando por idCreative e filtrando por idGroup
#    Quando o serviço para obter metricas de anuncios for chamado com o id de grupo "2"
#    Entao as métricas obtidas serão:
#      | id | totalImpressions | totalClicks | totalCost |
#      | 1  | 800              | 30          | 90.00     |
#      | 2  | 700              | 90          | 110.40    |
