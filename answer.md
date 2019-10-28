
# Knowledge & Experience Questions

### 1. Apakah anda pernah menggunakan Kotlin? Jika pernah jelaskan perbedaan mendasar antara Kotlin dengan Java sesuai dengan pengalaman anda. 

Iya pernah, sekarang ini semua project yg saya buat telah menggunakan Kotlin. Perbedaan mendasar pada kotlin adalah pada kotlin sudah support smart cast dengan mengidentifikasi immutable type dan dapat menggunakan implicit casting pada variable sedangakan pada java kita wajib mengidentifikasi type variable dan melakukan casting pada setiap variable nya. Selain itu di kotlin juga terdapat Null Safe, kita tau pada java NullPointerException merupakan penyumbang error terbesar pada aplikasi, sehingga kita wajib melakukan pengecekan pada variable sebelum mengolah variable tersebut, sedangkan pada kotlin semua variable merupakan non-null. Kotlin juga memiliki Extension Function jadi kita tidak perlu membuat class baru dengan extends pada class yg sudah ada.

### 2. Apa saja library Android yang sering atau biasa anda pakai? Jelaskan kegunaannya bagi anda. 
- [FastAndroidNetworking](https://github.com/amitshekhariitbhu/Fast-Android-Networking)
	FastAndroidNetworking adalah library yang powerfull untuk melakukan aktifitas Networking seperti membuat Request , Upload, atau Download segala jenis file. Kelebihan dari library ini yaitu mudah di gunakan, cepat, dan kita dapat merubah beberapa pengaturan seperti priority, cancelling dan lain lain
- [Glide](https://bumptech.github.io/glide/)
   Glide merupakan opensource media managemen dan image loader. Glide mendukung pengambilan, decoding, menapilkan video, gambar, dan animasi GIF. 
- [Gson](https://github.com/google/gson)
   Gson Merupakan library yang dapat digunakan untuk mengubah Java Object ke dalam format JSON atau sebaliknya.

### 3. akah anda menggunakan prinsip clean code atau design pattern untuk project Android anda? Jelaskan penerapan clean code atau design pattern yang biasa anda gunakan dan manfaatnya untuk anda.
ya Saya menggunakan prinsip clean code, selama ini saya menggunakan design pattern MVVM. Prinsip clean code yang saya terapkan antara lain menggunakan nama variable/class/object dengan nama yg mudah di pahami dan menggunakan CamelCase, menggunakan 

### 4. Apakah tantangan terbesar yang pernah anda temui dalam mengerjakan project Android dan bagaimana anda menyelesaikannya dari sisi engineering?


### 5. Untuk efisiensi pengerjaan project dalam tim, bagaimana workflow anda dari proses development hingga merilis aplikasi hingga bisa digunakan oleh tester / client?

### 6. Jelaskan teknik-teknik apa saja yang dapat meningkatkan performance dan keamanan sebuah aplikasi Android.
- Komunikasi dengan API harus menggunakan middleware, bisa menggunakan Oauth2
- Gunakan Secure Sockets Layer (SSL) untuk menghindari Man in the middle
- Menggunakan proguard untuk merubah nama variable, fungsi dan class. Proguard juga mampu mengoptimalkan bytecode serta mendeteksi dan menghapus instruksi yang tidak digunakan.
- Hanya gunakan permission yang diperlukan.
- Jangan terlalu sering menggunakan static references karena dapat mengakibatkan memory leak
- Gunakan event buz
- Jangan terlalu sering menggunakan Service di belakang layar, karena dapat mempercepat Battery habis

### 7. Apakah anda bersedia onsite di Malang?
Ya, Saya bersedia onsite di Malang