{
  "filepath": "/tmp/Compress-9b/src/test/java/org/apache/commons/compress/archivers/zip/ZipFileTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFileTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zf"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.tearDown()",
      "begin_line": 31,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testCDOrder()",
      "begin_line": 36,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 24)",
        "(line 38,col 9)-(line 38,col 73)",
        "(line 39,col 9)-(line 39,col 59)",
        "(line 40,col 9)-(line 40,col 47)",
        "(line 41,col 9)-(line 41,col 49)",
        "(line 42,col 9)-(line 42,col 53)",
        "(line 43,col 9)-(line 43,col 51)",
        "(line 44,col 9)-(line 44,col 43)",
        "(line 45,col 9)-(line 45,col 48)",
        "(line 46,col 9)-(line 46,col 55)",
        "(line 47,col 9)-(line 47,col 58)",
        "(line 48,col 9)-(line 48,col 55)",
        "(line 49,col 9)-(line 49,col 43)",
        "(line 50,col 9)-(line 50,col 60)",
        "(line 51,col 9)-(line 51,col 57)",
        "(line 52,col 9)-(line 52,col 50)",
        "(line 53,col 9)-(line 53,col 56)",
        "(line 54,col 9)-(line 54,col 57)",
        "(line 55,col 9)-(line 55,col 46)",
        "(line 56,col 9)-(line 56,col 52)",
        "(line 57,col 9)-(line 57,col 48)",
        "(line 58,col 9)-(line 58,col 42)",
        "(line 59,col 9)-(line 59,col 42)",
        "(line 60,col 9)-(line 60,col 43)",
        "(line 61,col 9)-(line 61,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testPhysicalOrder()",
      "begin_line": 64,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 24)",
        "(line 66,col 9)-(line 66,col 88)",
        "(line 67,col 9)-(line 67,col 59)",
        "(line 68,col 9)-(line 68,col 47)",
        "(line 69,col 9)-(line 69,col 49)",
        "(line 70,col 9)-(line 70,col 53)",
        "(line 71,col 9)-(line 71,col 51)",
        "(line 72,col 9)-(line 72,col 43)",
        "(line 73,col 9)-(line 73,col 48)",
        "(line 74,col 9)-(line 74,col 55)",
        "(line 75,col 9)-(line 75,col 58)",
        "(line 76,col 9)-(line 76,col 55)",
        "(line 77,col 9)-(line 77,col 43)",
        "(line 78,col 9)-(line 78,col 60)",
        "(line 79,col 9)-(line 79,col 57)",
        "(line 80,col 9)-(line 80,col 50)",
        "(line 81,col 9)-(line 81,col 56)",
        "(line 82,col 9)-(line 82,col 57)",
        "(line 83,col 9)-(line 83,col 46)",
        "(line 84,col 9)-(line 84,col 52)",
        "(line 85,col 9)-(line 85,col 48)",
        "(line 86,col 9)-(line 86,col 42)",
        "(line 87,col 9)-(line 87,col 42)",
        "(line 88,col 9)-(line 88,col 43)",
        "(line 89,col 9)-(line 89,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.testDoubleClose()",
      "begin_line": 92,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 24)",
        "(line 94,col 9)-(line 94,col 19)",
        "(line 95,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.readOrderTest()",
      "begin_line": 112,
      "end_line": 116,
      "comment": "\n     * ordertest.zip has been handcrafted.\n     *\n     * It contains enough files so any random coincidence of\n     * entries.keySet() and central directory order would be unlikely\n     * - in fact testCDOrder fails in svn revision 920284.\n     *\n     * The central directory has ZipFile and ZipUtil swapped so\n     * central directory order is different from entry data order.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 59)",
        "(line 114,col 9)-(line 114,col 57)",
        "(line 115,col 9)-(line 115,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFileTest.assertEntryName(java.util.ArrayList\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003e, int, java.lang.String)",
      "begin_line": 118,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 48)",
        "(line 122,col 9)-(line 124,col 35)"
      ]
    }
  ]
}