{
  "filepath": "/tmp/Compress-24b/src/main/java/org/apache/commons/compress/utils/ArchiveUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 253,
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
      "begin_line": 45,
      "end_line": 57,
      "comment": "\n     * Generates a string containing the name, isDirectory setting and size of an entry.\n     * \u003cp\u003e\n     * For example:\n     * \u003cpre\u003e\n     * -    2000 main.c\n     * d     100 testfiles\n     * \u003c/pre\u003e\n     * \n     * @return the representation of the entry\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 47)",
        "(line 47,col 9)-(line 47,col 50)",
        "(line 48,col 9)-(line 48,col 53)",
        "(line 49,col 9)-(line 49,col 23)",
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 24)",
        "(line 55,col 9)-(line 55,col 47)",
        "(line 56,col 9)-(line 56,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[], int, int)",
      "begin_line": 68,
      "end_line": 77,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     * \n     * @param expected\n     * @param buffer\n     * @param offset\n     * @param length\n     * @return {@code true} if buffer is the same as the expected string\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 23)",
        "(line 71,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[])",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     * \n     * @param expected\n     * @param buffer\n     * @return {@code true} if buffer is the same as the expected string\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(java.lang.String)",
      "begin_line": 97,
      "end_line": 103,
      "comment": "\n     * Convert a string to Ascii bytes.\n     * Used for comparing \"magic\" strings which need to be independent of the default Locale.\n     * \n     * @param inputString\n     * @return the bytes\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byte[])",
      "begin_line": 111,
      "end_line": 117,
      "comment": "\n     * Convert an input byte array to a String using the ASCII character set.\n     * \n     * @param inputBytes\n     * @return the bytes, interpreted as an Ascii string\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byte[], int, int)",
      "begin_line": 127,
      "end_line": 133,
      "comment": "\n     * Convert an input byte array to a String using the ASCII character set.\n     * \n     * @param inputBytes input byte array\n     * @param offset offset within array\n     * @param length length of array\n     * @return the bytes, interpreted as an Ascii string\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int, boolean)",
      "begin_line": 147,
      "end_line": 177,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     * \n     * @param buffer1\n     * @param offset1\n     * @param length1\n     * @param buffer2\n     * @param offset2\n     * @param length2\n     * @param ignoreTrailingNulls\n     * @return {@code true} if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 57)",
        "(line 152,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int)",
      "begin_line": 190,
      "end_line": 194,
      "comment": "\n     * Compare byte buffers\n     * \n     * @param buffer1\n     * @param offset1\n     * @param length1\n     * @param buffer2\n     * @param offset2\n     * @param length2\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[])",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Compare byte buffers\n     * \n     * @param buffer1\n     * @param buffer2\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[], boolean)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     * \n     * @param buffer1\n     * @param buffer2\n     * @param ignoreTrailingNulls\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byte[], int, int, byte[], int, int)",
      "begin_line": 230,
      "end_line": 234,
      "comment": "\n     * Compare byte buffers, ignoring trailing nulls\n     * \n     * @param buffer1\n     * @param offset1\n     * @param length1\n     * @param buffer2\n     * @param offset2\n     * @param length2\n     * @return {@code true} if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byte[], int)",
      "begin_line": 245,
      "end_line": 252,
      "comment": "\n     * Returns true if the first N bytes of an array are all zero\n     * \n     * @param a\n     *            The array to check\n     * @param size\n     *            The number of characters to check (not the size of the array)\n     * @return true if the first N bytes are zero\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 20)"
      ]
    }
  ]
}