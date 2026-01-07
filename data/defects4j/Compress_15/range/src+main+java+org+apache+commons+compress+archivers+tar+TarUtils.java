{
  "filepath": "/tmp/Compress-15b/src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 561,
      "comment": " CheckStyle:HideUtilityClassConstructorCheck OFF (bc)"
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ENCODING"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FALLBACK_ENCODING"
      ],
      "begin_line": 44,
      "end_line": 72,
      "comment": "\n     * Encapsulates the algorithms used up to Commons Compress 1.3 as\n     * ZipEncoding.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-ccd253e2-cfce-4f3d-9360-7f886bc1d477.canEncode(java.lang.String)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 45,col 53)-(line 45,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-f8325ef0-85ac-4f62-80be-9b098caee803.encode(java.lang.String)",
      "begin_line": 47,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 48,col 17)-(line 48,col 49)",
        "(line 49,col 17)-(line 49,col 46)",
        "(line 52,col 17)-(line 54,col 17)",
        "(line 55,col 17)-(line 55,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-8b5ae6bf-a427-4943-b823-45f6d660afb5.decode(byte[])",
      "begin_line": 58,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 59,col 17)-(line 59,col 49)",
        "(line 60,col 17)-(line 60,col 63)",
        "(line 62,col 17)-(line 68,col 17)",
        "(line 70,col 17)-(line 70,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.TarUtils()",
      "begin_line": 75,
      "end_line": 76,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byte[], int, int)",
      "begin_line": 99,
      "end_line": 148,
      "comment": "\n     * Parse an octal string from a buffer.\n     *\n     * \u003cp\u003eLeading spaces are ignored.\n     * The buffer must contain a trailing space or NUL,\n     * and may contain an additional trailing space or NUL.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe input buffer is allowed to contain all NULs,\n     * in which case the method returns 0L\n     * (this allows for missing fields).\u003c/p\u003e\n     *\n     * \u003cp\u003eTo work-around some tar implementations that insert a\n     * leading NUL this method returns 0 if it detects a leading NUL\n     * since Commons Compress 1.4.\u003c/p\u003e\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse - must be at least 2 bytes.\n     * @return The long value of the octal string.\n     * @throws IllegalArgumentException if the trailing space/NUL is missing or if a invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 27)",
        "(line 101,col 9)-(line 101,col 38)",
        "(line 102,col 9)-(line 102,col 31)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 113,col 9)-(line 119,col 9)",
        "(line 122,col 9)-(line 122,col 21)",
        "(line 123,col 9)-(line 123,col 32)",
        "(line 124,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 32)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byte[], int, int)",
      "begin_line": 167,
      "end_line": 178,
      "comment": " \n     * Compute the value contained in a byte buffer.  If the most\n     * significant bit of the first byte in the buffer is set, this\n     * bit is ignored and the rest of the buffer is interpreted as a\n     * binary number.  Otherwise, the buffer is interpreted as an\n     * octal number as per the parseOctal function above.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The long value of the octal or binary string.\n     * @throws IllegalArgumentException if the trailing space/NUL is\n     * missing or an invalid byte is detected in an octal number, or\n     * if a binary number would exceed the size of a signed long\n     * 64-bit integer.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 63)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong(byte[], int, int, boolean)",
      "begin_line": 180,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 21)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(byte[], int, int, boolean)",
      "begin_line": 201,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 48)",
        "(line 206,col 9)-(line 206,col 71)",
        "(line 207,col 9)-(line 207,col 51)",
        "(line 208,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byte[], int)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Parse a boolean byte from a buffer.\n     * Leading spaces and NUL are ignored.\n     * The buffer may contain trailing spaces or NULs.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @return The boolean value of the bytes.\n     * @throws IllegalArgumentException if an invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(byte[], int, int, int, byte)",
      "begin_line": 236,
      "end_line": 242,
      "comment": " Helper method to generate the exception message",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 59)",
        "(line 239,col 9)-(line 239,col 48)",
        "(line 240,col 9)-(line 240,col 115)",
        "(line 241,col 9)-(line 241,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int)",
      "begin_line": 254,
      "end_line": 265,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 279,
      "end_line": 296,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @param encoding name of the encoding to use for file names\n     * @since Commons Compress 1.4\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 25)",
        "(line 285,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int)",
      "begin_line": 313,
      "end_line": 325,
      "comment": "\n     * Copy a name into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @return The updated offset, i.e. offset + length\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 344,
      "end_line": 362,
      "comment": "\n     * Copy a name into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @param encoding name of the encoding to use for file names\n     * @since Commons Compress 1.4\n     * @return The updated offset, i.e. offset + length\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 32)",
        "(line 349,col 9)-(line 349,col 45)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 36)",
        "(line 354,col 9)-(line 354,col 73)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 361,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(long, byte[], int, int)",
      "begin_line": 373,
      "end_line": 396,
      "comment": "\n     * Fill buffer with unsigned octal number, padded with leading zeroes.\n     * \n     * @param value number to convert to octal - treated as unsigned\n     * @param buffer destination buffer\n     * @param offset starting offset in buffer\n     * @param length length of buffer to fill\n     * @throws IllegalArgumentException if the value will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 31)",
        "(line 376,col 9)-(line 376,col 20)",
        "(line 377,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(long, byte[], int, int)",
      "begin_line": 412,
      "end_line": 421,
      "comment": "\n     * Write an octal integer into a buffer.\n     *\n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by space and NUL\n     * \n     * @param value The value to write\n     * @param buf The buffer to receive the output\n     * @param offset The starting offset into the buffer\n     * @param length The size of the output buffer\n     * @return The updated offset, i.e offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 25)",
        "(line 415,col 9)-(line 415,col 59)",
        "(line 417,col 9)-(line 417,col 41)",
        "(line 418,col 9)-(line 418,col 32)",
        "(line 420,col 9)-(line 420,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(long, byte[], int, int)",
      "begin_line": 437,
      "end_line": 445,
      "comment": "\n     * Write an octal long integer into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write as octal\n     * @param buf The destinationbuffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer\n     * @return The updated offset\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 25)",
        "(line 441,col 9)-(line 441,col 59)",
        "(line 442,col 9)-(line 442,col 39)",
        "(line 444,col 9)-(line 444,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(long, byte[], int, int)",
      "begin_line": 464,
      "end_line": 482,
      "comment": "\n     * Write an long integer into a buffer as an octal string if this\n     * will fit, or as a binary number otherwise.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write into the buffer.\n     * @param buf The destination buffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer.\n     * @return The updated offset.\n     * @throws IllegalArgumentException if the value (and trailer)\n     * will not fit in the buffer.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 110)",
        "(line 470,col 9)-(line 470,col 43)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 69)",
        "(line 480,col 9)-(line 480,col 54)",
        "(line 481,col 9)-(line 481,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(long, byte[], int, int, boolean)",
      "begin_line": 484,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 42)",
        "(line 488,col 9)-(line 488,col 36)",
        "(line 489,col 9)-(line 489,col 35)",
        "(line 490,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 502,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(long, byte[], int, int, boolean)",
      "begin_line": 505,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 51)",
        "(line 510,col 9)-(line 510,col 43)",
        "(line 511,col 9)-(line 511,col 33)",
        "(line 512,col 9)-(line 512,col 46)",
        "(line 513,col 9)-(line 513,col 46)",
        "(line 514,col 9)-(line 514,col 55)",
        "(line 515,col 9)-(line 517,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(long, byte[], int, int)",
      "begin_line": 534,
      "end_line": 543,
      "comment": "\n     * Writes an octal value into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by NUL and then space.\n     *\n     * @param value The value to convert\n     * @param buf The destination buffer\n     * @param offset The starting offset into the buffer.\n     * @param length The size of the buffer.\n     * @return The updated value of offset, i.e. offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 25)",
        "(line 537,col 9)-(line 537,col 59)",
        "(line 539,col 9)-(line 539,col 34)",
        "(line 540,col 9)-(line 540,col 43)",
        "(line 542,col 9)-(line 542,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byte[])",
      "begin_line": 551,
      "end_line": 559,
      "comment": "\n     * Compute the checksum of a tar entry header.\n     *\n     * @param buf The tar entry\u0027s header buffer.\n     * @return The computed checksum.\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 21)",
        "(line 554,col 9)-(line 556,col 9)",
        "(line 558,col 9)-(line 558,col 19)"
      ]
    }
  ]
}