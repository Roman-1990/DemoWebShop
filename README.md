# Если ты майнер, тебе сюда!!

___

### Для разработки автотестов использовались технологии и инструменты:

| Java | Gradle | Junit5 | IntelliJ IDEA |
|:------:|:----:|:----:|:------:|
| <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Java.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Gradle.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/JUnit5.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Intelij_IDEA.png" width="40" height="40"> |

| GitHub | Jenkins | Selenoid | Allure Report | Allure TestOps | Telegram |
|:------:|:----:|:----:|:------:|:------:|:--------:|
| <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Github.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Jenkins.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Selenoid.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Allure_Report.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/AllureTestOps.png" width="40" height="40"> | <img src="https://github.com/Roman-1990/bip-test/blob/master/img/logo/Telegram.png" width="40" height="40"> |

___

### Добро пожаловать в новый магазин [Tricentis!](http://demowebshop.tricentis.com/)
### Не стесняйтесь ходить по магазинам и изучать все подряд.

## API тесты
1) Добавление товара в корзину

## Используемые параметры (по умолчанию) для запуска через Jenkins

### Для запуска API тестов необходимо заполнить remote.properties или передать значение:

* remoteDriverUrl (selenoid.autotests.cloud)
* threads (number of threads)

<img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/img/jenkins.PNG">

Запуск тестов с заполненными local.properties:
```bash
gradle clean test
```

<img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/img/console.PNG">

## :robot:Отправка уведомления о прохождении тестов в <img src = "https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width = "30">

<img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/img/telegrambot.PNG">

Подавайте отчет allure report:
```bash
allure serve build/allure-results
```
## Анализ результатов пройденных тестов через Allure Reports: <a href ="https://jenkins.autotests.cloud/job/C06-kudinovroman-Demowebshop-ApiTest/6/allure/#suites/ce9e7658a93407fd5bc66fdf0526dee1/190840dbe0cc32a9/">

1) Просмотр последнего скриншота; :eyes: :framed_picture:
2) Просмотр источника страницы; :eyes:
3) Просмотр лога в консоли; :eyes:
4) Просмотр видео прохождения теста; :eyes: :film_strip:
   </a>
   <img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/img/video.gif">
   <img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/img/Allure.PNG">


## Визуализация итогов пройденных тестов в Allure TestOps

<img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/img/dashboards.PNG">

- Шаги проведения тестов:
  
  <img src = "https://github.com/Roman-1990/DemoWebShop/blob/master/img/Attachments.PNG">