{
  "filepath": "/tmp/Compress-38b/src/main/java/org/apache/commons/compress/utils/ArchiveUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 287,
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
      "begin_line": 46,
      "end_line": 58,
      "comment": "\n     * Generates a string containing the name, isDirectory setting and size of an entry.\n     * \u003cp\u003e\n     * For example:\n     * \u003cpre\u003e\n     * -    2000 main.c\n     * d     100 testfiles\n     * \u003c/pre\u003e\n     * \n     * @param entry the entry\n     * @return the representation of the entry\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 53)",
        "(line 48,col 9)-(line 48,col 50)",
        "(line 49,col 9)-(line 49,col 59)",
        "(line 50,col 9)-(line 50,col 23)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 24)",
        "(line 56,col 9)-(line 56,col 47)",
        "(line 57,col 9)-(line 57,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[], int, int)",
      "begin_line": 69,
      "end_line": 78,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     * \n     * @param expected expected string\n     * @param buffer the buffer\n     * @param offset offset to read from\n     * @param length length of the buffer\n     * @return {@code true} if buffer is the same as the expected string\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 23)",
        "(line 72,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[])",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     * \n     * @param expected the expected strin\n     * @param buffer the buffer\n     * @return {@code true} if buffer is the same as the expected string\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(java.lang.String)",
      "begin_line": 98,
      "end_line": 104,
      "comment": "\n     * Convert a string to Ascii bytes.\n     * Used for comparing \"magic\" strings which need to be independent of the default Locale.\n     * \n     * @param inputString string to convert\n     * @return the bytes\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byte[])",
      "begin_line": 112,
      "end_line": 118,
      "comment": "\n     * Convert an input byte array to a String using the ASCII character set.\n     * \n     * @param inputBytes bytes to convert\n     * @return the bytes, interpreted as an Ascii string\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byte[], int, int)",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * Convert an input byte array to a String using the ASCII character set.\n     * \n     * @param inputBytes input byte array\n     * @param offset offset within array\n     * @param length length of array\n     * @return the bytes, interpreted as an Ascii string\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int, boolean)",
      "begin_line": 148,
      "end_line": 178,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     * \n     * @param buffer1 first buffer\n     * @param offset1 first offset\n     * @param length1 first length\n     * @param buffer2 second buffer\n     * @param offset2 second offset\n     * @param length2 second length\n     * @param ignoreTrailingNulls whether to ignore trailing nulls\n     * @return {@code true} if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 63)",
        "(line 153,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int)",
      "begin_line": 191,
      "end_line": 195,
      "comment": "\n     * Compare byte buffers\n     * \n     * @param buffer1 the first buffer\n     * @param offset1 the first offset\n     * @param length1 the first length\n     * @param buffer2 the second buffer\n     * @param offset2 the second offset\n     * @param length2 the second length\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[])",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Compare byte buffers\n     * \n     * @param buffer1 the first buffer\n     * @param buffer2 the second buffer\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[], boolean)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     * \n     * @param buffer1 the first buffer\n     * @param buffer2 the second buffer \n     * @param ignoreTrailingNulls whether to ignore tariling nulls\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byte[], int, int, byte[], int, int)",
      "begin_line": 231,
      "end_line": 235,
      "comment": "\n     * Compare byte buffers, ignoring trailing nulls\n     * \n     * @param buffer1 the first buffer\n     * @param offset1 the first offset\n     * @param length1 the first length\n     * @param buffer2 the second buffer\n     * @param offset2 the second offset\n     * @param length2 the second length\n     * @return {@code true} if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byte[], int)",
      "begin_line": 246,
      "end_line": 253,
      "comment": "\n     * Returns true if the first N bytes of an array are all zero\n     * \n     * @param a\n     *            The array to check\n     * @param size\n     *            The number of characters to check (not the size of the array)\n     * @return true if the first N bytes are zero\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.sanitize(java.lang.String)",
      "begin_line": 269,
      "end_line": 285,
      "comment": "\n     * Returns a \"sanitized\" version of the string given as arguments,\n     * where sanitized means non-printable characters have been\n     * replaced with a question mark.\n     *\n     * \u003cp\u003eThis method is used to clean up file names when they are\n     * used in exception messages as they may end up in log files or\n     * as console output and may have been read from a corrupted\n     * input.\u003c/p\u003e\n     *\n     * @param s the string to sanitize\n     * @return a sanitized version of the argument\n     * @since Compress 1.12\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 45)",
        "(line 271,col 9)-(line 271,col 37)",
        "(line 272,col 9)-(line 272,col 53)",
        "(line 273,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 29)"
      ]
    }
  ]
}