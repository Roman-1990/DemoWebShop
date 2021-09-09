# Популярно у майнеров!
## API тесты
1) Добавление товара в корзину

## Используемые параметры (по умолчанию) для запуска через Jenkins

### Для запуска API тестов необходимо заполнить remote.properties или передать значение:

* remoteDriverUrl (selenoid.autotests.cloud)
* threads (number of threads)

<img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/src/test/resources/img/jenkins.PNG">

Запуск тестов с заполненными local.properties:
```bash
gradle clean test
```

<img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/src/test/resources/img/console.PNG">

## :robot:Отправка оповещения о прохождении теста в <img src = "https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width = "30">

<img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/src/test/resources/img/telegrambot.PNG">

Подавайте отчет allure report:
```bash
allure serve build/allure-results
```
## Анализ результатов через Allure Reports: <a href ="https://jenkins.autotests.cloud/job/C06-kudinovroman-Demowebshop-ApiTest/6/allure/#suites/ce9e7658a93407fd5bc66fdf0526dee1/190840dbe0cc32a9/">

1) Просмотр последнего скриншота; :eyes: :framed_picture:
2) Просмотр источника страницы; :eyes:
3) Просмотр лога в консоли; :eyes:
4) Просмотр видео прохождения теста; :eyes: :film_strip:
   </a>
   
   <img src = "https://github.com/DemoWebShop/blob/master/src/test/resources/img/video.mp4">
   
   <img src = "https://github.com/DemoWebShop/blob/master/src/test/resources/img/allure.PNG">


## Визуализация итогов пройденных тестов в Allure TestOps
<img src = "https://github.com/DemoWebShop/blob/master/src/test/resources/img/dashboards.PNG">

- Шаги проведения тестов:
  <img src = "https://github.com/DemoWebShop/blob/master/src/test/resources/img/Attachments.PNG">