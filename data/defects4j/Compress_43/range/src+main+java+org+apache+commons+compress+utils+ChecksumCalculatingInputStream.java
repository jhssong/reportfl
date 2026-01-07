{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/utils/ChecksumCalculatingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChecksumCalculatingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 29,
      "end_line": 96,
      "comment": "\n * A stream that calculates the checksum of the data read.\n * @NotThreadSafe\n * @since 1.14\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checksum"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.ChecksumCalculatingInputStream(java.util.zip.Checksum, java.io.InputStream)",
      "begin_line": 33,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 33)",
        "(line 35,col 9)-(line 35,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read()",
      "begin_line": 44,
      "end_line": 51,
      "comment": "\n     * Reads a single byte from the stream\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 34)",
        "(line 47,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 50,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read(byte[])",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Reads a byte array from the stream\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read(byte[], int, int)",
      "begin_line": 70,
      "end_line": 77,
      "comment": "\n     * Reads from the stream into a byte array.\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 45)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.skip(long)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Returns the calculated checksum.\n     * @return the calculated checksum.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 35)"
      ]
    }
  ]
}