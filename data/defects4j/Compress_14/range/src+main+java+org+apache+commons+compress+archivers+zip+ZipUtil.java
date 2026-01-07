{
  "filepath": "/tmp/Compress-14b/src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 232,
      "comment": "\n * Utility class for handling DOS and Java time conversions.\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "DOS_TIME_MIN"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Smallest date/time ZIP can handle.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(java.util.Date)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Convert a Date object to a DOS date/time field.\n     * @param time the \u003ccode\u003eDate\u003c/code\u003e to convert\n     * @return the date as a \u003ccode\u003eZipLong\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(long)",
      "begin_line": 51,
      "end_line": 67,
      "comment": "\n     * Convert a Date object to a DOS date/time field.\n     *\n     * \u003cp\u003eStolen from InfoZip\u0027s \u003ccode\u003efileio.c\u003c/code\u003e\u003c/p\u003e\n     * @param t number of milliseconds since the epoch\n     * @return the date as a byte array\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 44)",
        "(line 53,col 9)-(line 53,col 29)",
        "(line 55,col 9)-(line 55,col 40)",
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 46)",
        "(line 60,col 9)-(line 65,col 52)",
        "(line 66,col 9)-(line 66,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(int)",
      "begin_line": 79,
      "end_line": 85,
      "comment": "\n     * Assumes a negative integer really is a positive integer that\n     * has wrapped around and re-creates the original value.\n     *\n     * \u003cp\u003eThis methods is no longer used as of Apache Commons Compress\n     * 1.3\u003c/p\u003e\n     *\n     * @param i the value to treat as unsigned int.\n     * @return the unsigned int as a long.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Convert a DOS date/time field to a Date object.\n     *\n     * @param zipDosTime contains the stored DOS time.\n     * @return a Date instance corresponding to the given time.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 45)",
        "(line 95,col 9)-(line 95,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime(long)",
      "begin_line": 102,
      "end_line": 113,
      "comment": "\n     * Converts DOS time to Java time (number of milliseconds since\n     * epoch).\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 46)",
        "(line 105,col 9)-(line 105,col 70)",
        "(line 106,col 9)-(line 106,col 68)",
        "(line 107,col 9)-(line 107,col 61)",
        "(line 108,col 9)-(line 108,col 68)",
        "(line 109,col 9)-(line 109,col 62)",
        "(line 110,col 9)-(line 110,col 62)",
        "(line 112,col 9)-(line 112,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.setNameAndCommentFromExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, byte[], byte[])",
      "begin_line": 120,
      "end_line": 141,
      "comment": "\n     * If the entry has Unicode*ExtraFields and the CRCs of the\n     * names/comments match those of the extra fields, transfer the\n     * known Unicode values from the extra field.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 124,col 61)",
        "(line 125,col 9)-(line 125,col 43)",
        "(line 126,col 9)-(line 127,col 78)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.getUnicodeStringIfOriginalMatches(org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField, byte[])",
      "begin_line": 150,
      "end_line": 172,
      "comment": "\n     * If the stored CRC matches the one of the given name, return the\n     * Unicode name of the given field.\n     *\n     * \u003cp\u003eIf the field is null or the CRCs don\u0027t match, return null\n     * instead.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.copy(byte[])",
      "begin_line": 178,
      "end_line": 185,
      "comment": "\n     * Create a copy of the given array - or return null if the\n     * argument is null.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.canHandleEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Whether this library is able to read or write the given entry.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.supportsEncryptionOf(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Whether this library supports the encryption used by the given\n     * entry.\n     *\n     * @return true if the entry isn\u0027t encrypted at all\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.supportsMethodOf(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\n     * Whether this library supports the compression method used by\n     * the given entry.\n     *\n     * @return true if the compression method is STORED or DEFLATED\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 212,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 219,
      "end_line": 231,
      "comment": "\n     * Checks whether the entry requires features not (yet) supported\n     * by the library and throws an exception if it does.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 230,col 9)"
      ]
    }
  ]
}