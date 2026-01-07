{
  "filepath": "/tmp/Compress-33b/src/main/java/org/apache/commons/compress/compressors/deflate/DeflateCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeflateCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 32,
      "end_line": 83,
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
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Creates a Deflate compressed output stream with the default parameters.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.DeflateCompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.deflate.DeflateParameters)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Creates a Deflate compressed output stream with the specified parameters.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 136)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.write(int)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.flush()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Flushes the encoder and calls \u003ccode\u003eoutputStream.flush()\u003c/code\u003e.\n     * All buffered pending data will then be decompressible from\n     * the output stream. Calling this function very often may increase\n     * the compressed file size a lot.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.finish()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Finishes compression without closing the underlying stream.\n     * No more data can be written to this stream after finishing.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream.close()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 20)"
      ]
    }
  ]
}