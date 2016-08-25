package common

data class Response(val Result : Int,
                    val Success : Boolean){
    override fun toString(): String {
        return "$Result - $Success"
    }
}