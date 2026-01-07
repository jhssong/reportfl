{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/compressors/lzma/LZMACompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LZMACompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 33,
      "end_line": 145,
      "comment": "\n * LZMA decompressor.\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.LZMACompressorInputStream(java.io.InputStream)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Creates a new input stream that decompresses LZMA-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     *\n     * @throws      IOException if the input is not in the .lzma format,\n     *                          the input is corrupt or truncated, the .lzma\n     *                          headers specify sizes that are not supported\n     *                          by this implementation, or the underlying\n     *                          \u003ccode\u003einputStream\u003c/code\u003e throws an exception\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.LZMACompressorInputStream(java.io.InputStream, int)",
      "begin_line": 70,
      "end_line": 78,
      "comment": "\n     * Creates a new input stream that decompresses LZMA-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     *\n     * @param       memoryLimitInKb calculated memory use threshold.  Throws MemoryLimitException\n     *                            if calculate memory use is above this threshold\n     *\n     * @throws      IOException if the input is not in the .lzma format,\n     *                          the input is corrupt or truncated, the .lzma\n     *                          headers specify sizes that are not supported\n     *                          by this implementation, or the underlying\n     *                          \u003ccode\u003einputStream\u003c/code\u003e throws an exception\n     *\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 77,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.read()",
      "begin_line": 81,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 34)",
        "(line 84,col 9)-(line 84,col 33)",
        "(line 85,col 9)-(line 85,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.read(byte[], int, int)",
      "begin_line": 89,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 47)",
        "(line 92,col 9)-(line 92,col 19)",
        "(line 93,col 9)-(line 93,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.skip(long)",
      "begin_line": 97,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.available()",
      "begin_line": 103,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.close()",
      "begin_line": 109,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byte[], int)",
      "begin_line": 125,
      "end_line": 144,
      "comment": "\n     * Checks if the signature matches what is expected for an lzma file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is an lzma  compressed stream, false otherwise\n     * \n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 20)"
      ]
    }
  ]
}