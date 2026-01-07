{
  "filepath": "/tmp/Compress-28b/src/test/java/org/apache/commons/compress/archivers/zip/ZipFileTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFileTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 298,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zf"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.tearDown()",
      "begin_line": 41,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testCDOrder()",
      "begin_line": 46,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 24)",
        "(line 48,col 9)-(line 48,col 73)",
        "(line 49,col 9)-(line 49,col 59)",
        "(line 50,col 9)-(line 50,col 47)",
        "(line 51,col 9)-(line 51,col 49)",
        "(line 52,col 9)-(line 52,col 53)",
        "(line 53,col 9)-(line 53,col 51)",
        "(line 54,col 9)-(line 54,col 43)",
        "(line 55,col 9)-(line 55,col 48)",
        "(line 56,col 9)-(line 56,col 55)",
        "(line 57,col 9)-(line 57,col 58)",
        "(line 58,col 9)-(line 58,col 55)",
        "(line 59,col 9)-(line 59,col 43)",
        "(line 60,col 9)-(line 60,col 60)",
        "(line 61,col 9)-(line 61,col 57)",
        "(line 62,col 9)-(line 62,col 50)",
        "(line 63,col 9)-(line 63,col 56)",
        "(line 64,col 9)-(line 64,col 57)",
        "(line 65,col 9)-(line 65,col 46)",
        "(line 66,col 9)-(line 66,col 52)",
        "(line 67,col 9)-(line 67,col 48)",
        "(line 68,col 9)-(line 68,col 42)",
        "(line 69,col 9)-(line 69,col 42)",
        "(line 70,col 9)-(line 70,col 43)",
        "(line 71,col 9)-(line 71,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testPhysicalOrder()",
      "begin_line": 74,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 24)",
        "(line 76,col 9)-(line 76,col 88)",
        "(line 77,col 9)-(line 77,col 59)",
        "(line 78,col 9)-(line 78,col 47)",
        "(line 79,col 9)-(line 79,col 49)",
        "(line 80,col 9)-(line 80,col 53)",
        "(line 81,col 9)-(line 81,col 51)",
        "(line 82,col 9)-(line 82,col 43)",
        "(line 83,col 9)-(line 83,col 48)",
        "(line 84,col 9)-(line 84,col 55)",
        "(line 85,col 9)-(line 85,col 58)",
        "(line 86,col 9)-(line 86,col 55)",
        "(line 87,col 9)-(line 87,col 43)",
        "(line 88,col 9)-(line 88,col 60)",
        "(line 89,col 9)-(line 89,col 57)",
        "(line 90,col 9)-(line 90,col 50)",
        "(line 91,col 9)-(line 91,col 56)",
        "(line 92,col 9)-(line 92,col 57)",
        "(line 93,col 9)-(line 93,col 46)",
        "(line 94,col 9)-(line 94,col 52)",
        "(line 95,col 9)-(line 95,col 48)",
        "(line 96,col 9)-(line 96,col 42)",
        "(line 97,col 9)-(line 97,col 42)",
        "(line 98,col 9)-(line 98,col 43)",
        "(line 99,col 9)-(line 99,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testDoubleClose()",
      "begin_line": 102,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 24)",
        "(line 104,col 9)-(line 104,col 19)",
        "(line 105,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testReadingOfStoredEntry()",
      "begin_line": 112,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 77)",
        "(line 114,col 9)-(line 114,col 25)",
        "(line 115,col 9)-(line 115,col 30)",
        "(line 116,col 9)-(line 116,col 29)",
        "(line 117,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testWinzipBackSlashWorkaround()",
      "begin_line": 152,
      "end_line": 157,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-176\"\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 50)",
        "(line 154,col 9)-(line 154,col 34)",
        "(line 155,col 9)-(line 155,col 54)",
        "(line 156,col 9)-(line 156,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testSkipsPK00Prefix()",
      "begin_line": 164,
      "end_line": 169,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 51)",
        "(line 166,col 9)-(line 166,col 34)",
        "(line 167,col 9)-(line 167,col 48)",
        "(line 168,col 9)-(line 168,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testUnixSymlinkSampleFile()",
      "begin_line": 171,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 65)",
        "(line 173,col 9)-(line 173,col 83)",
        "(line 176,col 9)-(line 176,col 105)",
        "(line 177,col 9)-(line 177,col 100)",
        "(line 178,col 9)-(line 178,col 113)",
        "(line 179,col 9)-(line 179,col 77)",
        "(line 180,col 9)-(line 180,col 100)",
        "(line 181,col 9)-(line 181,col 63)",
        "(line 182,col 9)-(line 182,col 62)",
        "(line 186,col 9)-(line 186,col 89)",
        "(line 187,col 9)-(line 187,col 90)",
        "(line 192,col 9)-(line 192,col 65)",
        "(line 194,col 9)-(line 194,col 34)",
        "(line 195,col 9)-(line 195,col 58)",
        "(line 196,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testDuplicateEntry()",
      "begin_line": 213,
      "end_line": 227,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-227\"\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 51)",
        "(line 215,col 9)-(line 215,col 34)",
        "(line 217,col 9)-(line 217,col 54)",
        "(line 218,col 9)-(line 218,col 26)",
        "(line 219,col 9)-(line 219,col 45)",
        "(line 221,col 9)-(line 221,col 32)",
        "(line 222,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testExcessDataInZip64ExtraField()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-228\"\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 51)",
        "(line 234,col 9)-(line 234,col 34)",
        "(line 237,col 9)-(line 237,col 113)",
        "(line 238,col 9)-(line 238,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testUnshrinking()",
      "begin_line": 241,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 48)",
        "(line 243,col 9)-(line 243,col 56)",
        "(line 244,col 9)-(line 244,col 77)",
        "(line 245,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 40)",
        "(line 252,col 9)-(line 252,col 61)",
        "(line 253,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testReadingOfFirstStoredEntry()",
      "begin_line": 266,
      "end_line": 273,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-264\"\n     * \u003eCOMPRESS-264\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 51)",
        "(line 268,col 9)-(line 268,col 34)",
        "(line 269,col 9)-(line 269,col 53)",
        "(line 270,col 9)-(line 270,col 38)",
        "(line 271,col 9)-(line 272,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.readOrderTest()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\n     * ordertest.zip has been handcrafted.\n     *\n     * It contains enough files so any random coincidence of\n     * entries.keySet() and central directory order would be unlikely\n     * - in fact testCDOrder fails in svn revision 920284.\n     *\n     * The central directory has ZipFile and ZipUtil swapped so\n     * central directory order is different from entry data order.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 48)",
        "(line 287,col 9)-(line 287,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.assertEntryName(java.util.ArrayList\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003e, int, java.lang.String)",
      "begin_line": 290,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 48)",
        "(line 294,col 9)-(line 296,col 35)"
      ]
    }
  ]
}