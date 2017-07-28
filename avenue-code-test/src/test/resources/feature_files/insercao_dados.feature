#language:pt

Funcionalidade: Inserir dados do relatorio de metricas

  Esquema do Cenario: Insercao dos dados de relatorio de metricas
    Dado que sejam recebidos os dados do relatorio <data_file>
    Quando o servico de insercao de dados for chamado
    Entao todos os dados informados serao persistidos e retornados ao componente
    Exemplos:
      | data_file                              |
      | json-data/insercao_dados_relatorio_metricas.json |