{
  "filepath": "/tmp/Compress-3b/src/main/java/org/apache/commons/compress/utils/ArchiveUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 214,
      "comment": "\n * Generic Archive utilities\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 39,
      "end_line": 51,
      "comment": "\n     * Generates a string containing the name, isDirectory setting and size of an entry.\n     * \u003cp\u003e\n     * For example:\u003cbr/\u003e\n     * \u003ctt\u003e-    2000 main.c\u003c/tt\u003e\u003cbr/\u003e\n     * \u003ctt\u003ed     100 testfiles\u003c/tt\u003e\u003cbr/\u003e\n     * \n     * @return the representation of the entry\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 45)",
        "(line 41,col 9)-(line 41,col 50)",
        "(line 42,col 9)-(line 42,col 55)",
        "(line 43,col 9)-(line 43,col 23)",
        "(line 45,col 9)-(line 47,col 9)",
        "(line 48,col 9)-(line 48,col 24)",
        "(line 49,col 9)-(line 49,col 47)",
        "(line 50,col 9)-(line 50,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[], int, int)",
      "begin_line": 62,
      "end_line": 71,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     * \n     * @param expected\n     * @param buffer\n     * @param offset\n     * @param length\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer is the same as the expected string\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 23)",
        "(line 65,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[])",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     * \n     * @param expected\n     * @param buffer\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer is the same as the expected string\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(java.lang.String)",
      "begin_line": 91,
      "end_line": 97,
      "comment": "\n     * Convert a string to Ascii bytes.\n     * Used for comparing \"magic\" strings which need to be independent of the default Locale.\n     * \n     * @param inputString\n     * @return the bytes\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byte[])",
      "begin_line": 105,
      "end_line": 111,
      "comment": "\n     * Convert an input byte array to a String using the ASCII character set.\n     * \n     * @param inputBytes\n     * @return the bytes, interpreted as an Ascii string\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int, boolean)",
      "begin_line": 125,
      "end_line": 155,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     * \n     * @param buffer1\n     * @param offset1\n     * @param length1\n     * @param buffer2\n     * @param offset2\n     * @param length2\n     * @param ignoreTrailingNulls\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 57)",
        "(line 130,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int)",
      "begin_line": 168,
      "end_line": 172,
      "comment": "\n     * Compare byte buffers\n     * \n     * @param buffer1\n     * @param offset1\n     * @param length1\n     * @param buffer2\n     * @param offset2\n     * @param length2\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[])",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Compare byte buffers\n     * \n     * @param buffer1\n     * @param buffer2\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[], boolean)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     * \n     * @param buffer1\n     * @param buffer2\n     * @param ignoreTrailingNulls\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byte[], int, int, byte[], int, int)",
      "begin_line": 208,
      "end_line": 212,
      "comment": "\n     * Compare byte buffers, ignoring trailing nulls\n     * \n     * @param buffer1\n     * @param offset1\n     * @param length1\n     * @param buffer2\n     * @param offset2\n     * @param length2\n     * @return \u003ccode\u003etrue\u003c/code\u003e if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 83)"
      ]
    }
  ]
}