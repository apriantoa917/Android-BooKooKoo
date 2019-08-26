package com.aprianto.bookookoo;

import java.util.ArrayList;

public class buku_data {
    //id, judul, penulis, harga, foto, th terbit, penerbit, link, deskripsi, kategori
    public static String[][] data = new String[][]{
            //buku 1
            {"0", "Kitab Hacker","Dedik Kurniawan","Rp 75.000", "https://cdn.gramedia.com/uploads/items/9786230004407_Kitab_Hacker__w414_hauto.jpg",
            "Agt 2019","Elex Media Komputindo", "https://www.gramedia.com/products/kitab-hacker",
            "Anda bercita-cita menjadi hacker handal? Kabar gembira untuk Anda karena buku ini dapat mewujudkan cita-cita Anda tersebut. Sungguh tujuan buku ini ditulis bukan untuk mengajari Anda menjadi seorang pencuri data atau pembobol sistem orang lain. Buku ini memiliki tujuan yang mulia, yaitu membantu Anda memahami ilmu hacking agar Anda tidak menjadi korban retas dari orang-orang yang tidak bertanggung jawab",
            "1"},
            //buku 2
            {"1","Android Application Development for Rookies with Database","Nadia Firly","Rp 59.500","https://cdn.gramedia.com/uploads/items/9786230003257_Android_Appli__w414_hauto.jpg",
            "Agt 2019","Elex Media Komputindo","https://www.gramedia.com/products/android-application-development-for-rookies-with-database",
            "Faktanya, Android telah digunakan oleh ratusan juta perangkat seluler di lebih dari 190 negara di seluruh dunia. Setiap harinya, terdapat 1 juta perangkat Android yang aktif dan lebih dari 1,5 miliar unduhan per bulan pada Google Play dan ke depannya, diperkirakan angka tersebut akan terus bertambah lho! Tidak heran, saat ini Android telah ternobatkan sebagai penguasa pasar smartphone dengan jumlah pengguna lebih dari 84%. Jika menengok kondisi pasar dalam negeri, tercatat lebih dari 103.000.000 perangkat yang aktif hanya dalam kurun waktu 5 tahun belakangan. Pasar yang begitu besar dan menjanjikan bukan? Anda yakin tidak ingin ikut berpartisipasi? Sudah tidak zaman lagi kebanyakan teori. Buku Android Application Development for Rookies with Database akan memandu Anda dalam melakukan berbagai implementasi program pada Android Studio. ",
            "1"},
            //buku 3
            {"2","Logika Pemrograman Menggunakan C++","Abdul Kadir","Rp 170.000","https://cdn.gramedia.com/uploads/items/9786230001581_Logika-Pemrograman-Menggunakan-C__w414_hauto.jpg",
            "Jul 2019","Elex Media Komputindo","https://www.gramedia.com/products/logika-pemrograman-menggunakan-c",
            "Buku ini sangat cocok digunakan untuk pelajar, mahasiswa, atau siapa saja yang bermaksud untuk mempelajari pemrograman komputer menggunakan Bahasa C++. Buku ini lebih menekankan pada cara untuk menyelesaikan masalah. Oleh karena itu, banyak contoh permasalahan yang diberikan dan cara untuk menyelesaikannya. Contoh-contoh yang cukup banyak dan bahasa yang mudah dipahami membuat buku ini sangat mudah digunakan dan dapat menjadi penuntun untuk memelajari Bahasa C++ secara mandiri.",
            "1"},
            //buku 4
            {"3","Pemrograman Aplikasi Android dengan Android Studio, Photoshop dan Audition","Musliadi KH, S.Kom., HERLINAH, S.KOM, M.SI. & MUSLIADI KH, S.KOM.","Rp 63.750","https://cdn.gramedia.com/uploads/items/9786230002137_Pemrograman-Aplikasi-Android-dengan-Android-Studio-Photoshop-dan-Audition_6i1k4Rc__w414_hauto.jpg",
            "Jul 2019","Elex Media Komputindo","https://www.gramedia.com/products/pemrograman-aplikasi-android-dengan-android-studio-photosho",
            "Anda ingin membuat aplikasi Android? Bingung ingin memulai dari mana? Apa yang harus dipersiapkan? Apa yang pertama kali harus dikerjakan? Bagaimana proses kerjanya? Setelah selesai dikerjakan mau diapakan? Untuk menjawab semua pertanyaan tersebut maka buku ini hadir di tengah-tengah pembaca dengan penyajian pembahasan materi menggunakan konsep persiapan, desain, pemrograman dan publikasi.",
            "1"},
            //buku 5
            {"4","Logika Pemrograman Python","Abdul Kadir","Rp 119.000","https://cdn.gramedia.com/uploads/items/9786230002274_Logika-Pemrograman-Python__w414_hauto.jpg",
            "Jul 2019", "Elex Media Komputindo","https://www.gramedia.com/products/logika-pemrograman-python",
            "Buku ini sangat cocok digunakan untuk pelajar, mahasiswa, atau siapa saja yang bermaksud untuk mempelajari pemrograman komputer dengan menggunakan bahasa Python. Buku ini lebih menekankan pada cara untuk menyelesaikan masalah. Oleh karena itu, banyak contoh permasalahan yang diberikan dan cara untuk menyelesaikannya. Contoh-contoh yang cukup banyak dan bahasa yang mudah dipahami membuat buku ini sangat mudah digunakan dan dapat menjadi penuntun untuk belajar bahasa Python secara mandiri.",
            "1"},
            //buku 6
            {"5","Atlas Binatang Paling Berbahaya Sedunia","Paula Hammond","Rp 215.000","https://cdn.gramedia.com/uploads/items/9786230003936_cov_atlas_bin__w414_hauto.jpg",
            "Sep 2019","Elex Media Komputindo","https://www.gramedia.com/products/atlas-binatang-paling-berbahaya-sedunia",
            "Buku ini menampilkan 50 spesies hewan mematikan dari seluruh dunia dan mengeksplorasi tiap benua, termasuk spesies yang hidup di berbagai habitat: dari hutan dan gurun sampai laut dalam. Ilustrasi tajam pada tiap anatomi hewan, habitat, dan sebaran geografis, peta, dan dan ditambah foto-foto yang detail dan penuh warna.",
            "2"},
            //buku 7
            {"6","How To Win Friends And Influence People","Dale Carnegie","Rp 98.000","https://cdn.gramedia.com/uploads/items/9786020628325_How-To-Win-Friends-And-Influence-People__w414_hauto.jpg",
            "Sep 2019","Gramedia Pustaka Utama","https://www.gramedia.com/products/how-to-win-friends-and-influence-people-1",
            "Nasihat-nasihat Dale Carnegie yang teruji waktu telah membawa tak terhitung banyaknya orang mendaki tangga kesuksesan dalam kehidupan pribadi dan bisnis. Salah satu buku terlaris sepanjang masa yang menjadi landasan buku-buku laris lainnya",
            "2"},
            //buku 8
            {"7","Komik: Jingga dan Senja","Esti Kinasih","Rp 65.000","https://cdn.gramedia.com/uploads/items/9786020618425_Komik-Jingga-__w414_hauto.jpg",
            "Okt 2018","Gramedia Pustaka Utama","https://www.gramedia.com/products/komik-jingga-dan-senja",
            "JINGGA DAN SENJA Tari dan Ari tidak sengaja bertemu saat upacara di sekolah. Ari tertarik pada Tari dan melakukan segala cara untuk mendekati si adik kelas. Ternyata nama mereka mirip, karena Tari dan Ari sama-sama lahir saat matahari terbenam. Tetapi, keduanya memiliki pribadi yang sangat bertolak belakang. Tari pemberani dan selalu ceria, tapi keras kepala. Sedangkan Ari cowok berandalan yang sering ikut tawuran. “Perang” pun sering terjadi di antara mereka, karena Tari menganggap Ari kasar dan sok penting. Situasi makin panas ketika Angga mulai mendekati Tari. Cowok itu dari SMA lain yang merupakan musuh bebuyutan sekolah mereka. Tetapi, tiba-tiba Angga berhenti mendekati Tari. Hubungan Tari dengan Ari juga makin renggang. Ada apakah?",
            "3"},
            //buku 9
            {"8","Dear Past Self","Aoirisuka, A Oirisuka","Rp 56.000","https://cdn.gramedia.com/uploads/items/9786024556228_DEAR-PAST-SEL__w414_hauto.jpg",
            "Agt 2018","Gramedia Pustaka Utama","https://www.gramedia.com/products/dear-past-self",
            "Ellina Riri berharap bisa mengubah masa lalu. Ada hal-hal yang ingin ia ubah sehingga akan lebih baik di masa sekarang. Siapa sangka, keinginannya itu terucap saat ada bintang jatuh. Ketika bangun dari tidurnya, Ellina mendapati dirinya seperti ketika ia SMP. Lalu, lewat surel, ia berkabar dengan dirinya yang lain, sekaligus mencoba mengubah keadaan, termasuk cinta, persahabatan, juga hidup seseorang.",
            "3"},
            //buku 10
            {"9","Young Adult: Match Point","Saufina","Rp 62.000","https://cdn.gramedia.com/uploads/items/9786020387123_Young-Adult_Match-Point__w414_hauto.jpg",
            "Agt 2018","Gramedia Pustaka Utama","https://www.gramedia.com/products/young-adult-match-point",
            "Ragil Satihardi digadang-gadang bakal menjadi penerus Taufik Hidayat di dunia bulutangkis, apalagi setelah mewarisi raket andalan yang pernah digunakan Taufik ketika menjuarai Olimpiade. Belakangan, prestasi atlet Pelatnas tunggal putra itu justru merosot tajam. Tekanan dari media sosial pun semakin membuat Ragil menarik diri. Setelah gagal mewawancarai Susi Susanti, Sheva jurnalis muda di Tabloid Arena ditugasi untuk meliput aktivitas Ragil Satihardi. ",
            "2"},
            //buku 11
            {"10","Unexpected Prince","Ainur Rahma, Ainurrahmah","Rp 94.000","https://cdn.gramedia.com/uploads/images/1/43129/image_highres/ID_UP2018MTH07UP__w414_hauto.jpg",
            "Jul 2018","Gramedia Widiasarana Indonesia","https://www.gramedia.com/products/unexpected-prince",
            "Kesepakatan dengan orangtua untuk meraih peringkat 10 besar demi bisa menjadi seorang tuan putri untuk satu hari, memaksa Aleta untuk mencari seseorang yang bisa membantunya belajar. Akhirnya, Aleta dapat ide untuk menjadikan Kasaga Milano -- cowok dengan IQ tertinggi di sekolah sebagai guru privat.",
            "3"},
            //buku 12
            {"11","Manajemen Risiko","Dadang Suwanda, H.,Dr. S.E., M.M., M.Ak., Ak., Ca., Dkk.","Rp 70.000","https://cdn.gramedia.com/uploads/items/9786024463441_Manajemen-Risiko-Pengelolaan-Keuangan-Daerah-Sebagai-Upaya-P__w414_hauto.jpg",
            "Jun 2019", "Remaja Rosdakarya","https://www.gramedia.com/products/manajemen-risiko-pengelolaan-keuangan-daerah-sebagai-upaya-p",
            "Otonomi keuangan daerah menuntut pemerintah daerah untuk meningkatkan kapabilitas dan efektivitas dalam menjalankan roda pemerintahannya. Pada kenyataannya, banyak pemerintah daerah yang belum menjalankan fungsi dan peranan secara efisien, terutama dalam pengelolaan keuangan daerah.",
            "2"},
            //buku 13
            {"12","Persona: Petualangan Seperempat Abad","Haris Firmansyah","Rp 50.000","https://cdn.gramedia.com/uploads/items/9786230003912_Persona_Petua__w414_hauto.jpg",
            "26 Agt 2019","Elex Media Komputindo","https://www.gramedia.com/products/persona-petualangan-seperempat-abad",
            "Bagi orang-orang kebanyakan, usia dua puluh lima berarti sudah punya pekerjaan tetap dengan gaji lumayan. Bisa ngopi siang-siang di Starbuck tanpa mikirin besok makan sama apa meski punya cicilan mobil sama KPR. Punya pasangan yang bakal mengisi rumah impian yang siap sedia memasakkan makan malam yang lezat, dan sosok yang bakal mengisi jok sebelah sambil mendengarkan curhatan-curhatan mumet selama di kantor. Iya, itu curhatannya orang-orang. Sebenarnya gue juga orang, tapi sayangnya belum mengarah ke sana. Boro-boro. Status di kantor masih pegawai kontrak, rumah masih numpang di orangtua, baru saja diputusin sama calon istri minggu lalu gara-gara gue belum semapan yang dibayangkan. Dan sekarang gue sedang berusaha menemukan diri gue dalam menghadapi quarter life crisis di usia sekarang.",
            "3"}
    };
    /*
    Kategori buku :
    1 = pemrograman
    2 = non-fiksi
    3 = fiksi

    digunakan untuk menampilkan saran buku serupa di tampilan buku_detail
     */

