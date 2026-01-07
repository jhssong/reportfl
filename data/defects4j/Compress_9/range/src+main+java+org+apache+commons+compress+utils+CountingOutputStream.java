{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/utils/CountingOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CountingOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterOutputStream"
      ],
      "begin_line": 31,
      "end_line": 72,
      "comment": "\n * Stream that tracks the number of bytes read.\n * @since Apache Commons Compress 1.3\n * @ThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "bytesWritten"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.CountingOutputStream(java.io.OutputStream)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.write(int)",
      "begin_line": 38,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 21)",
        "(line 41,col 9)-(line 41,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.write(byte[])",
      "begin_line": 43,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.write(byte[], int, int)",
      "begin_line": 47,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 31)",
        "(line 50,col 9)-(line 50,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.count(long)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Increments the counter of already written bytes.\n     * Doesn\u0027t increment if the EOF has been hit (written \u003d\u003d -1)\n     * \n     * @param written the number of bytes written\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.CountingOutputStream.getBytesWritten()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Returns the current number of bytes written to this stream.\n     * @return the number of written bytes\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 40)"
      ]
    }
  ]
}