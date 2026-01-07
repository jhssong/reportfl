{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/utils/ChecksumCalculatingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChecksumCalculatingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 29,
      "end_line": 99,
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
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 33)",
        "(line 38,col 9)-(line 38,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read()",
      "begin_line": 47,
      "end_line": 54,
      "comment": "\n     * Reads a single byte from the stream\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 34)",
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read(byte[])",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Reads a byte array from the stream\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.read(byte[], int, int)",
      "begin_line": 73,
      "end_line": 80,
      "comment": "\n     * Reads from the stream into a byte array.\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 45)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.skip(long)",
      "begin_line": 82,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumCalculatingInputStream.getValue()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Returns the calculated checksum.\n     * @return the calculated checksum.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 35)"
      ]
    }
  ]
}