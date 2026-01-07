{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/utils/ChecksumVerifyingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChecksumVerifyingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 30,
      "end_line": 109,
      "comment": "\n * A stream that verifies the checksum of the data read once the stream is\n * exhausted.\n * @NotThreadSafe\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesRemaining"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedChecksum"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checksum"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ChecksumVerifyingInputStream.ChecksumVerifyingInputStream(java.util.zip.Checksum, java.io.InputStream, long, long)",
      "begin_line": 36,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 33)",
        "(line 39,col 9)-(line 39,col 21)",
        "(line 40,col 9)-(line 40,col 49)",
        "(line 41,col 9)-(line 41,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumVerifyingInputStream.read()",
      "begin_line": 50,
      "end_line": 64,
      "comment": "\n     * Reads a single byte from the stream\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 34)",
        "(line 56,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumVerifyingInputStream.read(byte[])",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Reads a byte array from the stream\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumVerifyingInputStream.read(byte[], int, int)",
      "begin_line": 83,
      "end_line": 94,
      "comment": "\n     * Reads from the stream into a byte array.\n     * @throws IOException if the underlying stream throws or the\n     * stream is exhausted and the Checksum doesn\u0027t match the expected\n     * value\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 45)",
        "(line 86,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumVerifyingInputStream.skip(long)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ChecksumVerifyingInputStream.close()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 19)"
      ]
    }
  ]
}