{
  "filepath": "/tmp/Compress-5b/src/main/java/org/apache/commons/compress/utils/ArchiveUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 218,
      "comment": "\n * Generic Archive utilities\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.ArchiveUtils()",
      "begin_line": 31,
      "end_line": 32,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 43,
      "end_line": 55,
      "comment": "\n     * Generates a string containing the name, isDirectory setting and size of an entry.\n     * \u003cp\u003e\n     * For example:\u003cbr/\u003e\n     * \u003ctt\u003e-    2000 main.c\u003c/tt\u003e\u003cbr/\u003e\n     * \u003ctt\u003ed     100 testfiles\u003c/tt\u003e\u003cbr/\u003e\n     * \n     * @return the representation of the entry\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 45)",
        "(line 45,col 9)-(line 45,col 50)",
        "(line 46,col 9)-(line 46,col 55)",
        "(line 47,col 9)-(line 47,col 23)",
        "(line 49,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 52,col 24)",
        "(line 53,col 9)-(line 53,col 47)",
        "(line 54,col 9)-(line 54,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[], int, int)",
      "begin_line": 66,
      "end_line": 75,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     * \n     * @param expected\n     * @param buffer\n     * @param offset\n     * @param length\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer is the same as the expected string\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 23)",
        "(line 69,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[])",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     * \n     * @param expected\n     * @param buffer\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer is the same as the expected string\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(java.lang.String)",
      "begin_line": 95,
      "end_line": 101,
      "comment": "\n     * Convert a string to Ascii bytes.\n     * Used for comparing \"magic\" strings which need to be independent of the default Locale.\n     * \n     * @param inputString\n     * @return the bytes\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byte[])",
      "begin_line": 109,
      "end_line": 115,
      "comment": "\n     * Convert an input byte array to a String using the ASCII character set.\n     * \n     * @param inputBytes\n     * @return the bytes, interpreted as an Ascii string\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int, boolean)",
      "begin_line": 129,
      "end_line": 159,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     * \n     * @param buffer1\n     * @param offset1\n     * @param length1\n     * @param buffer2\n     * @param offset2\n     * @param length2\n     * @param ignoreTrailingNulls\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 57)",
        "(line 134,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int)",
      "begin_line": 172,
      "end_line": 176,
      "comment": "\n     * Compare byte buffers\n     * \n     * @param buffer1\n     * @param offset1\n     * @param length1\n     * @param buffer2\n     * @param offset2\n     * @param length2\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[])",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Compare byte buffers\n     * \n     * @param buffer1\n     * @param buffer2\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[], boolean)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     * \n     * @param buffer1\n     * @param buffer2\n     * @param ignoreTrailingNulls\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byte[], int, int, byte[], int, int)",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\n     * Compare byte buffers, ignoring trailing nulls\n     * \n     * @param buffer1\n     * @param offset1\n     * @param length1\n     * @param buffer2\n     * @param offset2\n     * @param length2\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 83)"
      ]
    }
  ]
}