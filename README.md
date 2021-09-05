## API
1) Доступность сервиса "Калькулятор ОСАГО"

## Используемые параметры (по умолчанию) для запуска через Jenkins

### Для запуска удаленных тестов необходимо заполнить remote.properties или передать значение:

* browser (default chrome)
* browserVersion (default 91.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (selenoid.autotests.cloud)
* videoStorage (url address where you should get video)
* threads (number of threads)

Запуск тестов с заполненными local.properties:
```bash
gradle clean test
```