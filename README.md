Exemplo de chamada para listas fornecedores

curl --location --request GET 'localhost:8080/providers' \
--data-raw ''



exemplo de criação de novo fornecedor

curl --location --request POST 'localhost:8080/providers' \
--header 'Content-Type: application/json' \
--data-raw '{
    "razaoSocial": "razaoSocial3",
    "nomeFantasia": "nomeFantasia3"
}'


importar estes curls na ferramenta Postman

Importar esta aplicação em uma IDE de desenvolvimento, de preferencia o IntellyJ

startar a aplicação com run ou debug na classe Application.java

Usar JDK 11
