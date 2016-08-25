package client

import common.CustomSerializer
import common.Operator
import common.Request
import java.net.Socket

fun main(args : Array<String>){

    val client = Socket("127.0.0.1", 9999)
    val request = Request(1, 2, Operator.Sum)

    val serializer = CustomSerializer()
    val requestBytes = serializer.Serialize(request)
    val output = client.outputStream
    output.write(requestBytes)
    client.close()

}


