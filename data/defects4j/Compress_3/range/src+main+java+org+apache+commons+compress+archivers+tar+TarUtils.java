{
  "filepath": "/tmp/Compress-3b/src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 258,
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
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byte[], int, int)",
      "begin_line": 44,
      "end_line": 77,
      "comment": "\n     * Parse an octal string from a buffer.\n     * Leading spaces are ignored.\n     * Parsing stops when a NUL is found, or a trailing space,\n     * or the buffer length is reached.\n     *\n     * Behaviour with non-octal input is currently undefined.\n     * \n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The long value of the octal string.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 27)",
        "(line 46,col 9)-(line 46,col 36)",
        "(line 47,col 9)-(line 47,col 38)",
        "(line 49,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int)",
      "begin_line": 89,
      "end_line": 102,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 55)",
        "(line 91,col 9)-(line 91,col 43)",
        "(line 93,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int)",
      "begin_line": 119,
      "end_line": 133,
      "comment": "\n     * Copy a name (StringBuffer) into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @return The updated offset, i.e. offset + length\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 14)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(long, byte[], int, int)",
      "begin_line": 144,
      "end_line": 167,
      "comment": "\n     * Fill buffer with unsigned octal number, padded with leading zeroes.\n     * \n     * @param value number to convert to octal - treated as unsigned\n     * @param buffer destination buffer\n     * @param offset starting offset in buffer\n     * @param length length of buffer to fill\n     * @throws IllegalArgumentException if the value will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 31)",
        "(line 147,col 9)-(line 147,col 20)",
        "(line 148,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(long, byte[], int, int)",
      "begin_line": 183,
      "end_line": 192,
      "comment": "\n     * Write an octal integer into a buffer.\n     *\n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by space and NUL\n     * \n     * @param value The value to write\n     * @param buf The buffer to receive the output\n     * @param offset The starting offset into the buffer\n     * @param length The size of the output buffer\n     * @return The updated offset, i.e offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 25)",
        "(line 186,col 9)-(line 186,col 59)",
        "(line 188,col 9)-(line 188,col 41)",
        "(line 189,col 9)-(line 189,col 32)",
        "(line 191,col 9)-(line 191,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(long, byte[], int, int)",
      "begin_line": 208,
      "end_line": 216,
      "comment": "\n     * Write an octal long integer into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write as octal\n     * @param buf The destinationbuffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer\n     * @return The updated offset\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 25)",
        "(line 212,col 9)-(line 212,col 59)",
        "(line 213,col 9)-(line 213,col 39)",
        "(line 215,col 9)-(line 215,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(long, byte[], int, int)",
      "begin_line": 232,
      "end_line": 241,
      "comment": "\n     * Writes an octal value into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by NUL and then space.\n     *\n     * @param value The value to convert\n     * @param buf The destination buffer\n     * @param offset The starting offset into the buffer.\n     * @param length The size of the buffer.\n     * @return The updated value of offset, i.e. offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 25)",
        "(line 235,col 9)-(line 235,col 59)",
        "(line 237,col 9)-(line 237,col 34)",
        "(line 238,col 9)-(line 238,col 43)",
        "(line 240,col 9)-(line 240,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byte[])",
      "begin_line": 249,
      "end_line": 257,
      "comment": "\n     * Compute the checksum of a tar entry header.\n     *\n     * @param buf The tar entry\u0027s header buffer.\n     * @return The computed checksum.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 21)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 19)"
      ]
    }
  ]
}