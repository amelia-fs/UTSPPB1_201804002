package com.example.uts_amel

object DataDosen {
    private val nipDosen = arrayOf(
        "012018001",
        "012018002",
        "012018003",
        "012018004",
        "012018005",
        "012018006",
        "012018007"
    )
    private val namaDosen = arrayOf(
        "Muhammad Nugraha, M.Eng.",
        "Musawarman, S.Kom., M.M.S.I.",
        "Halimil Fathi, M.Kom.",
        "Tiawan, M.Kom.",
        "Heti Mulyani, S.T., M.Kom.",
        "M. Lulu Latif U, S.Pd., M.Han.",
        "N Syam Azwar, S.Kom."
    )
    private val emailDosen = arrayOf(
        "mnugraga@gmail.com",
        "musawaman@gmail.com",
        "halimilf@gmail.com",
        "tiawan@gmail.com",
        "hetimulyani@gmail.com",
        "lululatif@gmail.com",
        "azwar@gmail.com"
    )
    private val alamatDosen = arrayOf(
        "Bandung",
        "Bandung",
        "Purwakarta",
        "Subang",
        "Purwakarta",
        "Jakarta",
        "Bekasi"
    )
    private val fotoDosen = arrayOf(
        R.drawable.panunu,
        R.drawable.pamusa,
        R.drawable.pahalim,
        R.drawable.paawan,
        R.drawable.buheti,
        R.drawable.palulu,
        R.drawable.paazwar
    )
    val listData: ArrayList<Dosen>
        get() {
            val listDosen = arrayListOf<Dosen>()
            for (position in namaDosen.indices) {
                val dosen = Dosen()
                dosen.nipdosen = nipDosen[position]
                dosen.namadosen = namaDosen[position]
                dosen.emaildosen = emailDosen[position]
                dosen.alamatdosen = alamatDosen[position]
                dosen.fotodosen = fotoDosen[position]
                listDosen.add(dosen)
            }
            return listDosen
        }
}