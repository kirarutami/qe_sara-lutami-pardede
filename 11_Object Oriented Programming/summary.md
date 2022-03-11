# Section 11 - Object Oriented Programming

Rangukuman ini berisi:
1. Alasan Memilih OOP
2. Komponen OOP
3. 3 Macam Modifier
4. Basic Programming

## Alasan Memilih OOP
1. Mempercepat pembuatan aplikasi
2. Jika program makin besar/kompleks, kode kita susah buat dimaintenance kalo pake prosedural.

## komponen oop
### Class
- mengumpulkan prosedur, fungsi dan variabel, dalam satu tempat
- blueprint dari suatu objek
- new=> java class=> nama class nya
- merepresentasikan objek yang akan dibuat
- penulisan nama class ada aturan (pascal case, diawali huruf kapital, dan jangan ada spasi diantaranya)

### Object
- variable *instant? instance?* yang merupakan wujud dari class
- digambarkan dengan variabel dan method
- berisi beberapa kumpulan variabel dan fungsi yg menggambarkan sebuah objek

### Attribute
- bagian dari class yg masih berhubungan erat dengan class tersebut
- properties dari sebuah class
- contoh : kita punya class namanya Car, lalu kita bikin atributnya
- int speed;
- int tire;
- penggunaan atribut berlaku dari kurung kurawal sampe kurung kurawal akhir, ini dinamakan scope 
- untuk penulisannya menggunakan lower case, kemudian kata berikutnya kapital., contoh int listCar; int listGetMethod;

### Method
- menjelaskan bagaimana suatu atribut beraksi
- peran yg dimaksud berupa tingkah laku/behaviour yg digambarkan oleh suatu method
- misal, ada class manusia, manusia ada tingkah laku seperti berbicara, makan, berjalan dll. 


### Inheritance
- hubungan 2 objek atau lebih
- terdapat sebuah objek utama yang mewariskan atribut/method yg dimilikinya ke objek lainnya.
- contoh kucing sebagai mamalia mewarisi bulu,telinga, dan mata induknya.
- diwariskan menggunakan keywoard extends.
- public class PersegiPanjang extends BangunDatar {}
- semua member dalam kelas itu bisa diakses oleh anaknya/subclassnya kecuali dikasih modifier private

* semua dalam class, atribut, dan method disebut member
* biasanya ada tingkatan akses modifier

## 3 Macam Modifier
1. public = membuat member dan class bisa di akses dari mana aja. misalnya ada 2 package, nah masing2 package ada classnya. nah dari class 1 bisa akses class lainnya di package yang berbeda.
2. private = member hanya bisa diakses dalam class itu sendiri.
3. protected = member itu bisa di akses oleh class itu, dan class lain tapi dalam satu package. kalo package lain gabisa ngeakses dia.
**kalo ga pake ketiga itu disebut no-modifier**
