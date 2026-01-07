{
  "filepath": "/tmp/Compress-22b/src/main/java/org/apache/commons/compress/compressors/xz/XZCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XZCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 33,
      "end_line": 130,
      "comment": "\n * XZ decompressor.\n * @since 1.4\n "
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
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byte[], int)",
      "begin_line": 43,
      "end_line": 55,
      "comment": "\n     * Checks if the signature matches what is expected for a .xz file.\n     *\n     * @param   signature     the bytes to check\n     * @param   length        the number of bytes to check\n     * @return  true if signature matches the .xz magic bytes, false otherwise\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 46,col 9)",
        "(line 48,col 9)-(line 52,col 9)",
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.XZCompressorInputStream(java.io.InputStream)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Creates a new input stream that decompresses XZ-compressed data\n     * from the specified input stream. This doesn\u0027t support\n     * concatenated .xz files.\n     *\n     * @param       inputStream where to read the compressed data\n     *\n     * @throws      IOException if the input is not in the .xz format,\n     *                          the input is corrupt or truncated, the .xz\n     *                          headers specify options that are not supported\n     *                          by this implementation, or the underlying\n     *                          \u003ccode\u003einputStream\u003c/code\u003e throws an exception\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.XZCompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 92,
      "end_line": 100,
      "comment": "\n     * Creates a new input stream that decompresses XZ-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     * @param       decompressConcatenated\n     *                          if true, decompress until the end of the\n     *                          input; if false, stop after the first .xz\n     *                          stream and leave the input position to point\n     *                          to the next byte after the .xz stream\n     *\n     * @throws      IOException if the input is not in the .xz format,\n     *                          the input is corrupt or truncated, the .xz\n     *                          headers specify options that are not supported\n     *                          by this implementation, or the underlying\n     *                          \u003ccode\u003einputStream\u003c/code\u003e throws an exception\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.read()",
      "begin_line": 102,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 28)",
        "(line 105,col 9)-(line 105,col 34)",
        "(line 106,col 9)-(line 106,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.read(byte[], int, int)",
      "begin_line": 109,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 41)",
        "(line 112,col 9)-(line 112,col 19)",
        "(line 113,col 9)-(line 113,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.skip(long)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.available()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.close()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 19)"
      ]
    }
  ]
}