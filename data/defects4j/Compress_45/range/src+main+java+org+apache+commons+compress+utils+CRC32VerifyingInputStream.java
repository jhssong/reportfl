{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/utils/CRC32VerifyingInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CRC32VerifyingInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.utils.ChecksumVerifyingInputStream"
      ],
      "begin_line": 29,
      "end_line": 50,
      "comment": "\n * A stream that verifies the CRC of the data read once the stream is\n * exhausted.\n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.CRC32VerifyingInputStream.CRC32VerifyingInputStream(java.io.InputStream, long, int)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * @param in the stream to wrap\n     * @param size the of the stream\u0027s content\n     * @param expectedCrc32 the expected checksum\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.CRC32VerifyingInputStream.CRC32VerifyingInputStream(java.io.InputStream, long, long)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * @since 1.7\n     * @param in the stream to wrap\n     * @param size the of the stream\u0027s content\n     * @param expectedCrc32 the expected checksum\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 52)"
      ]
    }
  ]
}