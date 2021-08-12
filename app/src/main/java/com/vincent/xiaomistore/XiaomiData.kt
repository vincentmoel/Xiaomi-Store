package com.vincent.xiaomistore

object XiaomiData
{
    private val xiaomiNames = arrayOf(
        "Xiaomi Mi 11 Lite",
        "Xiaomi Mi 10T Pro",
        "Xiaomi Redmi Note 10S",
        "Xiaomi Redmi Note 10 Pro",
        "Xiaomi Redmi Note 10",
        "Xiaomi Redmi Note 9 Pro",
        "Xiaomi POCO F3 5G",
        "Xiaomi POCO M3 Pro 5G",
        "Xiaomi POCO X3 Pro",
        "Xiaomi POCO X3 NFC"
    )

    private val xiaomiSpecification = arrayOf(
        "8/128GB Snapdragon 732G\nWarna : Bubble Blue",
        "8/128GB Snapdragon 865\nWarna : Lunar Silver",
        "8/128GB MediaTek Helio G95\nWarna : Ocean Blue",
        "8/128GB Snapdragon 732G\nWarna : Gradient Bronze",
        "4/64GB Snapdragon 678\nWarna : Onyx Grey",
        "8/128GB Snapdragon 720G\n Warna : Forest Green",
        "6/128GB Snapdragon 870\nWarna : Arctic White",
        "6/128GB MediaTek Dimensity 700\nWarna : Power Black",
        "6/128GB Snapdragon 860\nWarna : Phantom Black",
        "8/128GB Snapdragon 732G\nWarna : Shadow Grey"
    )

    private val xiaomiPrice = arrayOf(
        "Rp 3.999.000",
        "Rp 6.199.000",
        "Rp 3.199.000",
        "Rp 3.895.000",
        "Rp 2.499.000",
        "Rp 3.899.000",
        "Rp 4.999.000",
        "Rp 2.899.000",
        "Rp 3.499.000",
        "Rp 3.299.000",
        )

    private val xiaomiImages = intArrayOf(
        R.drawable.mi_11_lite,
        R.drawable.mi_10t_pro,
        R.drawable.redmi_note_10s,
        R.drawable.redmi_note_10_pro,
        R.drawable.redmi_note_10,
        R.drawable.redmi_note_9_pro,
        R.drawable.poco_f3_5g,
        R.drawable.poco_m3_pro_5g,
        R.drawable.poco_x3_pro,
        R.drawable.poco_x3_nfc
    )

    private val xiaomiDetail = arrayOf(
//        "RAM : 8GB\nStorage Internal : 128GB\nProsesor : Qualcomm Snapdragon 732G\nLayar : DotDisplay Amoled FHD+ 6,55inch\nDimensi : 160,53mm x 75,73mm x 6,61mm\nBaterai : 4250mAh",
        """
            RAM : 8GB
            Storage Internal : 128GB
            Prosesor : Qualcomm Snapdragon 732G
            Layar : DotDisplay Amoled FHD+ 6,55inch
            Dimensi : 160,53mm x 75,73mm x 6,61mm
            Baterai : 4250mAh
            Mendukung : Fast Charging 33W, fingerprint unlock, face unlock
        """.trimIndent(),
        """
            RAM : 8GB
            Storage Internal : 128GB
            Prosesor : Qualcomm Snapdragon 865
            Layar : IPS FHD+
            Dimensi : 165mm x 76mm x 9,3mm
            Baterai : 5000mAh
            Mendukung : Fast Charging 33W, fingerprint unlock, face unlock 
        """.trimIndent(),
        """
            RAM : 8GB
            Storage Internal : 128GB
            Prosesor : MediaTek Helio G95
            Layar : DotDisplay Amoled FHD+ 6.43inch
            Dimensi : 160,46mm x 74mm x 8mm
            Baterai : 4500mAh
            Mendukung : Fast Charging 33W, fingerprint unlock, face unlock 
        """.trimIndent(),


        """
            RAM : 8GB
            Storage Internal : 128GB
            Prosesor : Qualcomm Snapdragon 732G
            Layar : Super AMOLED FHD+ 120Hz 6.67inch
            Dimensi : 160mm x 76mm x 8mm
            Baterai : 5020mAh
            Mendukung : Fast Charging 33W, fingerprint unlock, face unlock 
        """.trimIndent(),
        """
            RAM : 4GB
            Storage Internal : 64GB
            Prosesor : Qualcomm® Snapdragon™ 678
            Layar : Super AMOLED FHD+ 6.43inch
            Dimensi : 160,46mm x 74mm x 8mm
            Baterai : 5000mAh
            Mendukung : Fast Charging 33W, fingerprint unlock, face unlock 
        """.trimIndent(),
        """
            RAM : 8GB
            Storage Internal : 128GB
            Prosesor : Qualcomm Snapdragon 720G
            Layar : DotDisplay IPS FHD+ 6.67inch
            Dimensi : 165,46mm x 76mm x 8,8mm
            Baterai : 5020mAh
            Mendukung : Fast Charging 33W, fingerprint unlock, face unlock 
        """.trimIndent(),


        """
            RAM : 6GB
            Storage Internal : 128GB
            Prosesor : Qualcomm Snapdragon 870
            Layar : DotDisplay AMOLED FHD+
            Dimensi : 165,46mm x 76mm x 8,8mm
            Baterai : 4520mAh 
            Mendukung : Fast Charging 33W, fingerprint unlock, face unlock 
        """.trimIndent(),
        """
            RAM : 6GB
            Storage Internal : 128GB
            Prosesor : MediaTek Dimensity 700
            Layar : DotDisplay IPS FHD+
            Dimensi : 161,46mm x 75mm x 8,9mm
            Baterai : 5000mAh
            Mendukung : Fast Charging 18W, fingerprint unlock, face unlock 
        """.trimIndent(),
        """
            RAM : 6GB
            Storage Internal : 128GB
            Prosesor : Qualcomm Snapdragon 860
            Layar : DotDisplay IPS FHD+
            Dimensi : 165,46mm x 76mm x 9mm
            Baterai : 5020mAh
            Mendukung : Fast Charging 33W, fingerprint unlock, face unlock 
        """.trimIndent(),

        """
            RAM : 6GB
            Storage Internal : 128GB
            Prosesor : Qualcomm Snapdragon 732G
            Layar : DotDisplay IPS FHD+ 6.67inch
            Dimensi : 165,46mm x 76mm x 9mm
            Baterai : 5160mAh
            Mendukung : Fast Charging 33W, fingerprint unlock, face unlock 
        """.trimIndent(),
    )

    val listDataXiaomi: ArrayList<Xiaomi>
        get()
        {
            val listHpXiaomi = arrayListOf<Xiaomi>()
            for (position in xiaomiNames.indices) {
                val xiaomiPhone = Xiaomi()
                xiaomiPhone.name = xiaomiNames[position]
                xiaomiPhone.specification = xiaomiSpecification[position]
                xiaomiPhone.price = xiaomiPrice[position]
                xiaomiPhone.image = xiaomiImages[position]
                xiaomiPhone.detail = xiaomiDetail[position]
                listHpXiaomi.add(xiaomiPhone)
            }
            return listHpXiaomi
        }
}