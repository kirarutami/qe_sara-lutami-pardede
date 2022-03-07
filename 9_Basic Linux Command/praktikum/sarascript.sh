#!/bin/sh
echo "Halo, Selamat Datang"
read -p "Tambahkan daftar belanja anda: " daftar
echo "$daftar" >> daftar-belanja.txt
clear
echo "$daftar telah ditambahkan ke dalam daftar belanja."
echo "=============================="
cat daftar-belanja.txt
echo "=============================="
echo "Jangan lupa dibeli, ya!"
sleep 2
