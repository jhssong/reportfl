{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/compressors/xz/XZCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XZCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 35,
      "end_line": 174,
      "comment": "\n * XZ decompressor.\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byte[], int)",
      "begin_line": 45,
      "end_line": 57,
      "comment": "\n     * Checks if the signature matches what is expected for a .xz file.\n     *\n     * @param   signature     the bytes to check\n     * @param   length        the number of bytes to check\n     * @return  true if signature matches the .xz magic bytes, false otherwise\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 48,col 9)",
        "(line 50,col 9)-(line 54,col 9)",
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.XZCompressorInputStream(java.io.InputStream)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Creates a new input stream that decompresses XZ-compressed data\n     * from the specified input stream. This doesn\u0027t support\n     * concatenated .xz files.\n     *\n     * @param       inputStream where to read the compressed data\n     *\n     * @throws      IOException if the input is not in the .xz format,\n     *                          the input is corrupt or truncated, the .xz\n     *                          headers specify options that are not supported\n     *                          by this implementation, or the underlying\n     *                          \u003ccode\u003einputStream\u003c/code\u003e throws an exception\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.XZCompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Creates a new input stream that decompresses XZ-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     * @param       decompressConcatenated\n     *                          if true, decompress until the end of the\n     *                          input; if false, stop after the first .xz\n     *                          stream and leave the input position to point\n     *                          to the next byte after the .xz stream\n     *\n     * @throws      IOException if the input is not in the .xz format,\n     *                          the input is corrupt or truncated, the .xz\n     *                          headers specify options that are not supported\n     *                          by this implementation, or the underlying\n     *                          \u003ccode\u003einputStream\u003c/code\u003e throws an exception\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.XZCompressorInputStream(java.io.InputStream, boolean, int)",
      "begin_line": 122,
      "end_line": 130,
      "comment": "\n     * Creates a new input stream that decompresses XZ-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     * @param       decompressConcatenated\n     *                          if true, decompress until the end of the\n     *                          input; if false, stop after the first .xz\n     *                          stream and leave the input position to point\n     *                          to the next byte after the .xz stream\n     * @param       memoryLimitInKb memory limit used when reading blocks.  If\n     *                          the estimated memory limit is exceeded on {@link #read()},\n     *                          a {@link MemoryLimitException} is thrown.\n     *\n     * @throws      IOException if the input is not in the .xz format,\n     *                          the input is corrupt or truncated, the .xz\n     *                          headers specify options that are not supported\n     *                          by this implementation,\n     *                          or the underlying \u003ccode\u003einputStream\u003c/code\u003e throws an exception\n     *\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.read()",
      "begin_line": 132,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.read(byte[], int, int)",
      "begin_line": 143,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.skip(long)",
      "begin_line": 155,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.available()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.close()",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 19)"
      ]
    }
  ]
}