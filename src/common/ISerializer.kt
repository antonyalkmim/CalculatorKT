package common

interface ISerializer {
    fun Serialize(request: Request): ByteArray
    fun Serialize(response: Response): ByteArray

    fun DeserializeRequest(bytes: ByteArray): Request
    fun DeserializeResponse(bytes: ByteArray): Response
}