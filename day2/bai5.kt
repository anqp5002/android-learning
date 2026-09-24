val hoTen = "Phạm Quốc An"
var soNgayHoc =2

fun tinhBMI(canNang: Double, chieuCao: Double): Double {
    var bmi = canNang/(chieuCao *chieuCao)
    return bmi
}

fun doiTien(vnd: Long, tyGia: Double = 25000.0) =(vnd/tyGia) 

fun formatTen(ho: String, tenDem: String="", ten: String ) = ("$ho $tenDem $ten").replace("  "," ").trim()

fun namSinh(tuoi: Int) = 2026-tuoi

fun main() {
    println("=== HO SO ===")
    println("Ten: ${formatTen("Pham", "Quoc", "An")}")
    println("Tuoi: 21 (sinh nam ${namSinh(21)})")
    println("BMI: ${tinhBMI(80.0,1.7)}")
    println("500000 VND = ${doiTien(500000)} USD")
}
