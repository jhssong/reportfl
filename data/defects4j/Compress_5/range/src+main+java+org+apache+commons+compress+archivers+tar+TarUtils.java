{
  "filepath": "/tmp/Compress-5b/src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 262,
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
      "begin_line": 48,
      "end_line": 81,
      "comment": "\n     * Parse an octal string from a buffer.\n     * Leading spaces are ignored.\n     * Parsing stops when a NUL is found, or a trailing space,\n     * or the buffer length is reached.\n     *\n     * Behaviour with non-octal input is currently undefined.\n     * \n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The long value of the octal string.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 27)",
        "(line 50,col 9)-(line 50,col 36)",
        "(line 51,col 9)-(line 51,col 38)",
        "(line 53,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int)",
      "begin_line": 93,
      "end_line": 106,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 55)",
        "(line 95,col 9)-(line 95,col 43)",
        "(line 97,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int)",
      "begin_line": 123,
      "end_line": 137,
      "comment": "\n     * Copy a name (StringBuffer) into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @return The updated offset, i.e. offset + length\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 14)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(long, byte[], int, int)",
      "begin_line": 148,
      "end_line": 171,
      "comment": "\n     * Fill buffer with unsigned octal number, padded with leading zeroes.\n     * \n     * @param value number to convert to octal - treated as unsigned\n     * @param buffer destination buffer\n     * @param offset starting offset in buffer\n     * @param length length of buffer to fill\n     * @throws IllegalArgumentException if the value will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 31)",
        "(line 151,col 9)-(line 151,col 20)",
        "(line 152,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(long, byte[], int, int)",
      "begin_line": 187,
      "end_line": 196,
      "comment": "\n     * Write an octal integer into a buffer.\n     *\n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by space and NUL\n     * \n     * @param value The value to write\n     * @param buf The buffer to receive the output\n     * @param offset The starting offset into the buffer\n     * @param length The size of the output buffer\n     * @return The updated offset, i.e offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 25)",
        "(line 190,col 9)-(line 190,col 59)",
        "(line 192,col 9)-(line 192,col 41)",
        "(line 193,col 9)-(line 193,col 32)",
        "(line 195,col 9)-(line 195,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(long, byte[], int, int)",
      "begin_line": 212,
      "end_line": 220,
      "comment": "\n     * Write an octal long integer into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write as octal\n     * @param buf The destinationbuffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer\n     * @return The updated offset\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 25)",
        "(line 216,col 9)-(line 216,col 59)",
        "(line 217,col 9)-(line 217,col 39)",
        "(line 219,col 9)-(line 219,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(long, byte[], int, int)",
      "begin_line": 236,
      "end_line": 245,
      "comment": "\n     * Writes an octal value into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by NUL and then space.\n     *\n     * @param value The value to convert\n     * @param buf The destination buffer\n     * @param offset The starting offset into the buffer.\n     * @param length The size of the buffer.\n     * @return The updated value of offset, i.e. offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 25)",
        "(line 239,col 9)-(line 239,col 59)",
        "(line 241,col 9)-(line 241,col 34)",
        "(line 242,col 9)-(line 242,col 43)",
        "(line 244,col 9)-(line 244,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byte[])",
      "begin_line": 253,
      "end_line": 261,
      "comment": "\n     * Compute the checksum of a tar entry header.\n     *\n     * @param buf The tar entry\u0027s header buffer.\n     * @return The computed checksum.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 21)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 260,col 19)"
      ]
    }
  ]
}