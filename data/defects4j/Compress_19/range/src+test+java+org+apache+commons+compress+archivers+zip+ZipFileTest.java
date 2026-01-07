{
  "filepath": "/tmp/Compress-19b/src/test/java/org/apache/commons/compress/archivers/zip/ZipFileTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFileTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zf"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.tearDown()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testCDOrder()",
      "begin_line": 44,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 24)",
        "(line 46,col 9)-(line 46,col 73)",
        "(line 47,col 9)-(line 47,col 59)",
        "(line 48,col 9)-(line 48,col 47)",
        "(line 49,col 9)-(line 49,col 49)",
        "(line 50,col 9)-(line 50,col 53)",
        "(line 51,col 9)-(line 51,col 51)",
        "(line 52,col 9)-(line 52,col 43)",
        "(line 53,col 9)-(line 53,col 48)",
        "(line 54,col 9)-(line 54,col 55)",
        "(line 55,col 9)-(line 55,col 58)",
        "(line 56,col 9)-(line 56,col 55)",
        "(line 57,col 9)-(line 57,col 43)",
        "(line 58,col 9)-(line 58,col 60)",
        "(line 59,col 9)-(line 59,col 57)",
        "(line 60,col 9)-(line 60,col 50)",
        "(line 61,col 9)-(line 61,col 56)",
        "(line 62,col 9)-(line 62,col 57)",
        "(line 63,col 9)-(line 63,col 46)",
        "(line 64,col 9)-(line 64,col 52)",
        "(line 65,col 9)-(line 65,col 48)",
        "(line 66,col 9)-(line 66,col 42)",
        "(line 67,col 9)-(line 67,col 42)",
        "(line 68,col 9)-(line 68,col 43)",
        "(line 69,col 9)-(line 69,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testPhysicalOrder()",
      "begin_line": 72,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 24)",
        "(line 74,col 9)-(line 74,col 88)",
        "(line 75,col 9)-(line 75,col 59)",
        "(line 76,col 9)-(line 76,col 47)",
        "(line 77,col 9)-(line 77,col 49)",
        "(line 78,col 9)-(line 78,col 53)",
        "(line 79,col 9)-(line 79,col 51)",
        "(line 80,col 9)-(line 80,col 43)",
        "(line 81,col 9)-(line 81,col 48)",
        "(line 82,col 9)-(line 82,col 55)",
        "(line 83,col 9)-(line 83,col 58)",
        "(line 84,col 9)-(line 84,col 55)",
        "(line 85,col 9)-(line 85,col 43)",
        "(line 86,col 9)-(line 86,col 60)",
        "(line 87,col 9)-(line 87,col 57)",
        "(line 88,col 9)-(line 88,col 50)",
        "(line 89,col 9)-(line 89,col 56)",
        "(line 90,col 9)-(line 90,col 57)",
        "(line 91,col 9)-(line 91,col 46)",
        "(line 92,col 9)-(line 92,col 52)",
        "(line 93,col 9)-(line 93,col 48)",
        "(line 94,col 9)-(line 94,col 42)",
        "(line 95,col 9)-(line 95,col 42)",
        "(line 96,col 9)-(line 96,col 43)",
        "(line 97,col 9)-(line 97,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testDoubleClose()",
      "begin_line": 100,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 24)",
        "(line 102,col 9)-(line 102,col 19)",
        "(line 103,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testReadingOfStoredEntry()",
      "begin_line": 110,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 77)",
        "(line 112,col 9)-(line 112,col 25)",
        "(line 113,col 9)-(line 113,col 30)",
        "(line 114,col 9)-(line 114,col 29)",
        "(line 115,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testWinzipBackSlashWorkaround()",
      "begin_line": 150,
      "end_line": 155,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-176\"\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 50)",
        "(line 152,col 9)-(line 152,col 34)",
        "(line 153,col 9)-(line 153,col 54)",
        "(line 154,col 9)-(line 154,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testSkipsPK00Prefix()",
      "begin_line": 162,
      "end_line": 167,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 51)",
        "(line 164,col 9)-(line 164,col 34)",
        "(line 165,col 9)-(line 165,col 48)",
        "(line 166,col 9)-(line 166,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testUnixSymlinkSampleFile()",
      "begin_line": 169,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 65)",
        "(line 171,col 9)-(line 171,col 83)",
        "(line 174,col 9)-(line 174,col 105)",
        "(line 175,col 9)-(line 175,col 100)",
        "(line 176,col 9)-(line 176,col 113)",
        "(line 177,col 9)-(line 177,col 77)",
        "(line 178,col 9)-(line 178,col 100)",
        "(line 179,col 9)-(line 179,col 63)",
        "(line 180,col 9)-(line 180,col 62)",
        "(line 184,col 9)-(line 184,col 89)",
        "(line 185,col 9)-(line 185,col 90)",
        "(line 190,col 9)-(line 190,col 65)",
        "(line 192,col 9)-(line 192,col 34)",
        "(line 193,col 9)-(line 193,col 58)",
        "(line 194,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testDuplicateEntry()",
      "begin_line": 211,
      "end_line": 227,
      "comment": "\n     * @see https://issues.apache.org/jira/browse/COMPRESS-227\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 51)",
        "(line 213,col 9)-(line 213,col 34)",
        "(line 215,col 9)-(line 215,col 54)",
        "(line 216,col 9)-(line 216,col 26)",
        "(line 217,col 9)-(line 217,col 45)",
        "(line 219,col 9)-(line 219,col 32)",
        "(line 220,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testExcessDataInZip64ExtraField()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\n     * @see https://issues.apache.org/jira/browse/COMPRESS-228\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 51)",
        "(line 234,col 9)-(line 234,col 34)",
        "(line 237,col 9)-(line 237,col 113)",
        "(line 238,col 9)-(line 238,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.readOrderTest()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "\n     * ordertest.zip has been handcrafted.\n     *\n     * It contains enough files so any random coincidence of\n     * entries.keySet() and central directory order would be unlikely\n     * - in fact testCDOrder fails in svn revision 920284.\n     *\n     * The central directory has ZipFile and ZipUtil swapped so\n     * central directory order is different from entry data order.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 48)",
        "(line 253,col 9)-(line 253,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.assertEntryName(java.util.ArrayList\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003e, int, java.lang.String)",
      "begin_line": 256,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 48)",
        "(line 260,col 9)-(line 262,col 35)"
      ]
    }
  ]
}