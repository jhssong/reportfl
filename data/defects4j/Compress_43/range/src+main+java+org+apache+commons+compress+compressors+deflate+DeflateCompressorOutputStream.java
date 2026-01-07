{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/compressors/deflate/DeflateCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeflateCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 32,
      "end_line": 95,
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
      "type": "field",
      "varNames": [
        "deflater"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.DeflateCompressorOutputStream(java.io.OutputStream)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Creates a Deflate compressed output stream with the default parameters.\n     * @param outputStream the stream to wrap\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.DeflateCompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.deflate.DeflateParameters)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n     * Creates a Deflate compressed output stream with the specified parameters.\n     * @param outputStream the stream to wrap\n     * @param parameters the deflate parameters to apply\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 101)",
        "(line 54,col 9)-(line 54,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.write(int)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.flush()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Flushes the encoder and calls \u003ccode\u003eoutputStream.flush()\u003c/code\u003e.\n     * All buffered pending data will then be decompressible from\n     * the output stream. Calling this function very often may increase\n     * the compressed file size a lot.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.finish()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Finishes compression without closing the underlying stream.\n     * \u003cp\u003eNo more data can be written to this stream after finishing.\u003c/p\u003e\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.close()",
      "begin_line": 87,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 93,col 9)"
      ]
    }
  ]
}