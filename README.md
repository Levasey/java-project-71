### Hexlet tests and linter status:
[![SonarQube](https://github.com/Levasey/java-project-71/actions/workflows/build.yml/badge.svg)](https://github.com/Levasey/java-project-71/actions/workflows/build.yml)
[![hexlet-check](https://github.com/Levasey/java-project-71/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/Levasey/java-project-71/actions/workflows/hexlet-check.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)

Консольная утилита `gendiff`, сравнивающая содержимое двух текстовых файлов (информацию об обмене данными). Поддерживаются два формата сравниваемых файлов: `Json` и `Yaml`.

Формат командной строки утилиты:
```java
gendiff [-hV] [-f=<formatName>] <filepath1> <filepath2>
```

Возможны как абсолютные, так и относительные пути к файлам.

Параметры утилиты `gendiff`:
```java
-h, --help      вывод справки по утилите
-V, --version   версия утилиты 
<filepath1>     путь к первому файлу     
<filepath2>     путь ко второму файлу
-f, --format    выбор формата вывода информации
```
#### Пример вывода справки (4 шаг Проекта):
[![asciicast](https://asciinema.org/a/721920.svg)](https://asciinema.org/a/721920)