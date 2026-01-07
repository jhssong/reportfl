{
  "filepath": "/tmp/Compress-32b/src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 359,
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
        "(line 54,col 9)-(line 54,col 36)",
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
        "(line 76,col 9)-(line 76,col 40)",
        "(line 77,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 46)",
        "(line 82,col 9)-(line 87,col 56)",
        "(line 88,col 9)-(line 88,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(int)",
      "begin_line": 99,
      "end_line": 105,
      "comment": "\n     * Assumes a negative integer really is a positive integer that\n     * has wrapped around and re-creates the original value.\n     *\n     * @param i the value to treat as unsigned int.\n     * @return the unsigned int as a long.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byte[])",
      "begin_line": 118,
      "end_line": 126,
      "comment": "\n     * Reverses a byte[] array.  Reverses in-place (thus provided array is\n     * mutated), but also returns same for convenience.\n     *\n     * @param array to reverse (mutated in-place, but also returned for\n     *        convenience).\n     *\n     * @return the reversed array (mutated in-place, but also returned for\n     *        convenience).\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 39)",
        "(line 120,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.bigToLong(java.math.BigInteger)",
      "begin_line": 135,
      "end_line": 141,
      "comment": "\n     * Converts a BigInteger into a long, and blows up\n     * (NumberFormatException) if the BigInteger is too big.\n     *\n     * @param big BigInteger to convert.\n     * @return long representation of the BigInteger.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.longToBig(long)",
      "begin_line": 154,
      "end_line": 163,
      "comment": "\n     * \u003cp\u003e\n     * Converts a long into a BigInteger.  Negative numbers between -1 and\n     * -2^31 are treated as unsigned 32 bit (e.g., positive) integers.\n     * Negative numbers below -2^31 cause an IllegalArgumentException\n     * to be thrown.\n     * \u003c/p\u003e\n     *\n     * @param l long to convert to BigInteger.\n     * @return BigInteger representation of the provided long.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt(byte)",
      "begin_line": 173,
      "end_line": 179,
      "comment": "\n     * Converts a signed byte into an unsigned integer representation\n     * (e.g., -1 becomes 255).\n     *\n     * @param b byte to convert to int\n     * @return int representation of the provided byte\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.unsignedIntToSignedByte(int)",
      "begin_line": 189,
      "end_line": 198,
      "comment": "\n     * Converts an unsigned integer to a signed byte (e.g., 255 becomes -1).\n     *\n     * @param i integer to convert to byte\n     * @return byte representation of the provided int\n     * @throws IllegalArgumentException if the provided integer is not inside the range [0,255].\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n     * Convert a DOS date/time field to a Date object.\n     *\n     * @param zipDosTime contains the stored DOS time.\n     * @return a Date instance corresponding to the given time.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 45)",
        "(line 208,col 9)-(line 208,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime(long)",
      "begin_line": 215,
      "end_line": 227,
      "comment": "\n     * Converts DOS time to Java time (number of milliseconds since\n     * epoch).\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 46)",
        "(line 218,col 9)-(line 218,col 70)",
        "(line 219,col 9)-(line 219,col 68)",
        "(line 220,col 9)-(line 220,col 61)",
        "(line 221,col 9)-(line 221,col 68)",
        "(line 222,col 9)-(line 222,col 62)",
        "(line 223,col 9)-(line 223,col 62)",
        "(line 224,col 9)-(line 224,col 41)",
        "(line 226,col 9)-(line 226,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.setNameAndCommentFromExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, byte[], byte[])",
      "begin_line": 234,
      "end_line": 255,
      "comment": "\n     * If the entry has Unicode*ExtraFields and the CRCs of the\n     * names/comments match those of the extra fields, transfer the\n     * known Unicode values from the extra field.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 238,col 61)",
        "(line 239,col 9)-(line 239,col 43)",
        "(line 240,col 9)-(line 241,col 78)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.getUnicodeStringIfOriginalMatches(org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField, byte[])",
      "begin_line": 264,
      "end_line": 286,
      "comment": "\n     * If the stored CRC matches the one of the given name, return the\n     * Unicode name of the given field.\n     *\n     * \u003cp\u003eIf the field is null or the CRCs don\u0027t match, return null\n     * instead.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.copy(byte[])",
      "begin_line": 292,
      "end_line": 299,
      "comment": "\n     * Create a copy of the given array - or return null if the\n     * argument is null.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.copy(byte[], byte[], int)",
      "begin_line": 300,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.canHandleEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Whether this library is able to read or write the given entry.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.supportsEncryptionOf(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Whether this library supports the encryption used by the given\n     * entry.\n     *\n     * @return true if the entry isn\u0027t encrypted at all\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.supportsMethodOf(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 330,
      "end_line": 335,
      "comment": "\n     * Whether this library supports the compression method used by\n     * the given entry.\n     *\n     * @return true if the compression method is STORED or DEFLATED\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 334,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 341,
      "end_line": 358,
      "comment": "\n     * Checks whether the entry requires features not (yet) supported\n     * by the library and throws an exception if it does.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 357,col 9)"
      ]
    }
  ]
}