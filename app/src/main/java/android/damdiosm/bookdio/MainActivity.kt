package android.damdiosm.bookdio
//ADAM DIOUF RAHMAN
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import android.damdiosm.bookdio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BookClickListener
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerview.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(bookList, mainActivity)
        }
    }
    override fun onClick(book: Book)
    {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA, book.id)
        startActivity(intent)
    }

    private fun populateBooks()
    {
        val book1 = Book(
            R.drawable.cs,
            "Tatsuki Fujimoto",
            "Chainsaw Man Vol.10",
            "Setelah dipaksa untuk membunuh seorang teman, Denji menemukan bahwa otaknya telah berubah menjadi bubur dari keputusasaan. Tanpa motivasi untuk terus berjalan, dia mencari bantuan dari Makima. Tapi Makima tidak seperti yang muncul, dan rasa sakit Denji baru saja dimulai."
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.nr,
            "Masashi Kishimoto",
            "Naruto Shippuden Vol.12",
            "Pencarian Sasuke hampir berakhir saat Tim Kakashi menyusup ke tempat persembunyian Orochimaru. Ketika Sai menyaksikan rasa kesetiaan Naruto yang kuat untuk Sasuke, dia teringat akan perasaan yang pernah dia miliki untuk saudaranya sendiri. Lebih lanjut, tapi semuanya mungkin rusak saat misi Sai yang sebenarnya terungkap!"
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.op,
            "Eiichiro Oda",
            "One Piece Vol.91",
            "Topi Jerami menuju tanah petualangan baru, kerajaan Wano! Tapi menunggu mereka ada kekuatan Kaido yang kuat dan segala macam masalah baru!"
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.str,
            "Ryōgo Narita",
            "Fate Strange Fake Vol.1",
            "Asosiasi Penyihir telah mengirim Rohngall dan muridnya, Faldeus, untuk menyelidiki kota dan status perang. Faldeus, seorang mata-mata dari organisasi AS, telah menembak Rohngall saat tiba, meskipun mengetahui bahwa Rohngall hanyalah boneka. Dia mengumumkan itu Perang Cawan Suci mereka telah dalam pengembangan dan itu nyata, yang menyebabkan kegemparan di Menara Jam, dan ingin mengiklankan proyek tersebut kepada Asosiasi."
        )
        bookList.add(book4)

        val book5 = Book(
            R.drawable.o,
            "Shiramine",
            "FGO Mortalis Stella Vol.3",
            "Bendera Jeanne d'Arc berkibar tinggi di atas Prancis sekali lagi--tapi apakah itu bendera keadilan, atau penindasan? Dengan Penyihir Naga Jeanne d'Arc masih buron, Ritsuka, Mash, dan Jeanne d'Arc yang asli bergabung dengan pelayan baru Marie Antoinette, Wolfgang Amadeus Mozart, dan Elisabeth Báthory dan menuju kastil penyihir di Orléans. Dengan sejarah Prancis dan masa depan umat manusia yang dipertaruhkan, dapatkah Ritsuka dan Mash mengakhiri pemerintahan teror Penyihir Naga yang jahat? Seperti apa? hasil menunggu mereka di akhir singularitas ini, dan kapan—dan ke mana—dalam sejarah mereka akan pergi selanjutnya...?"
        )
        bookList.add(book5)

        val book6 = Book(
            R.drawable.go,
            "Shiramine",
            "FGO Mortalis Stella Vol.2",
            "Saat ini tahun 2016, dan gangguan yang ditemukan di masa lalu umat manusia mengancam keberlanjutan masa depannya.Organisasi Keamanan Chaldea--bertugas melestarikan sejarah manusia selama dan sekuat mungkin--telah mengembangkan metode baru perjalanan waktu untuk memperbaikinya. Tetapi ketika ancaman yang tidak diketahui mendorong umat manusia ke ambang kepunahan, rekrutan muda Mash Kyrielight dan Ritsuka Fujimaru menemukan diri mereka di pucuk pimpinan misi penyelamatan: Memperoleh Cawan Suci dalam menghadapi takdir itu sendiri ...",
        )
        bookList.add(book6)

        val book7 = Book(
            R.drawable.fgo,
            "Shiramine",
            "FGO Mortalis Stella Vol.1",
            "Holy Grail War seorang gadis dan pemuda dimulai! Mash Kyrielight yang berafiliasi dengan Organisasi Pelindung Umat Manusia, Chaldea, bergabung dalam misi melindungi sejarah umat manusia. Di hari yang sama, dia bertemu dengan seorang pemuda bernama Ritsuka Fujimaru yang tertidur di ruang istirahat..?.\n",
        )
        bookList.add(book7)


        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)
    }


}