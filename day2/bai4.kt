fun formatTen(ho: String, tenDem: String="", ten: String ) {
    println(("$ho $tenDem $ten").replace("  "," ").trim())
}
fun main() {
    formatTen("Nguyen", "Van", "An")
	formatTen("Tran", ten="Binh")
}
