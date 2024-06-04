package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {

    var dataFormatada: String = ""

    init {
        this.formatarData()
    }

    fun formatarData() {
        var diaData: String = ""
        var mesData: String = ""
        var anoData: String = this.ano.toString()

        if (this.dia < 10) {
            diaData = "0" + this.dia.toString()
        } else {
            diaData = this.dia.toString()
        }

        if (this.mes < 10) {
            mesData = "0" + this.mes.toString()
        } else {
            mesData = this.mes.toString()
        }

        this.dataFormatada = diaData + "/" + mesData + "/" + anoData
    }

    fun obterDataFormatada(): String {

        return this.dataFormatada
    }

}