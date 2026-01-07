{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/compressors/CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 23,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorInputStream.count(int)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Increments the counter of already read bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param read the number of bytes read\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorInputStream.count(long)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Increments the counter of already read bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param read the number of bytes read\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 47,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorInputStream.pushedBackBytes(long)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Decrements the counter of already read bytes.\n     * \n     * @param pushedBack the number of bytes pushed back.\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorInputStream.getCount()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Returns the current number of bytes read from this stream.\n     * @return the number of read bytes\n     * @deprecated this method may yield wrong results for large\n     * archives, use #getBytesRead instead\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorInputStream.getBytesRead()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Returns the current number of bytes read from this stream.\n     * @return the number of read bytes\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)"
      ]
    }
  ]
}