{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/compressors/lzma/LZMACompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LZMACompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 32,
      "end_line": 80,
      "comment": "\n * LZMA compressor.\n * @since 1.13\n "
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
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream.LZMACompressorOutputStream(java.io.OutputStream)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Creates a LZMA compressor.\n     *\n     * @param       outputStream the stream to wrap\n     * @throws      IOException on error\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream.write(int)",
      "begin_line": 47,
      "end_line": 50,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream.write(byte[], int, int)",
      "begin_line": 53,
      "end_line": 56,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream.flush()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Doesn\u0027t do anything as {@link LZMAOutputStream} doesn\u0027t support flushing.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream.finish()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Finishes compression without closing the underlying stream.\n     * No more data can be written to this stream after finishing.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream.close()",
      "begin_line": 76,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 20)"
      ]
    }
  ]
}