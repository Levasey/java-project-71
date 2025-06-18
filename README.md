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

## Возможности

- Поддержка форматов файлов: JSON и YAML
- Три формата вывода различий:
    - `stylish` (по умолчанию) - древовидный формат с цветовым выделением
    - `plain` - текстовый список изменений
    - `json` - различия в формате JSON
- Рекурсивное сравнение вложенных структур
- Четкая индикация изменений (добавлено/удалено/изменено)

## Установка

1. Клонируйте репозиторий:
```bash
git clone https://github.com/Levasey/java-project-71.git
cd app
```

2. Соберите проект:
```bash
./gradlew build
```

3. Установите:
```bash
./gradlew installDist
```

## Использование

```bash
./app/build/install/java-project-71-app/bin/java-project-71-app [ОПЦИИ] <путь_к_файлу1> <путь_к_файлу2>
```

### Доступные опции:
- `-f, --format` - формат вывода (`stylish`, `plain`, `json`) [по умолчанию: `stylish`]
- `-h, --help` - показать справку
- `-V, --version` - показать версию

## Примеры работы

### Вывод справки:
```bash
./app/build/install/java-project-71-app/bin/java-project-71-app -h
```
[![asciicast](https://asciinema.org/a/721920.svg)](https://asciinema.org/a/721920)

### Сравнения Yaml-файлов:
[![asciicast](https://asciinema.org/a/bgIcXql7FnmWniFnCXwbcyBag.svg)](https://asciinema.org/a/bgIcXql7FnmWniFnCXwbcyBag)

### Сравнения вложенных структур:
```bash
./app/build/install/java-project-71-app/bin/java-project-71-app /home/user/IdeaProjects/java-project-61/java-project-71/app/src/test/resources/file1.json /home/user/IdeaProjects/java-project-61/java-project-71/app/src/test/resources/file2.json
```
[![asciicast](https://asciinema.org/a/Tna9FYmKif19Ktfsa2F51s9CJ.svg)](https://asciinema.org/a/Tna9FYmKif19Ktfsa2F51s9CJ)

### Сравнения вложенных структур в формате plain:
```bash
./app/build/install/java-project-71-app/bin/java-project-71-app -f plain /home/user/IdeaProjects/java-project-61/java-project-71/app/src/test/resources/file1.json /home/user/IdeaProjects/java-project-61/java-project-71/app/src/test/resources/file2.json
```
[![asciicast](https://asciinema.org/a/OelGNVnRUKpwhbneEGOBAkwDX.svg)](https://asciinema.org/a/OelGNVnRUKpwhbneEGOBAkwDX)

### Сравнения вложенных структур в формате json:
```bash
./app/build/install/java-project-71-app/bin/java-project-71-app -f json /home/user/IdeaProjects/java-project-61/java-project-71/app/src/test/resources/file1.json /home/user/IdeaProjects/java-project-61/java-project-71/app/src/test/resources/file2.json
```
[![asciicast](https://asciinema.org/a/r4alFm2cZnhtAv0TUy1w39dDn.svg)](https://asciinema.org/a/r4alFm2cZnhtAv0TUy1w39dDn)