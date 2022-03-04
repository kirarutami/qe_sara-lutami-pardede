# Session 7 - Agile Testing

Rangkuman ini berisi:
1. Definisi  Software Development Life Cycle (SDLC)
2. Model SDLC
3. Agile Testing Manifesto
4. Praktikum

## Definisi  Software Development Life Cycle (SDLC)
→ proses yang digunakan untuk merancang, mengembangkan, serta menguji software berkualitas tinggi. Tujuannya untuk membantu organisasi menghasilkan software berkualitas tinggi dengan waktu yang singkat dan biaya yang rendah, namun tetap memenuhi atau bahkan melebihi harapan pelanggan. Fungsi lainnya adalah dapat memberikan gambaran input dan output dari satu tahap ke tahap berikutnya.

### Fase SDLC
1. Requirements Gathering : 
→ sistem akan dianalisis bagaimana nanti dijalankan, kelebihan kekurangan sistem, fungsi sistem , pembaharuan yang dapat diterapkan
2. Design :
→ membuat model cara kerja aplikasi/software
3. Development (code) :
→ proyek kecil = dapat ditulis 1 dev aja, kalo besar bisa beberapa tim
4. Testing :
→ sistem diuji sebelum di publish, apakah bisa bekerja optimal atau tidak.
5. Deployment : 
→ aplikasi sudah tersedia pada user untuk digunakan
6. Maintenance
→ aplikasi sudah selesai dan bisa digunakan oleh pengguna. bisa jadi ada bug pada aplikasi

## Model SDLC
1. Waterfall =
 → setelah fase 1 selesai, fase berikutnya dimulai. jika ada satu detail kecil tertinggal maka akan mempengaruhi keseluruhan.
2. agile model = 
 → tim akan mencoba tiap produk yang sudah selesai untuk meminimalisir kesalahan. Dapat memicu proyek ke arah yg salah dan ga sesuai keinginan
3. Iterative model 
 → repetisi tinggi, dapat mengkonsumsi bahan baku jika ada 1 detail tertinggal
4. V-shaped model
 → lanjutan waterfall model, mencoba tiap fase dalam proses pengembangan suatu produk
5. Bigbang model
 → model yang beresiko tinggi saat dijalankan, karena semua bahan baku diinvestasikan dalam project tersebut. berhasil untuk proyek yang kecil dan berbahaya untuk proyek yang besar
6. Sprial model
 → paling fleksibel dan mirip iterative model
 → fokus pada repetisi dalam pengerjaannya.


