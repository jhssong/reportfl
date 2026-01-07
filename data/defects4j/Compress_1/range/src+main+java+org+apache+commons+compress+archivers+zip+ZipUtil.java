{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DOS_TIME_MIN"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": "\n     * Smallest date/time ZIP can handle.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(java.util.Date)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Convert a Date object to a DOS date/time field.\n     * @param time the \u003ccode\u003eDate\u003c/code\u003e to convert\n     * @return the date as a \u003ccode\u003eZipLong\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(long)",
      "begin_line": 45,
      "end_line": 62,
      "comment": "\n     * Convert a Date object to a DOS date/time field.\n     *\n     * \u003cp\u003eStolen from InfoZip\u0027s \u003ccode\u003efileio.c\u003c/code\u003e\u003c/p\u003e\n     * @param t number of milliseconds since the epoch\n     * @return the date as a byte array\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 32)",
        "(line 49,col 9)-(line 49,col 41)",
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 40)",
        "(line 54,col 9)-(line 59,col 47)",
        "(line 60,col 9)-(line 60,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(int)",
      "begin_line": 70,
      "end_line": 76,
      "comment": "\n     * Assumes a negative integer really is a positive integer that\n     * has wrapped around and re-creates the original value.\n     * @param i the value to treat as unsigned int.\n     * @return the unsigned int as a long.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Convert a DOS date/time field to a Date object.\n     *\n     * @param zipDosTime contains the stored DOS time.\n     * @return a Date instance corresponding to the given time.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 45)",
        "(line 86,col 9)-(line 86,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime(long)",
      "begin_line": 93,
      "end_line": 104,
      "comment": "\n     * Converts DOS time to Java time (number of milliseconds since\n     * epoch).\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 46)",
        "(line 96,col 9)-(line 96,col 70)",
        "(line 97,col 9)-(line 97,col 68)",
        "(line 98,col 9)-(line 98,col 61)",
        "(line 99,col 9)-(line 99,col 68)",
        "(line 100,col 9)-(line 100,col 62)",
        "(line 101,col 9)-(line 101,col 62)",
        "(line 103,col 9)-(line 103,col 39)"
      ]
    }
  ]
}