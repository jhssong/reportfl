{
  "filepath": "/tmp/Compress-5b/src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 171,
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
      "begin_line": 75,
      "end_line": 81,
      "comment": "\n     * Assumes a negative integer really is a positive integer that\n     * has wrapped around and re-creates the original value.\n     * @param i the value to treat as unsigned int.\n     * @return the unsigned int as a long.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Convert a DOS date/time field to a Date object.\n     *\n     * @param zipDosTime contains the stored DOS time.\n     * @return a Date instance corresponding to the given time.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 45)",
        "(line 91,col 9)-(line 91,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime(long)",
      "begin_line": 98,
      "end_line": 109,
      "comment": "\n     * Converts DOS time to Java time (number of milliseconds since\n     * epoch).\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 46)",
        "(line 101,col 9)-(line 101,col 70)",
        "(line 102,col 9)-(line 102,col 68)",
        "(line 103,col 9)-(line 103,col 61)",
        "(line 104,col 9)-(line 104,col 68)",
        "(line 105,col 9)-(line 105,col 62)",
        "(line 106,col 9)-(line 106,col 62)",
        "(line 108,col 9)-(line 108,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.setNameAndCommentFromExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, byte[], byte[])",
      "begin_line": 116,
      "end_line": 137,
      "comment": "\n     * If the entry has Unicode*ExtraFields and the CRCs of the\n     * names/comments match those of the extra fields, transfer the\n     * known Unicode values from the extra field.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 120,col 61)",
        "(line 121,col 9)-(line 121,col 43)",
        "(line 122,col 9)-(line 123,col 78)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.getUnicodeStringIfOriginalMatches(org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField, byte[])",
      "begin_line": 146,
      "end_line": 168,
      "comment": "\n     * If the stored CRC matches the one of the given name, return the\n     * Unicode name of the given field.\n     *\n     * \u003cp\u003eIf the field is null or the CRCs don\u0027t match, return null\n     * instead.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 20)"
      ]
    }
  ]
}