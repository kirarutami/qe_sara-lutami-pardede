# Session 4 - Testing Documentation

Rangkuman ini berisi:
1. Test Scenario
2. Test Case
3. Cara Membuat Test Case


## Test Scenario
Test scenario adalah konsep yang berisi satu baris informasi mengenai apa yang akan dites. Konsep ini dapat dibedakan menjadi 2, High level Test Scenario & Low level Test Scenario.
Ada halaman login terdiri dari username, password, tombol login dan tombol cancel.
### High-level Scenario:
1. Fungsi Login

### Low-level Scenario
1. Check ketika membuka halaman login
2. Check konten di halaman login
3. Check Username field
4. Check Password field
5. Check fungsi tombol Login & tombol Cancel

## Test Case
Test case adalah sekumpulan dari aksi yang akan di eksekusi  untuk memastikan fitur atau fungsi tertentu dari aplikasi. Test case biasanya berisi Test Steps, Test Data, Precondition, Postcondition yang diperuntukkan secara spesifik untuk suatu Test scenario.

## Cara Membuat Test Case
1. Simple and transparent = Semua langkah pelaksanaanya pun juga harus jelas dan tidak ada yang terlewat.
2. End-user mind = Tester bermindset bahwa ia adalah end-user. Selain memperhatikan berdasarkan requirement yang ada, kemudahan dalam penggunaan aplikasi juga perlu diperhatikan karena kepuasan user adalah saat aplikasi tidak memiliki kegagalan sistem yang bisa menghambat berjalannya sistem tersebut.
3. Don’t assume = Tester diharapkan tidak berasumsi bahwa end-user mengerti keseluruhan dari aplikasi. Jadi usahakan susun test case walaupun hal yang termudah.
4. Easy to understand = Pemilihan bahasa sewaktu menyusun test case juga harus diperhatikan karena pengguna test case bukan hanya tester saja. Bahasa yang sederhana dan mudah dipahami lebih disukai karena bisa dimengerti bahkan oleh end-user yang mungkin awam.
5. Repeatable. = Artinya test case harus mempunyai kondisi hasil yang sama di seluruh platform yang sedang dites. Contoh : apabila di OS Android setelah login, maka akan tampil halaman my profile maka di iOS pun akan demikian.
6. Peer review = Meminta tolong pada tester lain atau orang lain untuk me-review test case yang kita susun. Apabila pemilihan bahasa yang dipilih kurang baik dan menimbulkan banyak pertanyaan, tester perlu melakukan perubahan agar test case lebih mudah untuk dipahami.