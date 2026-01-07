{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 125,
      "comment": "\n * Various utilities for dump archives.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.DumpArchiveUtil()",
      "begin_line": 33,
      "end_line": 34,
      "comment": "\n     * Private constructor to prevent instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.calculateChecksum(byte[])",
      "begin_line": 42,
      "end_line": 51,
      "comment": "\n     * Calculate checksum for buffer.\n     *\n     * @param buffer buffer containing tape segment header\n     * @returns checksum\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 21)",
        "(line 45,col 9)-(line 47,col 9)",
        "(line 49,col 9)-(line 50,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(byte[])",
      "begin_line": 58,
      "end_line": 74,
      "comment": "\n     * Verify that the buffer contains a tape segment header.\n     *\n     * @param buffer\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 48)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 67,col 9)-(line 67,col 51)",
        "(line 69,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 73,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.getIno(byte[])",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Get the ino associated with this buffer.\n     *\n     * @param buffer\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert64(byte[], int)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Read 8-byte integer from buffer.\n     *\n     * @param buffer\n     * @param offset\n     * @return the 8-byte entry as a long\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert32(byte[], int)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Read 4-byte integer from buffer.\n     *\n     * @param buffer\n     * @param offset\n     * @return the 4-byte entry as an int\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert16(byte[], int)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Read 2-byte integer from buffer.\n     *\n     * @param buffer\n     * @param offset\n     * @return the 2-byte entry as an int\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.decode(org.apache.commons.compress.archivers.zip.ZipEncoding, byte[], int, int)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Decodes a byte array to a string.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 76)"
      ]
    }
  ]
}