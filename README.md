### Hexlet tests and linter status:
[![Java CI](https://github.com/Levasey/java-project-71/actions/workflows/build.yml/badge.svg)](https://github.com/Levasey/java-project-71/actions/workflows/build.yml)
[![hexlet-check](https://github.com/Levasey/java-project-71/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/Levasey/java-project-71/actions/workflows/hexlet-check.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)

Консольная утилита `gendiff`, сравнивающая содержимое двух текстовых файлов (информацию об обмене данными). Поддерживаются два формата сравниваемых файлов: `Json` и `Yaml`.

# Справка
gendiff -h
gendiff --help

# Версия
gendiff -V
gendiff --version

# Сравнение файлов
gendiff file1.json file2.json
gendiff --format=plain file1.yml file2.yml
gendiff -f json file1.json file2.json

### Пример вывода справки:
[![asciicast](https://asciinema.org/a/721920.svg)](https://asciinema.org/a/721920)

### Пример сравнения Yaml-файлов:
[![asciicast](https://asciinema.org/a/bgIcXql7FnmWniFnCXwbcyBag.svg)](https://asciinema.org/a/bgIcXql7FnmWniFnCXwbcyBag)

### Пример сравнения вложенных структур:
![img.png](img.png)

### Пример сравнения вложенных структур в формате plain:
![img_1.png](img_1.png)