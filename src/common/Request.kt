package common

class Request(val operandA: Int,
              val operandB: Int,
              val operator: Operator) {

    override fun toString(): String {
        return "$operator,$operandA,$operandB"
    }
}