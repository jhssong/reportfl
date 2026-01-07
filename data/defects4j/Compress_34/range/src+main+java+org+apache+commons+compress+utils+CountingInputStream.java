{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/utils/CountingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CountingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 30,
      "end_line": 76,
      "comment": "\n * Stream that tracks the number of bytes read.\n * @since 1.3\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.CountingInputStream(java.io.InputStream)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.read()",
      "begin_line": 37,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 26)",
        "(line 40,col 9)-(line 42,col 9)",
        "(line 43,col 9)-(line 43,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.read(byte[])",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.read(byte[], int, int)",
      "begin_line": 49,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 37)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.count(long)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Increments the counter of already read bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param read the number of bytes read\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.getBytesRead()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Returns the current number of bytes read from this stream.\n     * @return the number of read bytes\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 25)"
      ]
    }
  ]
}