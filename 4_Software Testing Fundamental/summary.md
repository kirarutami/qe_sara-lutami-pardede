# Session 4 - Software Testing Fundamental

Rangkuman ini berisi:
1. Software Testing
2. Tipe-tipe Software Testing
3. Level dalam 
4. Praktikum

## Software Testing
→ (ANSI/IEEE 1059) software testing adalah sebuah proses menganalisis sistem perangkat lunak untuk mendeteksi perbedaan antara kondisi yang sekarang dan kondisi yang akan diperlukan untuk mengevaluasi fitur atau item perangkat lunak.
### Seberapa penting Software Testing?
→ Software Testing sangat penting. Dengan adanya software testing, kita dapat mengehemat uang, menjamin kualitas produk, keamanan terjaga, sehingga mendapatkan kepuasan pelanggan.
### Testing Platform
→ dibedakan menjadi 4 macam: API (Application Programming Interface), Web, Mobile, dan Desktop.

## Tipe-tipe Software Testing
### Functional Testing
→ jenis pengujian yang memverifikasi bahwa setiap pengujian atau operasi sesuai dengan requirements spesification.
1.  Manual Testing → Pengujian yang dilakukan secara manual tanpa menggunakan bantuan tools. Bertujuan untuk memastikan aplikasi yang diuji bebas cacat dan bekerja sesuai dengan yang diharapkan
2.  Automation Testing → Pengujian bertujuan untuk membandingkan antara output yang diprediksikan dengan output yang dihasilkan oleh sistem.

> The right selection of automation tool, testing process and team, are important players for automation to be successful. Manual and automation methods go hand-in-hand for successful testing.

### Non-Functional Testing
→ pengujian dari aspek non-fungsional seperti kinerja, keandalan, kegunaan, keamanan, dan sebagainya. Dilakukan setelah Functional Testing selesai. Contoh non-functional testing:
1.  Performance Testing → speed, scalability (maksimum load), stability. Hasilnya akan menjadi sebagai pedoman performa aplikasi
2.  Maintenance Testing → dilakukan setelah rilis ke user. Contohnya Regression Testing (dilakukan ketika adanya fitur baru yang ditambah atau fitur lama yang dihapus)

## Level dalam Testing
### Unit Testing
→ sebuah pengujian perangkat lunak yang menguji setiap unit atau komponen dari sebuah perangkat lunak. Dilakukan pada tahap development. Komponen yang diuji adalah unit berupa function, method, procedure, module, ataupun object. Bertujuan agar setiap unit dapat bekerja sesuai dengan yang diharapkan.

### Integration Testing
→ pengujian dari hasil unit-uniit yang ada di dalam perangkat lunak. Biasanya diuji sebagaimana unit tersebut bekerja dalam satu kombinasi. Dilakukan secara bertahap untuk menghindari kesalahan. Bertujuan untuk:
1.  Memeriksa software agar berjalan dengan baik
2.  Memeriksa kinerja aplikasi
3.  Memeriksa struktur program yang telah dirancang

### System Testing
→ pengujian yang dilakukan dalam satu kesuluruhan sistem (end-to-end testing). Cakupannya akan memeriksa aspek fungsional ataupun non-fungsional.

### Acceptance Testing
→ digunakan untuk menentukan apakah sistem telah memenuhi kebutuhan pengguna. Diuji terakhir sebelum sistem diberikan pada pengguna. Tujuannya untuk membandingkan apakah aplikasi sudah sesuai dengan proses bisnis dan kebutuhan atau tidak.

> Testers don’t like to break things; they like to dispel the illusion that things work

---------
## Praktikum
![Soal1](https://drive.google.com/file/d/1MnKP6fZbHvmX5Mqsohq3Qcj5Bo7SbJNy/view?usp=sharing "Soal 1")

Line Coverage = salah satu jenis white box testing. Biasanya juga dikenal dengan Code Coverage. Line coverage mengukur seberapa banyak baris kode yang telah dibuat sudah dilakukan proses testing. Semakin tinggi Line Coverage, semakin tinggi tingkat kepercayaan klien terhadap sistem yang sedang dibuat.

Mutation Coverage = testing yang dilakukan terhadap suatu program dengan memodifikasi satu bagian kecil dari sebuah fungsi/method kode program. Mutation testing dilakukan untuk menentukan apakah test case sudah cukup atau belum. Program yang dimodifikasi disebut dengan mutan, hasil dari mutan tersebut akan dinamakan dengan mutasi. 

Mutasi disebut dengan non-killable jika mutan yang dimasukkan menghasilkan output yang sama. Sedangkan killable jika mutan yang dimasukkan menghasilkan output yang berbeda, dan hasil ini yang diinginkan oleh tester.

Dari soal diatas, bisa disimpulkan bahwa:
1. Test case pertama memiliki line coverage 6/9, menandakan baris yang telah diuji ada sebanyak 6 dari 9 baris yang tersedia. 
    Sedangkan mutation coverage yang ada sebanyak 2/ (67%), menandakan ada 2 hasil mutasi killable dari 3 mutasi. 
    Hasil mutasi yang belum sampai 100% menandakan bahwa kita harus menambah test case lagi agar hasil menjadi 100%
2. Test case kedua memiliki Line Coverage sebanyak 6/6, berarti semua baris telah diuji. 
    Untuk Mutation Coverage telah dijalankan sebanyak 3/4 (75%), menandakan ada 3 hasil mutasi killable dari 4 mutasi. Hasil mutasi yang belum sampai 100% menandakan bahwa kita harus menambah test case lagi agar hasil menjadi 100%

![Soal2](https://drive.google.com/file/d/1P5BTChFFU9XTSKwU-zga2TscDTdQGky7/view?usp=sharing "Soal 2")

Dalam soal di atas, terdapat sebuah class yang bernama CalculatorServiceImpl, di dalamnya ada add dan substract.

Bisa disimpulkan bahwa method add dapat berhasil (dengan adanya highlight hijau) dikarenakan proses penambahan tidak ada kesalahan.

Sedangkan untuk method substract, method gagal (dengan adanya highlight merah) dikarenakan proses pengurangan ambigu. Bisa saja b-a alih-alih a-b.