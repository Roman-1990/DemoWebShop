# Если ты майнер, тебе сюда!!

___

### Для разработки автотестов использовались технологии и инструменты:

| Java | Gradle | Junit5 | IntelliJ IDEA |
|:------:|:----:|:----:|:------:|
| <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Java.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Gradle.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/JUnit5.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Intelij_IDEA.png" width="40" height="40"> |

| GitHub | Jenkins | Selenoid | Allure Report | Allure TestOps | Telegram |
|:------:|:----:|:----:|:------:|:------:|:--------:|
| <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Github.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Jenkins.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Selenoid.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Allure_Report.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/AllureTestOps.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/src/test/resources/img/logo/Telegram.png" width="40" height="40"> |

___

### Добро пожаловать в новый магазин [Tricentis!](http://demowebshop.tricentis.com/)
### Не стесняйтесь ходить по магазинам и изучать все подряд.

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
   <img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/src/test/resources/img/video.gif">
   <img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/src/test/resources/img/Allure.PNG">


## Визуализация итогов пройденных тестов в Allure TestOps

<img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/src/test/resources/img/dashboards.PNG">

- Шаги проведения тестов:
  
  <img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/src/test/resources/img/Attachments.PNG">