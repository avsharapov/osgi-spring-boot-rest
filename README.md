## Karaf
Скачать, установить и запустить Apache Karaf
https://karaf.apache.org/manual/latest/#_quick_start

### Install module
```
install mvn:ru.inno.stc/calc-core/0.0.3
install mvn:ru.inno.stc/calc-add-plugin/0.0.3
install mvn:ru.inno.stc/calc-sub-plugin/0.0.3
```
Start module:
```
start <Id module>
```


## calc-core

http://localhost:8013/calculator - список имеющихся операций

http://localhost:8013/calculator/{operation}?n1={n1}&n2={n2} - шаблон вызова операции


## calc-add-plugin
http://localhost:8013/calculator/plus?n1=12&n2=12

## calc-sub-plugin
http://localhost:8013/calculator/minus?n1=12&n2=12
