# Projeto Kafka com Docker

## Introdução
Este projeto demonstra o uso do Apache Kafka em conjunto com Docker para criar um sistema de envio e processamento de pagamentos.

## Configuração
Siga as instruções abaixo para configurar e executar o Kafka usando Docker:

1. Clone este repositório.
2. Instale o Docker e o Docker Compose, se ainda não estiverem instalados.
3. Navegue até a raiz do projeto e execute `docker-compose up -d` para iniciar o Kafka e o Zookeeper.

## `kafkaproduce` - Produção de Mensagens
### Descrição
Este módulo é responsável por enviar pagamentos para processamento.

### Configuração
- `PagamentoAPI`: Endpoint REST para enviar pagamentos.
- `PagamentoService`: Lógica de integração com o Kafka.
- `PagamentoRequestProducer`: Produtor de mensagens Kafka.

## `kafkaconsumer` - Consumo de Mensagens
### Descrição
Este módulo consome mensagens de pagamento para processamento.

### Configuração
- `PagamentoRequestConsumer`: Consumidor de mensagens Kafka.

## Integração e Fluxo de Mensagens
Os pagamentos são enviados pelo `kafkaproduce` e consumidos pelo `kafkaconsumer` para processamento.

## Execução do Projeto
1. Certifique-se de que o Kafka está em execução usando Docker.
2. Execute os projetos `kafkaproduce` e `kafkaconsumer`.

## Considerações Finais
Este projeto serve como um exemplo de uso do Kafka com Docker para comunicação entre microserviços.

## Referências
- Documentação do Apache Kafka: [link](https://kafka.apache.org/documentation/)
- Documentação do Spring Kafka: [link](https://docs.spring.io/spring-kafka/docs/current/reference/html/)
