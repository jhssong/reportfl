{
  "filepath": "/tmp/Compress-36b/src/test/java/org/apache/commons/compress/archivers/zip/ZipFileTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFileTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zf"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.tearDown()",
      "begin_line": 43,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testCDOrder()",
      "begin_line": 48,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 24)",
        "(line 51,col 9)-(line 51,col 79)",
        "(line 52,col 9)-(line 52,col 59)",
        "(line 53,col 9)-(line 53,col 47)",
        "(line 54,col 9)-(line 54,col 49)",
        "(line 55,col 9)-(line 55,col 53)",
        "(line 56,col 9)-(line 56,col 51)",
        "(line 57,col 9)-(line 57,col 43)",
        "(line 58,col 9)-(line 58,col 48)",
        "(line 59,col 9)-(line 59,col 55)",
        "(line 60,col 9)-(line 60,col 58)",
        "(line 61,col 9)-(line 61,col 55)",
        "(line 62,col 9)-(line 62,col 43)",
        "(line 63,col 9)-(line 63,col 60)",
        "(line 64,col 9)-(line 64,col 57)",
        "(line 65,col 9)-(line 65,col 50)",
        "(line 66,col 9)-(line 66,col 56)",
        "(line 67,col 9)-(line 67,col 57)",
        "(line 68,col 9)-(line 68,col 46)",
        "(line 69,col 9)-(line 69,col 52)",
        "(line 70,col 9)-(line 70,col 48)",
        "(line 71,col 9)-(line 71,col 42)",
        "(line 72,col 9)-(line 72,col 42)",
        "(line 73,col 9)-(line 73,col 43)",
        "(line 74,col 9)-(line 74,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testPhysicalOrder()",
      "begin_line": 77,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 24)",
        "(line 80,col 9)-(line 80,col 94)",
        "(line 81,col 9)-(line 81,col 59)",
        "(line 82,col 9)-(line 82,col 47)",
        "(line 83,col 9)-(line 83,col 49)",
        "(line 84,col 9)-(line 84,col 53)",
        "(line 85,col 9)-(line 85,col 51)",
        "(line 86,col 9)-(line 86,col 43)",
        "(line 87,col 9)-(line 87,col 48)",
        "(line 88,col 9)-(line 88,col 55)",
        "(line 89,col 9)-(line 89,col 58)",
        "(line 90,col 9)-(line 90,col 55)",
        "(line 91,col 9)-(line 91,col 43)",
        "(line 92,col 9)-(line 92,col 60)",
        "(line 93,col 9)-(line 93,col 57)",
        "(line 94,col 9)-(line 94,col 50)",
        "(line 95,col 9)-(line 95,col 56)",
        "(line 96,col 9)-(line 96,col 57)",
        "(line 97,col 9)-(line 97,col 46)",
        "(line 98,col 9)-(line 98,col 52)",
        "(line 99,col 9)-(line 99,col 48)",
        "(line 100,col 9)-(line 100,col 42)",
        "(line 101,col 9)-(line 101,col 42)",
        "(line 102,col 9)-(line 102,col 43)",
        "(line 103,col 9)-(line 103,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testDoubleClose()",
      "begin_line": 106,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 24)",
        "(line 109,col 9)-(line 109,col 19)",
        "(line 110,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testReadingOfStoredEntry()",
      "begin_line": 117,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 83)",
        "(line 120,col 9)-(line 120,col 25)",
        "(line 121,col 9)-(line 121,col 30)",
        "(line 122,col 9)-(line 122,col 29)",
        "(line 123,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testWinzipBackSlashWorkaround()",
      "begin_line": 158,
      "end_line": 164,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-176\"\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 56)",
        "(line 161,col 9)-(line 161,col 34)",
        "(line 162,col 9)-(line 162,col 54)",
        "(line 163,col 9)-(line 163,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testSkipsPK00Prefix()",
      "begin_line": 171,
      "end_line": 177,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 57)",
        "(line 174,col 9)-(line 174,col 34)",
        "(line 175,col 9)-(line 175,col 48)",
        "(line 176,col 9)-(line 176,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testUnixSymlinkSampleFile()",
      "begin_line": 179,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 65)",
        "(line 182,col 9)-(line 182,col 83)",
        "(line 185,col 9)-(line 185,col 105)",
        "(line 186,col 9)-(line 186,col 100)",
        "(line 187,col 9)-(line 187,col 113)",
        "(line 188,col 9)-(line 188,col 77)",
        "(line 189,col 9)-(line 189,col 100)",
        "(line 190,col 9)-(line 190,col 63)",
        "(line 191,col 9)-(line 191,col 62)",
        "(line 195,col 9)-(line 195,col 89)",
        "(line 196,col 9)-(line 196,col 90)",
        "(line 201,col 9)-(line 201,col 71)",
        "(line 203,col 9)-(line 203,col 34)",
        "(line 204,col 9)-(line 204,col 64)",
        "(line 205,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testDuplicateEntry()",
      "begin_line": 222,
      "end_line": 237,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-227\"\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 57)",
        "(line 225,col 9)-(line 225,col 34)",
        "(line 227,col 9)-(line 227,col 60)",
        "(line 228,col 9)-(line 228,col 26)",
        "(line 229,col 9)-(line 229,col 45)",
        "(line 231,col 9)-(line 231,col 32)",
        "(line 232,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testExcessDataInZip64ExtraField()",
      "begin_line": 242,
      "end_line": 250,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-228\"\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 57)",
        "(line 245,col 9)-(line 245,col 34)",
        "(line 248,col 9)-(line 248,col 119)",
        "(line 249,col 9)-(line 249,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testUnshrinking()",
      "begin_line": 252,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 48)",
        "(line 255,col 9)-(line 255,col 56)",
        "(line 256,col 9)-(line 256,col 77)",
        "(line 257,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 40)",
        "(line 264,col 9)-(line 264,col 61)",
        "(line 265,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testReadingOfFirstStoredEntry()",
      "begin_line": 278,
      "end_line": 286,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-264\"\n     * \u003eCOMPRESS-264\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 57)",
        "(line 281,col 9)-(line 281,col 34)",
        "(line 282,col 9)-(line 282,col 59)",
        "(line 283,col 9)-(line 283,col 38)",
        "(line 284,col 9)-(line 285,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testUnzipBZip2CompressedEntry()",
      "begin_line": 288,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 54)",
        "(line 291,col 9)-(line 291,col 34)",
        "(line 292,col 9)-(line 292,col 61)",
        "(line 293,col 9)-(line 293,col 39)",
        "(line 294,col 9)-(line 294,col 45)",
        "(line 295,col 9)-(line 295,col 42)",
        "(line 296,col 9)-(line 296,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.readOrderTest()",
      "begin_line": 309,
      "end_line": 312,
      "comment": "\n     * ordertest.zip has been handcrafted.\n     *\n     * It contains enough files so any random coincidence of\n     * entries.keySet() and central directory order would be unlikely\n     * - in fact testCDOrder fails in svn revision 920284.\n     *\n     * The central directory has ZipFile and ZipUtil swapped so\n     * central directory order is different from entry data order.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 54)",
        "(line 311,col 9)-(line 311,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.assertEntryName(java.util.ArrayList\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003e, int, java.lang.String)",
      "begin_line": 314,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 54)",
        "(line 318,col 9)-(line 320,col 35)"
      ]
    }
  ]
}