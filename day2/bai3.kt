fun doiTien(vnd: Long, tyGia: Double = 25000.0) {println(vnd/tyGia)} 
fun main() {
    doiTien(100000)
	doiTien(100000, 24000.0)
	doiTien(vnd = 100000, tyGia = 25500.0)
}