{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 157,
      "comment": "\n * Various utilities for dump archives.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.DumpArchiveUtil()",
      "begin_line": 29,
      "end_line": 30,
      "comment": "\n     * Private constructor to prevent instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.calculateChecksum(byte[])",
      "begin_line": 38,
      "end_line": 47,
      "comment": "\n     * Calculate checksum for buffer.\n     *\n     * @param buffer buffer containing tape segment header\n     * @returns checksum\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 21)",
        "(line 41,col 9)-(line 43,col 9)",
        "(line 45,col 9)-(line 46,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(byte[])",
      "begin_line": 54,
      "end_line": 70,
      "comment": "\n     * Verify that the buffer contains a tape segment header.\n     *\n     * @param buffer\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 42)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 63,col 9)-(line 63,col 45)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.getIno(byte[])",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Get the ino associated with this buffer.\n     *\n     * @param buffer\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert64(byte[], int)",
      "begin_line": 88,
      "end_line": 100,
      "comment": "\n     * Read 8-byte integer from buffer.\n     *\n     * @param buffer\n     * @param offset\n     * @return the 8-byte entry as a long\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)",
        "(line 90,col 9)-(line 90,col 49)",
        "(line 91,col 9)-(line 91,col 71)",
        "(line 92,col 9)-(line 92,col 71)",
        "(line 93,col 9)-(line 93,col 71)",
        "(line 94,col 9)-(line 94,col 71)",
        "(line 95,col 9)-(line 95,col 71)",
        "(line 96,col 9)-(line 96,col 70)",
        "(line 97,col 9)-(line 97,col 61)",
        "(line 99,col 9)-(line 99,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert32(byte[], int)",
      "begin_line": 109,
      "end_line": 117,
      "comment": "\n     * Read 4-byte integer from buffer.\n     *\n     * @param buffer\n     * @param offset\n     * @return the 4-byte entry as an int\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 18)",
        "(line 111,col 9)-(line 111,col 45)",
        "(line 112,col 9)-(line 112,col 61)",
        "(line 113,col 9)-(line 113,col 60)",
        "(line 114,col 9)-(line 114,col 51)",
        "(line 116,col 9)-(line 116,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert16(byte[], int)",
      "begin_line": 126,
      "end_line": 132,
      "comment": "\n     * Read 2-byte integer from buffer.\n     *\n     * @param buffer\n     * @param offset\n     * @return the 2-byte entry as an int\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 18)",
        "(line 128,col 9)-(line 128,col 60)",
        "(line 129,col 9)-(line 129,col 51)",
        "(line 131,col 9)-(line 131,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveUtil.dumpBlock(byte[])",
      "begin_line": 139,
      "end_line": 156,
      "comment": "\n     * Dump the start of a block.\n     *\n     * @param buffer\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 155,col 9)"
      ]
    }
  ]
}