{
  "filepath": "/tmp/Compress-21b/src/test/java/org/apache/commons/compress/archivers/zip/ZipFileTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFileTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 39,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zf"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.tearDown()",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testCDOrder()",
      "begin_line": 47,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 24)",
        "(line 49,col 9)-(line 49,col 73)",
        "(line 50,col 9)-(line 50,col 59)",
        "(line 51,col 9)-(line 51,col 47)",
        "(line 52,col 9)-(line 52,col 49)",
        "(line 53,col 9)-(line 53,col 53)",
        "(line 54,col 9)-(line 54,col 51)",
        "(line 55,col 9)-(line 55,col 43)",
        "(line 56,col 9)-(line 56,col 48)",
        "(line 57,col 9)-(line 57,col 55)",
        "(line 58,col 9)-(line 58,col 58)",
        "(line 59,col 9)-(line 59,col 55)",
        "(line 60,col 9)-(line 60,col 43)",
        "(line 61,col 9)-(line 61,col 60)",
        "(line 62,col 9)-(line 62,col 57)",
        "(line 63,col 9)-(line 63,col 50)",
        "(line 64,col 9)-(line 64,col 56)",
        "(line 65,col 9)-(line 65,col 57)",
        "(line 66,col 9)-(line 66,col 46)",
        "(line 67,col 9)-(line 67,col 52)",
        "(line 68,col 9)-(line 68,col 48)",
        "(line 69,col 9)-(line 69,col 42)",
        "(line 70,col 9)-(line 70,col 42)",
        "(line 71,col 9)-(line 71,col 43)",
        "(line 72,col 9)-(line 72,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testPhysicalOrder()",
      "begin_line": 75,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 24)",
        "(line 77,col 9)-(line 77,col 88)",
        "(line 78,col 9)-(line 78,col 59)",
        "(line 79,col 9)-(line 79,col 47)",
        "(line 80,col 9)-(line 80,col 49)",
        "(line 81,col 9)-(line 81,col 53)",
        "(line 82,col 9)-(line 82,col 51)",
        "(line 83,col 9)-(line 83,col 43)",
        "(line 84,col 9)-(line 84,col 48)",
        "(line 85,col 9)-(line 85,col 55)",
        "(line 86,col 9)-(line 86,col 58)",
        "(line 87,col 9)-(line 87,col 55)",
        "(line 88,col 9)-(line 88,col 43)",
        "(line 89,col 9)-(line 89,col 60)",
        "(line 90,col 9)-(line 90,col 57)",
        "(line 91,col 9)-(line 91,col 50)",
        "(line 92,col 9)-(line 92,col 56)",
        "(line 93,col 9)-(line 93,col 57)",
        "(line 94,col 9)-(line 94,col 46)",
        "(line 95,col 9)-(line 95,col 52)",
        "(line 96,col 9)-(line 96,col 48)",
        "(line 97,col 9)-(line 97,col 42)",
        "(line 98,col 9)-(line 98,col 42)",
        "(line 99,col 9)-(line 99,col 43)",
        "(line 100,col 9)-(line 100,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testDoubleClose()",
      "begin_line": 103,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 24)",
        "(line 105,col 9)-(line 105,col 19)",
        "(line 106,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testReadingOfStoredEntry()",
      "begin_line": 113,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 77)",
        "(line 115,col 9)-(line 115,col 25)",
        "(line 116,col 9)-(line 116,col 30)",
        "(line 117,col 9)-(line 117,col 29)",
        "(line 118,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testWinzipBackSlashWorkaround()",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-176\"\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 50)",
        "(line 155,col 9)-(line 155,col 34)",
        "(line 156,col 9)-(line 156,col 54)",
        "(line 157,col 9)-(line 157,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testSkipsPK00Prefix()",
      "begin_line": 165,
      "end_line": 170,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 51)",
        "(line 167,col 9)-(line 167,col 34)",
        "(line 168,col 9)-(line 168,col 48)",
        "(line 169,col 9)-(line 169,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testUnixSymlinkSampleFile()",
      "begin_line": 172,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 65)",
        "(line 174,col 9)-(line 174,col 83)",
        "(line 177,col 9)-(line 177,col 105)",
        "(line 178,col 9)-(line 178,col 100)",
        "(line 179,col 9)-(line 179,col 113)",
        "(line 180,col 9)-(line 180,col 77)",
        "(line 181,col 9)-(line 181,col 100)",
        "(line 182,col 9)-(line 182,col 63)",
        "(line 183,col 9)-(line 183,col 62)",
        "(line 187,col 9)-(line 187,col 89)",
        "(line 188,col 9)-(line 188,col 90)",
        "(line 193,col 9)-(line 193,col 65)",
        "(line 195,col 9)-(line 195,col 34)",
        "(line 196,col 9)-(line 196,col 58)",
        "(line 197,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testDuplicateEntry()",
      "begin_line": 214,
      "end_line": 228,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-227\"\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 51)",
        "(line 216,col 9)-(line 216,col 34)",
        "(line 218,col 9)-(line 218,col 54)",
        "(line 219,col 9)-(line 219,col 26)",
        "(line 220,col 9)-(line 220,col 45)",
        "(line 222,col 9)-(line 222,col 32)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testExcessDataInZip64ExtraField()",
      "begin_line": 233,
      "end_line": 240,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-228\"\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 51)",
        "(line 235,col 9)-(line 235,col 34)",
        "(line 238,col 9)-(line 238,col 113)",
        "(line 239,col 9)-(line 239,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testUnshrinking()",
      "begin_line": 242,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 48)",
        "(line 244,col 9)-(line 244,col 56)",
        "(line 245,col 9)-(line 245,col 77)",
        "(line 246,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 40)",
        "(line 253,col 9)-(line 253,col 61)",
        "(line 254,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.readOrderTest()",
      "begin_line": 272,
      "end_line": 275,
      "comment": "\n     * ordertest.zip has been handcrafted.\n     *\n     * It contains enough files so any random coincidence of\n     * entries.keySet() and central directory order would be unlikely\n     * - in fact testCDOrder fails in svn revision 920284.\n     *\n     * The central directory has ZipFile and ZipUtil swapped so\n     * central directory order is different from entry data order.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 48)",
        "(line 274,col 9)-(line 274,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.assertEntryName(java.util.ArrayList\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003e, int, java.lang.String)",
      "begin_line": 277,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 48)",
        "(line 281,col 9)-(line 283,col 35)"
      ]
    }
  ]
}