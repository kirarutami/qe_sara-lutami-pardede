# Session 9 - Basic Linux Command

Rangkuman ini berisi:
1. Definisi Linux Command
2. Kelebihan Command Linux
3. Shell Script
4. Praktikum

# Definisi Linux Command

→ sebuah utilitas dari sistem operasi linux, semua tugas dasar dan lanjutan dapat dilakukan dengan melakukan commands. Commands dijalankan di terminal Linux.

# Kelebihan Command Linux

1. Less Resource: CLI ringan digunakan sehingga tidak merharuskan komputer untuk memiliki spesifikasi tinggi
2. Repetitive Task Friendly: dapat menyimpan script untuk mengotomatiskan tugas yang sama berulang kali
3. Powerful: terlihat lebih stabil dibandingkan GUI karena hanya menggunakan teks

# Shell Script
→ sebuah bahasa pemrograman yang disusun berdasarkan shell commands. Shelll merupakan program yang berfungsi sebagai jembatan antara user dan kernel.

# Praktikum

# Commands pada Linux
===
## Basic Commands

### cal
perintah untuk memperlihatkan kalendar

![cal](./screenshots/basic-commands/cal.png)

### date
perintah untuk memperlihatkan tanggal

![date](./screenshots/basic-commands/date.png)

## File System Commands

### touch
perintah untuk membuat sebuah file kosong di direktori saat ini

![touch](./screenshots/file-system-commands/touch.png)

### cat
singkatan dari concatenate, perintah ini digunakan untuk memperlihatkan list dokumen yang dipilih

![cat](./screenshots/file-system-commands/cat.png)

### cp
perintah untuk menyalin (copy) sebuah file

![cp](./screenshots/file-system-commands/cp.png)

### mv
perintah untuk memindahkan sebuah file

![mv](./screenshots/file-system-commands/mv.png)


### rm
perintah untuk menghapus sebuah file

![rm](./screenshots/file-system-commands/rm.png)

### mkdir
perintah untuk membuat sebuah folder

![mkdir](./screenshots/file-system-commands/mkdir.png)

### rmdir
perintah untuk menghapus sebuah folder, pada kali ini folder harus tidak ada isi atau kosong

![rmdir](./screenshots/file-system-commands/rmdir.png)

### cd
perintah untuk berpindah direktori

![cd](./screenshots/file-system-commands/cd.png)

### pwd
perintah untuk mengetahui posisi direktori user saat ini

![pwd](./screenshots/file-system-commands/pwd.png)

## Process Control Commands

### top
singkatan dari table of process, menampilkan aktivitas prosesor dari Linux yang sedang digunakan.

![top](./screenshots/process-control-commands/top.png)

### clear
perintah untuk membersihkan window command line.

![clear](./screenshots/process-control-commands/clear.png)

### history
perintah untuk menampilkan perintah apa saja yang telah diketikkan sebelumya pada CLI

![history](./screenshots/process-control-commands/history.png)

## Utilities Program Command

### ls
perintah untuk menampilkan konten yang tersedia pada direktori saat ini

![ls](./screenshots/utilities-programs-commands/ls.png)

### which
perintah yang digunakan untuk mencari perintah yang dapat dieksekusi di direktori yang ditentukan oleh variabel environment

![which](./screenshots/utilities-programs-commands/which.png)

### sudo
perintah untuk menjalankan perintah dengan status super user, contohnya sudo su untuk masuk sebagai root

![sudo](./screenshots/utilities-programs-commands/sudo%20su.png)

### find
perintah untuk mencari file 

![find](./screenshots/utilities-programs-commands/find.png)

## File Access Permission

### chmod
perintah untuk mengubah permission file atau folder yang dipilih

![chmod](./screenshots/file-access-permission/chmod.png)
===
# Shell Script
===
Kali ini saya membuat Shell Script seperti di bawah ini.

![script](./screenshots/shell-script/script.png)

### echo "Halo, Selamat Datang"
program akan menuliskan teks "Halo, Selamat Datang" begitu pula dengan perintah echo lainnya

### read -p "Tambahkan daftar belanja anda: " daftar
program akan membaca input oleh user dan disimpan dalam variabel %daftar

### echo "$daftar" >> daftar-belanja.txt
program akan menambahkan variabel $daftar ke dalam daftar-belanja.txt.

### clear
program akan membersihkan window command line.

### cat daftar-belanja.txt
program akan menampilkan isi dari daftar-belanja.txt

### sleep
program akan delay selama 2 detik

## Hasil Program

Berikut hasil running dari program sheel script yang telah dituliskan sebelumnya.

![hasil-1](./screenshots/shell-script/hasil-1.png)

![hasil-1](./screenshots/shell-script/hasil-2.png)