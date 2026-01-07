{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/compressors/deflate/DeflateCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeflateCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 32,
      "end_line": 88,
      "comment": "\n * Deflate compressor.\n * @since 1.9\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.DeflateCompressorOutputStream(java.io.OutputStream)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Creates a Deflate compressed output stream with the default parameters.\n     * @param outputStream the stream to wrap\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.DeflateCompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.deflate.DeflateParameters)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Creates a Deflate compressed output stream with the specified parameters.\n     * @param outputStream the stream to wrap\n     * @param parameters the deflate parameters to apply\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 136)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.write(int)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.flush()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Flushes the encoder and calls \u003ccode\u003eoutputStream.flush()\u003c/code\u003e.\n     * All buffered pending data will then be decompressible from\n     * the output stream. Calling this function very often may increase\n     * the compressed file size a lot.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.finish()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Finishes compression without closing the underlying stream.\n     * No more data can be written to this stream after finishing.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.close()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 20)"
      ]
    }
  ]
}