{
  "filepath": "/tmp/Compress-10b/src/main/java/org/apache/commons/compress/compressors/xz/XZCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XZCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 33,
      "end_line": 131,
      "comment": "\n * XZ decompressor.\n * @since Commons Compress 1.4\n "
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
      "end_line": 52,
      "comment": "\n     * Checks if the signature matches what is expected for a .xz file.\n     *\n     * @param   signature     the bytes to check\n     * @param   length        the number of bytes to check\n     * @return  true if signature matches the .xz magic bytes, false otherwise\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 45,col 25)",
        "(line 47,col 9)-(line 49,col 29)",
        "(line 51,col 9)-(line 51,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.XZCompressorInputStream(java.io.InputStream)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Creates a new input stream that decompresses XZ-compressed data\n     * from the specified input stream. This doesn\u0027t support\n     * concatenated .xz files.\n     *\n     * @param       inputStream where to read the compressed data\n     *\n     * @throws      IOException if the input is not in the .xz format,\n     *                          the input is corrupt or truncated, the .xz\n     *                          headers specify options that are not supported\n     *                          by this implementation, or the underlying\n     *                          \u003ccode\u003einputStream\u003c/code\u003e throws an exception\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.XZCompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\n     * Creates a new input stream that decompresses XZ-compressed data\n     * from the specified input stream.\n     *\n     * @param       inputStream where to read the compressed data\n     * @param       decompressConcatenated\n     *                          if true, decompress until the end of the\n     *                          input; if false, stop after the first .xz\n     *                          stream and leave the input position to point\n     *                          to the next byte after the .xz stream\n     *\n     * @throws      IOException if the input is not in the .xz format,\n     *                          the input is corrupt or truncated, the .xz\n     *                          headers specify options that are not supported\n     *                          by this implementation, or the underlying\n     *                          \u003ccode\u003einputStream\u003c/code\u003e throws an exception\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 95,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.read()",
      "begin_line": 99,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 28)",
        "(line 102,col 9)-(line 102,col 34)",
        "(line 103,col 9)-(line 103,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.read(byte[], int, int)",
      "begin_line": 107,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 41)",
        "(line 110,col 9)-(line 110,col 19)",
        "(line 111,col 9)-(line 111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.skip(long)",
      "begin_line": 115,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.available()",
      "begin_line": 121,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorInputStream.close()",
      "begin_line": 127,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 19)"
      ]
    }
  ]
}