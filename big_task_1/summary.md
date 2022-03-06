# Big Task 1 Alterra
Diberikan studi kasus untuk mengelola pengujian portal berita dan toko online melalui Jira dan TestRail. Penulis mengambil website [Kumparan](https://kumparan.com) serta [Amazon](https://www.amazon.com) sebagai tempat studi kasus.

Penulis menggunakan 2 project berbeda pada TestRail, project untuk Portal Berita Kumparan dipisah dengan Toko Online Amazon.
# Test Case pada TestRail
Penulis menggunakan TestRail sebagai Test Case Management Tools.
## Test Case Portal Berita: Kumparan
Halaman yang penulis ambil kali ini adalah:
1. Halaman Masuk
2. Halaman Buat Tulisan
3. Halaman Dashboard

### Halaman Masuk
[masuk](./screenshots/login-page.png)

Test Case yang dapat dilakukan antara lain:

[masuk-tc](./screenshots/test-rail/kumaran/masuk.png)

### Halaman Buat Tulisan
[buat-tulisan](./screenshots/buat-tulisan.png)

Test Case yang dapat dilakukan antara lain:

[buat-tulisan-tc](./screenshots/test-rail/kumaran/buat-tulisan.png)

### Halaman Dashboard
[dashboard](./screenshots/dashboard.png)

Test Case yang dapat dilakukan antara lain:

[dashboard-tc](./screenshots/test-rail/kumaran/dashboard.png)

## Test Case Toko Online: Amazon
Halaman yang penulis ambil kali ini adalah:
1. Halaman Shipping Address
2. Halaman Payment Method
3. Halaman Cart System

### Halaman Shipping Address
[shipping](./screenshots/shipping-address.png)

Test Case yang dapat dilakukan antara lain:

[shipping-tc](./screenshots/test-rail/amazon/shipping.png)

### Halaman Payment Method
[payment](./screenshots/payment-method.png)

Test Case yang dapat dilakukan antara lain:

[payment-tc](./screenshots/test-rail/amazon/payment.png)

### Halaman Cart System
[cart](./screenshots/shipping-cart.png)

Test Case yang dapat dilakukan antara lain:

[cart-tc](./screenshots/test-rail/amazon/cart.png)



# Pembuatan Milestone, dan Test Run pada TestRail
Setelah pembuatan Test Case, penulis membuat Milestone dan Test Run di kedua project.
## Milestone dan Test Run pada Portal Berita Kumparan
Milestone:

[milestone-kumparan](./screenshots/test-rail/kumparan-milestone-before-testing.png)

Test Run:

[tr-kumparan](./screenshots/test-rail/kumparan-test-run-before-testing.png)

## Milestone dan Test Run pada Toko Online Amazon
Milestone:

[milestone-kumparan](./screenshots/test-rail/amazon-milestone-before-testing.png)

Test Run:

[tr-kumparan](./screenshots/test-rail/amazon-test-run-before-testing.png)

# Pembuatan Project dan Sprint pada Jira
Setelah pengaturan TestRail di atas, penulis membuat project serta sprint untuk manajemen testing kedepannya. Kali ini, project hanya akan ada satu namun terdapat 2 buah sprint yang dapat berjalan secara paralel. [enulis membuat project dengan kriteria dibawah ini:
1. Project template: Scrun
2. Project type: Company-managed
Lalu, membuat 2 buah sprint yang dapat berjalan secara paralel.
1. Kumparan.com Sprint
2. Amazon.com Sprint

# Eksekusi Test Case pada TestRail
Setelah sprint dimulai, penulis akan eksekusi Test Case yang ada pada Test Rail. Hasilnya dapat dilihat di bawah ini.
## Hasil Eksekusi Test Case Portal Berita Kumparan
[test-run-kumparan](./screenshots/test-rail/kumparan-test-run-after-testing.png)

Berikut Overview untuk Portal Berita Kumparan setelah Testing:

[overview-kumparan](./screenshots/test-rail/kumparan-milestone-after-testing.png)

## Hasil Eksekusi Test Case Toko Online Amazon
[test-run-amazon](./screenshots/test-rail/amazon-test-run-after-testing.png)

Berikut Overview untuk Toko Online Amazon setelah Testing:

[overview-kumparan](./screenshots/test-rail/amazon-milestone-after-testing.png)

Dari hasil eksekusi tersebut, kita dapat melihat bahwa ada beberapa Test Case yang berstatus Failed. Dari hasil tersebut bisa diindikasikan bug dan kita harus melaporkannya ke Jira. 

# Bug Reporting pada Jira
Setelah eksekusi dan ada Test Case yang berstatus Failed, hal tersebut berindikasi adanya Bug. Penulis melaporkan Bug dari kedua website. Perlu dicatat bahwa berikut ini merupakan penulisan bug yang ideal menurut penulis.

[penulisan-bug](./screenshots/jira/contoh-penulisan-bug.png)

Berikut Bug yang ditemukan:
## Bug pada Portal Berita Kumparan
BTS-8 hingga BTS-10 merupakan bug cards.

[bug-kumparan](./screenshots/jira/kumparan-cards.png)

## Bug pada Toko Online Amazon
BTS-17 hingga BTS-19 merupakan bug cards.

[bug-kumparan](./screenshots/jira/amazon-cards.png)

# Start Sprint pada Jira
Ketika selesai melaporkan bug pada Jira, penulis langsung Start Sprint. Disini akan terjadi simulasi proses developing dan fixing. Epic, Task, dan Bug yang tadinya ada pada Sprint akan tersedia pada bagian TO DO di Board (atau dapat dilihat pada Active Sptints). Bug yang tadinya tersedia akan diperbaiki terlebih dahulu oleh programmer dan card akan dipindahkan ke bagian IN PROGRESS. Jika sudah selesai diperbaiki, card akan dipindahkan ke FINISH dan kemudian ke fase DELIVER jika bug sudah tersedia untuk diuji. Setelah itu, Tester akan memindahkan card ke fase TESTING jika akan menguji bug yang tadinya sudah dilakukan fixing. Setelah selesai, bug yang sudah diperbaiki akan pindah ke fase DONE, sedangkan yang butuh perbaikan lagi akan pindah ke fase NEED FIXING.







