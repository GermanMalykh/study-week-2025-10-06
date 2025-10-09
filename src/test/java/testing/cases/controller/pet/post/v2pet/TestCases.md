# POST /v2/pet
1) Добавление нового животного в магазин с указанием валидных данных

| Параметр      | Пример JSON-фрагмента                                                                        | Возможные значения             | Кейс автоматизирован? |
|---------------|----------------------------------------------------------------------------------------------|--------------------------------|:---------------------:|
| Headers       |                                                                                              |                                |          [ ]          |
| Content-Type  | `application/json`                                                                           |                                |                       |
| Body          |                                                                                              |                                |                       |
| name          | `"name": "Matt"`                                                                             |                                |                       |
| photoUrls[]   | `"photoUrls": ["https://upload.wikimedia.org/wikipedia/commons/8/84/Buberel_butterfly.jpg"]` |                                |                       |
| id            | `"id": 1234`                                                                                 |                                |                       |
| category.id   | `"id": 100`                                                                                  |                                |                       |
| category.name | `"name": "doggie"`                                                                           |                                |                       |
| tags[].id     | `"id": 10`                                                                                   |                                |                       |
| tags[].name   | `"name": "friendly"`                                                                         |                                |                       |
| status        | `"status": "available"`                                                                      | `available`, `pending`, `sold` |                       |

```json
{
  "name": "Matt",
  "photoUrls": [
    "https://upload.wikimedia.org/wikipedia/commons/8/84/Buberel_butterfly.jpg",
    "https://upload.wikimedia.org/wikipedia/commons/2/26/Lightmatter_silverback_gorilla.jpg"
  ],
  "id": 1001,
  "category": {
    "id": 100,
    "name": "doggie"
  },
  "tags": [
    {
      "id": 10,
      "name": "friendly"
    },
    {
      "id": 10,
      "name": "trained"
    }
  ],
  "status": "available"
}
```

2) Добавление нового животного в магазин с невалидными данными

_Черновик_

  |               Параметры                | name | photoUrls[] | id | category{} | category.id | category.name | tags[] | tags.id | tags.name | status |
  |:--------------------------------------:|:-----|:-----------:|:--:|:----------:|:-----------:|:-------------:|:------:|:-------:|:---------:|:------:|
  |             Передать null              |      |             |    |            |             |               |        |         |           |        |
  |              Передать ""               |      |             |    |            |             |               |        |         |           |        |
  |         Не передавать параметр         |      |             |    |            |             |               |        |         |           |        |
  |         Отрицательные значения         |      |             |    |            |             |               |        |         |           |        |
  |      Превышение ограничения поля       |      |             |    |            |             |               |        |         |           |        |
  |      Превышение ограничения поля       |      |             |    |            |             |               |        |         |           |        |
  |     Передать несуществующий status     |      |             |    |            |             |               |        |         |           |        |
  | Нарушение валидации строки (photoUrls) |      |             |    |            |             |               |        |         |           |        |
  |      Дубликаты значений массивов       |      |             |    |            |             |               |        |         |           |        |


Итоговый вариант:
> Легенда Technique: 
> **EP** — эквивалентности, 
> **BVA** — границы, 
> **NEG** — негатив технич., 
> **HDR** — заголовки.

