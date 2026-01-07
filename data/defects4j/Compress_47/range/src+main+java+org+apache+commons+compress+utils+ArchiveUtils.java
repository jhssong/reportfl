{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/utils/ArchiveUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 299,
      "comment": "\n * Generic Archive utilities\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_SANITIZED_NAME_LENGTH"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.ArchiveUtils()",
      "begin_line": 34,
      "end_line": 35,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 49,
      "end_line": 61,
      "comment": "\n     * Generates a string containing the name, isDirectory setting and size of an entry.\n     * \u003cp\u003e\n     * For example:\n     * \u003cpre\u003e\n     * -    2000 main.c\n     * d     100 testfiles\n     * \u003c/pre\u003e\n     *\n     * @param entry the entry\n     * @return the representation of the entry\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 53)",
        "(line 51,col 9)-(line 51,col 50)",
        "(line 52,col 9)-(line 52,col 59)",
        "(line 53,col 9)-(line 53,col 23)",
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 24)",
        "(line 59,col 9)-(line 59,col 47)",
        "(line 60,col 9)-(line 60,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[], int, int)",
      "begin_line": 72,
      "end_line": 82,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     *\n     * @param expected expected string\n     * @param buffer the buffer\n     * @param offset offset to read from\n     * @param length length of the buffer\n     * @return {@code true} if buffer is the same as the expected string\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 23)",
        "(line 75,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[])",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     *\n     * @param expected the expected strin\n     * @param buffer the buffer\n     * @return {@code true} if buffer is the same as the expected string\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(java.lang.String)",
      "begin_line": 102,
      "end_line": 109,
      "comment": "\n     * Convert a string to Ascii bytes.\n     * Used for comparing \"magic\" strings which need to be independent of the default Locale.\n     *\n     * @param inputString string to convert\n     * @return the bytes\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byte[])",
      "begin_line": 117,
      "end_line": 124,
      "comment": "\n     * Convert an input byte array to a String using the ASCII character set.\n     *\n     * @param inputBytes bytes to convert\n     * @return the bytes, interpreted as an Ascii string\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byte[], int, int)",
      "begin_line": 134,
      "end_line": 141,
      "comment": "\n     * Convert an input byte array to a String using the ASCII character set.\n     *\n     * @param inputBytes input byte array\n     * @param offset offset within array\n     * @param length length of array\n     * @return the bytes, interpreted as an Ascii string\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int, boolean)",
      "begin_line": 155,
      "end_line": 185,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     *\n     * @param buffer1 first buffer\n     * @param offset1 first offset\n     * @param length1 first length\n     * @param buffer2 second buffer\n     * @param offset2 second offset\n     * @param length2 second length\n     * @param ignoreTrailingNulls whether to ignore trailing nulls\n     * @return {@code true} if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 63)",
        "(line 160,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int)",
      "begin_line": 198,
      "end_line": 202,
      "comment": "\n     * Compare byte buffers\n     *\n     * @param buffer1 the first buffer\n     * @param offset1 the first offset\n     * @param length1 the first length\n     * @param buffer2 the second buffer\n     * @param offset2 the second offset\n     * @param length2 the second length\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[])",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Compare byte buffers\n     *\n     * @param buffer1 the first buffer\n     * @param buffer2 the second buffer\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[], boolean)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     *\n     * @param buffer1 the first buffer\n     * @param buffer2 the second buffer\n     * @param ignoreTrailingNulls whether to ignore tariling nulls\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byte[], int, int, byte[], int, int)",
      "begin_line": 238,
      "end_line": 242,
      "comment": "\n     * Compare byte buffers, ignoring trailing nulls\n     *\n     * @param buffer1 the first buffer\n     * @param offset1 the first offset\n     * @param length1 the first length\n     * @param buffer2 the second buffer\n     * @param offset2 the second offset\n     * @param length2 the second length\n     * @return {@code true} if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byte[], int)",
      "begin_line": 253,
      "end_line": 260,
      "comment": "\n     * Returns true if the first N bytes of an array are all zero\n     *\n     * @param a\n     *            The array to check\n     * @param size\n     *            The number of characters to check (not the size of the array)\n     * @return true if the first N bytes are zero\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.sanitize(java.lang.String)",
      "begin_line": 277,
      "end_line": 297,
      "comment": "\n     * Returns a \"sanitized\" version of the string given as arguments,\n     * where sanitized means non-printable characters have been\n     * replaced with a question mark and the outcome is not longer\n     * than 255 chars.\n     *\n     * \u003cp\u003eThis method is used to clean up file names when they are\n     * used in exception messages as they may end up in log files or\n     * as console output and may have been read from a corrupted\n     * input.\u003c/p\u003e\n     *\n     * @param s the string to sanitize\n     * @return a sanitized version of the argument\n     * @since Compress 1.12\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 42)",
        "(line 279,col 9)-(line 279,col 120)",
        "(line 280,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 53)",
        "(line 286,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 29)"
      ]
    }
  ]
}