{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 624,
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
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-9f4600e4-910c-4f86-b8a1-92618f64e732.canEncode(java.lang.String)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 48,col 53)-(line 48,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-4f9496e1-5605-4a05-8bdc-768fbfb890ce.encode(java.lang.String)",
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
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.Anonymous-ad55c083-ec9a-488c-9444-e542338bd3c2.decode(byte[])",
      "begin_line": 61,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 62,col 17)-(line 62,col 49)",
        "(line 63,col 17)-(line 63,col 63)",
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
      "end_line": 152,
      "comment": "\n     * Parse an octal string from a buffer.\n     *\n     * \u003cp\u003eLeading spaces are ignored.\n     * The buffer must contain a trailing space or NUL,\n     * and may contain an additional trailing space or NUL.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe input buffer is allowed to contain all NULs,\n     * in which case the method returns 0L\n     * (this allows for missing fields).\u003c/p\u003e\n     *\n     * \u003cp\u003eTo work-around some tar implementations that insert a\n     * leading NUL this method returns 0 if it detects a leading NUL\n     * since Commons Compress 1.4.\u003c/p\u003e\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse - must be at least 2 bytes.\n     * @return The long value of the octal string.\n     * @throws IllegalArgumentException if the trailing space/NUL is missing or if a invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 27)",
        "(line 104,col 9)-(line 104,col 38)",
        "(line 105,col 9)-(line 105,col 31)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 116,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 21)",
        "(line 126,col 9)-(line 126,col 32)",
        "(line 127,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 34)",
        "(line 135,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byte[], int, int)",
      "begin_line": 171,
      "end_line": 182,
      "comment": " \n     * Compute the value contained in a byte buffer.  If the most\n     * significant bit of the first byte in the buffer is set, this\n     * bit is ignored and the rest of the buffer is interpreted as a\n     * binary number.  Otherwise, the buffer is interpreted as an\n     * octal number as per the parseOctal function above.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The long value of the octal or binary string.\n     * @throws IllegalArgumentException if the trailing space/NUL is\n     * missing or an invalid byte is detected in an octal number, or\n     * if a binary number would exceed the size of a signed long\n     * 64-bit integer.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 63)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryLong(byte[], int, int, boolean)",
      "begin_line": 184,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 21)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBinaryBigInteger(byte[], int, int, boolean)",
      "begin_line": 205,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 48)",
        "(line 210,col 9)-(line 210,col 71)",
        "(line 211,col 9)-(line 211,col 51)",
        "(line 212,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byte[], int)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Parse a boolean byte from a buffer.\n     * Leading spaces and NUL are ignored.\n     * The buffer may contain trailing spaces or NULs.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @return The boolean value of the bytes.\n     * @throws IllegalArgumentException if an invalid byte is detected.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.exceptionMessage(byte[], int, int, int, byte)",
      "begin_line": 240,
      "end_line": 246,
      "comment": " Helper method to generate the exception message",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 59)",
        "(line 243,col 9)-(line 243,col 48)",
        "(line 244,col 9)-(line 244,col 115)",
        "(line 245,col 9)-(line 245,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int)",
      "begin_line": 258,
      "end_line": 269,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.parseName(byte[], int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 283,
      "end_line": 300,
      "comment": "\n     * Parse an entry name from a buffer.\n     * Parsing stops when a NUL is found\n     * or the buffer length is reached.\n     *\n     * @param buffer The buffer from which to parse.\n     * @param offset The offset into the buffer from which to parse.\n     * @param length The maximum number of bytes to parse.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     * @return The entry name.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 25)",
        "(line 289,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int)",
      "begin_line": 317,
      "end_line": 329,
      "comment": "\n     * Copy a name into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @return The updated offset, i.e. offset + length\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(java.lang.String, byte[], int, int, org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 348,
      "end_line": 366,
      "comment": "\n     * Copy a name into a buffer.\n     * Copies characters from the name into the buffer\n     * starting at the specified offset. \n     * If the buffer is longer than the name, the buffer\n     * is filled with trailing NULs.\n     * If the name is longer than the buffer,\n     * the output is truncated.\n     *\n     * @param name The header name from which to copy the characters.\n     * @param buf The buffer where the name is to be stored.\n     * @param offset The starting offset into the buffer\n     * @param length The maximum number of header bytes to copy.\n     * @param encoding name of the encoding to use for file names\n     * @since 1.4\n     * @return The updated offset, i.e. offset + length\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 32)",
        "(line 353,col 9)-(line 353,col 45)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 51)",
        "(line 358,col 9)-(line 358,col 73)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(long, byte[], int, int)",
      "begin_line": 377,
      "end_line": 400,
      "comment": "\n     * Fill buffer with unsigned octal number, padded with leading zeroes.\n     * \n     * @param value number to convert to octal - treated as unsigned\n     * @param buffer destination buffer\n     * @param offset starting offset in buffer\n     * @param length length of buffer to fill\n     * @throws IllegalArgumentException if the value will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 31)",
        "(line 380,col 9)-(line 380,col 20)",
        "(line 381,col 9)-(line 395,col 9)",
        "(line 397,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(long, byte[], int, int)",
      "begin_line": 416,
      "end_line": 425,
      "comment": "\n     * Write an octal integer into a buffer.\n     *\n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by space and NUL\n     * \n     * @param value The value to write\n     * @param buf The buffer to receive the output\n     * @param offset The starting offset into the buffer\n     * @param length The size of the output buffer\n     * @return The updated offset, i.e offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 25)",
        "(line 419,col 9)-(line 419,col 59)",
        "(line 421,col 9)-(line 421,col 41)",
        "(line 422,col 9)-(line 422,col 32)",
        "(line 424,col 9)-(line 424,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(long, byte[], int, int)",
      "begin_line": 441,
      "end_line": 449,
      "comment": "\n     * Write an octal long integer into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write as octal\n     * @param buf The destinationbuffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer\n     * @return The updated offset\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 25)",
        "(line 445,col 9)-(line 445,col 59)",
        "(line 446,col 9)-(line 446,col 39)",
        "(line 448,col 9)-(line 448,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(long, byte[], int, int)",
      "begin_line": 468,
      "end_line": 486,
      "comment": "\n     * Write an long integer into a buffer as an octal string if this\n     * will fit, or as a binary number otherwise.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by a space.\n     * \n     * @param value The value to write into the buffer.\n     * @param buf The destination buffer.\n     * @param offset The starting offset into the buffer.\n     * @param length The length of the buffer.\n     * @return The updated offset.\n     * @throws IllegalArgumentException if the value (and trailer)\n     * will not fit in the buffer.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 110)",
        "(line 474,col 9)-(line 474,col 43)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 69)",
        "(line 484,col 9)-(line 484,col 54)",
        "(line 485,col 9)-(line 485,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatLongBinary(long, byte[], int, int, boolean)",
      "begin_line": 488,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 42)",
        "(line 492,col 9)-(line 492,col 36)",
        "(line 493,col 9)-(line 493,col 35)",
        "(line 494,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 506,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatBigIntegerBinary(long, byte[], int, int, boolean)",
      "begin_line": 509,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 51)",
        "(line 514,col 9)-(line 514,col 43)",
        "(line 515,col 9)-(line 515,col 33)",
        "(line 516,col 9)-(line 516,col 46)",
        "(line 517,col 9)-(line 517,col 46)",
        "(line 518,col 9)-(line 518,col 55)",
        "(line 519,col 9)-(line 521,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(long, byte[], int, int)",
      "begin_line": 538,
      "end_line": 547,
      "comment": "\n     * Writes an octal value into a buffer.\n     * \n     * Uses {@link #formatUnsignedOctalString} to format\n     * the value as an octal string with leading zeros.\n     * The converted number is followed by NUL and then space.\n     *\n     * @param value The value to convert\n     * @param buf The destination buffer\n     * @param offset The starting offset into the buffer.\n     * @param length The size of the buffer.\n     * @return The updated value of offset, i.e. offset+length\n     * @throws IllegalArgumentException if the value (and trailer) will not fit in the buffer\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 25)",
        "(line 541,col 9)-(line 541,col 59)",
        "(line 543,col 9)-(line 543,col 34)",
        "(line 544,col 9)-(line 544,col 43)",
        "(line 546,col 9)-(line 546,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byte[])",
      "begin_line": 555,
      "end_line": 563,
      "comment": "\n     * Compute the checksum of a tar entry header.\n     *\n     * @param buf The tar entry\u0027s header buffer.\n     * @return The computed checksum.\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 21)",
        "(line 558,col 9)-(line 560,col 9)",
        "(line 562,col 9)-(line 562,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byte[])",
      "begin_line": 600,
      "end_line": 622,
      "comment": "\n     * Wikipedia \u003ca href\u003d\"http://en.wikipedia.org/wiki/Tar_(file_format)#File_header\"\u003esays\u003c/a\u003e:\n     * \u003cblockquote\u003e\n     * The checksum is calculated by taking the sum of the unsigned byte values\n     * of the header block with the eight checksum bytes taken to be ascii\n     * spaces (decimal value 32). It is stored as a six digit octal number with\n     * leading zeroes followed by a NUL and then a space. Various\n     * implementations do not adhere to this format. For better compatibility,\n     * ignore leading and trailing whitespace, and get the first six digits. In\n     * addition, some historic tar implementations treated bytes as signed.\n     * Implementations typically calculate the checksum both ways, and treat it\n     * as good if either the signed or unsigned sum matches the included\n     * checksum.\n     * \u003c/blockquote\u003e\n     * \u003cp\u003e\n     * In addition there are\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-117\"\u003esome tar files\u003c/a\u003e\n     * that seem to have parts of their header cleared to zero (no detectable\n     * magic bytes, etc.) but still have a reasonable-looking checksum field\n     * present. It looks like we can detect such cases reasonably well by\n     * checking whether the stored checksum is \u003cem\u003egreater than\u003c/em\u003e the\n     * computed unsigned checksum. That check is unlikely to pass on some\n     * random file header, as it would need to have a valid sequence of\n     * octal digits in just the right place.\n     * \u003cp\u003e\n     * The return value of this method should be treated as a best-effort\n     * heuristic rather than an absolute and final truth. The checksum\n     * verification logic may well evolve over time as more special cases\n     * are encountered.\n     *\n     * @param header tar header\n     * @return whether the checksum is reasonably good\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-191\"\u003eCOMPRESS-191\u003c/a\u003e\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 27)",
        "(line 602,col 9)-(line 602,col 29)",
        "(line 603,col 9)-(line 603,col 27)",
        "(line 605,col 9)-(line 605,col 23)",
        "(line 606,col 9)-(line 618,col 9)",
        "(line 620,col 9)-(line 621,col 43)"
      ]
    }
  ]
}