| Параметр         | Случай                   | Пример JSON-фрагмента                                             | Ожидание (код/семантика)       | Priority | Кейс автоматизирован? | Technique |
|------------------|--------------------------|-------------------------------------------------------------------|--------------------------------|----------|:---------------------:|-----------|
| name             | отсутствует ключ         | *(нет поля)*                                                      | 4xx (required)                 | High     |          [ ]          | EP        |
| name             | null                     | `"name": null`                                                    | 4xx (invalid type)             | High     |          [ ]          | EP        |
| name             | пустое значение          | `"name": ""`                                                      | 4xx (minLength)                | High     |          [ ]          | BVA/EP    |
| name             | только пробелы           | `"name": "   "`                                                   | 4xx/?                          | Med      |          [ ]          | EP        |
| name             | min                      | `"name": "A"`                                                     | 2xx                            | High     |          [ ]          | BVA       |
| name             | max+1                    | *длина 256*                                                       | 4xx                            | Med      |          [ ]          | BVA       |
| photoUrls        | отсутствует ключ         | *(нет поля)*                                                      | 4xx (required)                 | High     |          [ ]          | EP        |
| photoUrls        | пустой массив            | `"photoUrls": []`                                                 | 4xx (minItems)                 | High     |          [ ]          | BVA/EP    |
| photoUrls[0]     | элемент `null`           | `"photoUrls":[null]`                                              | 4xx                            | Med      |          [ ]          | EP        |
| photoUrls[0]     | элемент `""`             | `"photoUrls":[""]`                                                | 4xx/?                          | Med      |          [ ]          | EP        |
| photoUrls[0]     | элемент `" "`            | `"photoUrls":[" "]`                                               | 4xx/?                          | Med      |          [ ]          | EP        |
| id (Pet)         | отсутствует ключ         | *(нет поля)*                                                      | 2xx/? *(Assumption: optional)* | Med      |          [ ]          | EP        |
| id (Pet)         | отрицательное            | `"id": -1`                                                        | 4xx/?                          | Med      |          [ ]          | BVA       |
| id (Pet)         | очень большое (overflow) | `"id": 9223372036854775808`                                       | 4xx/?                          | Low      |          [ ]          | BVA       |
| id (Pet)         | существующий id          | `"id": 123` *(повторно)*                                          | 200/201/409 ?                  | Med      |          [ ]          | EP        |
| category         | пустой объект            | `"category": {}`                                                  | 2xx/?                          | Low      |          [ ]          | EP        |
| category.id      | отсутствует ключ         | `"category": {"name":"dog"}`                                      | 2xx/?                          | Med      |          [ ]          | EP        |
| category.id      | отрицательное            | `"category":{"id":-1,"name":"dog"}`                               | 4xx/?                          | Med      |          [ ]          | BVA       |
| category.id      | очень большое (overflow) | `"category":{"id":9223372036854775808,"name":"dog"}`              | 4xx/?                          | Low      |          [ ]          | BVA       |
| category.name    | null                     | `"category":{"id":1,"name":null}`                                 | 4xx/?                          | Med      |          [ ]          | EP        |
| category.name    | пустое значение          | `"category":{"id":1,"name":""}`                                   | 4xx/?                          | Med      |          [ ]          | BVA/EP    |
| category.name    | min                      | `"category":{"id":1,"name":"A"}`                                  | 2xx                            | Med      |          [ ]          | BVA       |
| tags             | пустой массив            | `"tags": []`                                                      | 2xx                            | Low      |          [ ]          | EP        |
| tags[0].id       | отсутствует ключ         | `"tags":[{"name":"nice"}]`                                        | 2xx/?                          | Med      |          [ ]          | EP        |
| tags[0].id       | отрицательное            | `"tags":[{"id":-1,"name":"nice"}]`                                | 4xx/?                          | Med      |          [ ]          | BVA       |
| tags[0].id       | очень большое (overflow) | `"tags":[{"id":9223372036854775808,"name":"nice"}]`               | 4xx/?                          | Low      |          [ ]          | BVA       |
| tags[0].name     | отсутствует ключ         | `"tags":[{"id":10}]`                                              | 2xx/?                          | Low      |          [ ]          | EP        |
| tags[0].name     | null                     | `"tags":[{"id":10,"name":null}]`                                  | 4xx/?                          | Low      |          [ ]          | EP        |
| tags[0].name     | пустое значение          | `"tags":[{"id":10,"name":""}]`                                    | 4xx/?                          | Low      |          [ ]          | BVA/EP    |
| tags[0].name     | min                      | `"tags":[{"id":10,"name":"A"}]`                                   | 2xx                            | Low      |          [ ]          | BVA       |
| tags (дубликаты) | одинаковые `tags[].id`   | `"tags":[{"id":10,"name":"friendly"},{"id":10,"name":"trained"}]` | 2xx/4xx/?                      | Med      |          [ ]          | EP        |
| status           | валид enum               | `"status":"available"`                                            | 2xx                            | Med      |          [ ]          | EP        |
| status           | пробел в enum            | `"status":"available "`                                           | 4xx                            | Med      |          [ ]          | EP        |
| status           | неверный регистр         | `"status":"AVAILABLE"`                                            | 4xx/?                          | Med      |          [ ]          | EP        |
| status           | неизвестное значение     | `"status":"unknown"`                                              | 4xx                            | High     |          [ ]          | EP        |
| запрос           | битый JSON               | `{ "name":"doggie",`                                              | 4xx                            | High     |          [ ]          | NEG       |
| заголовки        | Content-Type неверный    | `Content-Type: text/plain`                                        | 4xx                            | High     |          [ ]          | HDR       |
| заголовки        | Content-Type отсутствует | *(нет Content-Type)*                                              | 4xx                            | High     |          [ ]          | HDR       |
| структура        | лишние поля              | `"_extra":123`                                                    | игнор/4xx ?                    | Low      |          [ ]          | NEG       |
| типизация        | число как строка         | `"id": "1"`                                                       | 4xx/?                          | Med      |          [ ]          | NEG/EP    |

