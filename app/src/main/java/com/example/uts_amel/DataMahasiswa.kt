package com.example.uts_amel

object DataMahasiswa {
    private val nimMhs = arrayOf(
        "201804001",
        "201804002",
        "201804003",
        "201804004",
        "201804005",
        "201804006",
        "201804007",
        "201804008",
        "201804009",
        "201804010",
        "201804011",
        "201804012",
        "201804013"
    )
    private val namaMhs = arrayOf(
        "Ivena Virki Milenia",
        "Amelia Fitri Sanusi",
        "Jamaludin Yasykurniaam",
        "Fihar Dimastyo Rezkia",
        "Wobby Ramadhan",
        "Mia Rosmeida",
        "Rizky Ulirfan",
        "Ahmad Raihan",
        "Rendyanto Putra Widodo",
        "Yuniza Fitri",
        "Muhamad Rizki Baginda",
        "Dzaki Awaludin Mubarok",
        "Fadhly Aulia Roesewlly"
    )
    private val emailMhs = arrayOf(
        "ivenav@gmail.com",
        "amelftr01@gmail.com",
        "jamaludin@gmail.com",
        "fihardimas@gmail.com",
        "wobby@gmail.com",
        "miaros@gmail.com",
        "rizkyu@gmail.com",
        "ahmadr@gmail.com",
        "rendyanto@gmail.com",
        "yuniza@gmail.com",
        "rbaginda@gmail.com",
        "dzaki@gmail.com",
        "fadhly@gmail.com"
    )
    private val alamatlMhs = arrayOf(
        "Ciwareng, Purwakarta",
        "Darangdan, Purwakarta",
        "Ciasem, Purwakarta",
        "Jatiluhur, Purwakarta",
        "MunjulJaya, Purwakarta",
        "Ciasem, Subang",
        "Ciamis, Bandung",
        "Plered, Purwakarta",
        "Jatiluhur, Purwakarta",
        "Cipaisan, Purwakarta",
        "Sadang, Purwakarta",
        "MunjulJaya, Purwakarta",
        "Plamboyan, Purwakarta"
    )
    private val fotoMhs = arrayOf(
        R.drawable.mario,
        R.drawable.amel,
        R.drawable.aliando,
        R.drawable.angga,
        R.drawable.devano,
        R.drawable.amanda,
        R.drawable.ikbal,
        R.drawable.rizky,
        R.drawable.randi,
        R.drawable.tasya,
        R.drawable.verel,
        R.drawable.hito,
        R.drawable.jejef
    )
    val listDataM: ArrayList<Mahasiswa>
    get(){
        val listMhs = arrayListOf<Mahasiswa>()
        for (position in namaMhs.indices) {
            val mhs = Mahasiswa()
            mhs.nimmhs = nimMhs[position]
            mhs.namamhs = namaMhs[position]
            mhs.emailmhs = emailMhs[position]
            mhs.alamatmhs = alamatlMhs[position]
            mhs.fotomhs = fotoMhs[position]
            listMhs.add(mhs)
        }
        return listMhs
    }
}