## Agile Testing Manifesto
hal-hal yang jauh dari agile testing manifesto : 
- Testing is always behind
- automation is even further behind that
- testers can't work until development is done
- there is pressure at the end of a sprint
- there is blame around bugs (it's his fault etc.)

5 kunci dalam agile testing manifesto:
1. Testing is an Activity, not a Phase
  tester perlu beriringan dengan development. seperti membuat test case sebelum dev menulis code.

2. Prevent Bugs Rather than Finding Bugs
  bug bisa muncul karena req yang kurang lengkap/detail. sehingga kita perlu tulis dulu req nya, dengan komunikasi sesama anggota tim.

3. Don't be A Checker, be A Tester
  jangan ngecek doang dan ga paham kebutuhan user. maka kita perlu memberikan feedback terhadap apa yg dites

4. Don't Try to Break the System, Instead Help Build the Best Possible System
 QE bakal nyari positif dan negatif. dan terkadang senang kalo nemu bugnya. tapi kita perlu inget bahwa kita mau bikin software yang berkualitas. sehingga kita perlu memposisikan diri sebagai user. 

5. The Whole Team is Responsible for Quality, not Just the Tester
  jgn bebanin ke QE yang ga teliti cek bug, atau salahin dev karena salah coding, tp semua bertanggung jawab.

===
# Praktikum
## Pada fase apa saja QE berperan pada proses SDLC? sebutkan dan jelaskan peran seperti apa yang QE dapat lakukan pada setiap fase tersebut!
→ 
1. QE di Requirements Gathering
  QE dapat membantu perusahaan menghemat budget yang ada dengan ikut serta memberikan ide mengenai fitur yang akan ditambahkan di masa depan. Selain itu, QE juga dapat curi start untuk membuat test scenario serta test case yang nantinya akan dipakai.
2. QE di Fase Design
  Kurang lebih sama dengan fase sebelunya, pada Fase Design, QE dapat membantu terlibat dalam mengidentifikasi desain yang mungkin nantinya akan menjadi blocker atau masalah pada software.
3. QE di Fase Development
  Pada fase Development, QE akan turut mempertimbangkan dampak dan pengalaman pengguna di masa depan. Bisa jadi dengan memberikan saran mengenai animasi ataupun posisi tombol yang nantinya ada di software. 
4. QE fi Fase Testing
  Ini adalah fase terpenting untuk seorang QE, dimana QE akan membuat test case dan mengeksekusinya untuk menjaga kualitas software yang sedang dikembangkan. Selain itu, QE juga akan membuat bug report jika menemukan bug pada proses testing. Ketika proses tadi dijalankan, QE juga harus mencoba untuk mencari tahu system requirements terbaik yang akan digunakan oleh end-user nantinya. 
5. QE di Fase Deployment
  Pada fase Deployment, QE biasanya melakukan Smoke Testing untuk memastikan fungsi penting pada software dapat berjalan dengan baik tanpa adanya masalah ataupun showstopper.
5. QE di Fase Maintenance
 Di fase ini, QE akan mengulangi apa yang dilakukan pada fase Testing. Ini juga berlaku pada tahap bug fixing, yaitu QE harus melakukan verify bugfix yang telah dilakukan tim programmer sebelumnya. Pegujian testing lainnya juga akan dilakukan untuk memastikan fungsi-fungsi yang ada sebelumnya dapat berjalan dengan baik. Di fase ini juga biasanya QE akan memeriksa bug yang dilaporkan oleh pengguna software itu sendiri.
---
## Menurut teman teman, apa tantangan ketika menerapkan agile testing? berikan penjelasna pada masing masing 5 poin agile testing manifesto!
→ 
1. Testing is an Activity, not a Phase, artinya tester harus melakukan testing secara berkala. Adapun tantangannya ialah ketika di akhir proses Development, QE harus testing software secara keseluruhan dan hal tersebut akan membutuhkan waktu yang cukup lama.
2. Prevent Bugs Rather than Finding Bugs, biasanya dikarenakan requirements yang kurang lengkap ataupun detail. Tantangan yang harus dilalui seorang QE adalah untuk membuat requirements yang detail dan mengidentifikasi darimana "calon" bug akan muncul. Hal ini juga dapat dilakukan dengan berhipotesis dengan tim programmer sehingga komunikasi juga merupakan hal yang penting untuk dilakukan.
3. Don't be A Checker, be A Tester, sebagai QE pemula banyak yang masih takut untuk berkomunikasi memberikan feedback kepada tim programmer. Tantangan tersebut dapat dilatih dengan menulis review singkat mengenai software yang diuji dan diberikan pada tim programmer sebagai saran untuk penyempurnaan fitur ataupun sistem.
4. Don't Try to Break the System, Instead Help Build the Best Possible System. Jika tahap sebelumya memberikan review dengan kacamata tester, kali ini QE harus dapat memberikan masukan dengan kacamata user. Hal tersebut terkadang sulit dilakukan terutama untuk tester lama karena terkadang hasil masukan atau review yang diberikan pada programmer dapat bersifat bias.
5. The Whole Team is Responsible for Quality, not Just the Tester. Tantangan yang akan ditemui kadang berupa pressure yang didapatkan dari tim. Biasanya ketika sehabis menyelesaikan build, yang menguji hanya tim QE, sehingga proses pengujian akan tidak efektif terutama untuk tim yang memiliki QE sedikit.
