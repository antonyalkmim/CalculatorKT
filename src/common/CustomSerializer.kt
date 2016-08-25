package common

import java.nio.charset.Charset

class CustomSerializer : ISerializer {

    override fun Serialize(request: Request): ByteArray {
        val text = "${request.operator},${request.operandA},${request.operandB}"
        return text.toByteArray(Charset.defaultCharset())
    }


    override fun Serialize(response: Response): ByteArray = "${response.Success},${response.Result}".toByteArray(Charset.defaultCharset())

    override fun DeserializeRequest(bytes: ByteArray): Request {
        val text = String(bytes, Charset.defaultCharset())
        val parts = text.split(",")

        return Request(parts[1].toInt(),
                parts[2].toInt(),
                Operator.valueOf(parts[0]))
    }

    override fun DeserializeResponse(bytes: ByteArray): Response {
        val text = String(bytes)
        val parts = text.split(",")

        return Response(parts[0].toInt(), parts[1].toBoolean())
    }

}