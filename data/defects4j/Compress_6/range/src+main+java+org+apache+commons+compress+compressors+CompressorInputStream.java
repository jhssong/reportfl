{
  "filepath": "/tmp/Compress-6b/src/main/java/org/apache/commons/compress/compressors/CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 23,
      "end_line": 45,
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
      "begin_line": 32,
      "end_line": 36,
      "comment": "\n     * Increments the counter of already read bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param read the number of bytes read\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 35,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorInputStream.getCount()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Returns the current number of bytes read from this stream.\n     * @return the number of read bytes\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 25)"
      ]
    }
  ]
}