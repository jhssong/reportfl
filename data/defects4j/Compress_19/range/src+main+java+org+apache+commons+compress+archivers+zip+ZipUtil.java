{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 329,
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
      "end_line": 69,
      "comment": "\n     * Convert a Date object to a DOS date/time field.\n     *\n     * \u003cp\u003eStolen from InfoZip\u0027s \u003ccode\u003efileio.c\u003c/code\u003e\u003c/p\u003e\n     * @param t number of milliseconds since the epoch\n     * @return the date as a byte array\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 44)",
        "(line 55,col 9)-(line 55,col 29)",
        "(line 57,col 9)-(line 57,col 40)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 46)",
        "(line 62,col 9)-(line 67,col 52)",
        "(line 68,col 9)-(line 68,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(int)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "\n     * Assumes a negative integer really is a positive integer that\n     * has wrapped around and re-creates the original value.\n     *\n     * @param i the value to treat as unsigned int.\n     * @return the unsigned int as a long.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byte[])",
      "begin_line": 97,
      "end_line": 105,
      "comment": "\n     * Reverses a byte[] array.  Reverses in-place (thus provided array is\n     * mutated), but also returns same for convenience.\n     *\n     * @param array to reverse (mutated in-place, but also returned for\n     *        convenience).\n     *\n     * @return the reversed array (mutated in-place, but also returned for\n     *        convenience).\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 39)",
        "(line 99,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.bigToLong(java.math.BigInteger)",
      "begin_line": 114,
      "end_line": 120,
      "comment": "\n     * Converts a BigInteger into a long, and blows up\n     * (NumberFormatException) if the BigInteger is too big.\n     *\n     * @param big BigInteger to convert.\n     * @return long representation of the BigInteger.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.longToBig(long)",
      "begin_line": 133,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003e\n     * Converts a long into a BigInteger.  Negative numbers between -1 and\n     * -2^31 are treated as unsigned 32 bit (e.g., positive) integers.\n     * Negative numbers below -2^31 cause an IllegalArgumentException\n     * to be thrown.\n     * \u003c/p\u003e\n     *\n     * @param l long to convert to BigInteger.\n     * @return BigInteger representation of the provided long.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt(byte)",
      "begin_line": 152,
      "end_line": 158,
      "comment": "\n     * Converts a signed byte into an unsigned integer representation\n     * (e.g., -1 becomes 255).\n     *\n     * @param b byte to convert to int\n     * @return int representation of the provided byte\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.unsignedIntToSignedByte(int)",
      "begin_line": 168,
      "end_line": 177,
      "comment": "\n     * Converts an unsigned integer to a signed byte (e.g., 255 becomes -1).\n     *\n     * @param i integer to convert to byte\n     * @return byte representation of the provided int\n     * @throws IllegalArgumentException if the provided integer is not inside the range [0,255].\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\n     * Convert a DOS date/time field to a Date object.\n     *\n     * @param zipDosTime contains the stored DOS time.\n     * @return a Date instance corresponding to the given time.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 45)",
        "(line 187,col 9)-(line 187,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime(long)",
      "begin_line": 194,
      "end_line": 205,
      "comment": "\n     * Converts DOS time to Java time (number of milliseconds since\n     * epoch).\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 46)",
        "(line 197,col 9)-(line 197,col 70)",
        "(line 198,col 9)-(line 198,col 68)",
        "(line 199,col 9)-(line 199,col 61)",
        "(line 200,col 9)-(line 200,col 68)",
        "(line 201,col 9)-(line 201,col 62)",
        "(line 202,col 9)-(line 202,col 62)",
        "(line 204,col 9)-(line 204,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.setNameAndCommentFromExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, byte[], byte[])",
      "begin_line": 212,
      "end_line": 233,
      "comment": "\n     * If the entry has Unicode*ExtraFields and the CRCs of the\n     * names/comments match those of the extra fields, transfer the\n     * known Unicode values from the extra field.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 216,col 61)",
        "(line 217,col 9)-(line 217,col 43)",
        "(line 218,col 9)-(line 219,col 78)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.getUnicodeStringIfOriginalMatches(org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField, byte[])",
      "begin_line": 242,
      "end_line": 264,
      "comment": "\n     * If the stored CRC matches the one of the given name, return the\n     * Unicode name of the given field.\n     *\n     * \u003cp\u003eIf the field is null or the CRCs don\u0027t match, return null\n     * instead.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.copy(byte[])",
      "begin_line": 270,
      "end_line": 277,
      "comment": "\n     * Create a copy of the given array - or return null if the\n     * argument is null.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.canHandleEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Whether this library is able to read or write the given entry.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.supportsEncryptionOf(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Whether this library supports the encryption used by the given\n     * entry.\n     *\n     * @return true if the entry isn\u0027t encrypted at all\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.supportsMethodOf(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n     * Whether this library supports the compression method used by\n     * the given entry.\n     *\n     * @return true if the compression method is STORED or DEFLATED\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 304,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 311,
      "end_line": 328,
      "comment": "\n     * Checks whether the entry requires features not (yet) supported\n     * by the library and throws an exception if it does.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 327,col 9)"
      ]
    }
  ]
}