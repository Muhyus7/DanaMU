# Login Automation - Katalon Studio

## Prasyarat
- Katalon Studio (v10.x atau terbaru)
- Chrome Driver / Gecko Driver sesuai versi browser
- Akun Staging dengan akses API Mock

## Cara Menjalankan Secara Lokal
1. Clone repositori ini.
2. Buka Katalon Studio -> Open Project.
3. Klik kanan pada `Test Suites/Login_Suite`.
4. Pilih `Run` -> `Chrome`.

## Integrasi CI/CD (GitHub Actions / Jenkins)
Gunakan Katalon Runtime Engine (KRE):
```bash
katalonc -noSplash -runMode=console -projectPath="C:\Project\MyProject.prj" \
-retry=0 -testSuitePath="Test Suites/Login_Suite" -browserType="Chrome (headless)" \
-apiKey="YOUR_KATALON_API_KEY"
