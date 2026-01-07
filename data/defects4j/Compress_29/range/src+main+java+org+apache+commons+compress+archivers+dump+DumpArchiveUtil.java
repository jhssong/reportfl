{
  "filepath": "/tmp/Compress-29b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 145,
      "comment": "\n * Various utilities for dump archives.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.DumpArchiveUtil()",
      "begin_line": 31,
      "end_line": 32,
      "comment": "\n     * Private constructor to prevent instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.calculateChecksum(byte[])",
      "begin_line": 40,
      "end_line": 49,
      "comment": "\n     * Calculate checksum for buffer.\n     *\n     * @param buffer buffer containing tape segment header\n     * @returns checksum\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 21)",
        "(line 43,col 9)-(line 45,col 9)",
        "(line 47,col 9)-(line 48,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(byte[])",
      "begin_line": 56,
      "end_line": 72,
      "comment": "\n     * Verify that the buffer contains a tape segment header.\n     *\n     * @param buffer\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 42)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 65,col 9)-(line 65,col 45)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 71,col 9)-(line 71,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.getIno(byte[])",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Get the ino associated with this buffer.\n     *\n     * @param buffer\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert64(byte[], int)",
      "begin_line": 90,
      "end_line": 102,
      "comment": "\n     * Read 8-byte integer from buffer.\n     *\n     * @param buffer\n     * @param offset\n     * @return the 8-byte entry as a long\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 19)",
        "(line 92,col 9)-(line 92,col 49)",
        "(line 93,col 9)-(line 93,col 71)",
        "(line 94,col 9)-(line 94,col 71)",
        "(line 95,col 9)-(line 95,col 71)",
        "(line 96,col 9)-(line 96,col 71)",
        "(line 97,col 9)-(line 97,col 71)",
        "(line 98,col 9)-(line 98,col 70)",
        "(line 99,col 9)-(line 99,col 52)",
        "(line 101,col 9)-(line 101,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert32(byte[], int)",
      "begin_line": 111,
      "end_line": 119,
      "comment": "\n     * Read 4-byte integer from buffer.\n     *\n     * @param buffer\n     * @param offset\n     * @return the 4-byte entry as an int\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 18)",
        "(line 113,col 9)-(line 113,col 37)",
        "(line 114,col 9)-(line 114,col 53)",
        "(line 115,col 9)-(line 115,col 52)",
        "(line 116,col 9)-(line 116,col 41)",
        "(line 118,col 9)-(line 118,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert16(byte[], int)",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * Read 2-byte integer from buffer.\n     *\n     * @param buffer\n     * @param offset\n     * @return the 2-byte entry as an int\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 18)",
        "(line 130,col 9)-(line 130,col 52)",
        "(line 131,col 9)-(line 131,col 41)",
        "(line 133,col 9)-(line 133,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.decode(org.apache.commons.compress.archivers.zip.ZipEncoding, byte[], int, int)",
      "begin_line": 139,
      "end_line": 144,
      "comment": "\n     * Decodes a byte array to a string.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 36)",
        "(line 142,col 9)-(line 142,col 50)",
        "(line 143,col 9)-(line 143,col 37)"
      ]
    }
  ]
}