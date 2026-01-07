{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/compressors/lzma/LZMACompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LZMACompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 31,
      "end_line": 116,
      "comment": "\n * LZMA decompressor.\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.LZMACompressorInputStream(java.io.InputStream)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Creates a new input stream that decompresses LZMA-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     *\n     * @throws      IOException if the input is not in the .lzma format,\n     *                          the input is corrupt or truncated, the .lzma\n     *                          headers specify sizes that are not supported\n     *                          by this implementation, or the underlying\n     *                          \u003ccode\u003einputStream\u003c/code\u003e throws an exception\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.read()",
      "begin_line": 52,
      "end_line": 57,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 34)",
        "(line 55,col 9)-(line 55,col 33)",
        "(line 56,col 9)-(line 56,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.read(byte[], int, int)",
      "begin_line": 60,
      "end_line": 65,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 47)",
        "(line 63,col 9)-(line 63,col 19)",
        "(line 64,col 9)-(line 64,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.skip(long)",
      "begin_line": 68,
      "end_line": 71,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.available()",
      "begin_line": 74,
      "end_line": 77,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.close()",
      "begin_line": 80,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byte[], int)",
      "begin_line": 96,
      "end_line": 115,
      "comment": "\n     * Checks if the signature matches what is expected for an lzma file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is an lzma  compressed stream, false otherwise\n     * \n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 20)"
      ]
    }
  ]
}