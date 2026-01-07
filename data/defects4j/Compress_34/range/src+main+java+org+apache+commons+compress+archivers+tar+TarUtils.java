{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 627,
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
      "end_line": 74,
      "comment": "\n     * Encapsulates the algorithms used up to Commons Compress 1.3 as\n     * ZipEncoding.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-3faf847d-3105-4881-b822-5f79702a9fde.canEncode(java.lang.String)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 48,col 53)-(line 48,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-a3d3eed8-f2b4-43ef-b6b9-2edf14b31f6e.encode(java.lang.String)",
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
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-7bb6e5cd-651f-486e-81a9-c7946281f46a.decode(byte[])",
      "begin_line": 61,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 62,col 17)-(line 62,col 49)",
        "(line 63,col 17)-(line 63,col 65)",
        "(line 65,col 17)-(line 70,col 17)",
        "(line 72,col 17)-(line 72,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.TarUtils()",
      "begin_line": 77,
      "end_line": 78,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byte[], int, int)",
      "begin_line": 101,
      "end_line": 145,
      "comment": "\n     * Parse an octal string from a buffer.\n     *\n     * \u003cp\u003eLeading spaces are ignored.\n     * The buffer must contain a trailing space or NUL,\n     * and may contain an additional trailing space or NUL.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe input buffer is allowed to contain all NULs,\n     * in which case the method returns 0L\n     * (this allows for missing fields).\u003c/p\u003e\n     *\n     * \u003cp\u003eTo work-around some tar implementations that insert a\n     * leading NUL this method returns 0 if it detects a leading NUL\n     * since Commons Compress 1.4.\u003c/p\u003e\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse - must be at least 2 bytes.\n     * @return The long value of the octal string.\n     * @throws IllegalArgumentException if the trailing space/NUL is missing or if a invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 27)",
        "(line 103,col 9)-(line 103,col 38)",
        "(line 104,col 9)-(line 104,col 31)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 115,col 9)-(line 121,col 9)",
        "(line 127,col 9)-(line 127,col 39)",
        "(line 128,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byte[], int, int)",
      "begin_line": 164,
      "end_line": 175,
      "comment": " \n     * Compute the value contained in a byte buffer.  If the most\n     * significant bit of the first byte in the buffer is set, this\n     * bit is ignored and the rest of the buffer is interpreted as a\n     * binary number.  Otherwise, the buffer is interpreted as an\n     * octal number as per the parseOctal function above.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The long value of the octal or binary string.\n     * @throws IllegalArgumentException if the trailing space/NUL is\n     * missing or an invalid byte is detected in an octal number, or\n     * if a binary number would exceed the size of a signed long\n     * 64-bit integer.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 63)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong(byte[], int, int, boolean)",
      "begin_line": 177,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 21)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(byte[], int, int, boolean)",
      "begin_line": 198,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 48)",
        "(line 203,col 9)-(line 203,col 71)",
        "(line 204,col 9)-(line 204,col 51)",
        "(line 205,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byte[], int)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Parse a boolean byte from a buffer.\n     * Leading spaces and NUL are ignored.\n     * The buffer may contain trailing spaces or NULs.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @return The boolean value of the bytes.\n     * @throws IllegalArgumentException if an invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(byte[], int, int, int, byte)",
      "begin_line": 233,
      "end_line": 247,
      "comment": " Helper method to generate the exception message",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 59)",
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 245,col 115)",
        "(line 246,col 9)-(line 246,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int)",
      "begin_line": 259,
      "end_line": 270,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 269,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 285,
      "end_line": 302,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     * @return The entry name.\n     * @throws IOException on error\n     ",
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
      "begin_line": 351,
      "end_line": 369,
      "comment": "\n     * Copy a name into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     * @return The updated offset, i.e. offset + length\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 32)",
        "(line 356,col 9)-(line 356,col 45)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 51)",
        "(line 361,col 9)-(line 361,col 73)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 368,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(long, byte[], int, int)",
      "begin_line": 380,
      "end_line": 403,
      "comment": "\n     * Fill buffer with unsigned octal number, padded with leading zeroes.\n     * \n     * @param value number to convert to octal - treated as unsigned\n     * @param buffer destination buffer\n     * @param offset starting offset in buffer\n     * @param length length of buffer to fill\n     * @throws IllegalArgumentException if the value will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 31)",
        "(line 383,col 9)-(line 383,col 20)",
        "(line 384,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(long, byte[], int, int)",
      "begin_line": 419,
      "end_line": 428,
      "comment": "\n     * Write an octal integer into a buffer.\n     *\n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by space and NUL\n     * \n     * @param value The value to write\n     * @param buf The buffer to receive the output\n     * @param offset The starting offset into the buffer\n     * @param length The size of the output buffer\n     * @return The updated offset, i.e offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 25)",
        "(line 422,col 9)-(line 422,col 59)",
        "(line 424,col 9)-(line 424,col 41)",
        "(line 425,col 9)-(line 425,col 32)",
        "(line 427,col 9)-(line 427,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(long, byte[], int, int)",
      "begin_line": 444,
      "end_line": 452,
      "comment": "\n     * Write an octal long integer into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write as octal\n     * @param buf The destinationbuffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer\n     * @return The updated offset\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 25)",
        "(line 448,col 9)-(line 448,col 59)",
        "(line 449,col 9)-(line 449,col 39)",
        "(line 451,col 9)-(line 451,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(long, byte[], int, int)",
      "begin_line": 471,
      "end_line": 489,
      "comment": "\n     * Write an long integer into a buffer as an octal string if this\n     * will fit, or as a binary number otherwise.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write into the buffer.\n     * @param buf The destination buffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer.\n     * @return The updated offset.\n     * @throws IllegalArgumentException if the value (and trailer)\n     * will not fit in the buffer.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 110)",
        "(line 477,col 9)-(line 477,col 43)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 69)",
        "(line 487,col 9)-(line 487,col 54)",
        "(line 488,col 9)-(line 488,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(long, byte[], int, int, boolean)",
      "begin_line": 491,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 42)",
        "(line 495,col 9)-(line 495,col 36)",
        "(line 496,col 9)-(line 496,col 35)",
        "(line 497,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(long, byte[], int, int, boolean)",
      "begin_line": 512,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 51)",
        "(line 517,col 9)-(line 517,col 43)",
        "(line 518,col 9)-(line 518,col 33)",
        "(line 519,col 9)-(line 519,col 46)",
        "(line 520,col 9)-(line 520,col 46)",
        "(line 521,col 9)-(line 521,col 55)",
        "(line 522,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(long, byte[], int, int)",
      "begin_line": 541,
      "end_line": 550,
      "comment": "\n     * Writes an octal value into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by NUL and then space.\n     *\n     * @param value The value to convert\n     * @param buf The destination buffer\n     * @param offset The starting offset into the buffer.\n     * @param length The size of the buffer.\n     * @return The updated value of offset, i.e. offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 25)",
        "(line 544,col 9)-(line 544,col 59)",
        "(line 546,col 9)-(line 546,col 34)",
        "(line 547,col 9)-(line 547,col 43)",
        "(line 549,col 9)-(line 549,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byte[])",
      "begin_line": 558,
      "end_line": 566,
      "comment": "\n     * Compute the checksum of a tar entry header.\n     *\n     * @param buf The tar entry\u0027s header buffer.\n     * @return The computed checksum.\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 21)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 565,col 9)-(line 565,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byte[])",
      "begin_line": 603,
      "end_line": 625,
      "comment": "\n     * Wikipedia \u003ca href\u003d\"http://en.wikipedia.org/wiki/Tar_(file_format)#File_header\"\u003esays\u003c/a\u003e:\n     * \u003cblockquote\u003e\n     * The checksum is calculated by taking the sum of the unsigned byte values\n     * of the header block with the eight checksum bytes taken to be ascii\n     * spaces (decimal value 32). It is stored as a six digit octal number with\n     * leading zeroes followed by a NUL and then a space. Various\n     * implementations do not adhere to this format. For better compatibility,\n     * ignore leading and trailing whitespace, and get the first six digits. In\n     * addition, some historic tar implementations treated bytes as signed.\n     * Implementations typically calculate the checksum both ways, and treat it\n     * as good if either the signed or unsigned sum matches the included\n     * checksum.\n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * In addition there are\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-117\"\u003esome tar files\u003c/a\u003e\n     * that seem to have parts of their header cleared to zero (no detectable\n     * magic bytes, etc.) but still have a reasonable-looking checksum field\n     * present. It looks like we can detect such cases reasonably well by\n     * checking whether the stored checksum is \u003cem\u003egreater than\u003c/em\u003e the\n     * computed unsigned checksum. That check is unlikely to pass on some\n     * random file header, as it would need to have a valid sequence of\n     * octal digits in just the right place.\n     * \u003cp\u003e\n     * The return value of this method should be treated as a best-effort\n     * heuristic rather than an absolute and final truth. The checksum\n     * verification logic may well evolve over time as more special cases\n     * are encountered.\n     *\n     * @param header tar header\n     * @return whether the checksum is reasonably good\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-191\"\u003eCOMPRESS-191\u003c/a\u003e\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 27)",
        "(line 605,col 9)-(line 605,col 29)",
        "(line 606,col 9)-(line 606,col 27)",
        "(line 608,col 9)-(line 608,col 23)",
        "(line 609,col 9)-(line 621,col 9)",
        "(line 623,col 9)-(line 624,col 43)"
      ]
    }
  ]
}