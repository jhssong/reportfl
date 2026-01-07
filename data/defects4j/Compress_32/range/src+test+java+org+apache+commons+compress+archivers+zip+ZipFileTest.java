{
  "filepath": "/tmp/Compress-32b/src/test/java/org/apache/commons/compress/archivers/zip/ZipFileTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFileTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 310,
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
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 24)",
        "(line 50,col 9)-(line 50,col 73)",
        "(line 51,col 9)-(line 51,col 59)",
        "(line 52,col 9)-(line 52,col 47)",
        "(line 53,col 9)-(line 53,col 49)",
        "(line 54,col 9)-(line 54,col 53)",
        "(line 55,col 9)-(line 55,col 51)",
        "(line 56,col 9)-(line 56,col 43)",
        "(line 57,col 9)-(line 57,col 48)",
        "(line 58,col 9)-(line 58,col 55)",
        "(line 59,col 9)-(line 59,col 58)",
        "(line 60,col 9)-(line 60,col 55)",
        "(line 61,col 9)-(line 61,col 43)",
        "(line 62,col 9)-(line 62,col 60)",
        "(line 63,col 9)-(line 63,col 57)",
        "(line 64,col 9)-(line 64,col 50)",
        "(line 65,col 9)-(line 65,col 56)",
        "(line 66,col 9)-(line 66,col 57)",
        "(line 67,col 9)-(line 67,col 46)",
        "(line 68,col 9)-(line 68,col 52)",
        "(line 69,col 9)-(line 69,col 48)",
        "(line 70,col 9)-(line 70,col 42)",
        "(line 71,col 9)-(line 71,col 42)",
        "(line 72,col 9)-(line 72,col 43)",
        "(line 73,col 9)-(line 73,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testPhysicalOrder()",
      "begin_line": 76,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 24)",
        "(line 79,col 9)-(line 79,col 88)",
        "(line 80,col 9)-(line 80,col 59)",
        "(line 81,col 9)-(line 81,col 47)",
        "(line 82,col 9)-(line 82,col 49)",
        "(line 83,col 9)-(line 83,col 53)",
        "(line 84,col 9)-(line 84,col 51)",
        "(line 85,col 9)-(line 85,col 43)",
        "(line 86,col 9)-(line 86,col 48)",
        "(line 87,col 9)-(line 87,col 55)",
        "(line 88,col 9)-(line 88,col 58)",
        "(line 89,col 9)-(line 89,col 55)",
        "(line 90,col 9)-(line 90,col 43)",
        "(line 91,col 9)-(line 91,col 60)",
        "(line 92,col 9)-(line 92,col 57)",
        "(line 93,col 9)-(line 93,col 50)",
        "(line 94,col 9)-(line 94,col 56)",
        "(line 95,col 9)-(line 95,col 57)",
        "(line 96,col 9)-(line 96,col 46)",
        "(line 97,col 9)-(line 97,col 52)",
        "(line 98,col 9)-(line 98,col 48)",
        "(line 99,col 9)-(line 99,col 42)",
        "(line 100,col 9)-(line 100,col 42)",
        "(line 101,col 9)-(line 101,col 43)",
        "(line 102,col 9)-(line 102,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testDoubleClose()",
      "begin_line": 105,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 24)",
        "(line 108,col 9)-(line 108,col 19)",
        "(line 109,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testReadingOfStoredEntry()",
      "begin_line": 116,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 77)",
        "(line 119,col 9)-(line 119,col 25)",
        "(line 120,col 9)-(line 120,col 30)",
        "(line 121,col 9)-(line 121,col 29)",
        "(line 122,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testWinzipBackSlashWorkaround()",
      "begin_line": 157,
      "end_line": 163,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-176\"\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 50)",
        "(line 160,col 9)-(line 160,col 34)",
        "(line 161,col 9)-(line 161,col 54)",
        "(line 162,col 9)-(line 162,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testSkipsPK00Prefix()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 51)",
        "(line 173,col 9)-(line 173,col 34)",
        "(line 174,col 9)-(line 174,col 48)",
        "(line 175,col 9)-(line 175,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testUnixSymlinkSampleFile()",
      "begin_line": 178,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 65)",
        "(line 181,col 9)-(line 181,col 83)",
        "(line 184,col 9)-(line 184,col 105)",
        "(line 185,col 9)-(line 185,col 100)",
        "(line 186,col 9)-(line 186,col 113)",
        "(line 187,col 9)-(line 187,col 77)",
        "(line 188,col 9)-(line 188,col 100)",
        "(line 189,col 9)-(line 189,col 63)",
        "(line 190,col 9)-(line 190,col 62)",
        "(line 194,col 9)-(line 194,col 89)",
        "(line 195,col 9)-(line 195,col 90)",
        "(line 200,col 9)-(line 200,col 65)",
        "(line 202,col 9)-(line 202,col 34)",
        "(line 203,col 9)-(line 203,col 58)",
        "(line 204,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testDuplicateEntry()",
      "begin_line": 221,
      "end_line": 236,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-227\"\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 51)",
        "(line 224,col 9)-(line 224,col 34)",
        "(line 226,col 9)-(line 226,col 54)",
        "(line 227,col 9)-(line 227,col 26)",
        "(line 228,col 9)-(line 228,col 45)",
        "(line 230,col 9)-(line 230,col 32)",
        "(line 231,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testExcessDataInZip64ExtraField()",
      "begin_line": 241,
      "end_line": 249,
      "comment": "\n     * @see \"https://issues.apache.org/jira/browse/COMPRESS-228\"\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 51)",
        "(line 244,col 9)-(line 244,col 34)",
        "(line 247,col 9)-(line 247,col 113)",
        "(line 248,col 9)-(line 248,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testUnshrinking()",
      "begin_line": 251,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 48)",
        "(line 254,col 9)-(line 254,col 56)",
        "(line 255,col 9)-(line 255,col 77)",
        "(line 256,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 40)",
        "(line 263,col 9)-(line 263,col 61)",
        "(line 264,col 9)-(line 269,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testReadingOfFirstStoredEntry()",
      "begin_line": 277,
      "end_line": 285,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-264\"\n     * \u003eCOMPRESS-264\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 51)",
        "(line 280,col 9)-(line 280,col 34)",
        "(line 281,col 9)-(line 281,col 53)",
        "(line 282,col 9)-(line 282,col 38)",
        "(line 283,col 9)-(line 284,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.readOrderTest()",
      "begin_line": 297,
      "end_line": 300,
      "comment": "\n     * ordertest.zip has been handcrafted.\n     *\n     * It contains enough files so any random coincidence of\n     * entries.keySet() and central directory order would be unlikely\n     * - in fact testCDOrder fails in svn revision 920284.\n     *\n     * The central directory has ZipFile and ZipUtil swapped so\n     * central directory order is different from entry data order.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 48)",
        "(line 299,col 9)-(line 299,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.assertEntryName(java.util.ArrayList\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003e, int, java.lang.String)",
      "begin_line": 302,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 48)",
        "(line 306,col 9)-(line 308,col 35)"
      ]
    }
  ]
}