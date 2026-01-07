{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 612,
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
      "end_line": 77,
      "comment": "\n     * Encapsulates the algorithms used up to Commons Compress 1.3 as\n     * ZipEncoding.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-6eb625e8-75d6-49e0-a997-764d2eece104.canEncode(java.lang.String)",
      "begin_line": 48,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 49,col 59)-(line 49,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-7bda3884-f65b-414a-9bb8-e0bc57434e8d.encode(java.lang.String)",
      "begin_line": 51,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 53,col 17)-(line 53,col 49)",
        "(line 54,col 17)-(line 54,col 52)",
        "(line 57,col 17)-(line 59,col 17)",
        "(line 60,col 17)-(line 60,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-e749348a-7f0e-4472-81ee-b8755a6b3a4a.decode(byte[])",
      "begin_line": 63,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 65,col 17)-(line 65,col 49)",
        "(line 66,col 17)-(line 66,col 71)",
        "(line 68,col 17)-(line 73,col 17)",
        "(line 75,col 17)-(line 75,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.TarUtils()",
      "begin_line": 80,
      "end_line": 81,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byte[], int, int)",
      "begin_line": 104,
      "end_line": 148,
      "comment": "\n     * Parse an octal string from a buffer.\n     *\n     * \u003cp\u003eLeading spaces are ignored.\n     * The buffer must contain a trailing space or NUL,\n     * and may contain an additional trailing space or NUL.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe input buffer is allowed to contain all NULs,\n     * in which case the method returns 0L\n     * (this allows for missing fields).\u003c/p\u003e\n     *\n     * \u003cp\u003eTo work-around some tar implementations that insert a\n     * leading NUL this method returns 0 if it detects a leading NUL\n     * since Commons Compress 1.4.\u003c/p\u003e\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse - must be at least 2 bytes.\n     * @return The long value of the octal string.\n     * @throws IllegalArgumentException if the trailing space/NUL is missing or if a invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 27)",
        "(line 106,col 9)-(line 106,col 38)",
        "(line 107,col 9)-(line 107,col 31)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 118,col 9)-(line 124,col 9)",
        "(line 130,col 9)-(line 130,col 39)",
        "(line 131,col 9)-(line 134,col 9)",
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
        "(line 205,col 9)-(line 205,col 54)",
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
      "end_line": 250,
      "comment": " Helper method to generate the exception message",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 59)",
        "(line 247,col 9)-(line 247,col 48)",
        "(line 248,col 9)-(line 248,col 115)",
        "(line 249,col 9)-(line 249,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int)",
      "begin_line": 262,
      "end_line": 273,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 288,
      "end_line": 305,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     * @return The entry name.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 25)",
        "(line 294,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int)",
      "begin_line": 322,
      "end_line": 334,
      "comment": "\n     * Copy a name into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @return The updated offset, i.e. offset + length\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 354,
      "end_line": 372,
      "comment": "\n     * Copy a name into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     * @return The updated offset, i.e. offset + length\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 32)",
        "(line 359,col 9)-(line 359,col 45)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 51)",
        "(line 364,col 9)-(line 364,col 73)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 371,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(long, byte[], int, int)",
      "begin_line": 383,
      "end_line": 406,
      "comment": "\n     * Fill buffer with unsigned octal number, padded with leading zeroes.\n     * \n     * @param value number to convert to octal - treated as unsigned\n     * @param buffer destination buffer\n     * @param offset starting offset in buffer\n     * @param length length of buffer to fill\n     * @throws IllegalArgumentException if the value will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 31)",
        "(line 386,col 9)-(line 386,col 20)",
        "(line 387,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 405,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(long, byte[], int, int)",
      "begin_line": 422,
      "end_line": 431,
      "comment": "\n     * Write an octal integer into a buffer.\n     *\n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by space and NUL\n     * \n     * @param value The value to write\n     * @param buf The buffer to receive the output\n     * @param offset The starting offset into the buffer\n     * @param length The size of the output buffer\n     * @return The updated offset, i.e offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 25)",
        "(line 425,col 9)-(line 425,col 59)",
        "(line 427,col 9)-(line 427,col 41)",
        "(line 428,col 9)-(line 428,col 32)",
        "(line 430,col 9)-(line 430,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(long, byte[], int, int)",
      "begin_line": 447,
      "end_line": 455,
      "comment": "\n     * Write an octal long integer into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write as octal\n     * @param buf The destinationbuffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer\n     * @return The updated offset\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 31)",
        "(line 451,col 9)-(line 451,col 59)",
        "(line 452,col 9)-(line 452,col 39)",
        "(line 454,col 9)-(line 454,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(long, byte[], int, int)",
      "begin_line": 474,
      "end_line": 492,
      "comment": "\n     * Write an long integer into a buffer as an octal string if this\n     * will fit, or as a binary number otherwise.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write into the buffer.\n     * @param buf The destination buffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer.\n     * @return The updated offset.\n     * @throws IllegalArgumentException if the value (and trailer)\n     * will not fit in the buffer.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 110)",
        "(line 480,col 9)-(line 480,col 43)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 69)",
        "(line 490,col 9)-(line 490,col 54)",
        "(line 491,col 9)-(line 491,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(long, byte[], int, int, boolean)",
      "begin_line": 494,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 42)",
        "(line 498,col 9)-(line 498,col 36)",
        "(line 499,col 9)-(line 499,col 35)",
        "(line 500,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 512,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(long, byte[], int, int, boolean)",
      "begin_line": 515,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 57)",
        "(line 520,col 9)-(line 520,col 43)",
        "(line 521,col 9)-(line 521,col 33)",
        "(line 522,col 9)-(line 522,col 46)",
        "(line 523,col 9)-(line 523,col 46)",
        "(line 524,col 9)-(line 524,col 55)",
        "(line 525,col 9)-(line 527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(long, byte[], int, int)",
      "begin_line": 544,
      "end_line": 553,
      "comment": "\n     * Writes an octal value into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by NUL and then space.\n     *\n     * @param value The value to convert\n     * @param buf The destination buffer\n     * @param offset The starting offset into the buffer.\n     * @param length The size of the buffer.\n     * @return The updated value of offset, i.e. offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 25)",
        "(line 547,col 9)-(line 547,col 59)",
        "(line 549,col 9)-(line 549,col 34)",
        "(line 550,col 9)-(line 550,col 43)",
        "(line 552,col 9)-(line 552,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byte[])",
      "begin_line": 561,
      "end_line": 569,
      "comment": "\n     * Compute the checksum of a tar entry header.\n     *\n     * @param buf The tar entry\u0027s header buffer.\n     * @return The computed checksum.\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 21)",
        "(line 564,col 9)-(line 566,col 9)",
        "(line 568,col 9)-(line 568,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byte[])",
      "begin_line": 596,
      "end_line": 610,
      "comment": "\n     * Wikipedia \u003ca href\u003d\"http://en.wikipedia.org/wiki/Tar_(file_format)#File_header\"\u003esays\u003c/a\u003e:\n     * \u003cblockquote\u003e\n     * The checksum is calculated by taking the sum of the unsigned byte values\n     * of the header block with the eight checksum bytes taken to be ascii\n     * spaces (decimal value 32). It is stored as a six digit octal number with\n     * leading zeroes followed by a NUL and then a space. Various\n     * implementations do not adhere to this format. For better compatibility,\n     * ignore leading and trailing whitespace, and get the first six digits. In\n     * addition, some historic tar implementations treated bytes as signed.\n     * Implementations typically calculate the checksum both ways, and treat it\n     * as good if either the signed or unsigned sum matches the included\n     * checksum.\n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * The return value of this method should be treated as a best-effort\n     * heuristic rather than an absolute and final truth. The checksum\n     * verification logic may well evolve over time as more special cases\n     * are encountered.\n     *\n     * @param header tar header\n     * @return whether the checksum is reasonably good\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-191\"\u003eCOMPRESS-191\u003c/a\u003e\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 76)",
        "(line 598,col 9)-(line 598,col 29)",
        "(line 599,col 9)-(line 599,col 27)",
        "(line 601,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 66)"
      ]
    }
  ]
}