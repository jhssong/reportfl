{
  "filepath": "/tmp/Compress-26b/src/main/java/org/apache/commons/compress/utils/CountingOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CountingOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterOutputStream"
      ],
      "begin_line": 30,
      "end_line": 71,
      "comment": "\n * Stream that tracks the number of bytes read.\n * @since 1.3\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "bytesWritten"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.CountingOutputStream(java.io.OutputStream)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.write(int)",
      "begin_line": 37,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 21)",
        "(line 40,col 9)-(line 40,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.write(byte[])",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.write(byte[], int, int)",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 31)",
        "(line 49,col 9)-(line 49,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.count(long)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n     * Increments the counter of already written bytes.\n     * Doesn\u0027t increment if the EOF has been hit (written \u003d\u003d -1)\n     * \n     * @param written the number of bytes written\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 61,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.getBytesWritten()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Returns the current number of bytes written to this stream.\n     * @return the number of written bytes\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 28)"
      ]
    }
  ]
}