    //untuk menampilkan data singkat di home
    public static ArrayList<buku_model> getListData(){
        ArrayList<buku_model> model = new ArrayList<>();
        for(String[] aData : data){
            buku_model bm = new buku_model();
            bm.setId(aData[0]);
            bm.setJudul_buku(aData[1]);
            bm.setNama_penulis(aData[2]);
            bm.setHarga(aData[3]);
            bm.setFoto_buku(aData[4]);
            model.add(bm);
        }
        return model;
    }

    //untuk data detail buku terkait di buku_detail
    public static ArrayList getDetailView(String id){
        ArrayList list = new ArrayList();
        int id1 = Integer.parseInt(id);
        list.removeAll(list);
        list.add(data[id1][1]); //judul 0
        list.add(data[id1][2]); //penulis 1
        list.add(data[id1][3]); //harga 2
        list.add(data[id1][4]); //foto 3
        list.add(data[id1][5]); //th terbit 4
        list.add(data[id1][6]); //penerbit 5
        list.add(data[id1][7]); //link 6
        list.add(data[id1][8]); //deskripsi 7
        return list;
    }

    //untuk data saran buku terkait di buku_detail
    public static ArrayList getSuggest(String id1){
        ArrayList suggest = new ArrayList();
        int id = Integer.parseInt(id1);
        int kategori = Integer.parseInt(data[id][9]);
        //mendapatkan data buku di kategori yang sama
        for(int i = 0; i<13;i++){
            int kategori_dump = Integer.parseInt(data[i][9]);
            if(kategori == kategori_dump){
                if(i == id){ //jika data dikategori sama dan memiliki id yang sama = cari lain
                }else{
                    suggest.add(data[i][1]); //menambah judul
                    suggest.add(data[i][4]); //menambah link foto
                    suggest.add(data[i][0]); //menambah id
                }
            }
        }
        return suggest;
    }
}
