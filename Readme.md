## Construindo um projeto Java com arquitetura baseada em microsserviços usando Spring Cloud.


### Tecnologias utilizadas:

* catalago de produto : Spring com base de dados no elasticsearch.
* carrinho de compras: Spring com base de dados no redis.
* servidor de descoberta: Sprind Cloud Eureka server.
* servidor de configuração: Spring Cloud Config.
* Gateway: Spring Cloud Gateway.

## Base de dados:

Utilizamos docker para subir as instancias de banco de dados.

elasticsearch versão 6.6.1 conforme comando abaixo:

`docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:6.6.2`

Redis versão 3.0.1 conforme comando abaixo:

`docker run --name redis -d -p 6379:6379 redis:3.0.1`
