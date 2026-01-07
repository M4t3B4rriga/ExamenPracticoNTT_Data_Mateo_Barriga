# Pruebas de Performance - Login API

## 1. Prerequisitos

- Sistema Operativo: Windows 11
- Editor: Visual Studio Code
- Node.js: Node.js v22.11.0
- K6: k6.exe v1.4.2 (commit/5b725e8a6a, go1.25.4, windows/amd64)
- Git instalado y configurado: git version 2.47.0.windows.2
- Cuenta GitHub

## 2. Comandos de instalación

Clonar el repositorio: 
```bash
git clone https://github.com/M4t3B4rriga/ExamenPracticoNTT_Data_Mateo_Barriga.git
```
Ingresar a la carpeta: 
```bash
cd performance-login-k6
```
Instalar K6:
CMD como administrador 
```bash
choco install k6 -y
```
Ejecución de prueba:
```bash
k6 run scripts/login_test.js
```

Para volver a generar el reporte: 
El reporte ya esta cargado en la carpeta report/summary.txt 
```bash
k6 run scripts/login_test.js > reports/summary.txt
```




