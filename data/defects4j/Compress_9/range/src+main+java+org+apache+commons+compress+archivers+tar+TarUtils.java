{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 311,
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
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byte[], int)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Parse a boolean byte from a buffer.\n     * Leading spaces and NUL are ignored.\n     * The buffer may contain trailing spaces or NULs.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @return The boolean value of the bytes.\n     * @throws IllegalArgumentException if an invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(byte[], int, int, int, byte)",
      "begin_line": 124,
      "end_line": 130,
      "comment": " Helper method to generate the exception message",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 59)",
        "(line 127,col 9)-(line 127,col 48)",
        "(line 128,col 9)-(line 128,col 115)",
        "(line 129,col 9)-(line 129,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int)",
      "begin_line": 142,
      "end_line": 155,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 55)",
        "(line 144,col 9)-(line 144,col 43)",
        "(line 146,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int)",
      "begin_line": 172,
      "end_line": 186,
      "comment": "\n     * Copy a name (StringBuffer) into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @return The updated offset, i.e. offset + length\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 14)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(long, byte[], int, int)",
      "begin_line": 197,
      "end_line": 220,
      "comment": "\n     * Fill buffer with unsigned octal number, padded with leading zeroes.\n     * \n     * @param value number to convert to octal - treated as unsigned\n     * @param buffer destination buffer\n     * @param offset starting offset in buffer\n     * @param length length of buffer to fill\n     * @throws IllegalArgumentException if the value will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 31)",
        "(line 200,col 9)-(line 200,col 20)",
        "(line 201,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(long, byte[], int, int)",
      "begin_line": 236,
      "end_line": 245,
      "comment": "\n     * Write an octal integer into a buffer.\n     *\n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by space and NUL\n     * \n     * @param value The value to write\n     * @param buf The buffer to receive the output\n     * @param offset The starting offset into the buffer\n     * @param length The size of the output buffer\n     * @return The updated offset, i.e offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 25)",
        "(line 239,col 9)-(line 239,col 59)",
        "(line 241,col 9)-(line 241,col 41)",
        "(line 242,col 9)-(line 242,col 32)",
        "(line 244,col 9)-(line 244,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(long, byte[], int, int)",
      "begin_line": 261,
      "end_line": 269,
      "comment": "\n     * Write an octal long integer into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write as octal\n     * @param buf The destinationbuffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer\n     * @return The updated offset\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 25)",
        "(line 265,col 9)-(line 265,col 59)",
        "(line 266,col 9)-(line 266,col 39)",
        "(line 268,col 9)-(line 268,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(long, byte[], int, int)",
      "begin_line": 285,
      "end_line": 294,
      "comment": "\n     * Writes an octal value into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by NUL and then space.\n     *\n     * @param value The value to convert\n     * @param buf The destination buffer\n     * @param offset The starting offset into the buffer.\n     * @param length The size of the buffer.\n     * @return The updated value of offset, i.e. offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 25)",
        "(line 288,col 9)-(line 288,col 59)",
        "(line 290,col 9)-(line 290,col 34)",
        "(line 291,col 9)-(line 291,col 43)",
        "(line 293,col 9)-(line 293,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byte[])",
      "begin_line": 302,
      "end_line": 310,
      "comment": "\n     * Compute the checksum of a tar entry header.\n     *\n     * @param buf The tar entry\u0027s header buffer.\n     * @return The computed checksum.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 21)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 19)"
      ]
    }
  ]
}