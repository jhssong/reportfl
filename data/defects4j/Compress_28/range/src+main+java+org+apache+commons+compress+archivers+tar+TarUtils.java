{
  "filepath": "/tmp/Compress-28b/src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 626,
      "comment": " CheckStyle:HideUtilityClassConstructorCheck OFF (bc)"
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ENCODING"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FALLBACK_ENCODING"
      ],
      "begin_line": 47,
      "end_line": 75,
      "comment": "\n     * Encapsulates the algorithms used up to Commons Compress 1.3 as\n     * ZipEncoding.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-51d1d725-4c82-4fc2-883b-dd7228e91370.canEncode(java.lang.String)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 48,col 53)-(line 48,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-6207e179-9a3d-4489-9918-c972463cd5cb.encode(java.lang.String)",
      "begin_line": 50,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 51,col 17)-(line 51,col 49)",
        "(line 52,col 17)-(line 52,col 46)",
        "(line 55,col 17)-(line 57,col 17)",
        "(line 58,col 17)-(line 58,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-f2b96b3c-8467-4559-9517-9f1ddf73c3b8.decode(byte[])",
      "begin_line": 61,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 62,col 17)-(line 62,col 49)",
        "(line 63,col 17)-(line 63,col 65)",
        "(line 65,col 17)-(line 71,col 17)",
        "(line 73,col 17)-(line 73,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.TarUtils()",
      "begin_line": 78,
      "end_line": 79,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byte[], int, int)",
      "begin_line": 102,
      "end_line": 146,
      "comment": "\n     * Parse an octal string from a buffer.\n     *\n     * \u003cp\u003eLeading spaces are ignored.\n     * The buffer must contain a trailing space or NUL,\n     * and may contain an additional trailing space or NUL.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe input buffer is allowed to contain all NULs,\n     * in which case the method returns 0L\n     * (this allows for missing fields).\u003c/p\u003e\n     *\n     * \u003cp\u003eTo work-around some tar implementations that insert a\n     * leading NUL this method returns 0 if it detects a leading NUL\n     * since Commons Compress 1.4.\u003c/p\u003e\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse - must be at least 2 bytes.\n     * @return The long value of the octal string.\n     * @throws IllegalArgumentException if the trailing space/NUL is missing or if a invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 27)",
        "(line 104,col 9)-(line 104,col 38)",
        "(line 105,col 9)-(line 105,col 31)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 116,col 9)-(line 122,col 9)",
        "(line 128,col 9)-(line 128,col 39)",
        "(line 129,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byte[], int, int)",
      "begin_line": 165,
      "end_line": 176,
      "comment": " \n     * Compute the value contained in a byte buffer.  If the most\n     * significant bit of the first byte in the buffer is set, this\n     * bit is ignored and the rest of the buffer is interpreted as a\n     * binary number.  Otherwise, the buffer is interpreted as an\n     * octal number as per the parseOctal function above.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The long value of the octal or binary string.\n     * @throws IllegalArgumentException if the trailing space/NUL is\n     * missing or an invalid byte is detected in an octal number, or\n     * if a binary number would exceed the size of a signed long\n     * 64-bit integer.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 63)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong(byte[], int, int, boolean)",
      "begin_line": 178,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 21)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(byte[], int, int, boolean)",
      "begin_line": 199,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 48)",
        "(line 204,col 9)-(line 204,col 71)",
        "(line 205,col 9)-(line 205,col 51)",
        "(line 206,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byte[], int)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Parse a boolean byte from a buffer.\n     * Leading spaces and NUL are ignored.\n     * The buffer may contain trailing spaces or NULs.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @return The boolean value of the bytes.\n     * @throws IllegalArgumentException if an invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(byte[], int, int, int, byte)",
      "begin_line": 234,
      "end_line": 248,
      "comment": " Helper method to generate the exception message",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 59)",
        "(line 245,col 9)-(line 245,col 48)",
        "(line 246,col 9)-(line 246,col 115)",
        "(line 247,col 9)-(line 247,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int)",
      "begin_line": 260,
      "end_line": 271,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 285,
      "end_line": 302,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 25)",
        "(line 291,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int)",
      "begin_line": 319,
      "end_line": 331,
      "comment": "\n     * Copy a name into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @return The updated offset, i.e. offset + length\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 350,
      "end_line": 368,
      "comment": "\n     * Copy a name into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     * @return The updated offset, i.e. offset + length\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 32)",
        "(line 355,col 9)-(line 355,col 45)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 51)",
        "(line 360,col 9)-(line 360,col 73)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 367,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(long, byte[], int, int)",
      "begin_line": 379,
      "end_line": 402,
      "comment": "\n     * Fill buffer with unsigned octal number, padded with leading zeroes.\n     * \n     * @param value number to convert to octal - treated as unsigned\n     * @param buffer destination buffer\n     * @param offset starting offset in buffer\n     * @param length length of buffer to fill\n     * @throws IllegalArgumentException if the value will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 31)",
        "(line 382,col 9)-(line 382,col 20)",
        "(line 383,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(long, byte[], int, int)",
      "begin_line": 418,
      "end_line": 427,
      "comment": "\n     * Write an octal integer into a buffer.\n     *\n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by space and NUL\n     * \n     * @param value The value to write\n     * @param buf The buffer to receive the output\n     * @param offset The starting offset into the buffer\n     * @param length The size of the output buffer\n     * @return The updated offset, i.e offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 25)",
        "(line 421,col 9)-(line 421,col 59)",
        "(line 423,col 9)-(line 423,col 41)",
        "(line 424,col 9)-(line 424,col 32)",
        "(line 426,col 9)-(line 426,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(long, byte[], int, int)",
      "begin_line": 443,
      "end_line": 451,
      "comment": "\n     * Write an octal long integer into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write as octal\n     * @param buf The destinationbuffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer\n     * @return The updated offset\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 25)",
        "(line 447,col 9)-(line 447,col 59)",
        "(line 448,col 9)-(line 448,col 39)",
        "(line 450,col 9)-(line 450,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(long, byte[], int, int)",
      "begin_line": 470,
      "end_line": 488,
      "comment": "\n     * Write an long integer into a buffer as an octal string if this\n     * will fit, or as a binary number otherwise.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write into the buffer.\n     * @param buf The destination buffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer.\n     * @return The updated offset.\n     * @throws IllegalArgumentException if the value (and trailer)\n     * will not fit in the buffer.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 110)",
        "(line 476,col 9)-(line 476,col 43)",
        "(line 477,col 9)-(line 479,col 9)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 69)",
        "(line 486,col 9)-(line 486,col 54)",
        "(line 487,col 9)-(line 487,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(long, byte[], int, int, boolean)",
      "begin_line": 490,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 42)",
        "(line 494,col 9)-(line 494,col 36)",
        "(line 495,col 9)-(line 495,col 35)",
        "(line 496,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(long, byte[], int, int, boolean)",
      "begin_line": 511,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 51)",
        "(line 516,col 9)-(line 516,col 43)",
        "(line 517,col 9)-(line 517,col 33)",
        "(line 518,col 9)-(line 518,col 46)",
        "(line 519,col 9)-(line 519,col 46)",
        "(line 520,col 9)-(line 520,col 55)",
        "(line 521,col 9)-(line 523,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(long, byte[], int, int)",
      "begin_line": 540,
      "end_line": 549,
      "comment": "\n     * Writes an octal value into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by NUL and then space.\n     *\n     * @param value The value to convert\n     * @param buf The destination buffer\n     * @param offset The starting offset into the buffer.\n     * @param length The size of the buffer.\n     * @return The updated value of offset, i.e. offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 25)",
        "(line 543,col 9)-(line 543,col 59)",
        "(line 545,col 9)-(line 545,col 34)",
        "(line 546,col 9)-(line 546,col 43)",
        "(line 548,col 9)-(line 548,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byte[])",
      "begin_line": 557,
      "end_line": 565,
      "comment": "\n     * Compute the checksum of a tar entry header.\n     *\n     * @param buf The tar entry\u0027s header buffer.\n     * @return The computed checksum.\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 21)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 564,col 9)-(line 564,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byte[])",
      "begin_line": 602,
      "end_line": 624,
      "comment": "\n     * Wikipedia \u003ca href\u003d\"http://en.wikipedia.org/wiki/Tar_(file_format)#File_header\"\u003esays\u003c/a\u003e:\n     * \u003cblockquote\u003e\n     * The checksum is calculated by taking the sum of the unsigned byte values\n     * of the header block with the eight checksum bytes taken to be ascii\n     * spaces (decimal value 32). It is stored as a six digit octal number with\n     * leading zeroes followed by a NUL and then a space. Various\n     * implementations do not adhere to this format. For better compatibility,\n     * ignore leading and trailing whitespace, and get the first six digits. In\n     * addition, some historic tar implementations treated bytes as signed.\n     * Implementations typically calculate the checksum both ways, and treat it\n     * as good if either the signed or unsigned sum matches the included\n     * checksum.\n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * In addition there are\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-117\"\u003esome tar files\u003c/a\u003e\n     * that seem to have parts of their header cleared to zero (no detectable\n     * magic bytes, etc.) but still have a reasonable-looking checksum field\n     * present. It looks like we can detect such cases reasonably well by\n     * checking whether the stored checksum is \u003cem\u003egreater than\u003c/em\u003e the\n     * computed unsigned checksum. That check is unlikely to pass on some\n     * random file header, as it would need to have a valid sequence of\n     * octal digits in just the right place.\n     * \u003cp\u003e\n     * The return value of this method should be treated as a best-effort\n     * heuristic rather than an absolute and final truth. The checksum\n     * verification logic may well evolve over time as more special cases\n     * are encountered.\n     *\n     * @param header tar header\n     * @return whether the checksum is reasonably good\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-191\"\u003eCOMPRESS-191\u003c/a\u003e\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 27)",
        "(line 604,col 9)-(line 604,col 29)",
        "(line 605,col 9)-(line 605,col 27)",
        "(line 607,col 9)-(line 607,col 23)",
        "(line 608,col 9)-(line 620,col 9)",
        "(line 622,col 9)-(line 623,col 43)"
      ]
    }
  ]
}