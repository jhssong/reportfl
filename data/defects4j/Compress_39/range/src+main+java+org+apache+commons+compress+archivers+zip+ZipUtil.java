{
  "filepath": "/tmp/Compress-39b/src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 357,
      "comment": "\n * Utility class for handling DOS and Java time conversions.\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "DOS_TIME_MIN"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Smallest date/time ZIP can handle.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(java.util.Date)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Convert a Date object to a DOS date/time field.\n     * @param time the \u003ccode\u003eDate\u003c/code\u003e to convert\n     * @return the date as a \u003ccode\u003eZipLong\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(long)",
      "begin_line": 53,
      "end_line": 57,
      "comment": "\n     * Convert a Date object to a DOS date/time field.\n     *\n     * \u003cp\u003eStolen from InfoZip\u0027s \u003ccode\u003efileio.c\u003c/code\u003e\u003c/p\u003e\n     * @param t number of milliseconds since the epoch\n     * @return the date as a byte array\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 42)",
        "(line 55,col 9)-(line 55,col 32)",
        "(line 56,col 9)-(line 56,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(long, byte[], int)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Convert a Date object to a DOS date/time field.\n     *\n     * \u003cp\u003eStolen from InfoZip\u0027s \u003ccode\u003efileio.c\u003c/code\u003e\u003c/p\u003e\n     * @param t number of milliseconds since the epoch\n     * @param buf the output buffer\n     * @param offset\n     *         The offset within the output buffer of the first byte to be written.\n     *         must be non-negative and no larger than \u003ctt\u003ebuf.length-4\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(java.util.Calendar, long, byte[], int)",
      "begin_line": 73,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 29)",
        "(line 76,col 9)-(line 76,col 46)",
        "(line 77,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 52)",
        "(line 82,col 9)-(line 87,col 56)",
        "(line 88,col 9)-(line 88,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(int)",
      "begin_line": 99,
      "end_line": 104,
      "comment": "\n     * Assumes a negative integer really is a positive integer that\n     * has wrapped around and re-creates the original value.\n     *\n     * @param i the value to treat as unsigned int.\n     * @return the unsigned int as a long.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byte[])",
      "begin_line": 117,
      "end_line": 125,
      "comment": "\n     * Reverses a byte[] array.  Reverses in-place (thus provided array is\n     * mutated), but also returns same for convenience.\n     *\n     * @param array to reverse (mutated in-place, but also returned for\n     *        convenience).\n     *\n     * @return the reversed array (mutated in-place, but also returned for\n     *        convenience).\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 39)",
        "(line 119,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.bigToLong(java.math.BigInteger)",
      "begin_line": 134,
      "end_line": 139,
      "comment": "\n     * Converts a BigInteger into a long, and blows up\n     * (NumberFormatException) if the BigInteger is too big.\n     *\n     * @param big BigInteger to convert.\n     * @return long representation of the BigInteger.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.longToBig(long)",
      "begin_line": 152,
      "end_line": 161,
      "comment": "\n     * \u003cp\u003e\n     * Converts a long into a BigInteger.  Negative numbers between -1 and\n     * -2^31 are treated as unsigned 32 bit (e.g., positive) integers.\n     * Negative numbers below -2^31 cause an IllegalArgumentException\n     * to be thrown.\n     * \u003c/p\u003e\n     *\n     * @param l long to convert to BigInteger.\n     * @return BigInteger representation of the provided long.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt(byte)",
      "begin_line": 171,
      "end_line": 176,
      "comment": "\n     * Converts a signed byte into an unsigned integer representation\n     * (e.g., -1 becomes 255).\n     *\n     * @param b byte to convert to int\n     * @return int representation of the provided byte\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.unsignedIntToSignedByte(int)",
      "begin_line": 186,
      "end_line": 194,
      "comment": "\n     * Converts an unsigned integer to a signed byte (e.g., 255 becomes -1).\n     *\n     * @param i integer to convert to byte\n     * @return byte representation of the provided int\n     * @throws IllegalArgumentException if the provided integer is not inside the range [0,255].\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * Convert a DOS date/time field to a Date object.\n     *\n     * @param zipDosTime contains the stored DOS time.\n     * @return a Date instance corresponding to the given time.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 51)",
        "(line 204,col 9)-(line 204,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime(long)",
      "begin_line": 213,
      "end_line": 225,
      "comment": "\n     * Converts DOS time to Java time (number of milliseconds since\n     * epoch).\n     * @param dosTime time to convert\n     * @return converted time\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 52)",
        "(line 216,col 9)-(line 216,col 70)",
        "(line 217,col 9)-(line 217,col 68)",
        "(line 218,col 9)-(line 218,col 61)",
        "(line 219,col 9)-(line 219,col 68)",
        "(line 220,col 9)-(line 220,col 62)",
        "(line 221,col 9)-(line 221,col 62)",
        "(line 222,col 9)-(line 222,col 41)",
        "(line 224,col 9)-(line 224,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.setNameAndCommentFromExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, byte[], byte[])",
      "begin_line": 232,
      "end_line": 253,
      "comment": "\n     * If the entry has Unicode*ExtraFields and the CRCs of the\n     * names/comments match those of the extra fields, transfer the\n     * known Unicode values from the extra field.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 236,col 61)",
        "(line 237,col 9)-(line 237,col 49)",
        "(line 238,col 9)-(line 239,col 78)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.getUnicodeStringIfOriginalMatches(org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField, byte[])",
      "begin_line": 262,
      "end_line": 284,
      "comment": "\n     * If the stored CRC matches the one of the given name, return the\n     * Unicode name of the given field.\n     *\n     * \u003cp\u003eIf the field is null or the CRCs don\u0027t match, return null\n     * instead.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.copy(byte[])",
      "begin_line": 290,
      "end_line": 297,
      "comment": "\n     * Create a copy of the given array - or return null if the\n     * argument is null.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.copy(byte[], byte[], int)",
      "begin_line": 298,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.canHandleEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Whether this library is able to read or write the given entry.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.supportsEncryptionOf(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Whether this library supports the encryption used by the given\n     * entry.\n     *\n     * @return true if the entry isn\u0027t encrypted at all\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.supportsMethodOf(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 328,
      "end_line": 334,
      "comment": "\n     * Whether this library supports the compression method used by\n     * the given entry.\n     *\n     * @return true if the compression method is STORED or DEFLATED\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 333,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 340,
      "end_line": 356,
      "comment": "\n     * Checks whether the entry requires features not (yet) supported\n     * by the library and throws an exception if it does.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 355,col 9)"
      ]
    }
  ]
}