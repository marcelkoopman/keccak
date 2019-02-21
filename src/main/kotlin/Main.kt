package main.kotlin

import org.bouncycastle.jcajce.provider.digest.Keccak
import org.bouncycastle.util.encoders.Hex
import java.io.File

fun main() {
    //var input = "Marcel".toByteArray(Charsets.UTF_8)
    var file = File("input.txt")
    var input = file.readBytes()
    var txt = createHash(input)
    println(txt)
}

fun createHash(input:ByteArray):String {
    var bytes = Keccak.Digest256().digest(input)
    return String(Hex.encode(bytes),Charsets.UTF_8)
}


