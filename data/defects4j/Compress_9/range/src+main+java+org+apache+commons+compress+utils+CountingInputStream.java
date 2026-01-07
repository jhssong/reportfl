{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/utils/CountingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CountingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 31,
      "end_line": 77,
      "comment": "\n * Stream that tracks the number of bytes read.\n * @since Apache Commons Compress 1.3\n * @ThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.CountingInputStream(java.io.InputStream)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.read()",
      "begin_line": 38,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 26)",
        "(line 41,col 9)-(line 43,col 9)",
        "(line 44,col 9)-(line 44,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.read(byte[])",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.read(byte[], int, int)",
      "begin_line": 50,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 37)",
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.count(long)",
      "begin_line": 64,
      "end_line": 68,
      "comment": "\n     * Increments the counter of already read bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param read the number of bytes read\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingInputStream.getBytesRead()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Returns the current number of bytes read from this stream.\n     * @return the number of read bytes\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 37)"
      ]
    }
  ]
}