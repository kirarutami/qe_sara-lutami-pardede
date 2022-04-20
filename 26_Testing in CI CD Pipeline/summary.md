## Section 26 - Testing in CI/CD Pipeline

[Repository Latihan](https://github.com/kirarutami/belajar-ci/)

Rangkuman ini berisi:
1. Pengertian Continuous Integration
2. Pengertian Continuous Delivery 
3. Apa yang membuat CI/CD Bagus?
4. Proses CI/CD
5. Implementasi CI
6. Implementasi CD
7. CI/CD Tools

## Pengertian Continuous Integration
Continuous Integration adalah praktik mengintegrasikan kode ke dalam repositori bersama dan membangun/menguji setiap perubahan secara otomatis, sedini mungkin - biasanya beberapa kali sehari.

## Pengertian Continuous Delivery 
Continuous Delivery menambahkan bahwa perangkat lunak dapat dirilis ke produksi kapan saja, seringkali dengan secara otomatis mendorong perubahan ke sistem staging. Continuous Deployment melangkah lebih jauh dan mendorong perubahan ke produksi secara otomatis

## Apa yang membuat CI/CD Bagus?
1. Decoupled stages -> setiap step pada CI harus fokus dalam mengerjakan tugas tunggal
2. Repeatable -> di automasi secara konsisten, tools juga harus bekerja pada developer lokal
3. Fail Fast -> langsung gagal di awal tanda-tanda masalah
4. Design with system in mind -> menutupi sebanyak mungkin bagian dalam proses pengerjaan, seperti: Application, Infrastruktur, Configuration, Data
5. Pipelines -> terus meningkatkan kepercayaan diri ketika menjalankan project
6. Globally Unique versions -> mengetahui keadaan sistem kapanpun, dapat mendemonstrasikan perbedaan antara keadaan sekarang ataupun masa depan.

## Proses CI/CD
1. Commit
2. Build
3. Test
4. Deploy

## Implementasi CI
### Keuntungan:
1. Mendeteksi Bug di awal Stage
2. Mengurangi jumlag bug
3. Proses development yang lebih transparan
4. Efisien

### Biaya:
1. Menulis Automated Test
2. Server untuk Automated Test
3. Merge code sesering mungkin

## Implementasi CD
### Keuntungan: 
1. Mengurangi risiko
2. Painless deplotment
3. Mengurangi biaya
4. Proses yang terautomasi dan transparan
5. Releases more frequently

### Biaya:
1. Fondasi yang kuat pada CI
2. Membutuhkan kualitas tes terbaik
3. Perlu memperbarui dokumen sesering mungkin

## CI/CD Tools
1. Jenkins
2. Atlassian Bamboo
3. circleci
4. AWS CodeBuild
5. Azure DevOps
6. Github Actions
7. Travis CI
8. GitLab CI

