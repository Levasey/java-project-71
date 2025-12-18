# 📊 Gendiff Utility

[![CI/CD Build](https://github.com/Levasey/java-project-71/actions/workflows/build.yml/badge.svg)](https://github.com/Levasey/java-project-71/actions/workflows/build.yml)
[![Hexlet Check](https://github.com/Levasey/java-project-71/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/Levasey/java-project-71/actions/workflows/hexlet-check.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=Levasey_java-project-71&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=Levasey_java-project-71)

A command-line utility for comparing the contents of two text files (JSON and YAML formats) with multiple output formats.

---

## 📋 Table of Contents
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Project Structure](#project-structure)
- [Testing](#testing)
- [CI/CD](#cicd)
- [Code Quality](#code-quality)

---

## ✨ Features

### 📁 **Supported File Formats**
- **JSON** (.json files)
- **YAML** (.yml, .yaml files)

### 🎨 **Output Formats**
| Format | Description | Use Case |
|--------|-------------|----------|
| **`stylish`** (default) | Tree format with color highlighting | Human-readable visualization |
| **`plain`** | Textual list of changes | Simple change tracking |
| **`json`** | Differences in JSON format | Machine processing |

### 🔧 **Core Capabilities**
- 🔄 Recursive comparison of nested structures
- 🎯 Clear indication of changes: `added` / `removed` / `changed`
- 🛡️ Robust error handling for malformed files
- 📊 Support for complex nested objects and arrays

---

## 🚀 Installation

### Prerequisites
- **Java 17+** (recommended)
- **Gradle 8.5+**

### Steps
```bash
# 1. Clone the repository
git clone https://github.com/Levasey/java-project-71.git
cd java-project-71

# 2. Build the project
./gradlew build

# 3. Install the utility
./gradlew installDist

# 4. Verify installation
./app/build/install/app/bin/app --version
