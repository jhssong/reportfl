{
  "filepath": "/tmp/Compress-11b/src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 386,
      "comment": " CheckStyle:HideUtilityClassConstructorCheck OFF (bc)"
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.TarUtils()",
      "begin_line": 32,
      "end_line": 33,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byte[], int, int)",
      "begin_line": 51,
      "end_line": 107,
      "comment": "\n     * Parse an octal string from a buffer.\n     * Leading spaces are ignored.\n     * The buffer must contain a trailing space or NUL,\n     * and may contain an additional trailing space or NUL.\n     *\n     * The input buffer is allowed to contain all NULs,\n     * in which case the method returns 0L\n     * (this allows for missing fields).\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse - must be at least 2 bytes.\n     * @return The long value of the octal string.\n     * @throws IllegalArgumentException if the trailing space/NUL is missing or if a invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 27)",
        "(line 53,col 9)-(line 53,col 38)",
        "(line 54,col 9)-(line 54,col 31)",
        "(line 56,col 9)-(line 58,col 9)",
        "(line 60,col 9)-(line 60,col 30)",
        "(line 61,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 72,col 9)-(line 78,col 9)",
        "(line 81,col 9)-(line 81,col 21)",
        "(line 82,col 9)-(line 82,col 32)",
        "(line 83,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 32)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byte[], int, int)",
      "begin_line": 126,
      "end_line": 143,
      "comment": " \n     * Compute the value contained in a byte buffer.  If the most\n     * significant bit of the first byte in the buffer is set, this\n     * bit is ignored and the rest of the buffer is interpreted as a\n     * binary number.  Otherwise, the buffer is interpreted as an\n     * octal number as per the parseOctal function above.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The long value of the octal or binary string.\n     * @throws IllegalArgumentException if the trailing space/NUL is\n     * missing or an invalid byte is detected in an octal number, or\n     * if a binary number would exceed the size of a signed long\n     * 64-bit integer.\n     * @since Apache Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 41)",
        "(line 134,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byte[], int)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Parse a boolean byte from a buffer.\n     * Leading spaces and NUL are ignored.\n     * The buffer may contain trailing spaces or NULs.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @return The boolean value of the bytes.\n     * @throws IllegalArgumentException if an invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(byte[], int, int, int, byte)",
      "begin_line": 160,
      "end_line": 166,
      "comment": " Helper method to generate the exception message",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 59)",
        "(line 163,col 9)-(line 163,col 48)",
        "(line 164,col 9)-(line 164,col 115)",
        "(line 165,col 9)-(line 165,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int)",
      "begin_line": 178,
      "end_line": 191,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 55)",
        "(line 180,col 9)-(line 180,col 43)",
        "(line 182,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int)",
      "begin_line": 208,
      "end_line": 222,
      "comment": "\n     * Copy a name (StringBuffer) into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @return The updated offset, i.e. offset + length\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 14)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 221,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(long, byte[], int, int)",
      "begin_line": 233,
      "end_line": 256,
      "comment": "\n     * Fill buffer with unsigned octal number, padded with leading zeroes.\n     * \n     * @param value number to convert to octal - treated as unsigned\n     * @param buffer destination buffer\n     * @param offset starting offset in buffer\n     * @param length length of buffer to fill\n     * @throws IllegalArgumentException if the value will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 31)",
        "(line 236,col 9)-(line 236,col 20)",
        "(line 237,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(long, byte[], int, int)",
      "begin_line": 272,
      "end_line": 281,
      "comment": "\n     * Write an octal integer into a buffer.\n     *\n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by space and NUL\n     * \n     * @param value The value to write\n     * @param buf The buffer to receive the output\n     * @param offset The starting offset into the buffer\n     * @param length The size of the output buffer\n     * @return The updated offset, i.e offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 25)",
        "(line 275,col 9)-(line 275,col 59)",
        "(line 277,col 9)-(line 277,col 41)",
        "(line 278,col 9)-(line 278,col 32)",
        "(line 280,col 9)-(line 280,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(long, byte[], int, int)",
      "begin_line": 297,
      "end_line": 305,
      "comment": "\n     * Write an octal long integer into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write as octal\n     * @param buf The destinationbuffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer\n     * @return The updated offset\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 25)",
        "(line 301,col 9)-(line 301,col 59)",
        "(line 302,col 9)-(line 302,col 39)",
        "(line 304,col 9)-(line 304,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(long, byte[], int, int)",
      "begin_line": 324,
      "end_line": 344,
      "comment": "\n     * Write an long integer into a buffer as an octal string if this\n     * will fit, or as a binary number otherwise.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write into the buffer.\n     * @param buf The destination buffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer.\n     * @return The updated offset.\n     * @throws IllegalArgumentException if the value (and trailer)\n     * will not fit in the buffer.\n     * @since Apache Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 329,col 9)",
        "(line 331,col 9)-(line 331,col 25)",
        "(line 332,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 340,col 9)",
        "(line 342,col 9)-(line 342,col 28)",
        "(line 343,col 9)-(line 343,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(long, byte[], int, int)",
      "begin_line": 360,
      "end_line": 369,
      "comment": "\n     * Writes an octal value into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by NUL and then space.\n     *\n     * @param value The value to convert\n     * @param buf The destination buffer\n     * @param offset The starting offset into the buffer.\n     * @param length The size of the buffer.\n     * @return The updated value of offset, i.e. offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 25)",
        "(line 363,col 9)-(line 363,col 59)",
        "(line 365,col 9)-(line 365,col 34)",
        "(line 366,col 9)-(line 366,col 43)",
        "(line 368,col 9)-(line 368,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byte[])",
      "begin_line": 377,
      "end_line": 385,
      "comment": "\n     * Compute the checksum of a tar entry header.\n     *\n     * @param buf The tar entry\u0027s header buffer.\n     * @return The computed checksum.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 21)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 19)"
      ]
    }
  ]
}