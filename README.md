# Sistem Manajemen Bank: Array vs ArrayList (Java)

Repitori ini berisi program berbasis konsol Java yang mendemonstrasikan perbandingan pengelolaan data menggunakan **Array statis** dan **`ArrayList` dinamis** pada sistem manajemen rekening bank. Proyek ini dibangun dengan menerapkan prinsip modularitas.

## 🚀 Cara Menjalankan Program (Compile & Run)
Kompilasi seluruh file program secara bersamaan dengan perintah:
   ```bash
   javac Main.java Bank.java BankDemo.java
   ```

Jalankan program utama:
   ```bash
   java Main
   ```

## 💻 Penjelasan Struktur File & Implementasi Kode

Proyek ini dibagi menjadi 3 file terpisah untuk menjaga kerapian dan pemisahan tanggung jawab (*separation of concerns*):

### 1. `Bank.java` (Model / Blueprint)
Bertindak sebagai kelas entitas yang merepresentasikan data rekening bank. Berisi:
* Atribut privat: `noRekening`, `nama`, dan `balance`.
* *Constructor* untuk inisialisasi data awal akun.
* Method transaksi: `deposit()` dan `withdraw()` untuk mengubah saldo secara aman.
* Kumpulan *getter* untuk mengakses data privat.

### 2. `BankDemo.java` (Logika & Menu Interaktif)
Menampung seluruh logika program utama, yang mencakup:
* **Array Statis (`daftarAkunArray`)**: Kapasitas tetap (100) dengan penghitung manual `jumlahAkunArray`.
* **`ArrayList` Dinamis (`daftarAkunArrayList`)**: Koleksi objek yang fleksibel dan ukurannya otomatis bertambah saat data baru dimasukkan.
* Sistem navigasi menu interaktif menggunakan perulangan `do-while` dan `Scanner`.

### 3. `Main.java` (Entry Point)
File utama yang sangat bersih dan ringkas. Bertugas khusus sebagai titik masuk (*entry point*) untuk mengeksekusi method `jalankanProgram()` dari kelas `BankDemo`.

## 🔍 Poin Utama Pembelajaran `ArrayList`
* **Dinamisme**: Penambahan akun baru ke dalam *list* dilakukan secara fleksibel menggunakan method `.add()` tanpa batasan kapasitas awal.
* **Pencarian Data**: Memanfaatkan perulangan *for-each* untuk mencocokkan nomor rekening target sebelum melakukan pembaruan saldo.
