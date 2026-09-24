fun tinhBMI(canNang: Double, chieuCao: Double): Double {
    var bmi = canNang/(chieuCao *chieuCao)
    return bmi
}
fun main() {
    var bmi = tinhBMI(60.0, 1.7)
    println("BMI cua An: $bmi")
}